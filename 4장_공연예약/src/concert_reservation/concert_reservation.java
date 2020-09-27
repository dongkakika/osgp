package concert_reservation;
import java.util.Scanner;

class reserveSystem {
    Scanner scanner = new Scanner(System.in);
    String seats[][] = new String[3][10]; // �¼� ��ġ �迭

    // Ŭ������ ���� �̸��� ������
    reserveSystem() {
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 10; j++)
                this.seats[i][j] = "---";
    }

    // �¼� �Է� �޼ҵ�
    void seat_input(int seat) {
        switch (seat) {
        case 1:
            System.out.print("S>>");
            break;
        case 2:
            System.out.print("A>>");
            break;
        case 3:
            System.out.print("B>>");
            break;
        }

        for (int i = 0; i < 10; i++)
            System.out.print(this.seats[seat - 1][i] + " ");
        System.out.println();
    }

    // ���� �޼ҵ�
    void seat_reserve() {
        int seat;
        String name = null;
        int seat_Number;
        while (true) {
            System.out.print("�¼����� S(1), A(2), B(3)>>");
            seat = scanner.nextInt();

            // ���� �޴� ���� --> ���� ó��
            try {
                seat_input(seat);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("�ٽ� �����Ͻʽÿ�. (1 ~ 3)");
                continue;
            }

            System.out.print("�̸�>>");
            name = scanner.next();
            System.out.print("��ȣ>>");
            seat_Number = scanner.nextInt();

            // �¼� ��ȣ�� �߸� �Է��Ͽ��� ��
            if (seat_Number > 10 || seat_Number < 1) {
                System.out.println("E: �߸� �Է��ϼ̽��ϴ�. (1 ~ 10).");
                continue;
            }
            // �̹� ����� �¼� �Ÿ���
            if (!this.seats[seat - 1][seat_Number - 1].equals("---")) {
                System.out.println("E: �̹� ����� �¼��Դϴ�.");
                continue;
            }

            // ���� �¼��� �����ϸ� ���� ó��
            try {
                this.seats[seat - 1][seat_Number - 1] = name;
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("E: �ٽ� �����Ͻʽÿ�. (1 ~ 10)");
                continue;
            }

            return;
        }
    }

    // �������� ���� �޼ҵ�
    int dist_name(String name) {
        int count = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 10; j++) {
                if (this.seats[i][j].equals(name)) {
                    count++;
                }
            }
        }
        return count;
    }

    // ��ȸ �޼ҵ�
    void seat_check() {
        for (int i = 0; i < 3; i++) {
            if (i == 0)
                System.out.print("S>> ");
            else if (i == 1)
                System.out.print("A>> ");
            else if (i == 2)
                System.out.print("B>> ");
            for (int j = 0; j < 10; j++) {
                System.out.print(this.seats[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("<<<��ȸ�� �Ϸ��Ͽ����ϴ�.>>>");
    }

    // ��� �޼ҵ�
    void seat_cancle() {
        int seat;
        int name_count; // ���� �̸� �� �� ���Դ��� Ȯ�� �ϴ� ����
        int seat_num;
        String name = null;

        while (true) {
            System.out.print("�¼����� s<1>, A<2>, B<3>>>");
            seat = scanner.nextInt();
            seat_input(seat);

            System.out.print("�̸�>> ");
            name = scanner.next();
            name_count = dist_name(name);

            if (name_count > 1) { // ���������� �ִٸ� ����
                System.out.println("���������� �ֽ��ϴ�.");
                System.out.print("��� �¼� ��ȣ>>");
                seat_num = scanner.nextInt();
                // �Է��� �¼� ��ȣ�� ���������� ���ٸ� ����
                if (!this.seats[seat - 1][seat_num - 1].equals(name)) { 
                    System.out.println("�߸� �Է��ϼ̽��ϴ�.");
                    continue;
                } else { // �ִٸ� �Է��� �¼� ���
                    this.seats[seat - 1][seat_num - 1] = "---";
                    return;
                }
            } else { // ���������� ���ٸ� ����
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 10; j++) {
                        if (this.seats[i][j].equals(name)) {
                            this.seats[i][j] = "---";
                            return;
                        }
                    }
                }
                System.out.println("����� �̸��� �����ϴ�.");
            }
        }
    }
}

public class concert_reservation {
	public static void main(String[] args) {
		reserveSystem sr = new reserveSystem(); // ShowReserve ��ü ����
        Scanner scanner = new Scanner(System.in);
        int select;

        // ���� ���� �ý���
        while (true) {
            System.out.print("����<1>, ��ȸ<2>, ���<3>, ������<4>>>");
            select = scanner.nextInt();
            switch (select) {
            case 1:
                sr.seat_reserve(); // ���� �޼ҵ� ȣ��
                break;
            case 2:
                sr.seat_check(); // ��ȸ �޼ҵ� ȣ��
                break;
            case 3:
                sr.seat_cancle(); // ��� �޼ҵ� ȣ��
                break;
            case 4:
                return; // ������
            default:
                System.out.println("�߸� �Է��ϼ̽��ϴ� (1 ~ 4).");
                continue;
            }

        }
    }
}
