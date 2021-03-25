// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class DeleteSueBreakpromiseinfoRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 集群ID
    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 合同唯一标识，不可更新
    @NameInMap("order_id")
    @Validation(required = true)
    public String orderId;

    // 诉前id，不可更新
    @NameInMap("pre_sue_id")
    @Validation(required = true)
    public String preSueId;

    public static DeleteSueBreakpromiseinfoRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteSueBreakpromiseinfoRequest self = new DeleteSueBreakpromiseinfoRequest();
        return TeaModel.build(map, self);
    }

    public DeleteSueBreakpromiseinfoRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public DeleteSueBreakpromiseinfoRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public DeleteSueBreakpromiseinfoRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public DeleteSueBreakpromiseinfoRequest setPreSueId(String preSueId) {
        this.preSueId = preSueId;
        return this;
    }
    public String getPreSueId() {
        return this.preSueId;
    }

}
