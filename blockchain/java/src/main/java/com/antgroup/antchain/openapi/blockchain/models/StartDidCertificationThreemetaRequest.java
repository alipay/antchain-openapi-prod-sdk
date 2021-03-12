// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class StartDidCertificationThreemetaRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 集群ID
    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 身份证号码
    // 
    @NameInMap("cert_no")
    @Validation(required = true)
    public String certNo;

    // 证书的subject did
    // 
    @NameInMap("did")
    @Validation(required = true)
    public String did;

    // 手机号码
    // 
    @NameInMap("mobile")
    @Validation(required = true)
    public String mobile;

    // 姓名
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 场景码，找dis工作人员进行分配
    @NameInMap("biz_code")
    public String bizCode;

    public static StartDidCertificationThreemetaRequest build(java.util.Map<String, ?> map) throws Exception {
        StartDidCertificationThreemetaRequest self = new StartDidCertificationThreemetaRequest();
        return TeaModel.build(map, self);
    }

    public StartDidCertificationThreemetaRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public StartDidCertificationThreemetaRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public StartDidCertificationThreemetaRequest setCertNo(String certNo) {
        this.certNo = certNo;
        return this;
    }
    public String getCertNo() {
        return this.certNo;
    }

    public StartDidCertificationThreemetaRequest setDid(String did) {
        this.did = did;
        return this;
    }
    public String getDid() {
        return this.did;
    }

    public StartDidCertificationThreemetaRequest setMobile(String mobile) {
        this.mobile = mobile;
        return this;
    }
    public String getMobile() {
        return this.mobile;
    }

    public StartDidCertificationThreemetaRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public StartDidCertificationThreemetaRequest setBizCode(String bizCode) {
        this.bizCode = bizCode;
        return this;
    }
    public String getBizCode() {
        return this.bizCode;
    }

}
