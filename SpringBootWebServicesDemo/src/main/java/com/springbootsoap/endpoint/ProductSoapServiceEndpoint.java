package com.springbootsoap.endpoint;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.springbootsoap.model.Product1;
import com.springbootsoap.service.ProductService;

import springbootsoap.com.products.CreateProductRequest;
import springbootsoap.com.products.CreateProductResponse;
import springbootsoap.com.products.GetProductRequest;
import springbootsoap.com.products.GetProductResponse;
import springbootsoap.com.products.Product;


@Endpoint
public class ProductSoapServiceEndpoint {
    private static final String NAMESPACE_URI = "http://com.springbootsoap/products";

    @Autowired
    private ProductService productService;

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "GetProductRequest")
    @ResponsePayload
    public GetProductResponse getProduct(@RequestPayload GetProductRequest request) {
        Long productId = request.getProductId();
       // Product product = productService.getProductById(productId);

        GetProductResponse response = new GetProductResponse();
        response.setProduct(productService.getProductById(productId));
       // response.setProduct(product);
        return response;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "CreateProductRequest")
    @ResponsePayload
    public CreateProductResponse createProduct(@RequestPayload CreateProductRequest request) {
        Product product = request.getProduct();
        Product1  product1=new Product1();
        product1.setId(product.getId());
        product1.setName(product.getName());
        product1.setPrice(product.getPrice());
        productService.saveProduct(product1);

        CreateProductResponse response = new CreateProductResponse();
        response.setProductId(product.getId());
        return response;
    }
//
//    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "UpdateProductRequest")
//    @ResponsePayload
//    public UpdateProductResponse updateProduct(@RequestPayload UpdateProductRequest request) {
//       // Product product = request.getProduct();
//       // product = productService.saveProduct(request.getProduct());
//
//        UpdateProductResponse response = new UpdateProductResponse();
//        response.setProduct( productService.saveProduct(request.getProduct()));
//        return response;
//    }

//    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "DeleteProductRequest")
//    @ResponsePayload
//    public DeleteProductResponse deleteProduct(@RequestPayload DeleteProductRequest request) {
//        Long productId = request.getProductId();
//        productService.deleteProduct(productId);
//
//        DeleteProductResponse response = new DeleteProductResponse();
//        response.setSuccess(true);
//        return response;
//    }
}