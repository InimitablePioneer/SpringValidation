package hello.itemservice.web.validation;

import hello.itemservice.domain.item.Item;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

public class ItemValidator implements Validator {

    @Override
    public boolean supports(Class<?> clazz) {
        return Item.class.isAssignableFrom(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {

    }
}
