// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class StartDidPersonSelfcreateRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 扩展字段
    @NameInMap("extension_info")
    public String extensionInfo;

    // 由调用者，或者浏览器直接生成
    @NameInMap("owner_name")
    public String ownerName;

    // 携带自己定义的服务类型
    // 
    @NameInMap("services")
    public java.util.List<DidDocServicesInfo> services;

    // 场景码，找dis工作人员进行分配
    @NameInMap("biz_code")
    public String bizCode;

    public static StartDidPersonSelfcreateRequest build(java.util.Map<String, ?> map) throws Exception {
        StartDidPersonSelfcreateRequest self = new StartDidPersonSelfcreateRequest();
        return TeaModel.build(map, self);
    }

    public StartDidPersonSelfcreateRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public StartDidPersonSelfcreateRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public StartDidPersonSelfcreateRequest setExtensionInfo(String extensionInfo) {
        this.extensionInfo = extensionInfo;
        return this;
    }
    public String getExtensionInfo() {
        return this.extensionInfo;
    }

    public StartDidPersonSelfcreateRequest setOwnerName(String ownerName) {
        this.ownerName = ownerName;
        return this;
    }
    public String getOwnerName() {
        return this.ownerName;
    }

    public StartDidPersonSelfcreateRequest setServices(java.util.List<DidDocServicesInfo> services) {
        this.services = services;
        return this;
    }
    public java.util.List<DidDocServicesInfo> getServices() {
        return this.services;
    }

    public StartDidPersonSelfcreateRequest setBizCode(String bizCode) {
        this.bizCode = bizCode;
        return this;
    }
    public String getBizCode() {
        return this.bizCode;
    }

}
