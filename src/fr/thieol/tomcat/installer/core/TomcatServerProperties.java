package fr.thieol.tomcat.installer.core;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.With;

@Getter @Setter @Builder
public class TomcatServerProperties {

	@With private String host;
	@With private String user;
	@With private String password;

}
