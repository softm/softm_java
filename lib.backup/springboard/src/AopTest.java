import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class AopTest implements MethodInterceptor{
 
 public final Object invoke(MethodInvocation invocation) throws Throwable {
 
     //�޼ҵ� ������ ó�� �ڵ� �߰�
     System.out.println( "before ----- test ");
     Object obj = invocation.proceed(); // �޼ҵ� ����
    
     //�޼ҵ� ������ ó�� �ڵ� �߰�
     System.out.println( "after ----- test ");
  return obj;
 }
}
 

