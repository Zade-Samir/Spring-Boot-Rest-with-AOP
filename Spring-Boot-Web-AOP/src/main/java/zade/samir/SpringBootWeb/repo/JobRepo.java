package zade.samir.SpringBootWeb.repo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import zade.samir.SpringBootWeb.model.JobPost;

@Repository
public interface JobRepo extends JpaRepository<JobPost, Integer>   {
	
	List<JobPost> findByPostProfileContainingOrPostDescContaining(String postProfile, String postDesc);

}






