package CollectionFramework;


import java.util.ArrayList;
import java.util.Collections;

class Post implements Comparable<Post>{
	int postId;
	String postName;
	double rating;
	
	public Post(int postId, String postName, double rating) {
		super();
		this.postId = postId;
		this.postName = postName;
		this.rating = rating;
	}
	@Override
	public int compareTo(Post o) {
		
		return this.postId-o.postId;
	}
	@Override
	public String toString() {
		return "Post [postId=" + postId + ", postName=" + postName + ", rating=" + rating + "]";
	}
	
}
public class CCDemo {

	public static void main(String[] args) {
		ArrayList<Post>post=new ArrayList<Post>();
		
		post.add(new Post(101,"java is secure",8.9));
		post.add(new Post(35,"Life is race",100.100));
		post.add(new Post(25,"DML Tutorial By Sufi",9.9));
		post.add(new Post(10,"java version 25",10.10));
		Collections.sort(post);
		System.out.println(post);
		
		for(Post p:post) {
			System.out.println(p);
		}

	}

}