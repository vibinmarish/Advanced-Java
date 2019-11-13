/*
import java.rmi.*;
import java.rmi.server.UnicastRemoteObject;

//These are to be written on server side
interface step1 extends Remote {
    void writeMessage(String s) throws RemoteException;
}

class step2 extends UnicastRemoteObject implements step1 {
     step2() throws RemoteException {
    }

    public void writeMessage(String s) throws RemoteException {
        System.out.println(s);
    }
}

class server_side_program {
    public static void main(String args[]) throws RemoteException {
        step1 s = new step2();
        Naming.rebind("url", s);
    }
}

//This is to be written on client side
public class rmiprogram {
    public static void main(String args[]) {
        step1 s = (step2) Naming.lookup("rmi://url");
        s.writeMessage("hello world");
    }
}
*/