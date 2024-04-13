package tags;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

public class taghandler extends TagSupport {

	@Override
	public int doStartTag() throws JspException {
		// TODO Auto-generated method stub
		try {
			JspWriter out=pageContext.getOut();
			out.println("<h1>hello from tag</h1>");
		} catch(Exception e) {
			e.printStackTrace();
		}
		return super.doStartTag();
	}

}
