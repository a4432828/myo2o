package enums;

import java.util.Iterator;

public enum ShopStateEnum {
	CHECK(0, "审核中"), PASS(1, "通过认证"), OFFLINE(-2001, "非法商铺"), EDIT_ERROR(-2002, "店铺操作失败"),
	NULL_SHOPID(-2003, "ShopId为空"), NULL_SHOP_INFO(-2004, "店铺信息为空");
	
	private int state;
	private String stateInfo;
	
	private ShopStateEnum(int state, String stateInfo) {
		this.state = state;
		this.stateInfo = stateInfo;
	}

	public int getState() {
		return state;
	}

	public String getStateInfo() {
		return stateInfo;
	}

	public static ShopStateEnum stateof(int index) {
		for(ShopStateEnum state : values()) {
			if(state.getState() == index) {
				return state;
			}
		}
		return null;
	}
	
	
	
}
