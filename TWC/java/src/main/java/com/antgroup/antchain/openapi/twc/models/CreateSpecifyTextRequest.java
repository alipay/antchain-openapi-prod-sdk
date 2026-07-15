// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class CreateSpecifyTextRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 存证地点(如手机硬件ID，Wi-Fi地址，GPS位置，IP地址)
    @NameInMap("location")
    public Location location;

    // 存证内容
    @NameInMap("notary_content")
    @Validation(required = true)
    public String notaryContent;

    // 描述本条存证在存证事务中的阶段，用户可自行维护
    @NameInMap("phase")
    @Validation(required = true)
    public String phase;

    // 扩展属性
    @NameInMap("properties")
    public String properties;

    // 存证事务id
    @NameInMap("transaction_id")
    @Validation(required = true)
    public String transactionId;

    // 是否使用可信时间戳，默认为false
    @NameInMap("tsr")
    public Boolean tsr;

    // 文本存证类型，支持源文本/文本哈希
    @NameInMap("text_notary_type")
    public String textNotaryType;

    // 哈希算法，目前仅支持 SHA256
    @NameInMap("hash_algorithm")
    public String hashAlgorithm;

    // 链账户名称
    @NameInMap("chain_account")
    @Validation(required = true)
    public String chainAccount;

    // 指定上链的节点ip，固定只能传一个，不传则按照链账号绑定ip随机上链
    @NameInMap("node_ip")
    public String nodeIp;

    public static CreateSpecifyTextRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateSpecifyTextRequest self = new CreateSpecifyTextRequest();
        return TeaModel.build(map, self);
    }

    public CreateSpecifyTextRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateSpecifyTextRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateSpecifyTextRequest setLocation(Location location) {
        this.location = location;
        return this;
    }
    public Location getLocation() {
        return this.location;
    }

    public CreateSpecifyTextRequest setNotaryContent(String notaryContent) {
        this.notaryContent = notaryContent;
        return this;
    }
    public String getNotaryContent() {
        return this.notaryContent;
    }

    public CreateSpecifyTextRequest setPhase(String phase) {
        this.phase = phase;
        return this;
    }
    public String getPhase() {
        return this.phase;
    }

    public CreateSpecifyTextRequest setProperties(String properties) {
        this.properties = properties;
        return this;
    }
    public String getProperties() {
        return this.properties;
    }

    public CreateSpecifyTextRequest setTransactionId(String transactionId) {
        this.transactionId = transactionId;
        return this;
    }
    public String getTransactionId() {
        return this.transactionId;
    }

    public CreateSpecifyTextRequest setTsr(Boolean tsr) {
        this.tsr = tsr;
        return this;
    }
    public Boolean getTsr() {
        return this.tsr;
    }

    public CreateSpecifyTextRequest setTextNotaryType(String textNotaryType) {
        this.textNotaryType = textNotaryType;
        return this;
    }
    public String getTextNotaryType() {
        return this.textNotaryType;
    }

    public CreateSpecifyTextRequest setHashAlgorithm(String hashAlgorithm) {
        this.hashAlgorithm = hashAlgorithm;
        return this;
    }
    public String getHashAlgorithm() {
        return this.hashAlgorithm;
    }

    public CreateSpecifyTextRequest setChainAccount(String chainAccount) {
        this.chainAccount = chainAccount;
        return this;
    }
    public String getChainAccount() {
        return this.chainAccount;
    }

    public CreateSpecifyTextRequest setNodeIp(String nodeIp) {
        this.nodeIp = nodeIp;
        return this;
    }
    public String getNodeIp() {
        return this.nodeIp;
    }

}
