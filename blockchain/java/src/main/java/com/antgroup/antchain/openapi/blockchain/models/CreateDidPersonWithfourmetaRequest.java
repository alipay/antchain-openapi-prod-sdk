// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class CreateDidPersonWithfourmetaRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 集群ID
    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 银行卡号
    @NameInMap("bank_card")
    @Validation(required = true)
    public String bankCard;

    // 身份证号码
    // 
    @NameInMap("cert_no")
    @Validation(required = true)
    public String certNo;

    // 扩展字段
    // 
    @NameInMap("extension_info")
    public String extensionInfo;

    // 手机号码
    // 
    @NameInMap("mobile")
    @Validation(required = true)
    public String mobile;

    // 姓名
    // 
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 名称
    // 
    @NameInMap("owner_name")
    public String ownerName;

    // 自定义个人唯一id，个人在自有模式下的唯一号，调用者需要保证其唯一性
    @NameInMap("owner_uid")
    @Validation(required = true)
    public String ownerUid;

    // 场景码，找dis工作人员进行分配
    @NameInMap("biz_code")
    public String bizCode;

    public static CreateDidPersonWithfourmetaRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDidPersonWithfourmetaRequest self = new CreateDidPersonWithfourmetaRequest();
        return TeaModel.build(map, self);
    }

    public CreateDidPersonWithfourmetaRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateDidPersonWithfourmetaRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateDidPersonWithfourmetaRequest setBankCard(String bankCard) {
        this.bankCard = bankCard;
        return this;
    }
    public String getBankCard() {
        return this.bankCard;
    }

    public CreateDidPersonWithfourmetaRequest setCertNo(String certNo) {
        this.certNo = certNo;
        return this;
    }
    public String getCertNo() {
        return this.certNo;
    }

    public CreateDidPersonWithfourmetaRequest setExtensionInfo(String extensionInfo) {
        this.extensionInfo = extensionInfo;
        return this;
    }
    public String getExtensionInfo() {
        return this.extensionInfo;
    }

    public CreateDidPersonWithfourmetaRequest setMobile(String mobile) {
        this.mobile = mobile;
        return this;
    }
    public String getMobile() {
        return this.mobile;
    }

    public CreateDidPersonWithfourmetaRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateDidPersonWithfourmetaRequest setOwnerName(String ownerName) {
        this.ownerName = ownerName;
        return this;
    }
    public String getOwnerName() {
        return this.ownerName;
    }

    public CreateDidPersonWithfourmetaRequest setOwnerUid(String ownerUid) {
        this.ownerUid = ownerUid;
        return this;
    }
    public String getOwnerUid() {
        return this.ownerUid;
    }

    public CreateDidPersonWithfourmetaRequest setBizCode(String bizCode) {
        this.bizCode = bizCode;
        return this;
    }
    public String getBizCode() {
        return this.bizCode;
    }

}
