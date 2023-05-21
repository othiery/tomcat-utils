package fr.thieol.tomcat.installer.example;
import java.io.IOException;

import fr.thieol.tomcat.installer.core.TomcatInstaller;
import fr.thieol.tomcat.installer.core.TomcatServerProperties;

public class Example {

	public static void main(String[] args) throws IOException {
		
		final TomcatServerProperties properties = TomcatServerProperties.builder()
				.host("192.168.0.10")
				.user("olivier")
				.password("olivier").build();

		TomcatInstaller tomcatInstaller = new TomcatInstaller(properties);
		tomcatInstaller.stop();


	}

}
