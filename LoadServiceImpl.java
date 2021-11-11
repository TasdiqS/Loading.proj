package com.SpringLogi.SpringLogis.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SpringLogi.SpringLogis.entities.Load;

@Service
public class LoadServiceImpl implements ServiceInterface{

	List<Load>list;
//	UUID id1=UUID.randomUUID();
//	UUID id2=UUID.randomUUID();
	
	
	public LoadServiceImpl() {
		list=new ArrayList<>();
		
		list.add(new Load(101, LocalDate.now(), "Delhi", "Jaipur", "Chemical", "Canter", 1, 100, " "));
		list.add(new Load(102, LocalDate.now(), "Gujarat", "Mumbai", "Garments", "Lorry", 2, 90, "Branded clothes"));
	}


	@Override
	public List<Load> getLoads() {
		return list;
	}


	@Override
	public Load getLoad(long loadId) {
		
		Load l=null;
		for(Load load : list) {
			if(load.getShipmentid()==loadId) {
				l=load;
				break;
			}
		}
		return l;
	}


	@Override
	public Load addLoad(Load load) {
		list.add(load);
		return load;
	}


	@Override
	public void deleteLoad(long loadId) {
		list=this.list.stream().filter(e->e.getShipmentid()!=loadId).collect(Collectors.toList());

	}


	@Override
	public Load updateLoad(Load load) {
		list.forEach(e -> {
			if(e.getShipmentid()==load.getShipmentid()) {
				e.setLoadingPoint(load.getLoadingPoint());
				e.setUnloadingPoint(load.getUnloadingPoint());
				e.setNoOfTrucks(load.getNoOfTrucks());
				e.setTruckType(load.getTruckType());
				e.setWeight(load.getWeight());
				e.setOptional(load.getOptional());
				
			}
		});
		return load;
	}


}
