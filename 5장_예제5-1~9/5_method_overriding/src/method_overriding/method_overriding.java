package method_overriding;

class Weapon {
	protected int fire() {
		return 1; // ����� �⺻������ �� �� ���
	}
}

class Cannon extends Weapon {
	@Override
	protected int fire() {	// �������̵�
		return 10;			// ������ �ѹ��� 10���� ���
	}
}

public class method_overriding {
	public static void main(String[] args) {
		Weapon weapon;
		weapon = new Weapon();
		System.out.println("�⺻ ������ ��� �ɷ��� " +
				weapon.fire());
		weapon = new Cannon();
		System.out.println("������ ��� �ɷ��� " +
				weapon.fire());
	}
}