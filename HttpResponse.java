public class HttpResponse {
    private String responceLine;
    private String header;
    private String body ;
    public HttpResponse(String header, String responceLine, String body) {
        this.header = header;
        this.responceLine = responceLine;
        this.body = body;
    }
    @Override
    public String toString() {
        return "HttpResponse [header=" + header + ", responceLine=" + responceLine + ", body=" + body + "]";
    }
    public String getHeader() {
        return header;
    }
    public String getResponceLine() {
        return responceLine;
    }
    public String getBody() {
        return body;
    }
    public void setHeader(String header) {
        this.header = header;
    }
    public void setResponceLine(String responceLine) {
        this.responceLine = responceLine;
    }
    public void setBody(String body) {
        this.body = body;
    }
    
    public HttpResponse(String header, String body) {
        this.header = header;
        this.body = body;
    }
    public static void main(String[] args) {
       ResponseLine response1 = new ResponseLine("http /", "1,1 ","200 ok ", "seurver....","html");
       System.out.println( response1);
    }
    
}
