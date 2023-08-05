//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.0 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.08.05 at 04:40:10 PM IST 
//


package springbootsoap.com.products;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the springbootsoap.com.products package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _CreateProductRequest_QNAME = new QName("http://com.springbootsoap/products", "CreateProductRequest");
    private final static QName _CreateProductResponse_QNAME = new QName("http://com.springbootsoap/products", "CreateProductResponse");
    private final static QName _GetProductRequest_QNAME = new QName("http://com.springbootsoap/products", "GetProductRequest");
    private final static QName _GetProductResponse_QNAME = new QName("http://com.springbootsoap/products", "GetProductResponse");
    private final static QName _UpdateProductRequest_QNAME = new QName("http://com.springbootsoap/products", "UpdateProductRequest");
    private final static QName _UpdateProductResponse_QNAME = new QName("http://com.springbootsoap/products", "UpdateProductResponse");
    private final static QName _DeleteProductRequest_QNAME = new QName("http://com.springbootsoap/products", "DeleteProductRequest");
    private final static QName _DeleteProductResponse_QNAME = new QName("http://com.springbootsoap/products", "DeleteProductResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: springbootsoap.com.products
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CreateProductRequest }
     * 
     */
    public CreateProductRequest createCreateProductRequest() {
        return new CreateProductRequest();
    }

    /**
     * Create an instance of {@link CreateProductResponse }
     * 
     */
    public CreateProductResponse createCreateProductResponse() {
        return new CreateProductResponse();
    }

    /**
     * Create an instance of {@link GetProductRequest }
     * 
     */
    public GetProductRequest createGetProductRequest() {
        return new GetProductRequest();
    }

    /**
     * Create an instance of {@link GetProductResponse }
     * 
     */
    public GetProductResponse createGetProductResponse() {
        return new GetProductResponse();
    }

    /**
     * Create an instance of {@link UpdateProductRequest }
     * 
     */
    public UpdateProductRequest createUpdateProductRequest() {
        return new UpdateProductRequest();
    }

    /**
     * Create an instance of {@link UpdateProductResponse }
     * 
     */
    public UpdateProductResponse createUpdateProductResponse() {
        return new UpdateProductResponse();
    }

    /**
     * Create an instance of {@link DeleteProductRequest }
     * 
     */
    public DeleteProductRequest createDeleteProductRequest() {
        return new DeleteProductRequest();
    }

    /**
     * Create an instance of {@link DeleteProductResponse }
     * 
     */
    public DeleteProductResponse createDeleteProductResponse() {
        return new DeleteProductResponse();
    }

    /**
     * Create an instance of {@link Product }
     * 
     */
    public Product createProduct() {
        return new Product();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateProductRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CreateProductRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://com.springbootsoap/products", name = "CreateProductRequest")
    public JAXBElement<CreateProductRequest> createCreateProductRequest(CreateProductRequest value) {
        return new JAXBElement<CreateProductRequest>(_CreateProductRequest_QNAME, CreateProductRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateProductResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CreateProductResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://com.springbootsoap/products", name = "CreateProductResponse")
    public JAXBElement<CreateProductResponse> createCreateProductResponse(CreateProductResponse value) {
        return new JAXBElement<CreateProductResponse>(_CreateProductResponse_QNAME, CreateProductResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetProductRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetProductRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://com.springbootsoap/products", name = "GetProductRequest")
    public JAXBElement<GetProductRequest> createGetProductRequest(GetProductRequest value) {
        return new JAXBElement<GetProductRequest>(_GetProductRequest_QNAME, GetProductRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetProductResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetProductResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://com.springbootsoap/products", name = "GetProductResponse")
    public JAXBElement<GetProductResponse> createGetProductResponse(GetProductResponse value) {
        return new JAXBElement<GetProductResponse>(_GetProductResponse_QNAME, GetProductResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateProductRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UpdateProductRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://com.springbootsoap/products", name = "UpdateProductRequest")
    public JAXBElement<UpdateProductRequest> createUpdateProductRequest(UpdateProductRequest value) {
        return new JAXBElement<UpdateProductRequest>(_UpdateProductRequest_QNAME, UpdateProductRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateProductResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UpdateProductResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://com.springbootsoap/products", name = "UpdateProductResponse")
    public JAXBElement<UpdateProductResponse> createUpdateProductResponse(UpdateProductResponse value) {
        return new JAXBElement<UpdateProductResponse>(_UpdateProductResponse_QNAME, UpdateProductResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteProductRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DeleteProductRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://com.springbootsoap/products", name = "DeleteProductRequest")
    public JAXBElement<DeleteProductRequest> createDeleteProductRequest(DeleteProductRequest value) {
        return new JAXBElement<DeleteProductRequest>(_DeleteProductRequest_QNAME, DeleteProductRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteProductResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DeleteProductResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://com.springbootsoap/products", name = "DeleteProductResponse")
    public JAXBElement<DeleteProductResponse> createDeleteProductResponse(DeleteProductResponse value) {
        return new JAXBElement<DeleteProductResponse>(_DeleteProductResponse_QNAME, DeleteProductResponse.class, null, value);
    }

}