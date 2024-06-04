public class ResponseLine extends HttpResponse {
    private String protocol;
    private String code;
    private String codeText;
    public ResponseLine(String header, String body, String protocol, String code,
            String codeText) {
        super(header, body);
        this.protocol = protocol;
        this.code = code;
        this.codeText = codeText;
    }
    @Override
    public String toString() {
        return "responseLine [protocol=" + protocol + ", code=" + code + ", codeText=" + codeText + super.toString()+"]" ;
    }

    
    
}
