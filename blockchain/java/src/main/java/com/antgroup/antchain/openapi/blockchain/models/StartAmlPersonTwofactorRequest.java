// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class StartAmlPersonTwofactorRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 完整证件号，与证件类型配对
    @NameInMap("cert_no")
    @Validation(required = true)
    public String certNo;

    // 证件类型
    // 001，身份证
    // 目前只支持身份证
    @NameInMap("cert_type")
    @Validation(required = true)
    public Long certType;

    // 张三
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    public static StartAmlPersonTwofactorRequest build(java.util.Map<String, ?> map) throws Exception {
        StartAmlPersonTwofactorRequest self = new StartAmlPersonTwofactorRequest();
        return TeaModel.build(map, self);
    }

    public StartAmlPersonTwofactorRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public StartAmlPersonTwofactorRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public StartAmlPersonTwofactorRequest setCertNo(String certNo) {
        this.certNo = certNo;
        return this;
    }
    public String getCertNo() {
        return this.certNo;
    }

    public StartAmlPersonTwofactorRequest setCertType(Long certType) {
        this.certType = certType;
        return this;
    }
    public Long getCertType() {
        return this.certType;
    }

    public StartAmlPersonTwofactorRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
