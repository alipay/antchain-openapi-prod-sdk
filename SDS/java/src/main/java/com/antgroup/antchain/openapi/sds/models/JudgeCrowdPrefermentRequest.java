// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.sds.models;

import com.aliyun.tea.*;

public class JudgeCrowdPrefermentRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 业务号：可以标识用户的编码，例如手机号，身份证号等，通过业务号类型来控制，与biz_no_type和encrypt_type共同确定编码形式。
    @NameInMap("biz_no")
    @Validation(required = true)
    public String bizNo;

    // 业务号类型：1-手机号，2-支付宝用户id
    @NameInMap("biz_no_type")
    @Validation(required = true)
    public String bizNoType;

    // 加密方式：0-不加密，1-SHA1，2-MD5
    @NameInMap("encrypt_type")
    @Validation(required = true)
    public String encryptType;

    // json结构，可以传递自定义参数
    @NameInMap("properties")
    @Validation(maxLength = 512)
    public String properties;

    public static JudgeCrowdPrefermentRequest build(java.util.Map<String, ?> map) throws Exception {
        JudgeCrowdPrefermentRequest self = new JudgeCrowdPrefermentRequest();
        return TeaModel.build(map, self);
    }

    public JudgeCrowdPrefermentRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public JudgeCrowdPrefermentRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public JudgeCrowdPrefermentRequest setBizNo(String bizNo) {
        this.bizNo = bizNo;
        return this;
    }
    public String getBizNo() {
        return this.bizNo;
    }

    public JudgeCrowdPrefermentRequest setBizNoType(String bizNoType) {
        this.bizNoType = bizNoType;
        return this;
    }
    public String getBizNoType() {
        return this.bizNoType;
    }

    public JudgeCrowdPrefermentRequest setEncryptType(String encryptType) {
        this.encryptType = encryptType;
        return this;
    }
    public String getEncryptType() {
        return this.encryptType;
    }

    public JudgeCrowdPrefermentRequest setProperties(String properties) {
        this.properties = properties;
        return this;
    }
    public String getProperties() {
        return this.properties;
    }

}
