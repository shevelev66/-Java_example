import java.util.Scanner;
public class example32_06 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("��������� ������� ������������������ �����, ��������������� �������:"); //������
		System.out.println("��� ������� ����� �� 5 � ������� ���������� 2"); //������
		System.out.println("������� ���������� ����� ����� ������������������:"); //������
try {
		int n = in.nextInt(); //���� ����������
		int arr[] = new int [n]; // ������������ ������
		//������������ ���������� �������
		int k=0; //�� k ����������� ������� ��������� �������
		int i=0; //�� i ����������� ����� ������������������
		//--------------------------for--------------------------
		for (i=0; k<n; ++i) { 
			//������� ����� �� 5 � ������� ���������� 2, ��� ��� ������� �� 3 � ������� ���������� 1
			if ((i % 5)==2) {arr[k]=i; ++k;} 
		}	
		System.out.println("--------------------------------------");
	    System.out.println("������������������ ������������:");
	    for (i=0; i<n; ++i) {
	    	   System.out.print(arr[i]+" ");  //����� ������� ������ �� �������
	    }
	    System.out.println();
}
catch (Exception error) {
    System.out.println("��� ��������� ������ ��������� ������!"); //��������� ����������
	System.out.println("�������� �� ����������� ����� ������!"); }
    in.close();
	}
}
