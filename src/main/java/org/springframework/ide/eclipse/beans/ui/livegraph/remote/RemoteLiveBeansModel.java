package org.springframework.ide.eclipse.beans.ui.livegraph.remote;

import org.springframework.jmx.export.annotation.ManagedAttribute;
import org.springframework.jmx.export.annotation.ManagedResource;

@ManagedResource(objectName="bean:name=liveGraphModelBean", description="Spring live beans graph model")
public class RemoteLiveBeansModel implements IRemoteLiveBeansModel {

	private String name;
	
	@ManagedAttribute
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
}
