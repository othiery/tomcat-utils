package fr.thieol.tomcat.installer.core;
import java.io.IOException;

import fr.thieol.sshutils.core.SshProperties;
import fr.thieol.sshutils.executors.TomcatExecutor;

public class TomcatInstaller {

	private TomcatServerProperties tomcatServerProperties;
	
	public TomcatInstaller(TomcatServerProperties tomcatServerProperties) {
		this.tomcatServerProperties = tomcatServerProperties;
	}
	
	public void install() throws IOException {
		
		final SshProperties properties = 
				TomcatServerPropertiesMapper.INSTANCE
				.sshPropertiesToTomcatServerProperties(tomcatServerProperties);
		
		final TomcatExecutor executor = new TomcatExecutor(properties);
		System.out.println(executor.pwd());
		executor.close();
		


	}
	
	public void start() throws IOException {
		final SshProperties properties = 
				TomcatServerPropertiesMapper.INSTANCE
				.sshPropertiesToTomcatServerProperties(tomcatServerProperties);
		System.out.println("starting tomcat");
		final TomcatExecutor executor = new TomcatExecutor(properties);
		executor.startTomcat(null);
		executor.close();
		
	}
	
	public void stop() throws IOException {
		final SshProperties properties = 
				TomcatServerPropertiesMapper.INSTANCE
				.sshPropertiesToTomcatServerProperties(tomcatServerProperties);
		System.out.println("stopping tomcat");
		final TomcatExecutor executor = new TomcatExecutor(properties);
		executor.stopTomcat(null);
		executor.close();
		
	}
}
