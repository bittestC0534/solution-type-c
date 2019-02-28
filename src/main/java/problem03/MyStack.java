package problem03;

public class MyStack {
	
	private String[] buffer;

	public MyStack( int size ) {
		buffer = new String[size];
	}
	
	public void push(String item) {
		if(buffer.length == size()) {
			
			String[] resizeBuffer = new String[buffer.length * 2];
			
			System.arraycopy(buffer, 0, resizeBuffer, 0, buffer.length);
			
			buffer = resizeBuffer;
		}
		
		buffer[size()] = item;
		
		
	}

	public String pop() {
		if(isEmpty() == false) {
			String result = buffer[size() - 1];
			
			buffer[size() - 1] = null;
			
			return result;
			
		}else {
			return null;
		}
		
	}

	public boolean isEmpty() {
		return buffer[0] == null ? true : false;
	}
	
	public int size() {
		
		int count = 0;
		
		for (int i = 0; i < buffer.length; i++) {
			if(buffer[i] == null) {
				break;
			}else {
				count++;
			}
		}
		return count;
		
	}
}