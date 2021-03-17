// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class CreateFinanceTextnotaryRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 集群ID
    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 反欺诈查询对应的身份证号码
    @NameInMap("cert_no")
    public String certNo;

    // 哈希算法
    @NameInMap("hash_algorithm")
    @Validation(required = true)
    public String hashAlgorithm;

    // 位置描述信息
    @NameInMap("location")
    public Location location;

    // 反欺诈查询需要的手机号码
    @NameInMap("mobile")
    public String mobile;

    // 存证阶段，用户可自行维护
    @NameInMap("phase")
    @Validation(required = true)
    public String phase;

    // 扩展属性
    @NameInMap("properties")
    public String properties;

    // 文本哈希
    @NameInMap("text_hash")
    @Validation(required = true)
    public String textHash;

    // 存证事务ID
    @NameInMap("transaction_id")
    @Validation(required = true)
    public String transactionId;

    // 是否使用可信时间戳
    @NameInMap("tsr")
    public Boolean tsr;

    // 反欺诈查询需要的姓名
    @NameInMap("user_name")
    public String userName;

    // 本次请求的唯一id
    @NameInMap("third_message_id")
    public String thirdMessageId;

    public static CreateFinanceTextnotaryRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateFinanceTextnotaryRequest self = new CreateFinanceTextnotaryRequest();
        return TeaModel.build(map, self);
    }

    public CreateFinanceTextnotaryRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateFinanceTextnotaryRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateFinanceTextnotaryRequest setCertNo(String certNo) {
        this.certNo = certNo;
        return this;
    }
    public String getCertNo() {
        return this.certNo;
    }

    public CreateFinanceTextnotaryRequest setHashAlgorithm(String hashAlgorithm) {
        this.hashAlgorithm = hashAlgorithm;
        return this;
    }
    public String getHashAlgorithm() {
        return this.hashAlgorithm;
    }

    public CreateFinanceTextnotaryRequest setLocation(Location location) {
        this.location = location;
        return this;
    }
    public Location getLocation() {
        return this.location;
    }

    public CreateFinanceTextnotaryRequest setMobile(String mobile) {
        this.mobile = mobile;
        return this;
    }
    public String getMobile() {
        return this.mobile;
    }

    public CreateFinanceTextnotaryRequest setPhase(String phase) {
        this.phase = phase;
        return this;
    }
    public String getPhase() {
        return this.phase;
    }

    public CreateFinanceTextnotaryRequest setProperties(String properties) {
        this.properties = properties;
        return this;
    }
    public String getProperties() {
        return this.properties;
    }

    public CreateFinanceTextnotaryRequest setTextHash(String textHash) {
        this.textHash = textHash;
        return this;
    }
    public String getTextHash() {
        return this.textHash;
    }

    public CreateFinanceTextnotaryRequest setTransactionId(String transactionId) {
        this.transactionId = transactionId;
        return this;
    }
    public String getTransactionId() {
        return this.transactionId;
    }

    public CreateFinanceTextnotaryRequest setTsr(Boolean tsr) {
        this.tsr = tsr;
        return this;
    }
    public Boolean getTsr() {
        return this.tsr;
    }

    public CreateFinanceTextnotaryRequest setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

    public CreateFinanceTextnotaryRequest setThirdMessageId(String thirdMessageId) {
        this.thirdMessageId = thirdMessageId;
        return this;
    }
    public String getThirdMessageId() {
        return this.thirdMessageId;
    }

}
