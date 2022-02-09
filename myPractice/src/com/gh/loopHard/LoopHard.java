package com.gh.loopHard;

import java.util.Scanner;

public class LoopHard {
    
    private Scanner sc = new Scanner(System.in);

    public void practice1() {
        // ����ڷκ��� �Է¹��� �ϳ��� ���� �Ҽ����� �Ǻ�
        // �Է��� ���� 2���� ���� ��� "�߸� �Է��ϼ̽��ϴ�." ���

        System.out.print("���� �Է�(2 �̻�) : ");
        int num = sc.nextInt();
        sc.close();

        if (num < 2) {
            System.out.println("�߸� �Է��ϼ̽��ϴ�.");
        } else {
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    System.out.println("�Ҽ��� �ƴմϴ�.");
                    return;
                }
            }

            System.out.println("�Ҽ��Դϴ�.");
        }
    }

    public void practice2() {

        while(true) {
            System.out.print("���� �Է�(2 �̻�) : ");
            int num = sc.nextInt();
            
            if (num < 2) {
                System.out.println("�߸� �Է��ϼ̽��ϴ�.");
            } else {
                sc.close();

                for (int i = 2; i < num; i++) {
                    if (num % i == 0) {
                        System.out.println("�Ҽ��� �ƴմϴ�.");
                        return;
                    }
                }

                System.out.println("�Ҽ��Դϴ�.");
                return;
            }
        }
    }

    public void practice3() {
        // 2���� ����ڰ� �Է��� �������� �Ҽ� ��� ���, �Ҽ��� ���� ���

        while(true) {
            System.out.print("���� �Է�(2 �̻�) : ");
            int num = sc.nextInt();

            if (num < 2) {
                System.out.println("�߸� �Է��ϼ̽��ϴ�.");
            } else {
                int primeCount = 0;
                boolean primeCheck = true;
                if (num == 2) {
                    System.out.println(num);
                    System.out.println("�Ҽ��� ������ 1���Դϴ�.");
                } else {
                    for(int i = 2; i <= num; i++) {
                        primeCheck = true;
                        for (int j = 2; j < i; j++) {
                            if (i % j == 0) {
                                primeCheck = false;
                            } 
                        }

                        if (primeCheck) {
                            System.out.print(i + " ");
                            primeCount++;
                        }
                    } 
                    System.out.println();
                    System.out.println("2���� " + num + "���� �Ҽ��� ������ " + primeCount + "���Դϴ�.");
                }
                break;
            }
        }
        sc.close();
    }

    public void practice4() {
        // 1���� ����ڿ��� �Է� ���� ������ �߿���
        // 2�� 3�� ��� ��� ���
        // 2�� 3�� ������� ������ ���
    
        System.out.print("�ڿ��� �ϳ��� �Է��ϼ��� : ");
        int num = sc.nextInt();

        if (num > 0) {
            int count = 0;
            for (int i = 1; i <= num; i++) {
                if (i % 2 == 0) {
                    System.out.print(i + " ");
                } else if (i % 3 == 0) {
                    System.out.print(i + " ");
                }
                
                if (i % 2 == 0 && i % 3 == 0) {
                    count++;
                }
            }

            System.out.println("\ncount : " + count);
        } else {
            System.out.println("�߸� �Է��ϼ̽��ϴ�.");
        }

    }

    public void practice5() {
        System.out.print("���� �Է� : ");
        int num = sc.nextInt();

        for (int i = 1; i <= num; i++) {
            for (int j = 0; j < num - i; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }

            System.out.println("");
        }
    }

    public void practice6() {
        System.out.print("���� �Է� : ");
        int num = sc.nextInt();

        for (int i = 1; i <= num; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }

        for (int i = num-1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }

    }
    
}
