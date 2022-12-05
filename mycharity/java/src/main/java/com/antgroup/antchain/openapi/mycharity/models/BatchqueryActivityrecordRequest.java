// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mycharity.models;

import com.aliyun.tea.*;

public class BatchqueryActivityrecordRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 元徽章id
    @NameInMap("poap_meta_id")
    public String poapMetaId;

    // 支付宝用户UID 
    @NameInMap("alipay_user_id")
    public String alipayUserId;

    public static BatchqueryActivityrecordRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchqueryActivityrecordRequest self = new BatchqueryActivityrecordRequest();
        return TeaModel.build(map, self);
    }

    public BatchqueryActivityrecordRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public BatchqueryActivityrecordRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public BatchqueryActivityrecordRequest setPoapMetaId(String poapMetaId) {
        this.poapMetaId = poapMetaId;
        return this;
    }
    public String getPoapMetaId() {
        return this.poapMetaId;
    }

    public BatchqueryActivityrecordRequest setAlipayUserId(String alipayUserId) {
        this.alipayUserId = alipayUserId;
        return this;
    }
    public String getAlipayUserId() {
        return this.alipayUserId;
    }

}
