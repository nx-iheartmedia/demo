package nx.iHeartMedia.demo;

import java.util.UUID;
import java.util.Optional;
import javax.persistence.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.*;

/**
 * Created by Nx on 5/24/2017.
 */
@RestController
@RequestMapping("/api/advertiser")
public class AdvertiserController {
  //  @Autowired
    private AdvertiserRepository repository;

    @RequestMapping(method=RequestMethod.GET)
    public Advertiser[] getAdvertisers() {
        return new Advertiser[0];
    }

    @RequestMapping(value="/{id}", method=RequestMethod.GET)
    public Optional<Advertiser> getAdvertiser(@PathVariable UUID id) {
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
        Optional<Advertiser> advertiser = this.getAdvertiser(id);
        if(!advertiser.isPresent())
            return new ResponseEntity<Object>( false, HttpStatus.NOT_FOUND /* this should return something other than 404 */);

        if((advertiser.get().credit_limit - advertiser.get().credit_balance) >= credit)
            return new ResponseEntity<Object>( true, HttpStatus.OK);

        return new ResponseEntity<Object>( false, HttpStatus.OK);
    }
}
