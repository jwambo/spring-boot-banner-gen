package be.ordina.cloudfoundry.validation;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;
import org.springframework.web.multipart.MultipartFile;

import be.ordina.cloudfoundry.banner.BannerOptions;

public class UploadValidator implements Validator {

    @Override
    public boolean supports(Class<?> clazz) {
        return BannerOptions.class.equals(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
        BannerOptions options = (BannerOptions) target;
        MultipartFile multipartFile = options.getImage();
        if (multipartFile == null || multipartFile.isEmpty()) {
            errors.rejectValue("image", "required");
        }
    }
}
