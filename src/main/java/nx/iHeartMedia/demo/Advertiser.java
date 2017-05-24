package nx.iHeartMedia.demo;

import java.util.UUID;
import javax.persistence.*;

/**
 * Created by Nx on 5/23/2017.
 */
@Entity
public class Advertiser {
    @Id
    @GeneratedValue
    public UUID id;

    public String name;

    public String primary_contact;

    public double credit_limit;

    public Advertiser(UUID id, String name, String primaryContact, double creditLimit) {
        this.id = id;
        this.name = name;
        this.primary_contact = primaryContact;
        this.credit_limit = creditLimit;
    }
}
