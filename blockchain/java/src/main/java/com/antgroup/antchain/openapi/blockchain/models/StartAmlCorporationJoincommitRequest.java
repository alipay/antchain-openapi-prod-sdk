// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class StartAmlCorporationJoincommitRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 集群ID
    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 入驻准备阶段得到的数字标识
    @NameInMap("did")
    @Validation(required = true)
    public String did;

    // 选择采用的TAPP ID编号，如果不填，系统将选择默认的kyc tapp进行执行
    @NameInMap("tapp_id")
    public String tappId;

    // 对应tapp的版本号。默认选择最新版本
    @NameInMap("tapp_version")
    public Long tappVersion;

    public static StartAmlCorporationJoincommitRequest build(java.util.Map<String, ?> map) throws Exception {
        StartAmlCorporationJoincommitRequest self = new StartAmlCorporationJoincommitRequest();
        return TeaModel.build(map, self);
    }

    public StartAmlCorporationJoincommitRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public StartAmlCorporationJoincommitRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public StartAmlCorporationJoincommitRequest setDid(String did) {
        this.did = did;
        return this;
    }
    public String getDid() {
        return this.did;
    }

    public StartAmlCorporationJoincommitRequest setTappId(String tappId) {
        this.tappId = tappId;
        return this;
    }
    public String getTappId() {
        return this.tappId;
    }

    public StartAmlCorporationJoincommitRequest setTappVersion(Long tappVersion) {
        this.tappVersion = tappVersion;
        return this;
    }
    public Long getTappVersion() {
        return this.tappVersion;
    }

}
