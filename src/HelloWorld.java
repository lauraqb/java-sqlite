import org.json.simple.JSONObject;


public class HelloWorld {

	public static void main(String[] args) {
		String argument = args[0].toString();
		System.out.println(argument);
		JSONObject obj = new JSONObject();
		if (argument.equals("arg1"))
		{
			obj.put("name", "foo");
			obj.put("num", new Integer(100));
		}
		System.out.println(obj.toString());
	}

}
