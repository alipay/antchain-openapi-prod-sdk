// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_b66bef8db53548c2baeb943ff90ab139.models;

import com.aliyun.tea.*;

public class JudgeAntchainSdsCrowdPrefermentRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 业务号：可以标识用户的编码，例如手机号，身份证号等，通过业务号类型来控制，与biz_no_type和encrypt_type连用来确定编码形式。
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

    // 拓展属性：自定义结构，里面可传地址等信息
    @NameInMap("properties")
    public String properties;

    public static JudgeAntchainSdsCrowdPrefermentRequest build(java.util.Map<String, ?> map) throws Exception {
        JudgeAntchainSdsCrowdPrefermentRequest self = new JudgeAntchainSdsCrowdPrefermentRequest();
        return TeaModel.build(map, self);
    }

    public JudgeAntchainSdsCrowdPrefermentRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public JudgeAntchainSdsCrowdPrefermentRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public JudgeAntchainSdsCrowdPrefermentRequest setBizNo(String bizNo) {
        this.bizNo = bizNo;
        return this;
    }
    public String getBizNo() {
        return this.bizNo;
    }

    public JudgeAntchainSdsCrowdPrefermentRequest setBizNoType(String bizNoType) {
        this.bizNoType = bizNoType;
        return this;
    }
    public String getBizNoType() {
        return this.bizNoType;
    }

    public JudgeAntchainSdsCrowdPrefermentRequest setEncryptType(String encryptType) {
        this.encryptType = encryptType;
        return this;
    }
    public String getEncryptType() {
        return this.encryptType;
    }

    public JudgeAntchainSdsCrowdPrefermentRequest setProperties(String properties) {
        this.properties = properties;
        return this;
    }
    public String getProperties() {
        return this.properties;
    }

}
