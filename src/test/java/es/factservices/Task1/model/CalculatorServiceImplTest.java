package es.factservices.Task1.model;



import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;


@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = { CalculatorServiceImpl.class })
class CalculatorServiceImplTest {




    @Mock
    private CalculatorServiceImpl calculatorServiceImpl;

    @InjectMocks
    private CalculadoraService service;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        service = new CalculadoraService();

    }


    @Test
    void shouldAddTwoNumbers() throws Exception {

        when(calculatorServiceImpl.add(5.0,5.0)).thenReturn(10.0);
        when(calculatorServiceImpl.add(7.0,5.0)).thenReturn(12.0);
        assertEquals(10.0,calculatorServiceImpl.add(5,5), 0.001);
        assertEquals(12.0,calculatorServiceImpl.add(7,5), 0.001);
    }

    @Test
    void subtract() {
    }

    @Test
    void multiply() {
    }

    @Test
    void divide() {
    }
}