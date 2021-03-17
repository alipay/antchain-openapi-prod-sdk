// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class InitCertificationRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 集群ID
    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 申请人的身份信息
    @NameInMap("applier")
    @Validation(required = true)
    public Identity applier;

    // 存证证明所要展示的存证信息，可填多个
    @NameInMap("notary_info")
    @Validation(required = true)
    public java.util.List<NotaryInfo> notaryInfo;

    // 存证证明的类型：STANDARD（标准存证证明）或COPYRIGHT（版权存证证明），默认为COPYRIGHT
    @NameInMap("type")
    public String type;

    public static InitCertificationRequest build(java.util.Map<String, ?> map) throws Exception {
        InitCertificationRequest self = new InitCertificationRequest();
        return TeaModel.build(map, self);
    }

    public InitCertificationRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public InitCertificationRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public InitCertificationRequest setApplier(Identity applier) {
        this.applier = applier;
        return this;
    }
    public Identity getApplier() {
        return this.applier;
    }

    public InitCertificationRequest setNotaryInfo(java.util.List<NotaryInfo> notaryInfo) {
        this.notaryInfo = notaryInfo;
        return this;
    }
    public java.util.List<NotaryInfo> getNotaryInfo() {
        return this.notaryInfo;
    }

    public InitCertificationRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
