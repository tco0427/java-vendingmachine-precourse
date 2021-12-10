package vendingmachine.domain;

import java.util.ArrayList;
import java.util.List;

public class VendingMachine {

    private Change change;
    private Money money;
    private List<Product> productList = new ArrayList<>();

    public VendingMachine() {
    }

    public void inputMoney(Money money) {
        this.money = money;
    }

    public void createChange() {
        //랜덤하게 생성하는 코드 필요
    }

    public void inputProducts(List<Product> productList) {
        this.productList = productList;
    }

    public Change getChange() {
        return change;
    }

    public Money getMoney() {
        return money;
    }

    public List<Product> getProductList() {
        return productList;
    }
}
