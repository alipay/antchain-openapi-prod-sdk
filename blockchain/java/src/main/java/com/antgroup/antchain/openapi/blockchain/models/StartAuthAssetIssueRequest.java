// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class StartAuthAssetIssueRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 长度不超过64字符的业务唯一ID，用于对一个业务流的追踪，查询等。
    @NameInMap("biz_id")
    @Validation(required = true)
    public String bizId;

    // 具体的业务类型，长度不超过32字符，具体需要与DIS小组业务对接商定新增的业务类型。
    @NameInMap("biz_type")
    @Validation(required = true)
    public String bizType;

    // 目前区分content的两种数据：
    // - "b_total"：商户维度聚合数据，（分城市消费者统计数据），相关商家属性。
    // - "c_deposit"：C类个人充值数据，未来扩展C类核销，退款等数据类型，"c_"前缀。
    // - "c_total"：C类个人充值数据聚合(安心充+学费码整体去重按照地理位置维度聚合)
    @NameInMap("type")
    @Validation(required = true)
    public String type;

    // 当 type参数为："b_total"
    // 主要设定“商户统一信用码” ，其name字段从mif如果获取到也填入：
    // {"name": "XXXX",
    // "certNo":"信用码"}，
    // 
    // 当type参数为："c_deposit"时，设定C类用户信息，使用uid，如果有二要素信息，则计算二要素“姓名+身份证号”的拼接字符串计算Hash得到twoMeta：
    // {"userId": "XXXX",
    // "twoMeta":"SHA256(姓名+身份证号码)"}
    // 
    // 当 type参数为："c_total"，可以不设定此参数。
    @NameInMap("identity")
    public String identity;

    // 可能两种类型数据：
    // 商户维度的统计数据，是聚合的数据结果
    // C类充值数据，包含 充值明细数据，目标商户信用码，商户所在城市地理位置信息等。
    @NameInMap("content")
    @Validation(required = true)
    public String content;

    // 传递的附加信息说明，暂时未定义
    @NameInMap("extension")
    public String extension;

    public static StartAuthAssetIssueRequest build(java.util.Map<String, ?> map) throws Exception {
        StartAuthAssetIssueRequest self = new StartAuthAssetIssueRequest();
        return TeaModel.build(map, self);
    }

    public StartAuthAssetIssueRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public StartAuthAssetIssueRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public StartAuthAssetIssueRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public StartAuthAssetIssueRequest setBizType(String bizType) {
        this.bizType = bizType;
        return this;
    }
    public String getBizType() {
        return this.bizType;
    }

    public StartAuthAssetIssueRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public StartAuthAssetIssueRequest setIdentity(String identity) {
        this.identity = identity;
        return this;
    }
    public String getIdentity() {
        return this.identity;
    }

    public StartAuthAssetIssueRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public StartAuthAssetIssueRequest setExtension(String extension) {
        this.extension = extension;
        return this;
    }
    public String getExtension() {
        return this.extension;
    }

}
