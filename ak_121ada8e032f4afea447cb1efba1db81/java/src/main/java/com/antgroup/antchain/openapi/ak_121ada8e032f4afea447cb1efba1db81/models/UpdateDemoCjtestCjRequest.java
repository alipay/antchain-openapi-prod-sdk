// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_121ada8e032f4afea447cb1efba1db81.models;

import com.aliyun.tea.*;

public class UpdateDemoCjtestCjRequest extends TeaModel {
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

    public static UpdateDemoCjtestCjRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateDemoCjtestCjRequest self = new UpdateDemoCjtestCjRequest();
        return TeaModel.build(map, self);
    }

    public UpdateDemoCjtestCjRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UpdateDemoCjtestCjRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public UpdateDemoCjtestCjRequest setVar1(String var1) {
        this.var1 = var1;
        return this;
    }
    public String getVar1() {
        return this.var1;
    }

    public UpdateDemoCjtestCjRequest setVar2(String var2) {
        this.var2 = var2;
        return this;
    }
    public String getVar2() {
        return this.var2;
    }

    public UpdateDemoCjtestCjRequest setSubject(String subject) {
        this.subject = subject;
        return this;
    }
    public String getSubject() {
        return this.subject;
    }

}
