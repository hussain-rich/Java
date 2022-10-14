package closedLabBook;

public class MethodCalling {
public static void main(String[]args) {
	MethodCalling avg=new MethodCalling();
	float average=avg.average();
	System.out.println(average);
}
private float average()
{
int tam=78,eng=34,mat=87,sci=78,soc=89,total;
float average;
total=tam+eng+mat+sci+soc;
average=total/5;
return average;

}
}