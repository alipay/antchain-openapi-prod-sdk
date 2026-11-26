// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dtkya.models;

import com.aliyun.tea.*;

public class FacestartAntchainDasKyaRealpersonRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 个人身份证件姓名
    @NameInMap("cert_name")
    @Validation(required = true)
    public String certName;

    // 个人身份证号码
    @NameInMap("cert_no")
    @Validation(required = true)
    public String certNo;

    // 小程序刷脸完成后的业务回跳地址，可省略
    @NameInMap("return_url")
    public String returnUrl;

    public static FacestartAntchainDasKyaRealpersonRequest build(java.util.Map<String, ?> map) throws Exception {
        FacestartAntchainDasKyaRealpersonRequest self = new FacestartAntchainDasKyaRealpersonRequest();
        return TeaModel.build(map, self);
    }

    public FacestartAntchainDasKyaRealpersonRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public FacestartAntchainDasKyaRealpersonRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public FacestartAntchainDasKyaRealpersonRequest setCertName(String certName) {
        this.certName = certName;
        return this;
    }
    public String getCertName() {
        return this.certName;
    }

    public FacestartAntchainDasKyaRealpersonRequest setCertNo(String certNo) {
        this.certNo = certNo;
        return this;
    }
    public String getCertNo() {
        return this.certNo;
    }

    public FacestartAntchainDasKyaRealpersonRequest setReturnUrl(String returnUrl) {
        this.returnUrl = returnUrl;
        return this;
    }
    public String getReturnUrl() {
        return this.returnUrl;
    }

}
