// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasplus.models;

import com.aliyun.tea.*;

public class InitIndividualidFaceauthinternalRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 认证方式,FACE表示在支付宝内进行认证,FACE_SDK表示在客户的应用中进行认证 默认为FACE
    @NameInMap("biz_code")
    public String bizCode;

    // 姓名
    @NameInMap("cert_name")
    @Validation(required = true)
    public String certName;

    // 身份证号
    @NameInMap("cert_no")
    @Validation(required = true)
    public String certNo;

    // 内部字段
    @NameInMap("biz_info")
    @Validation(required = true)
    public BizInfo bizInfo;

    public static InitIndividualidFaceauthinternalRequest build(java.util.Map<String, ?> map) throws Exception {
        InitIndividualidFaceauthinternalRequest self = new InitIndividualidFaceauthinternalRequest();
        return TeaModel.build(map, self);
    }

    public InitIndividualidFaceauthinternalRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public InitIndividualidFaceauthinternalRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public InitIndividualidFaceauthinternalRequest setBizCode(String bizCode) {
        this.bizCode = bizCode;
        return this;
    }
    public String getBizCode() {
        return this.bizCode;
    }

    public InitIndividualidFaceauthinternalRequest setCertName(String certName) {
        this.certName = certName;
        return this;
    }
    public String getCertName() {
        return this.certName;
    }

    public InitIndividualidFaceauthinternalRequest setCertNo(String certNo) {
        this.certNo = certNo;
        return this;
    }
    public String getCertNo() {
        return this.certNo;
    }

    public InitIndividualidFaceauthinternalRequest setBizInfo(BizInfo bizInfo) {
        this.bizInfo = bizInfo;
        return this;
    }
    public BizInfo getBizInfo() {
        return this.bizInfo;
    }

}
