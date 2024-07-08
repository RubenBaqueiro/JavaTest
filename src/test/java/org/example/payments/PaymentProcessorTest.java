package org.example.payments;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class PaymentProcessorTest {
    private PaymentGateway paymentGateway;
    private PaymentProcessor paymentProcessor;

    @Before
    //Para que se inicie antes de ejecutar los Test.
    public void setup () {
         paymentGateway = Mockito.mock(PaymentGateway.class);
         paymentProcessor = new PaymentProcessor(paymentGateway);
    }

    @Test
    public void payment_correct() {
        Mockito.when(paymentGateway.requestPayment(Mockito.any()))
                .thenReturn(new PaymentResponse(PaymentResponse.PaymentStatus.OK));

        assertTrue(paymentProcessor.makePayment(10000));
    }

    @Test
    public void payment_wrong() {
        Mockito.when(paymentGateway.requestPayment(Mockito.any()))
                .thenReturn(new PaymentResponse(PaymentResponse.PaymentStatus.ERROR));
        assertFalse(paymentProcessor.makePayment(10000));
    }

}