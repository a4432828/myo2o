package enums;

import dto.ShopExecution;

public class TestNums {
	public static void main(String[] args) {
		ShopExecution shopExecution = new ShopExecution(ShopStateEnum.CHECK);
		System.out.println(shopExecution.getStateInfo());
	}
}
