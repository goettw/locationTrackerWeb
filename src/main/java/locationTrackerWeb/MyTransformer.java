package locationTrackerWeb;

import org.springframework.stereotype.Component;
@Component
public class MyTransformer {
	
	public String byteArrayToString (byte[] m) {
		return new String (m);
	}
}
