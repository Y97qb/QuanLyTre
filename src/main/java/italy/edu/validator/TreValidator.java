//package italy.edu.validator;
//
//import org.springframework.validation.Errors;
//import org.springframework.validation.ValidationUtils;
//import org.springframework.validation.Validator;
//
//import italy.edu.entity.Tre;
//
//public class TreValidator implements Validator{
//
//	@Override
//	public boolean supports(Class<?> clazz) {
//		return Tre.class.isAssignableFrom(clazz);
//	}
//
//	@Override
//	public void validate(Object target, Errors errors) {
//		Tre tre = (Tre) target;
//		if(tre.getLop().getMaLop() == null && tre.getLop().getMaLop() == "" ) {
//				errors.rejectValue("maLop", "fied.required"); 
//			}
//		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "ngaySinh","fied.required");
//		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "hoTen","fied.required");
//	}
//}
