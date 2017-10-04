package th;

public class Runner {
	public static void main(String[] args){
		int sum=0;
		int p=0;
		int bwp = 0;
		Book[] books = {
				new Book("Singing in thorns",30,true),
				new Book("Who will cry when you die",35,false),
				new Book("The Path of a Real Man",34,false),
				new Book("Unbridled Heart",33,false),
				new Book("How to acquire friends and influence people",53,false),
				new Book("10X Rule",55,true),
				new Book("Law of Success",47,false),
				new Book("Wake up in Himself Ishlin",44,true),
				new Book("The science of becoming rich",52,false),
				new Book("Bible",60,true)
		};
		for(int i=0;i<books.length;i++){
			p=books[i].getPrice();
			sum=sum+p;
			if((books[i].getPic())==true){
				bwp++;
			}
		}
		System.out.println(sum);
		System.out.println(bwp);
	}
}
