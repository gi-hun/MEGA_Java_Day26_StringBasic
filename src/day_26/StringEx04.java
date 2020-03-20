/*
 * # ���ڿ�(= ������ �迭)
 * 1. ���ڿ��� "������ �迭"�� ���Ӹ�
 * 2. 0������ �����ϴ� ��ȣ�� �ο�(index)
 */

package day_26;

public class StringEx04 {
	public static void main(String[] args) {
		//012345
		String str = "megait";
		System.out.println(str);
		
		//[1]������ ���� : length()
		int size = str.length();		 //�ε���0���� ä������ ������ �ε����� null�� ä������
		System.out.println(size);
		
		//[1]���� �Ѱ� ����(�ε���) : charAt(index)
		char ch = str.charAt(0);
		System.out.println(ch);
		ch = str.charAt(size - 1);
		System.out.println(ch);
		
		//[2]���� ������ ����(�����̽�)
		//1)substring(index1, index1)
		// �������� �������� �ʴ´�. (index1���� index2�̸�����)
		String rs = str.substring(4,6);
		System.out.println(rs);
		
		//2)substring(index)
		//index���� ���ڿ� ������
		rs = str.substring(4);
		System.out.println(rs);
		
		//[3]�����ڷ� �߶󳻱�
		str = "hello,java,android";
		String[] ar = str.split(",");
		System.out.println(ar.length);
		System.out.println(ar[0]);
		System.out.println(ar[1]);
		System.out.println(ar[2]);
	}
}
