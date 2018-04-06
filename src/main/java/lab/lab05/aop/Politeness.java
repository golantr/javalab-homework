package lab.lab05.aop;


import lab.lab05.model.Customer;
import lab.lab05.model.Squishee;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

@Aspect
public class Politeness {

    public static final String EXECUTION_SELL_SQUISHEE = "execution(* sellSquishee(..))";

    @Before(EXECUTION_SELL_SQUISHEE)
    public void sayHello(JoinPoint joinPiont) {
        AopLog.append("Hello " + ((Customer) joinPiont.getArgs()[0]).getName() + ". How are you doing? \n");
    }

    @AfterReturning(pointcut = EXECUTION_SELL_SQUISHEE,
            returning = "retVal", argNames = "retVal")
    public void askOpinion(Object retVal) {
        AopLog.append("Is " + ((Squishee) retVal).getName() + " Good Enough? \n");
    }

    @AfterThrowing(pointcut = EXECUTION_SELL_SQUISHEE)
    public void sayYouAreNotAllowed() {
        AopLog.append("Hmmm... \n");
    }

    @After(EXECUTION_SELL_SQUISHEE)
    public void sayGoodBye() {
        AopLog.append("Good Bye! \n");
    }

    @Around(EXECUTION_SELL_SQUISHEE)
    public Object sayPoliteWordsAndSell(ProceedingJoinPoint pjp) throws Throwable {
        AopLog.append("Hi! \n");
        Object retVal = pjp.proceed();
        AopLog.append("See you! \n");
        return retVal;
    }

}