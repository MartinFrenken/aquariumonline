import Communication.AquariumControllable;
import Communication.ClientEndPoint;
import Communication.ClientEndPointable;
import Model.Aquariumable;

public class ClientManager implements ClientManagerable
{
    ClientEndPointable clientEndPointable;
    AquariumControllable controller;
    public ClientManager(AquariumControllable controller)
    {
        this.controller=controller;
        this.clientEndPointable=new ClientEndPoint();
        clientEndPointable.startClient();
    }
    public void updateAquarium(Aquariumable aquariumable)
    {
        controller.updateObjects(aquariumable.getObjects());
    }
}
