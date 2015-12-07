package net.cbtltd.rest.quote;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import com.bookingnet.service.MailService;

import net.cbtltd.shared.Mail;

import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * The Class FlipkeyRest.
 */
@Path("/quote")
@Produces("application/json")
public class QuoteRest {

	private static final Logger LOG = Logger.getLogger(QuoteRest.class.getName());

	@POST
	@Path("/send")
	public static synchronized String send(@RequestBody String json) {

		Mail mail = new Mail();
		mail.setSubject("Quote send endpoint");
		mail.setContent(json);
		mail.setRecipients("mike793@gmail.com, konstantinnvlasov@gmail.com");
		MailService.send(mail);

		System.out.println(json);
		System.out.println("test email sending");
		
		return "{\"success\": true}";
	}
}
