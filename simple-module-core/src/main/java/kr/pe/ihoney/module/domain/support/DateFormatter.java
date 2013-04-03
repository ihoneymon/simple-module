package kr.pe.ihoney.module.domain.support;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import org.springframework.format.Formatter;

/**
 * Date <-> String Format 변경
 * @author honeymon
 * @see <a href="http://static.springsource.org/spring/docs/3.2.x/spring-framework-reference/html/validation.html#format-Formatter-SPI">Formatter SPI</a>
 */
public class DateFormatter implements Formatter<Date> {

	private String pattern = "${date.pattern}";

	@Override
	public String print(Date date, Locale locale) {
        if (date == null) {
            return "";
        }
        return getDateFormat(locale).format(date);
    }

	@Override
    public Date parse(String formatted, Locale locale) throws ParseException {
        if (formatted.length() == 0) {
            return null;
        }
        return getDateFormat(locale).parse(formatted);
    }

    protected DateFormat getDateFormat(Locale locale) {
        DateFormat dateFormat = new SimpleDateFormat(this.pattern, locale);
        dateFormat.setLenient(false);
        return dateFormat;
    }

}
