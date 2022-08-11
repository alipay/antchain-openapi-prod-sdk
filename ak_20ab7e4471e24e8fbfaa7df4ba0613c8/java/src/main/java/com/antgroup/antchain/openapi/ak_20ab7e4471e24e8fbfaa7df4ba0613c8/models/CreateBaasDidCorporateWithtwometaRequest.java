// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_20ab7e4471e24e8fbfaa7df4ba0613c8.models;

import com.aliyun.tea.*;

public class CreateBaasDidCorporateWithtwometaRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 企业名称
    @NameInMap("ep_cert_name")
    @Validation(required = true)
    public String epCertName;

    // 企业证件号
    @NameInMap("ep_cert_no")
    @Validation(required = true)
    public String epCertNo;

    // {
    //   "nation": "CN", //企业注册地址
    //   "type": "LimitedCompany", //企业类型
    //   "name": "演示用户名", //必选字段，企业名
    //   "licenceNo": "1111", //营业执照
    //   "address": "1111", //企业地址
    //   "parentName": "", //<-必选字段 业务方名 需要提前协商
    //   "linkType": "indirect", //<- 连接类型，direct直链企业， indirect间链企业
    //   "certifyDate": "2019-1-1", //证书颁发时间
    //   "licenceExpireDate": "2020-1-1", //证书到期时间
    //   "businessScope": "1111", //企业经营范围
    //   "businessAddress": "1111", //企业经营地址
    //   "corporateBusinessType": 0, //<- 企业类型：0 一般企业， 1 个人商户
    //   "channelName": "" //<- 必选字段 业务渠道 需要提前沟通
    // }
    @NameInMap("extension_info")
    public String extensionInfo;

    // 名称
    // 
    @NameInMap("owner_name")
    public String ownerName;

    // 自定义企业唯一id，企业在自有模式下的唯一号，调用者需要保证其唯一性
    @NameInMap("owner_uid")
    @Validation(required = true)
    public String ownerUid;

    // 场景码，找dis工作人员进行分配
    @NameInMap("biz_code")
    public String bizCode;

    // 生成的did
    // 
    @NameInMap("did")
    public String did;

    // 颁发的vcId
    @NameInMap("vc_id")
    public String vcId;

    public static CreateBaasDidCorporateWithtwometaRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateBaasDidCorporateWithtwometaRequest self = new CreateBaasDidCorporateWithtwometaRequest();
        return TeaModel.build(map, self);
    }

    public CreateBaasDidCorporateWithtwometaRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateBaasDidCorporateWithtwometaRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateBaasDidCorporateWithtwometaRequest setEpCertName(String epCertName) {
        this.epCertName = epCertName;
        return this;
    }
    public String getEpCertName() {
        return this.epCertName;
    }

    public CreateBaasDidCorporateWithtwometaRequest setEpCertNo(String epCertNo) {
        this.epCertNo = epCertNo;
        return this;
    }
    public String getEpCertNo() {
        return this.epCertNo;
    }

    public CreateBaasDidCorporateWithtwometaRequest setExtensionInfo(String extensionInfo) {
        this.extensionInfo = extensionInfo;
        return this;
    }
    public String getExtensionInfo() {
        return this.extensionInfo;
    }

    public CreateBaasDidCorporateWithtwometaRequest setOwnerName(String ownerName) {
        this.ownerName = ownerName;
        return this;
    }
    public String getOwnerName() {
        return this.ownerName;
    }

    public CreateBaasDidCorporateWithtwometaRequest setOwnerUid(String ownerUid) {
        this.ownerUid = ownerUid;
        return this;
    }
    public String getOwnerUid() {
        return this.ownerUid;
    }

    public CreateBaasDidCorporateWithtwometaRequest setBizCode(String bizCode) {
        this.bizCode = bizCode;
        return this;
    }
    public String getBizCode() {
        return this.bizCode;
    }

    public CreateBaasDidCorporateWithtwometaRequest setDid(String did) {
        this.did = did;
        return this;
    }
    public String getDid() {
        return this.did;
    }

    public CreateBaasDidCorporateWithtwometaRequest setVcId(String vcId) {
        this.vcId = vcId;
        return this;
    }
    public String getVcId() {
        return this.vcId;
    }

}
