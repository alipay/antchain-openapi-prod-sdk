// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class ApplyFlowAuthRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 流程id
    @NameInMap("flow_id")
    @Validation(required = true)
    public String flowId;

    // 链上证据包对应的链上交易Hash，通过twc.notary.flow.evidence.query(全流程证据包生成进度查询)获取
    @NameInMap("chain_pack_tx_hash")
    @Validation(required = true)
    public String chainPackTxHash;

    // 授权时间长度，单位为s，默认72小时，即259200s，有效期为接口调用时间开始，接口调用时间+授权时间长度的时间为结束时间，例如当前时间为2022-08-18 00:00:00，授权时间长度为86400s(即一天)，则授权截止时间为2022-08-19 00:00:00
    @NameInMap("auth_time_period")
    public Long authTimePeriod;

    public static ApplyFlowAuthRequest build(java.util.Map<String, ?> map) throws Exception {
        ApplyFlowAuthRequest self = new ApplyFlowAuthRequest();
        return TeaModel.build(map, self);
    }

    public ApplyFlowAuthRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ApplyFlowAuthRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ApplyFlowAuthRequest setFlowId(String flowId) {
        this.flowId = flowId;
        return this;
    }
    public String getFlowId() {
        return this.flowId;
    }

    public ApplyFlowAuthRequest setChainPackTxHash(String chainPackTxHash) {
        this.chainPackTxHash = chainPackTxHash;
        return this;
    }
    public String getChainPackTxHash() {
        return this.chainPackTxHash;
    }

    public ApplyFlowAuthRequest setAuthTimePeriod(Long authTimePeriod) {
        this.authTimePeriod = authTimePeriod;
        return this;
    }
    public Long getAuthTimePeriod() {
        return this.authTimePeriod;
    }

}
