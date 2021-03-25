// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class CreateLeasePaymentfileRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 集群ID
    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 融资租赁业务id，由资方控制台生成
    @NameInMap("application_id")
    public String applicationId;

    // 是否启动订单的异步处理
    @NameInMap("async")
    public Long async;

    // 融资租赁额外字段
    @NameInMap("extra_info")
    public String extraInfo;

    // 租赁服务平台ID 长度不可超过50
    @NameInMap("lease_id")
    @Validation(required = true)
    public String leaseId;

    // 订单id 长度不可超过50
    @NameInMap("order_id")
    @Validation(required = true)
    public String orderId;

    // 付款通知书加签完电子签名后，PDF文件hash
    @NameInMap("payment_file_hash")
    public String paymentFileHash;

    // 付款通知书存证交易哈希
    @NameInMap("payment_file_tx_hash")
    public String paymentFileTxHash;

    // 付款通知所在路径
    @NameInMap("payment_url")
    public String paymentUrl;

    // 额外通知第三方，如果需要通知相关方外的第三方，需要在此设置关联方的租户id，若不设置则只通知资方	
    // 
    @NameInMap("related_notify")
    public java.util.List<String> relatedNotify;

    public static CreateLeasePaymentfileRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateLeasePaymentfileRequest self = new CreateLeasePaymentfileRequest();
        return TeaModel.build(map, self);
    }

    public CreateLeasePaymentfileRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateLeasePaymentfileRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateLeasePaymentfileRequest setApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }
    public String getApplicationId() {
        return this.applicationId;
    }

    public CreateLeasePaymentfileRequest setAsync(Long async) {
        this.async = async;
        return this;
    }
    public Long getAsync() {
        return this.async;
    }

    public CreateLeasePaymentfileRequest setExtraInfo(String extraInfo) {
        this.extraInfo = extraInfo;
        return this;
    }
    public String getExtraInfo() {
        return this.extraInfo;
    }

    public CreateLeasePaymentfileRequest setLeaseId(String leaseId) {
        this.leaseId = leaseId;
        return this;
    }
    public String getLeaseId() {
        return this.leaseId;
    }

    public CreateLeasePaymentfileRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public CreateLeasePaymentfileRequest setPaymentFileHash(String paymentFileHash) {
        this.paymentFileHash = paymentFileHash;
        return this;
    }
    public String getPaymentFileHash() {
        return this.paymentFileHash;
    }

    public CreateLeasePaymentfileRequest setPaymentFileTxHash(String paymentFileTxHash) {
        this.paymentFileTxHash = paymentFileTxHash;
        return this;
    }
    public String getPaymentFileTxHash() {
        return this.paymentFileTxHash;
    }

    public CreateLeasePaymentfileRequest setPaymentUrl(String paymentUrl) {
        this.paymentUrl = paymentUrl;
        return this;
    }
    public String getPaymentUrl() {
        return this.paymentUrl;
    }

    public CreateLeasePaymentfileRequest setRelatedNotify(java.util.List<String> relatedNotify) {
        this.relatedNotify = relatedNotify;
        return this;
    }
    public java.util.List<String> getRelatedNotify() {
        return this.relatedNotify;
    }

}
