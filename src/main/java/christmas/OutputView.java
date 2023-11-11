package christmas;

public class OutputView {

    // TODO: 2023-11-12 OutputView에 필요한 value call
    public void requestDate(){
        System.out.println("안녕하세요! 우테코 식당 12월 이벤트 플래너입니다.\n12월 중 식당 예상 방문 날짜는 언제인가요? (숫자만 입력해 주세요!)");
    }

    public void requestMenu(){
        System.out.println("주문하실 메뉴를 메뉴와 개수를 알려 주세요. (e.g. 해산물파스타-2,레드와인-1,초코케이크-1");
    }

    public void eventInformation(int date){
        System.out.println("12월 "+date+"일에 우테코 식당에서 받을 이벤트 혜택 미리 보기!");
    }
    public void printMenu(){
        System.out.println("<주문 메뉴>");
    }

    public void printBeforeSale(){
        System.out.println("<할인 전 총주문 금액>");
    }

    public void printGetFree(){
        System.out.println("<증정 메뉴>");
    }

    public void printAllBenefit(){
        System.out.println("<혜택 내역>");
    }

    public void printTotalBenefitPrice(){
        System.out.println("<총혜택 금액>");
    }

    public void printAfterSale(){
        System.out.println("<할인 후 예상 결제 금액>");
    }

    public void printEventBadge(){
        System.out.println("<12월 이벤트 배지>");
    }
}
