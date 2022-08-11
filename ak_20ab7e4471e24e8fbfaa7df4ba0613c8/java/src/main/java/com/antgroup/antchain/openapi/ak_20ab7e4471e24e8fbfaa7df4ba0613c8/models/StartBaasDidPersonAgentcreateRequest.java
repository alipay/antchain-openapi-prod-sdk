// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_20ab7e4471e24e8fbfaa7df4ba0613c8.models;

import com.aliyun.tea.*;

public class StartBaasDidPersonAgentcreateRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 企业自定信息
    @NameInMap("extension_info")
    public String extensionInfo;

    // 所有需要关联的外键，外键必须已did auth key controller的did作为前缀+“sidekey:”+外键
    @NameInMap("indexs")
    public java.util.List<String> indexs;

    // 名称
    @NameInMap("owner_name")
    public String ownerName;

    // 唯一号，比如可以是hash(证件类型+企业营业执照号) 计算出来的唯一值等
    @NameInMap("owner_uid")
    @Validation(required = true)
    public String ownerUid;

    // 携带自己定义的服务类型
    @NameInMap("services")
    public java.util.List<DidDocServicesInfo> services;

    // 场景码，找dis工作人员进行分配
    @NameInMap("biz_code")
    public String bizCode;

    // 生成的did字符串
    @NameInMap("did")
    public String did;

    public static StartBaasDidPersonAgentcreateRequest build(java.util.Map<String, ?> map) throws Exception {
        StartBaasDidPersonAgentcreateRequest self = new StartBaasDidPersonAgentcreateRequest();
        return TeaModel.build(map, self);
    }

    public StartBaasDidPersonAgentcreateRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public StartBaasDidPersonAgentcreateRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public StartBaasDidPersonAgentcreateRequest setExtensionInfo(String extensionInfo) {
        this.extensionInfo = extensionInfo;
        return this;
    }
    public String getExtensionInfo() {
        return this.extensionInfo;
    }

    public StartBaasDidPersonAgentcreateRequest setIndexs(java.util.List<String> indexs) {
        this.indexs = indexs;
        return this;
    }
    public java.util.List<String> getIndexs() {
        return this.indexs;
    }

    public StartBaasDidPersonAgentcreateRequest setOwnerName(String ownerName) {
        this.ownerName = ownerName;
        return this;
    }
    public String getOwnerName() {
        return this.ownerName;
    }

    public StartBaasDidPersonAgentcreateRequest setOwnerUid(String ownerUid) {
        this.ownerUid = ownerUid;
        return this;
    }
    public String getOwnerUid() {
        return this.ownerUid;
    }

    public StartBaasDidPersonAgentcreateRequest setServices(java.util.List<DidDocServicesInfo> services) {
        this.services = services;
        return this;
    }
    public java.util.List<DidDocServicesInfo> getServices() {
        return this.services;
    }

    public StartBaasDidPersonAgentcreateRequest setBizCode(String bizCode) {
        this.bizCode = bizCode;
        return this;
    }
    public String getBizCode() {
        return this.bizCode;
    }

    public StartBaasDidPersonAgentcreateRequest setDid(String did) {
        this.did = did;
        return this;
    }
    public String getDid() {
        return this.did;
    }

}
