public class HttpRequest{
    private String header;
    private String requestLine;
    private String body ;
    @Override
    public String toString() {
        return "HttpRequest [header=" + header + ", requestLine=" + requestLine + ", body=" + body + "]";
    }
    public String getHeader() {
        return header;
    }
    public String getRequestLine() {
        return requestLine;
    }
    public String getBody() {
        return body;
    }
    public HttpRequest(String header, String requestLine, String body) {
        this.header = header;
        this.requestLine = requestLine;
        this.body = body;
    }
    public void setHeader(String header) {
        this.header = header;
    }
    public void setRequestLine(String requestLine) {
        this.requestLine = requestLine;
    }
    public void setBody(String body) {
        this.body = body;
    }
    public static void main(String[] args) {
        HttpRequest request1= new HttpRequest("GET / INDEX.HTML HTTP 1,1 ","HOST:..." ,"HTML");
        System.out.println(request1);
    }

}