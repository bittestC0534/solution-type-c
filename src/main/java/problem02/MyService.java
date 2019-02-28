package problem02;

public class MyService extends BaseService {
	
	@Override
	public void service(String state) {
		System.out.println((state.equals("낮") ? day() : (state.equals("오후") ? afternoon() : night())) + "서비스시작");
	
	}

	public String afternoon() {
		return "오후";
	}
}
