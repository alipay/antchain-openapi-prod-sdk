// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.demo.models;

import com.aliyun.tea.*;

public class ACreateStructRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // TestObject
    @NameInMap("structa")
    public TestObject structa;

    // TestAPIObject
    @NameInMap("structb")
    public TestAPIObject structb;

    // A
    @NameInMap("structc")
    public A structc;

    // Map
    @NameInMap("structd")
    public Map structd;

    // NestModel
    @NameInMap("structe")
    public NestModel structe;

    // 超时时间
    @NameInMap("timeout")
    public String timeout;

    // 新增结构体
    @NameInMap("another_class")
    public AnotherClass anotherClass;

    public static ACreateStructRequest build(java.util.Map<String, ?> map) throws Exception {
        ACreateStructRequest self = new ACreateStructRequest();
        return TeaModel.build(map, self);
    }

    public ACreateStructRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ACreateStructRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ACreateStructRequest setStructa(TestObject structa) {
        this.structa = structa;
        return this;
    }
    public TestObject getStructa() {
        return this.structa;
    }

    public ACreateStructRequest setStructb(TestAPIObject structb) {
        this.structb = structb;
        return this;
    }
    public TestAPIObject getStructb() {
        return this.structb;
    }

    public ACreateStructRequest setStructc(A structc) {
        this.structc = structc;
        return this;
    }
    public A getStructc() {
        return this.structc;
    }

    public ACreateStructRequest setStructd(Map structd) {
        this.structd = structd;
        return this;
    }
    public Map getStructd() {
        return this.structd;
    }

    public ACreateStructRequest setStructe(NestModel structe) {
        this.structe = structe;
        return this;
    }
    public NestModel getStructe() {
        return this.structe;
    }

    public ACreateStructRequest setTimeout(String timeout) {
        this.timeout = timeout;
        return this;
    }
    public String getTimeout() {
        return this.timeout;
    }

    public ACreateStructRequest setAnotherClass(AnotherClass anotherClass) {
        this.anotherClass = anotherClass;
        return this;
    }
    public AnotherClass getAnotherClass() {
        return this.anotherClass;
    }

}
