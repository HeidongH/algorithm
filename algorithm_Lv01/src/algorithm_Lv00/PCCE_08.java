package algorithm_Lv00;

public class PCCE_08 {
    public String solution(String[] storage, int[] num) {
        int num_item = 0; // storage의 중복을 제거하기 위한 체크용
        String[] clean_storage = new String[storage.length]; // 중복 제거된 storage
        int[] clean_num = new int[num.length]; // 중복 제거된 num

        // storage의 중복 제거 및 num의 수량 매치
        for(int i=0; i<storage.length; i++){
            int clean_idx = -1; // storage 요소가 clean_storage에 존재하는지 체크용

            // clean_storage에 storage[i]가 존재하는지 확인
            for(int j=0; j<num_item; j++){
                if(storage[i].equals(clean_storage[j])){
                    clean_idx = j;
                    break;
                }
            }

            // clean_storage에 storage[i]가 존재하지 않으면 요소 추가, 존재하면 clean_num 수량 증가
            if(clean_idx == -1){
                clean_storage[num_item] = storage[i];
                clean_num[num_item] = num[i];
                num_item += 1;
            }
            else{
                clean_num[clean_idx] += num[i];
            }
        }

        // clean_num 중 가장 큰 수량을 가진 storage 요소 찾기
        int num_max = -1;
        String answer = "";
        for(int i=0; i<num_item; i++){
            if(clean_num[i] > num_max){
                num_max = clean_num[i];
                answer = clean_storage[i];
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        PCCE_08 t = new PCCE_08();
        String[] storage = {"pencil", "pencil", "pencil", "book"};
        int[] num = {2, 4, 3, 1};
        String answer = t.solution(storage, num);
        System.out.println(answer);
    }

}
