// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class VerifyPrivatepersonTwometaRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 个人信息
    @NameInMap("person_info")
    @Validation(required = true)
    public PersonInfo personInfo;

    // 私有云实例id
    @NameInMap("instance_id")
    @Validation(required = true)
    public String instanceId;

    public static VerifyPrivatepersonTwometaRequest build(java.util.Map<String, ?> map) throws Exception {
        VerifyPrivatepersonTwometaRequest self = new VerifyPrivatepersonTwometaRequest();
        return TeaModel.build(map, self);
    }

    public VerifyPrivatepersonTwometaRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public VerifyPrivatepersonTwometaRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public VerifyPrivatepersonTwometaRequest setPersonInfo(PersonInfo personInfo) {
        this.personInfo = personInfo;
        return this;
    }
    public PersonInfo getPersonInfo() {
        return this.personInfo;
    }

    public VerifyPrivatepersonTwometaRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
