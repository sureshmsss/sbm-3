package ss.it.service;

import java.util.List;

import ss.it.entity.PC;
//import ss.it.exception.TouristNotFoundException;

public interface IPCMgmtService {
//     public   String  registerTourist(Tourist tourist);
     public   List<PC> fetchAllPcs();
 //    public   Tourist   fetchTouristById(Integer tid)throws TouristNotFoundException;
  //   public    String   updateTouristDetails(Tourist tourist)throws TouristNotFoundException;
  //  public  String    deleteTourist(Integer tid)throws TouristNotFoundException;
 //   public  String  updateTouristBudgetById(Integer id, Float hikePercent)throws TouristNotFoundException;
}