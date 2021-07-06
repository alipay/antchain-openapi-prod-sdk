// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasplus.models;

import com.aliyun.tea.*;

public class CreateDidCorporatedidagentRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 扩展字段
    // { "nation": "CN", //企业注册地址 "type": "LimitedCompany", //企业类型 "name": "演示用户名", //必选字段，企业名 "licenceNo": "1111", //营业执照 "address": "1111", //企业地址 "parentName": "", //<-必选字段 业务方名 需要提前协商 "linkType": "indirect", //<- 连接类型，direct直链企业， indirect间链企业 "certifyDate": "2019-1-1", //证书颁发时间 "licenceExpireDate": "2020-1-1", //证书到期时间 "businessScope": "1111", //企业经营范围 "businessAddress": "1111", //企业经营地址 "corporateBusinessType": 0, //<- 企业类型：0 一般企业， 1 个人商户 "channelName": "" //<- 必选字段 业务渠道 需要提前沟通 }
    @NameInMap("extension_info")
    @Validation(required = true)
    public String extensionInfo;

    // 所有需要关联的外键，外键必须已did auth key controller的did作为前缀+“sidekey:”+外键
    @NameInMap("indexs")
    public java.util.List<String> indexs;

    // 企业名称
    @NameInMap("owner_name")
    public String ownerName;

    // 自定义企业唯一id，企业在自有模式下的唯一号bid的hash值，调用者需要保证其唯一性
    @NameInMap("owner_uid")
    @Validation(required = true)
    public String ownerUid;

    // 携带自己定义的服务类型
    @NameInMap("services")
    public java.util.List<DidDocServicesInfo> services;

    public static CreateDidCorporatedidagentRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDidCorporatedidagentRequest self = new CreateDidCorporatedidagentRequest();
        return TeaModel.build(map, self);
    }

    public CreateDidCorporatedidagentRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateDidCorporatedidagentRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateDidCorporatedidagentRequest setExtensionInfo(String extensionInfo) {
        this.extensionInfo = extensionInfo;
        return this;
    }
    public String getExtensionInfo() {
        return this.extensionInfo;
    }

    public CreateDidCorporatedidagentRequest setIndexs(java.util.List<String> indexs) {
        this.indexs = indexs;
        return this;
    }
    public java.util.List<String> getIndexs() {
        return this.indexs;
    }

    public CreateDidCorporatedidagentRequest setOwnerName(String ownerName) {
        this.ownerName = ownerName;
        return this;
    }
    public String getOwnerName() {
        return this.ownerName;
    }

    public CreateDidCorporatedidagentRequest setOwnerUid(String ownerUid) {
        this.ownerUid = ownerUid;
        return this;
    }
    public String getOwnerUid() {
        return this.ownerUid;
    }

    public CreateDidCorporatedidagentRequest setServices(java.util.List<DidDocServicesInfo> services) {
        this.services = services;
        return this;
    }
    public java.util.List<DidDocServicesInfo> getServices() {
        return this.services;
    }

}
