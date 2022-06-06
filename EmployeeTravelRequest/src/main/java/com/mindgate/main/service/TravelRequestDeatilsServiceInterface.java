package com.mindgate.main.service;

import java.util.List;

import com.mindgate.main.pojo.TravelRequest;


public interface TravelRequestDeatilsServiceInterface {
//public boolean addNewTravelAgent(TravelAgentDetails travelAgentDetails);
//    
//    public boolean updateTravelAgent(TravelAgentDetails travelAgentDetails);
//    
//    public boolean deleteTravelAgentByAgentId(int agentId);
    
    public TravelRequest getTravelRequestDetailsById(int travelRequestId);
    
    public List<TravelRequest> getAllAgentDetails();
}
