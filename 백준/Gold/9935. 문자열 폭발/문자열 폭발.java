import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 입력 받기
        String s = sc.nextLine();
        String bomb = sc.nextLine();
        sc.close();
        
        // 스택 선언
        Stack<Character> stack = new Stack<>();
        int bombLength = bomb.length();
        
        // 문자열 순회
        for (int i = 0; i < s.length(); i++) {
            stack.push(s.charAt(i));
            
            // 스택의 끝부분이 폭발 문자열과 같은지 확인
            if (stack.size() >= bombLength) {
                boolean isBomb = true;
                
                // 스택의 마지막 부분을 폭발 문자열과 비교
                for (int j = 0; j < bombLength; j++) {
                    if (stack.get(stack.size() - bombLength + j) != bomb.charAt(j)) {
                        isBomb = false;
                        break;
                    }
                }
                
                // 폭발 문자열과 일치하면 스택에서 제거
                if (isBomb) {
                    for (int j = 0; j < bombLength; j++) {
                        stack.pop();
                    }
                }
            }
        }
        
        // 스택에 남은 문자들을 합쳐서 결과 출력
        StringBuilder result = new StringBuilder();
        for (char c : stack) {
            result.append(c);
        }
        
        // 결과가 비었으면 "FRULA" 출력, 아니면 남은 문자열 출력
        if (result.length() == 0) {
            System.out.println("FRULA");
        } else {
            System.out.println(result.toString());
        }
    }
}
