public class AgenciaViagem {
  
  private CompanhiaAerea companhiaAerea;
  private AgenciaHotel agenciaHotel;
  
  public void reservarPassagemEDiaria(){
    companhiaAerea.reservar();
    agenciaHotel.reservar();
  }
  
}
