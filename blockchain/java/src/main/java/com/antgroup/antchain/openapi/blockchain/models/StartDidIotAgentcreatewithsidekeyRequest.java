// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class StartDidIotAgentcreatewithsidekeyRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 集群ID
    @NameInMap("product_instance_id")
    public String productInstanceId;

    // { "自定义服务相关字段": 自定义字符串, "type": "IOT设备类型", "name": "演示用户名", "licenceNo": "设备唯一号", "address": "1111" }
    @NameInMap("extension_info")
    public String extensionInfo;

    // 所有需要关联的外键，外键必须已did auth key controller的did作为前缀+“sidekey:”+外键
    @NameInMap("indexs")
    @Validation(required = true)
    public java.util.List<String> indexs;

    // iot设备名
    @NameInMap("owner_name")
    public String ownerName;

    // 自定义企业唯一id，企业在自有模式下的唯一号bid的has...
    @NameInMap("owner_uid")
    @Validation(required = true)
    public String ownerUid;

    // 场景码，找dis工作人员进行分配
    @NameInMap("biz_code")
    public String bizCode;

    public static StartDidIotAgentcreatewithsidekeyRequest build(java.util.Map<String, ?> map) throws Exception {
        StartDidIotAgentcreatewithsidekeyRequest self = new StartDidIotAgentcreatewithsidekeyRequest();
        return TeaModel.build(map, self);
    }

    public StartDidIotAgentcreatewithsidekeyRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public StartDidIotAgentcreatewithsidekeyRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public StartDidIotAgentcreatewithsidekeyRequest setExtensionInfo(String extensionInfo) {
        this.extensionInfo = extensionInfo;
        return this;
    }
    public String getExtensionInfo() {
        return this.extensionInfo;
    }

    public StartDidIotAgentcreatewithsidekeyRequest setIndexs(java.util.List<String> indexs) {
        this.indexs = indexs;
        return this;
    }
    public java.util.List<String> getIndexs() {
        return this.indexs;
    }

    public StartDidIotAgentcreatewithsidekeyRequest setOwnerName(String ownerName) {
        this.ownerName = ownerName;
        return this;
    }
    public String getOwnerName() {
        return this.ownerName;
    }

    public StartDidIotAgentcreatewithsidekeyRequest setOwnerUid(String ownerUid) {
        this.ownerUid = ownerUid;
        return this;
    }
    public String getOwnerUid() {
        return this.ownerUid;
    }

    public StartDidIotAgentcreatewithsidekeyRequest setBizCode(String bizCode) {
        this.bizCode = bizCode;
        return this;
    }
    public String getBizCode() {
        return this.bizCode;
    }

}
