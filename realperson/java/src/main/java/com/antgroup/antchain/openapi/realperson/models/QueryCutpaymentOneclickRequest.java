// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.realperson.models;

import com.aliyun.tea.*;

public class QueryCutpaymentOneclickRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 请求ID，为32位以内的字母数字组合，由调用方自行生成、保证唯一并留存，以便问题定位和授权核查。
    @NameInMap("outer_order_no")
    @Validation(required = true)
    public String outerOrderNo;

    // 一键绑卡商户跳转的请求ID
    @NameInMap("pre_outer_order_no")
    @Validation(required = true)
    public String preOuterOrderNo;

    // 渠道ID
    @NameInMap("channel_id")
    @Validation(required = true)
    public String channelId;

    public static QueryCutpaymentOneclickRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryCutpaymentOneclickRequest self = new QueryCutpaymentOneclickRequest();
        return TeaModel.build(map, self);
    }

    public QueryCutpaymentOneclickRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryCutpaymentOneclickRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryCutpaymentOneclickRequest setOuterOrderNo(String outerOrderNo) {
        this.outerOrderNo = outerOrderNo;
        return this;
    }
    public String getOuterOrderNo() {
        return this.outerOrderNo;
    }

    public QueryCutpaymentOneclickRequest setPreOuterOrderNo(String preOuterOrderNo) {
        this.preOuterOrderNo = preOuterOrderNo;
        return this;
    }
    public String getPreOuterOrderNo() {
        return this.preOuterOrderNo;
    }

    public QueryCutpaymentOneclickRequest setChannelId(String channelId) {
        this.channelId = channelId;
        return this;
    }
    public String getChannelId() {
        return this.channelId;
    }

}
