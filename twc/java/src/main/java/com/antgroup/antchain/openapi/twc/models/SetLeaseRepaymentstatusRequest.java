// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class SetLeaseRepaymentstatusRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 集群ID
    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 租赁机构金融科技租户Id
    @NameInMap("lease_id")
    @Validation(required = true)
    public String leaseId;

    // 融资租赁对应的合约id
    @NameInMap("application_id")
    public String applicationId;

    // 融资租赁对应的订单id
    @NameInMap("order_id")
    @Validation(required = true)
    public String orderId;

    // finish只能为0或1，0表示订单重置此状态下订单可以被再次操作【如清分记录上传、还款记录上传等】，1表示订单结束，在1的状态下不会再进行清分、还款记录上传等操作
    @NameInMap("finish")
    @Validation(required = true)
    public Long finish;

    public static SetLeaseRepaymentstatusRequest build(java.util.Map<String, ?> map) throws Exception {
        SetLeaseRepaymentstatusRequest self = new SetLeaseRepaymentstatusRequest();
        return TeaModel.build(map, self);
    }

    public SetLeaseRepaymentstatusRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public SetLeaseRepaymentstatusRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public SetLeaseRepaymentstatusRequest setLeaseId(String leaseId) {
        this.leaseId = leaseId;
        return this;
    }
    public String getLeaseId() {
        return this.leaseId;
    }

    public SetLeaseRepaymentstatusRequest setApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }
    public String getApplicationId() {
        return this.applicationId;
    }

    public SetLeaseRepaymentstatusRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public SetLeaseRepaymentstatusRequest setFinish(Long finish) {
        this.finish = finish;
        return this;
    }
    public Long getFinish() {
        return this.finish;
    }

}
