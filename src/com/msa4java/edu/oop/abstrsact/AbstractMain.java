package com.msa4java.edu.oop.abstrsact;

public class AbstractMain {
    public static void main(String[] args) {
        Whale whale = new Whale("고래친구");
        FlyingSquirrel flyingSquirrel = new FlyingSquirrel("다람쥐친구");

        whale.residence();
        flyingSquirrel.residence();

        whale.swimming();

        //------------------------------------------------------------------------------
        // 다형성
        // 같은 자료형에 여러가지 타입의 데이터를 대입하여 다양한 결과를 얻어낼 수 있는 성질

         // 업캐스팅
         Whale whale2 = new Whale("고래2");
         Mammal castingWhaleToMammal = (Mammal)whale2;

         whale2.swimming();
         // castingWhaleToMammal.swimming();  // 자식 클래스가 가진 멤버에는 접근이 불가

         whale2.breath();
         castingWhaleToMammal.breath();   // 오버라이드한 요소는 자식클래스의 것이 적용되는 것처럼 느껴짐

        // 다운캐스팅
        // 업캐스팅한 인스턴스를 다시 본인의 데이터타입으로 캐스팅 하는 것
        Whale downCastingWhale = (Whale)castingWhaleToMammal;
        downCastingWhale.swimming();

        Mammal[] arrMammal = new Mammal[4];
        arrMammal[0] = new Whale("고래1");
        arrMammal[1] = new Whale("고래2");
        arrMammal[2] = new Whale("고래3");
        arrMammal[3] = new FlyingSquirrel("날다람쥐4");

        for(int i =0 ; i < arrMammal.length; i++){
            Mammal obj = arrMammal[i];
            if(obj instanceof Whale){
                Whale whale3 = (Whale) obj;
                whale3.swimming();
            }else if(obj instanceof FlyingSquirrel){
                FlyingSquirrel flyingSquirrel3 = (FlyingSquirrel) obj;
                flyingSquirrel3.residence();
            }
        }
    }
}
