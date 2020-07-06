package se.plilja;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;
import se.plilja.loadingcache.LoadingCacheConfiguration;

@SpringBootApplication
@Import(LoadingCacheConfiguration.class)
public class LoadingCacheApplication {

	public static void main(String[] args) {
		SpringApplication.run(LoadingCacheApplication.class, args);
	}

}
