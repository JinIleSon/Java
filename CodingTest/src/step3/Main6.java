package step3;

import java.io.*;
import java.util.StringTokenizer;

public class Main6 {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

            int T = Integer.parseInt(br.readLine());  // 테스트 케이스 개수

            for (; T > 0; T--) {
                String s = br.readLine();  // 각 줄 입력 받기
                StringTokenizer st = new StringTokenizer(s);
                int A = Integer.parseInt(st.nextToken());
                int B = Integer.parseInt(st.nextToken());

                bw.write((A + B) + "\n");  // 또는: bw.write(String.valueOf(A + B)); bw.newLine();
            }

            bw.flush();  // 출력 버퍼 비우기
            bw.close();  // 닫기
        } catch (IOException e) {
            System.out.println("입력 오류: " + e.getMessage());
        }
    }
}