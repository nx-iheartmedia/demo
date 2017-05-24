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

    @Column(nullable = false)
    public String name;

    @Column(nullable = false)
    public String primary_contact;

    @Column(nullable = false)
    public double credit_limit;

    @Column(nullable = false)
    public double credit_balance = 0d;

    Advertiser() {}

    public Advertiser(UUID id, String name, String primaryContact, double creditLimit, double creditBalance) {
        this.id = id;
        this.name = name;
        this.primary_contact = primaryContact;
        this.credit_limit = creditLimit;
        this.credit_balance = creditBalance;
    }
}
