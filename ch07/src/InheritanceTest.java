class MyPoint {
	int x;
	int y;
}

class myCircle extends MyPoint { // ����� �̿��ؼ� ����
	int r; // �̷���, int x; int y; int r;�� �ִ� ���̴�.
}

class myCircle2 { // ����
	MyPoint p = new MyPoint(); // ���������� ������ �ʱ�ȭ
							 // �ʱ�ȭ�� ���������� �����ڿ��� �ؾ��Ѵ�.
	int r;
}

public class InheritanceTest {

	public static void main(String[] args) {
		System.out.println("����� �̿��ؼ� ���� ��");
		myCircle b = new myCircle();
		myCircle2 c = new myCircle2();
		b.x =1;
		b.y =2;
		b.r =3;
		System.out.println("b.x : "+b.x);
		System.out.println("b.y : "+b.y);
		System.out.println("b.r : "+b.r);
		
		System.out.println("������ �̿��ؼ� ���� ��");
		
		c.p.x =1;
		c.p.y =2;
		c.r =3;
		System.out.println("c.p.x : "+c.p.x);
		System.out.println("c.p.y : "+c.p.y);
		System.out.println("c.r : "+c.r);
	}

}
