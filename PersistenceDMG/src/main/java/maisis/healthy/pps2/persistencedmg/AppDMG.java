/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package maisis.healthy.pps2.persistencedmg;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import healthy.PersonArchetype;
import healthy.rim.Person;
import healthy.rim.Role;
import healthy.rim.type.AD; //ad
import healthy.rim.type.AddressPurpose;
import healthy.rim.type.AddressType;
import healthy.rim.type.EN; //a
import healthy.rim.type.EntityNamePurpose;
import healthy.rim.type.EntityNameType;
import healthy.rim.type.II; //a
import healthy.rim.type.IVL; //a
import healthy.rim.type.TEL; //a
import healthy.rim.type.TS; //a
import healthy.rim.type.TelecomEquipment;
import healthy.rim.type.TelecomPurpose;
import healthy.rim.type.TelecomType;

/**
 *
 * @author Carlos Cardoso <carlos.cardoso@maisis.pt>
 */
public class AppDMG {

    public static void main(String[] args) {

        // instanciar Person
        // IDS
        //exemplo: objeto.getEntityIds().add(new II("NIF", "888888888", "Numero de Identificação Fiscal"));
       
        //Nomes - aqui usamos um tipo EN e os enum's 
        
        //Moradas - tipo AD e enum's
        
        //Telecomunicações - tipo TEL e enum's poderemos usara também tipos IVL<TS>(new TS(), new TS())
        
        //Regras / papel
        
        //instanciar Role
        
        // IDS 
        // no mínimmo uma roleId se é utente ou profissional
        // o resto da informação é facultativa
        
        //adicionar a role ao person criado com o método getRoles().add()
        
        // Instancia do objeto PersonArchetype passando o person   
        //seriço para a persistencia
        try {
            Client client = Client.create();
            WebResource webResourceDmgRim = client.resource("http://healthy.oobian.com/EntityManager/webresources/person");
            ClientResponse response;
            //substituir o objeto pela instancia do PersonArchetype criado anteriormente
            //descomentar as seguintes linhas
//            response = webResourceDmgRim.type("application/xml").post(ClientResponse.class, objeto);
//            System.out.println("Server Response: " + response.getStatus());
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
