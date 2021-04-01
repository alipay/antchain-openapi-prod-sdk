// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class StartDidCorporateAgentcreatewithsidekeyRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // {
    //     "自定义服务相关字段": 自定义字符串,
    //     "nation": "CN",
    //     "type": "LimitedCompany",
    //     "name": "演示用户名",
    //     "licenceNo": "1111",
    //     "address": "1111",
    //     "parentName": "演示直连公司",
    //     "linkType": "indirect",
    //     "certifyDate": "2019-1-1",
    //     "licenceExpireDate": "2020-1-1",
    //     "businessScope": "1111",
    //     "businessAddress": "1111",
    //     "corporateBusinessType": 0
    // }
    @NameInMap("extension_info")
    public String extensionInfo;

    // 所有需要关联的外键，外键必须已did auth key controller的did作为前缀+“sidekey:”+外键
    @NameInMap("indexs")
    @Validation(required = true)
    public java.util.List<String> indexs;

    // 企业名称
    @NameInMap("owner_name")
    public String ownerName;

    // 自定义企业唯一id，企业在自有模式下的唯一号bid的has...
    @NameInMap("owner_uid")
    @Validation(required = true)
    public String ownerUid;

    // 场景码，找dis工作人员进行分配
    @NameInMap("biz_code")
    public String bizCode;

    public static StartDidCorporateAgentcreatewithsidekeyRequest build(java.util.Map<String, ?> map) throws Exception {
        StartDidCorporateAgentcreatewithsidekeyRequest self = new StartDidCorporateAgentcreatewithsidekeyRequest();
        return TeaModel.build(map, self);
    }

    public StartDidCorporateAgentcreatewithsidekeyRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public StartDidCorporateAgentcreatewithsidekeyRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public StartDidCorporateAgentcreatewithsidekeyRequest setExtensionInfo(String extensionInfo) {
        this.extensionInfo = extensionInfo;
        return this;
    }
    public String getExtensionInfo() {
        return this.extensionInfo;
    }

    public StartDidCorporateAgentcreatewithsidekeyRequest setIndexs(java.util.List<String> indexs) {
        this.indexs = indexs;
        return this;
    }
    public java.util.List<String> getIndexs() {
        return this.indexs;
    }

    public StartDidCorporateAgentcreatewithsidekeyRequest setOwnerName(String ownerName) {
        this.ownerName = ownerName;
        return this;
    }
    public String getOwnerName() {
        return this.ownerName;
    }

    public StartDidCorporateAgentcreatewithsidekeyRequest setOwnerUid(String ownerUid) {
        this.ownerUid = ownerUid;
        return this;
    }
    public String getOwnerUid() {
        return this.ownerUid;
    }

    public StartDidCorporateAgentcreatewithsidekeyRequest setBizCode(String bizCode) {
        this.bizCode = bizCode;
        return this;
    }
    public String getBizCode() {
        return this.bizCode;
    }

}
