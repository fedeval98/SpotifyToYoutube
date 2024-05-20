package com.playlistswitcher.playlisttransfer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
//@PropertySource("classpath:.env")
public class PlaylisttransferApplication {

	public static void main(String[] args) {
		SpringApplication.run(PlaylisttransferApplication.class, args);
	}

}
