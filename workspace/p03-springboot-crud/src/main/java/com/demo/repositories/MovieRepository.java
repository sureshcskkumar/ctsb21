package com.demo.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.demo.entities.Movie;


public interface MovieRepository extends JpaRepository<Movie, Integer>{
	
	public List<Movie> findByTitle(String title);
	
	// not -> sql, hql
	@Query(value="select obj from Movie obj where obj.title=?1 and obj.id=?2", nativeQuery = false)
	public Movie findData(String str, int n);
}


//@Repository
//public class MovieRepository<T> {
//
//	List<T> findAll(){return null;}
//	T findById(int id){return null;}
//	T findByTitle(String title){return null;}
//	T save(T m){return null;}
//	
//	T deleteById(int id){return null;}
//	
//}

//class BookRepository {
//
//	List<Book> findAllBook(){return null;}
//	Book findBookById(int id){return null;}
//	Book findBookByTitle(String title){return null;}
//	Book saveBook(Book m){return null;}
//	
//	Book deleteBookById(int id){return null;}
//	
//}






//class MyRepository<T> {
//
//	List<T> findAll(){return null;}
//	T findById(int id){return null;}
//	T findByTitle(String title){return null;}
//	T save(T m){return null;}
//	
//	T deleteById(int id){return null;}
//	
//}
//
//
//class Demo{
//	public static void main(String[] args) {
//		MyRepository<Movie> repo = new MyRepository();
//		
//		List<Movie> findAll = repo.findAll();
//	}
//}




