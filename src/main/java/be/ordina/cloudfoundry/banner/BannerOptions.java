package be.ordina.cloudfoundry.banner;

import org.springframework.web.multipart.MultipartFile;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BannerOptions {

    private MultipartFile image;
    private boolean dark;
}
