// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.demo.models;

import com.aliyun.tea.*;

public class UpdateCjtestCjRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 测试参数
    @NameInMap("var1")
    @Validation(required = true)
    public String var1;

    // 测试参数2
    @NameInMap("var2")
    @Validation(required = true)
    public String var2;

    // 被授权机构did
    @NameInMap("subject")
    public String subject;

    // test
    @NameInMap("var3")
    @Validation(required = true, maximum = 100, minimum = 1)
    public Long var3;

    // 111
    @NameInMap("var4")
    @Validation(required = true, maxLength = 200, minLength = 2)
    public String var4;

    public static UpdateCjtestCjRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateCjtestCjRequest self = new UpdateCjtestCjRequest();
        return TeaModel.build(map, self);
    }

    public UpdateCjtestCjRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UpdateCjtestCjRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public UpdateCjtestCjRequest setVar1(String var1) {
        this.var1 = var1;
        return this;
    }
    public String getVar1() {
        return this.var1;
    }

    public UpdateCjtestCjRequest setVar2(String var2) {
        this.var2 = var2;
        return this;
    }
    public String getVar2() {
        return this.var2;
    }

    public UpdateCjtestCjRequest setSubject(String subject) {
        this.subject = subject;
        return this;
    }
    public String getSubject() {
        return this.subject;
    }

    public UpdateCjtestCjRequest setVar3(Long var3) {
        this.var3 = var3;
        return this;
    }
    public Long getVar3() {
        return this.var3;
    }

    public UpdateCjtestCjRequest setVar4(String var4) {
        this.var4 = var4;
        return this;
    }
    public String getVar4() {
        return this.var4;
    }

}
