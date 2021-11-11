package com.SpringLogi.SpringLogis.Service;

import java.util.List;
import java.util.UUID;

import com.SpringLogi.SpringLogis.entities.Load;

public interface ServiceInterface {
	
	public List<Load> getLoads();

	public Load getLoad(long loadId);

	public Load addLoad(Load load);

	public void deleteLoad(long l);

	public Load updateLoad(Load load);
	
}