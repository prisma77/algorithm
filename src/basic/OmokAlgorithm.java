package basic;

import java.util.Random;

public class OmokAlgorithm { // 클래스 이름을 OmokAlgorithm으로 선언
    public static void main(String[] args) { // 메인 메서드 시작
        // 델타 배열 정의: 8방향의 행과 열 변화를 저장
        int[][] deltas = {
                { -1, 0 },  // 상: 행 -1, 열 변화 없음
                { 1, 0 },   // 하: 행 +1, 열 변화 없음
                { 0, -1 },  // 좌: 행 변화 없음, 열 -1
                { 0, 1 },   // 우: 행 변화 없음, 열 +1
                { -1, -1 }, // 좌상 대각선: 행 -1, 열 -1
                { -1, 1 },  // 우상 대각선: 행 -1, 열 +1
                { 1, -1 },  // 좌하 대각선: 행 +1, 열 -1
                { 1, 1 }    // 우하 대각선: 행 +1, 열 +1
        };

        // 15x15 문자형 이차원 배열 grid 정의 (오목판)
        char[][] grid = new char[15][15]; // 빈 오목판 생성
        Random random = new Random(); // 랜덤 객체 생성

        // 오목판을 랜덤으로 흑돌('O'), 백돌('X'), 빈칸(' ')으로 채우기
        for (int r = 0; r < grid.length; r++) {
            for (int c = 0; c < grid[r].length; c++) {
                int randomValue = random.nextInt(3); // 0, 1, 2 중 하나의 값을 생성
                if (randomValue == 0) {
                    grid[r][c] = 'O'; // 흑돌
                } else if (randomValue == 1) {
                    grid[r][c] = 'X'; // 백돌
                } else {
                    grid[r][c] = ' '; // 빈칸
                }
            }
        }

        boolean win = false; // 승리 조건 만족 여부를 저장할 변수 초기화

        // 오목판의 모든 위치를 순회
        for (int r = 0; r < 15; r++) { // 행을 순회
            for (int c = 0; c < 15; c++) { // 열을 순회
                // 현재 위치가 흑돌('O') 또는 백돌('X')일 때만 실행
                if (grid[r][c] == 'O' || grid[r][c] == 'X') {
                    char stone = grid[r][c]; // 현재 돌 종류 저장
                    // 델타 배열을 사용하여 8방향을 탐색
                    for (int d = 0; d < 8; d++) { // 8방향 각각에 대해 탐색
                        int count = 1; // 현재 돌을 포함하여 연속된 돌 개수를 저장
                        int nr = r + deltas[d][0]; // 다음 행 계산
                        int nc = c + deltas[d][1]; // 다음 열 계산

                        // 새 위치가 유효하고 돌이 연속될 때까지 반복
                        while (nr >= 0 && nr < 15 && nc >= 0 && nc < 15 && grid[nr][nc] == stone) {
                            count++; // 연속된 돌 개수 증가
                            if (count == 5) { // 5개가 연속되면
                                win = true; // 승리 조건 충족
                                System.out.println("Winning stone: " + stone); // 승리한 돌 출력
                                break; // 반복 종료
                            }
                            nr += deltas[d][0]; // 다음 행으로 이동
                            nc += deltas[d][1]; // 다음 열로 이동
                        }

                        if (win) break; // 승리 조건 충족 시 방향 탐색 종료
                    }
                }
                if (win) break; // 승리 조건 충족 시 열 탐색 종료
            }
            if (win) break; // 승리 조건 충족 시 행 탐색 종료
        }

        // 결과 출력
        if (win) {
            System.out.println("5 stones connected! Omok victory!"); // 승리 조건 충족 메시지 출력
        } else {
            System.out.println("No winning condition found."); // 승리 조건 미충족 메시지 출력
        }

        // 오목판 출력
        System.out.println("Omok Board:");
        for (int r = 0; r < 15; r++) {
            for (int c = 0; c < 15; c++) {
                System.out.print(grid[r][c] + " "); // 오목판의 각 칸 출력
            }
            System.out.println(); // 한 행 출력 후 줄 바꿈
        }
    }
}