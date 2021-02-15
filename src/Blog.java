import java.util.ArrayList;

public class Blog {

	  private ArrayList<Post> posts;

	    public Blog() {
	        posts = new ArrayList<Post>();
	    }

	    public Blog(ArrayList<Post> post) {
	        this.posts = post;
	    }
	    
	    public ArrayList<Post> getPosts() {
	    	return posts;
	    }
	    
	    public void setPosts(ArrayList<Post> posts) {
	    	this.posts = posts;
	    }

	    public void addPost(Post post) {
	        posts.add(post);
	    }

	    public void removePost(String title) {
	    	for (int j = 0; j < posts.size(); j++) {
				if (posts.get(j).getTitulo().equals(title)) {
					posts.remove(j);					
				} else {
					System.out.println("Error al intentar borrar");
				}
			}
	    }
	    
	    public String showPost(int number) {
			
			if (number<posts.size() && number > 0) {
				return posts.get(number-1).toString();
			}
			return "Número incorrecto";
		}
	    
	    public String showAll() {
			String result = "";
			for (Post post: posts) {
			result = result + post.toString() + "\n";
			}
			return result;
		}

		
}
