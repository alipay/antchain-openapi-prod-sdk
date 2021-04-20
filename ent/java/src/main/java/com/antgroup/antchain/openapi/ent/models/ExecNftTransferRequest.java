// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ent.models;

import com.aliyun.tea.*;

public class ExecNftTransferRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 支付用户uid
    @NameInMap("alipay_uid")
    @Validation(required = true)
    public String alipayUid;

    // 在外部渠道的全局唯一id
    @NameInMap("project_id")
    @Validation(required = true)
    public String projectId;

    // 外部订单号（阿里拍卖成功的订单号）
    @NameInMap("order_no")
    @Validation(required = true)
    public String orderNo;

    // 拍品成交价（单位：分）
    @NameInMap("price_cent")
    @Validation(required = true)
    public Long priceCent;

    public static ExecNftTransferRequest build(java.util.Map<String, ?> map) throws Exception {
        ExecNftTransferRequest self = new ExecNftTransferRequest();
        return TeaModel.build(map, self);
    }

    public ExecNftTransferRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ExecNftTransferRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ExecNftTransferRequest setAlipayUid(String alipayUid) {
        this.alipayUid = alipayUid;
        return this;
    }
    public String getAlipayUid() {
        return this.alipayUid;
    }

    public ExecNftTransferRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public ExecNftTransferRequest setOrderNo(String orderNo) {
        this.orderNo = orderNo;
        return this;
    }
    public String getOrderNo() {
        return this.orderNo;
    }

    public ExecNftTransferRequest setPriceCent(Long priceCent) {
        this.priceCent = priceCent;
        return this;
    }
    public Long getPriceCent() {
        return this.priceCent;
    }

}
