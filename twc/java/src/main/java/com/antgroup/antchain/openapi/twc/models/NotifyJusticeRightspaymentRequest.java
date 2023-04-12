// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class NotifyJusticeRightspaymentRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 案件维权记录编号
    @NameInMap("record_id")
    @Validation(required = true)
    public Long recordId;

    // 缴费金额(支持两位小数)
    @NameInMap("amount")
    @Validation(required = true)
    public Long amount;

    // 费用类型(枚举)
    // ARBITRATION: 仲裁案件受理费
    @NameInMap("payment_type")
    @Validation(required = true)
    public String paymentType;

    // 缴费状态(枚举)
    // WAIT_FEE: 待缴费
    // SUCCESS: 成功
    // FAIL: 失败
    @NameInMap("payment_status")
    @Validation(required = true)
    public String paymentStatus;

    // 缴费失败的描述(不是缴费完成时,必填)
    // 不超过500字符
    @NameInMap("payment_remark")
    public String paymentRemark;

    // 相关的文件信息列表,示例查看对接文档
    @NameInMap("payment_file_infos")
    public java.util.List<FileInfo> paymentFileInfos;

    // 缴费账户信息(待缴费时必填),示例查看对接文档
    @NameInMap("payment_info")
    public PaymentInfo paymentInfo;

    public static NotifyJusticeRightspaymentRequest build(java.util.Map<String, ?> map) throws Exception {
        NotifyJusticeRightspaymentRequest self = new NotifyJusticeRightspaymentRequest();
        return TeaModel.build(map, self);
    }

    public NotifyJusticeRightspaymentRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public NotifyJusticeRightspaymentRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public NotifyJusticeRightspaymentRequest setRecordId(Long recordId) {
        this.recordId = recordId;
        return this;
    }
    public Long getRecordId() {
        return this.recordId;
    }

    public NotifyJusticeRightspaymentRequest setAmount(Long amount) {
        this.amount = amount;
        return this;
    }
    public Long getAmount() {
        return this.amount;
    }

    public NotifyJusticeRightspaymentRequest setPaymentType(String paymentType) {
        this.paymentType = paymentType;
        return this;
    }
    public String getPaymentType() {
        return this.paymentType;
    }

    public NotifyJusticeRightspaymentRequest setPaymentStatus(String paymentStatus) {
        this.paymentStatus = paymentStatus;
        return this;
    }
    public String getPaymentStatus() {
        return this.paymentStatus;
    }

    public NotifyJusticeRightspaymentRequest setPaymentRemark(String paymentRemark) {
        this.paymentRemark = paymentRemark;
        return this;
    }
    public String getPaymentRemark() {
        return this.paymentRemark;
    }

    public NotifyJusticeRightspaymentRequest setPaymentFileInfos(java.util.List<FileInfo> paymentFileInfos) {
        this.paymentFileInfos = paymentFileInfos;
        return this;
    }
    public java.util.List<FileInfo> getPaymentFileInfos() {
        return this.paymentFileInfos;
    }

    public NotifyJusticeRightspaymentRequest setPaymentInfo(PaymentInfo paymentInfo) {
        this.paymentInfo = paymentInfo;
        return this;
    }
    public PaymentInfo getPaymentInfo() {
        return this.paymentInfo;
    }

}
