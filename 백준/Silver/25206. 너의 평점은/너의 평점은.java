import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 점수 등록
        HashMap<String, Double> score = new HashMap<>();
        score.put("A+", 4.5);
        score.put("A0", 4.0);
        score.put("B+", 3.5);
        score.put("B0", 3.0);
        score.put("C+", 2.5);
        score.put("C0", 2.0);
        score.put("D+", 1.5);
        score.put("D0", 1.0);
        score.put("F", 0.0);

        List<List<String>> outerList = new ArrayList<>();

        
        // P가 아닌 과목만 저장
        boolean isGradeP;

        for (int i = 0; i < 20; i++) {
            isGradeP = true;
            List<String> innerList = new ArrayList<>();

            String name = sc.next();
            innerList.add(name);

            String hak = sc.next();
            innerList.add(hak);

            String grade = sc.next();
            if (!grade.equals("P")) {
                isGradeP = false;
                innerList.add(grade);
            }

            if (!isGradeP) {
                outerList.add(innerList);
            }
        }

        // 성적 계산
        double sum = 0;
        double hours = 0;

        for (List<String> innerList : outerList) {
            sum += Double.parseDouble(innerList.get(1)) * score.get(innerList.get(2));
            hours += Double.parseDouble(innerList.get(1));
        }
        
        //출력
        System.out.println(sum / hours);
    }
}