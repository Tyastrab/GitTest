import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util. *;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class Flashboyz {
	 
	

	public static void main(String[] args) throws Exception {
		
//		File f = new File();
//		f.write();
		
		JSONObject jo = new JSONObject();
		JSONArray j2 = new JSONArray();
        
        
		for (int i=1; i<26; i++) {
			Auction a = new Auction();
			a.getInput(1, i, i);
			a.auction(j2);

		}
		
		jo.put("Auction", j2);
 
	    // writing JSON to file: in cwd 
	    PrintWriter pw = new PrintWriter("AuctionResults.json"); 
	    pw.write(jo.toJSONString()); 
	        
	    pw.flush(); 
	    pw.close();
		}

}