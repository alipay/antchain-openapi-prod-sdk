// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class StartIpAuthtradeRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 集群ID
    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 请求参数
    @NameInMap("base_request")
    @Validation(required = true)
    public BaseRequestInfo baseRequest;

    // 采购者的链上账户Id
    @NameInMap("account_id")
    @Validation(required = true)
    public String accountId;

    // IP ID
    @NameInMap("ip_id")
    @Validation(required = true)
    public String ipId;

    // 授权计费比例
    @NameInMap("auth_rate")
    @Validation(required = true)
    public String authRate;

    // 授权合作开始期限（毫秒时间戳）
    @NameInMap("auth_begin_time")
    @Validation(required = true)
    public Long authBeginTime;

    // 授权合作结束期限（毫秒时间戳）
    @NameInMap("auth_end_time")
    @Validation(required = true)
    public Long authEndTime;

    // 合同（文件URL）
    @NameInMap("contract")
    @Validation(required = true)
    public String contract;

    // 设计稿（文件URL）
    @NameInMap("design_draft")
    @Validation(required = true)
    public String designDraft;

    // 备注消息(不超过256个字符)
    @NameInMap("memo")
    @Validation(required = true)
    public String memo;

    public static StartIpAuthtradeRequest build(java.util.Map<String, ?> map) throws Exception {
        StartIpAuthtradeRequest self = new StartIpAuthtradeRequest();
        return TeaModel.build(map, self);
    }

    public StartIpAuthtradeRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public StartIpAuthtradeRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public StartIpAuthtradeRequest setBaseRequest(BaseRequestInfo baseRequest) {
        this.baseRequest = baseRequest;
        return this;
    }
    public BaseRequestInfo getBaseRequest() {
        return this.baseRequest;
    }

    public StartIpAuthtradeRequest setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    public String getAccountId() {
        return this.accountId;
    }

    public StartIpAuthtradeRequest setIpId(String ipId) {
        this.ipId = ipId;
        return this;
    }
    public String getIpId() {
        return this.ipId;
    }

    public StartIpAuthtradeRequest setAuthRate(String authRate) {
        this.authRate = authRate;
        return this;
    }
    public String getAuthRate() {
        return this.authRate;
    }

    public StartIpAuthtradeRequest setAuthBeginTime(Long authBeginTime) {
        this.authBeginTime = authBeginTime;
        return this;
    }
    public Long getAuthBeginTime() {
        return this.authBeginTime;
    }

    public StartIpAuthtradeRequest setAuthEndTime(Long authEndTime) {
        this.authEndTime = authEndTime;
        return this;
    }
    public Long getAuthEndTime() {
        return this.authEndTime;
    }

    public StartIpAuthtradeRequest setContract(String contract) {
        this.contract = contract;
        return this;
    }
    public String getContract() {
        return this.contract;
    }

    public StartIpAuthtradeRequest setDesignDraft(String designDraft) {
        this.designDraft = designDraft;
        return this;
    }
    public String getDesignDraft() {
        return this.designDraft;
    }

    public StartIpAuthtradeRequest setMemo(String memo) {
        this.memo = memo;
        return this;
    }
    public String getMemo() {
        return this.memo;
    }

}
