package com.msa4java.edu;

import java.util.Arrays;

public class E05Array {
    public static void main(String[] args) {
        // 배열 생성 및 초기화
            // 타입[] 변수명 = new 타입[길이];
            // 변수명[인덱스] = 값;
            // 타입[] 변수명 = {요소1, 요소2, 요소3...};

            // 길이가 5인 인트 배열. 생성 및 초기화
        int[] arrInt = new int[5];
        arrInt[2] = 50;
        System.out.println(Arrays.toString(arrInt));   // [0, 0, 50, 0, 0]

            // 길이가 4인 캐릭터 배열. 생성 및 초기화(요소의 값도 셋팅)
        char[] arrChar = {'a', 'b', 'c', 'd'};
        System.out.println(Arrays.toString(arrChar));

        // -----------------------------------------------------------------------------------
        // 배열의 요소 접근


        // 배열의 출력
            // Arrays.toString 메소드 이용(System.out.println은 주소값을 출력; 참조타입이므로)
            // * char 배열만: System.out.println이 특별히 값을 출력해줌(단, 배열X 문자열로써 나열)

        // ------------------------------------------------------------------------------------
        // 배열의 복사
            // 대입연산자 사용: 얕은 복사

            // for문 이용:  깊은 복사

            // System.arraycopy 이용: 깊은 복사
                // System.arraycopy(
                //    원본배열
                //    ,원본배열의 복사 시작할 인덱스(n번부터 가져오겠다!)
                //    ,카피배열
                //    ,카피배열에 붙여넣기 시작할 인덱스(n번부터 붙여넣겠다!)
                //    ,붙여넣기 할 개수
                // )
            int[] arrInt0 = {1, 2, 3};
            int[] arrIntCopy = new int[arrInt0.length * 2];  // arrInt0의 길이*2인 arrIntCopy 배열 생성 => arrIntCopy[6]
            System.arraycopy(arrInt0, 0, arrIntCopy, 0, arrInt0.length); // arrIntCopy = [1, 2, 3, 0, 0, 0]

                // Arrays.copyof() 이용: 깊은 복사
                    // Arrays.copyOf(원본배열, 지정 길이)
            int[] originArr = {1, 2, 3};
            int[] copyArr = new int[originArr.length * 2];
            copyArr = Arrays.copyOf(originArr, originArr.length);

            System.out.println(Arrays.toString(copyArr));

            // ------------------------------------------------------------------------------------
            // 다차원 배열: 배열의 요소로 배열이 들어감
            int[][] arrMD = {
                    {1, 2, 3}
                    ,{4, 5, 6}
                    ,{7, 8, 9}
            };
            System.out.println(arrMD[1][2]);  // 6 출력


        // ------------------------------------------------------------------------------------------
        // 배열의 API
        int[] arrInt1 = {1, 2, 3};
        int[] arrInt2 = {1, 2, 3};

            // 배열의 길이 반환
        System.out.println(arrInt1.length);

            // 배열이 같은지 비교
            // Arrays.equals(배열1, 배열2) : 배열의 얕은 비교
        System.out.println(Arrays.equals(arrInt1, arrInt2));

            // Arrays.deepEquals(배열1, 배열2) : 배열의 깊은 비교(다차원배열 비교)
        int[][] arrIntDM1 = {{1, 2, 3},{4, 5, 6}};
        int[][] arrIntDM2 = {{1, 2, 3},{4, 5, 6}};
        System.out.println(Arrays.deepEquals(arrIntDM1, arrIntDM2));

            // 배열의 정렬
            // Arrays.sort(배열)
                // Arrays.sort: void: 반환값 없음
                // => 정렬 결과를 리턴하지 않고 원본 배열을 직접 바꿈
        int[] arrSort = {5, 217, 88, 3, 1};
        Arrays.sort(arrSort);
        System.out.println(Arrays.toString(arrSort)); // [1, 3, 5, 88, 217] 출력
    }
}
