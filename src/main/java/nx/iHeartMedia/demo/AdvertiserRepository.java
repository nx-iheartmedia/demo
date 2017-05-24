package nx.iHeartMedia.demo;

import java.lang.annotation.Annotation;
import java.util.Optional;
import java.util.UUID;
import javax.persistence.*;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.Repository;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.*;
import org.springframework.data.repository.*;

/**
 * Created by Nx on 5/24/2017.
 */
@org.springframework.stereotype.Repository
public interface AdvertiserRepository extends Repository<Advertiser, UUID> {
    Iterable<Advertiser> findAll(Sort sort);

    Page<Advertiser> findAll(Pageable pageable);

    Optional<Advertiser> findOne(UUID id);

    void Save(Advertiser advertiser);
}

