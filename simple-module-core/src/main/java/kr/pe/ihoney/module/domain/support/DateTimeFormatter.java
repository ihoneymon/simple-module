package kr.pe.ihoney.module.domain.support;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;

import org.joda.time.DateTime;
import org.springframework.format.Formatter;

/**
 * DateTime <-> String Format 변경
 * @author honeymon
 * @see <a href="http://static.springsource.org/spring/docs/3.2.x/spring-framework-reference/html/validation.html#format-Formatter-SPI">Formatter SPI</a>
 */
public class DateTimeFormatter implements Formatter<DateTime> {

	private String pattern = "${date.pattern}";
	
	@Override
    public String print(DateTime date, Locale locale) {
	if (date == null) {
            return "";
        }
        return getDateFormat(locale).format(date.toDate());
    }

    @Override
    public DateTime parse(String formatted, Locale locale) throws ParseException {
	if (formatted.length() == 0) {
            return null;
        }
        return new DateTime(getDateFormat(locale).parse(formatted));
    }

    protected DateFormat getDateFormat(Locale locale) {
        DateFormat dateFormat = new SimpleDateFormat(this.pattern, locale);
        dateFormat.setLenient(false);
        
        return dateFormat;
    }
}
