class tot{
public static void main(String[] args){
String str="java programming";
System.out.println("Length:"+str.length());
System.out.println("Character at 2:"+str.charAt(2));
System.out.println("substring:"+str.substring(1,5));
System.out.println("uppercase:"+str.toUpperCase());
System.out.println("lowercase:"+str.toLowerCase());
System.out.println("Trim:"+str.trim());
System.out.println("Contains Java:"+str.contains("java"));
System.out.println("Starts with java:"+str.trim().startsWith("ja"));
System.out.println("ends with java:"+str.trim().endsWith("ing"));
System.out.println("Replace:"+str.replace("java","python"));
System.out.println("Index Of a:"+str.indexOf('a'));
}
}
