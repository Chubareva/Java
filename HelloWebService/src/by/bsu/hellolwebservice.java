package by.bsu;


        import javax.jws.WebMethod;
        import javax.jws.WebService;
        import javax.jws.soap.SOAPBinding;

// говорим, что наш интерфейс будет работать как веб-сервис
@WebService
// говорим, что веб-сервис будет использоваться для вызова методов
@SOAPBinding(style = SOAPBinding.Style.RPC)
public interface hellowebservice {
    // говорим, что этот метод можно вызывать удаленно
    @WebMethod
    public String getHelloString(String name);
}