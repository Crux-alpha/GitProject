public class HelloWorld{
	
	public static void main(String[] args){
		String time = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss"));
		System,out.println("save time to " + time);
		System.out.println("broswer edition");
	}
}
