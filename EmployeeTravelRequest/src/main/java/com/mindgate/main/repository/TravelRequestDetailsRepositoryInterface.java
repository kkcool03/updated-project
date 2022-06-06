package com.mindgate.main.repository;

import java.util.List;

import com.mindgate.main.pojo.TravelAgentDetails;
import com.mindgate.main.pojo.TravelRequest;

public interface TravelRequestDetailsRepositoryInterface {
	
//	    public boolean addNewTravelAgent(TravelRequest travelRequest);
//	     
//	    public boolean updateTravelAgent(TravelRequest travelRequest);
//	     
//	    public boolean deleteTravelAgentByAgentId(int agentId);
	     
	    public TravelAgentDetails getSingleRequestByRequestId(int travelRequestId);
	     
	    public List<TravelAgentDetails> getAllRequest();
	}
