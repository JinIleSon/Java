package test7.sub04;

import java.util.ArrayList;
import java.util.List;

public class Board {
	private List<Article> articles;
	private List<User> users;
	
	public Board() {
		articles = new ArrayList<>();
		users = new ArrayList<>();
	}
	
	public void addArticle(Article articles) {
		this.articles.add(articles);
	}
	
	public void addUser(User users) {
		this.users.add(users);
	}
	
	public List<Article> getArticles() {
		return articles;
	}
	
	public List<User> getUsers() {
		return users;
	}
}
