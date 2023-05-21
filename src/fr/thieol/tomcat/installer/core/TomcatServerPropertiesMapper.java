package fr.thieol.tomcat.installer.core;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import fr.thieol.sshutils.core.SshProperties;

@Mapper
public interface TomcatServerPropertiesMapper {

	TomcatServerPropertiesMapper INSTANCE = Mappers.getMapper( TomcatServerPropertiesMapper.class ); 
    
	SshProperties sshPropertiesToTomcatServerProperties(TomcatServerProperties tomcatServerProperties); 

}
