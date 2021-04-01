// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class StartMydidcommunAgencyChoicetappRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 入驻时候生成的did
    @NameInMap("did")
    @Validation(required = true)
    public String did;

    // 服务ID
    @NameInMap("service_id")
    @Validation(required = true)
    public String serviceId;

    // 选择tapp的名称
    @NameInMap("tapp_name")
    @Validation(required = true)
    public String tappName;

    // tapp版本
    @NameInMap("tapp_version")
    @Validation(required = true)
    public Long tappVersion;

    // 业务码，需要接入时联系数据隐私服务分配
    @NameInMap("biz_code")
    public String bizCode;

    public static StartMydidcommunAgencyChoicetappRequest build(java.util.Map<String, ?> map) throws Exception {
        StartMydidcommunAgencyChoicetappRequest self = new StartMydidcommunAgencyChoicetappRequest();
        return TeaModel.build(map, self);
    }

    public StartMydidcommunAgencyChoicetappRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public StartMydidcommunAgencyChoicetappRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public StartMydidcommunAgencyChoicetappRequest setDid(String did) {
        this.did = did;
        return this;
    }
    public String getDid() {
        return this.did;
    }

    public StartMydidcommunAgencyChoicetappRequest setServiceId(String serviceId) {
        this.serviceId = serviceId;
        return this;
    }
    public String getServiceId() {
        return this.serviceId;
    }

    public StartMydidcommunAgencyChoicetappRequest setTappName(String tappName) {
        this.tappName = tappName;
        return this;
    }
    public String getTappName() {
        return this.tappName;
    }

    public StartMydidcommunAgencyChoicetappRequest setTappVersion(Long tappVersion) {
        this.tappVersion = tappVersion;
        return this;
    }
    public Long getTappVersion() {
        return this.tappVersion;
    }

    public StartMydidcommunAgencyChoicetappRequest setBizCode(String bizCode) {
        this.bizCode = bizCode;
        return this;
    }
    public String getBizCode() {
        return this.bizCode;
    }

}
