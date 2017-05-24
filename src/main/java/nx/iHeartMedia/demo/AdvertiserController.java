package nx.iHeartMedia.demo;

import java.util.UUID;
import javax.persistence.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.*;

/**
 * Created by Nx on 5/24/2017.
 */
@RestController
@RequestMapping("/api/advertiser")
public class AdvertiserController {
    @RequestMapping(method=RequestMethod.GET)
    public Advertiser[] getAdvertisers() {
        return null;
    }

    @RequestMapping(value="/{id}", method=RequestMethod.GET)
    public Advertiser getAdvertiser(@PathVariable UUID id) {
        return null;
    }

    @RequestMapping(method=RequestMethod.POST, headers="Content-Type=application/json")
    public void createAdvertiser(@RequestBody Advertiser advertiser) {

    }

    @RequestMapping(value="/{id}", method=RequestMethod.PUT, headers="Content-Type=application/json")
    public void updateAdvertiser(@PathVariable UUID id, @RequestBody Advertiser advertiser) {

    }

    @RequestMapping(value="/{id}", method=RequestMethod.DELETE)
    public void deleteAdvertiser(@PathVariable UUID id) {

    }

    @RequestMapping(value="/{id}/validateTransaction", method=RequestMethod.POST, headers="Content-Type=application/json")
    public ResponseEntity<?> validateTransaction(@PathVariable UUID id, @RequestParam("credit") double credit) {
        Advertiser advertiser = this.getAdvertiser(id);
        if(advertiser == null)
            return new ResponseEntity<Object>( false, HttpStatus.NOT_FOUND /* this should return something other than 404 */);

        if((advertiser.credit_limit - advertiser.credit_balance) >= credit)
            return new ResponseEntity<Object>( true, HttpStatus.OK);

        return new ResponseEntity<Object>( false, HttpStatus.OK);
    }
}
