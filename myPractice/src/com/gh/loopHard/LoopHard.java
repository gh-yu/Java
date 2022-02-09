package com.gh.loopHard;

import java.util.Scanner;

public class LoopHard {
    
    private Scanner sc = new Scanner(System.in);

    public void practice1() {
        // 사용자로부터 입력받은 하나의 값이 소수인지 판별
        // 입력한 수가 2보다 작은 경우 "잘못 입력하셨습니다." 출력

        System.out.print("정수 입력(2 이상) : ");
        int num = sc.nextInt();
        sc.close();

        if (num < 2) {
            System.out.println("잘못 입력하셨습니다.");
        } else {
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    System.out.println("소수가 아닙니다.");
                    return;
                }
            }

            System.out.println("소수입니다.");
        }
    }

    public void practice2() {

        while(true) {
            System.out.print("정수 입력(2 이상) : ");
            int num = sc.nextInt();
            
            if (num < 2) {
                System.out.println("잘못 입력하셨습니다.");
            } else {
                sc.close();

                for (int i = 2; i < num; i++) {
                    if (num % i == 0) {
                        System.out.println("소수가 아닙니다.");
                        return;
                    }
                }

                System.out.println("소수입니다.");
                return;
            }
        }
    }

    public void practice3() {
        // 2부터 사용자가 입력한 수까지의 소수 모두 출력, 소수의 개수 출력

        while(true) {
            System.out.print("정수 입력(2 이상) : ");
            int num = sc.nextInt();

            if (num < 2) {
                System.out.println("잘못 입력하셨습니다.");
            } else {
                int primeCount = 0;
                boolean primeCheck = true;
                if (num == 2) {
                    System.out.println(num);
                    System.out.println("소수의 개수는 1개입니다.");
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
                    System.out.println("2부터 " + num + "까지 소수의 개수는 " + primeCount + "개입니다.");
                }
                break;
            }
        }
        sc.close();
    }

    public void practice4() {
        // 1부터 사용자에게 입력 받은 수까지 중에서
        // 2와 3의 배수 모두 출력
        // 2와 3의 공배수의 개수를 출력
    
        System.out.print("자연수 하나를 입력하세요 : ");
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
            System.out.println("잘못 입력하셨습니다.");
        }

    }

    public void practice5() {
        System.out.print("정수 입력 : ");
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
        System.out.print("정수 입력 : ");
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
