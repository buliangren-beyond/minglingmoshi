package mingling;

import java.util.ArrayList;

public class WaitorInvoker {
	private ArrayList<Commond> commonds = null;
	public WaitorInvoker() {
		commonds = new ArrayList<Commond>();
	}
	public void SetCommond(Commond cmd) {
		commonds.add(cmd);
	}
	public void orderup() {
		System.out.println("”–∂©µ•¡À");
		for(Commond cd:commonds) {
			if(cd != null) {
				cd.excute();
			}
		}
	}
}
