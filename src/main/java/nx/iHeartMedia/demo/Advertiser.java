package nx.iHeartMedia.demo;

import java.util.UUID;
import javax.persistence.*;
/**
 * Created by Nx on 5/23/2017.
 */
public class Advertiser {
 //   @Id
 //   @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    private String Name;

    private String PrimaryContact;

    private double CreditLimit;
}
