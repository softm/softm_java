import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class AopTest implements MethodInterceptor{
 
 public final Object invoke(MethodInvocation invocation) throws Throwable {
 
     //메소드 실행전 처리 코딩 추가
     System.out.println( "before ----- test ");
     Object obj = invocation.proceed(); // 메소드 실행
    
     //메소드 실행후 처리 코딩 추가
     System.out.println( "after ----- test ");
  return obj;
 }
}
 

