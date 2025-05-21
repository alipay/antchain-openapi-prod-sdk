// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dog.models;

import com.aliyun.tea.*;

public class GetAgeRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 数组结构体
    @NameInMap("dog")
    public java.util.List<Dog> dog;

    // 狗狗的id
    @NameInMap("id")
    @Validation(required = true)
    public Long id;

    // 结构体
    @NameInMap("home")
    @Validation(required = true)
    public DogHome home;

    // alipay
    @NameInMap("file_id")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String fileId;

    // test
    @NameInMap("test")
    @Validation(required = true)
    public String test;

    public static GetAgeRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAgeRequest self = new GetAgeRequest();
        return TeaModel.build(map, self);
    }

    public GetAgeRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public GetAgeRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public GetAgeRequest setDog(java.util.List<Dog> dog) {
        this.dog = dog;
        return this;
    }
    public java.util.List<Dog> getDog() {
        return this.dog;
    }

    public GetAgeRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public GetAgeRequest setHome(DogHome home) {
        this.home = home;
        return this;
    }
    public DogHome getHome() {
        return this.home;
    }

    public GetAgeRequest setFileId(String fileId) {
        this.fileId = fileId;
        return this;
    }
    public String getFileId() {
        return this.fileId;
    }

    public GetAgeRequest setTest(String test) {
        this.test = test;
        return this;
    }
    public String getTest() {
        return this.test;
    }

}
