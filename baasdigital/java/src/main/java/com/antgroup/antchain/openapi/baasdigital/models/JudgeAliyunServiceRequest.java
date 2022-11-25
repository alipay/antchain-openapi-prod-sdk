// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdigital.models;

import com.aliyun.tea.*;

public class JudgeAliyunServiceRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 联盟ID
    @NameInMap("consortium_id")
    @Validation(required = true, minLength = 1)
    public String consortiumId;

    // 蚂蚁链ID
    @NameInMap("bizid")
    @Validation(required = true, minLength = 1)
    public String bizid;

    public static JudgeAliyunServiceRequest build(java.util.Map<String, ?> map) throws Exception {
        JudgeAliyunServiceRequest self = new JudgeAliyunServiceRequest();
        return TeaModel.build(map, self);
    }

    public JudgeAliyunServiceRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public JudgeAliyunServiceRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public JudgeAliyunServiceRequest setConsortiumId(String consortiumId) {
        this.consortiumId = consortiumId;
        return this;
    }
    public String getConsortiumId() {
        return this.consortiumId;
    }

    public JudgeAliyunServiceRequest setBizid(String bizid) {
        this.bizid = bizid;
        return this;
    }
    public String getBizid() {
        return this.bizid;
    }

}
