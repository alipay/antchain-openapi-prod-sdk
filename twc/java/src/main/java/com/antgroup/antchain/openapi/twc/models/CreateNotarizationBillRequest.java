// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class CreateNotarizationBillRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 集群ID
    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 支付宝交易订单号
    @NameInMap("alipay_order_no")
    public String alipayOrderNo;

    // 支付宝用户ID
    @NameInMap("alipay_uid")
    public String alipayUid;

    // 申请者名称
    @NameInMap("cert_name")
    public String certName;

    // 申请者证件号码：身份证号码（个人用户）或企业统一社会信用代码（企业用户）
    @NameInMap("cert_no")
    public String certNo;

    // 电子公证书业务细项，如“200”对应出生公证
    @NameInMap("e_notarization_biz")
    public String eNotarizationBiz;

    // 电子公证书下载地址
    @NameInMap("e_notarization_download_url")
    public String eNotarizationDownloadUrl;

    // 电子公证书编号
    @NameInMap("e_notarization_no")
    public String eNotarizationNo;

    // 电子公证书页数
    @NameInMap("e_notarization_page_no")
    public String eNotarizationPageNo;

    // 电子公证书状态码
    @NameInMap("e_notarization_status")
    public String eNotarizationStatus;

    // 电子公证书业务用途
    @NameInMap("e_notarization_usage")
    public String eNotarizationUsage;

    // 电子公证书有效期
    @NameInMap("e_notarization_valid_date")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String eNotarizationValidDate;

    // 企业法人姓名（企业用户必填）
    @NameInMap("legal_person_name")
    public String legalPersonName;

    // 出证订单ID
    @NameInMap("order_id")
    public String orderId;

    // 出证机构ID
    @NameInMap("org_id")
    public String orgId;

    // 支付宝交易订单支付金额（人民币），单位为分
    @NameInMap("payment_amount")
    public Long paymentAmount;

    // 联系电话
    @NameInMap("phone")
    public String phone;

    // 场景枚举：E_NOTARIZATION（电子公证），NOTARY_CERTIFICATION（存证证明）
    @NameInMap("scenario")
    @Validation(required = true)
    public String scenario;

    // 申请者身份类型，1个人，2企业
    @NameInMap("user_type")
    public Long userType;

    // 是否为酬金分润方式，是则按照订金额一定比例分润，否则直接支付订单金额
    @NameInMap("fee_splitting")
    @Validation(required = true)
    public Boolean feeSplitting;

    public static CreateNotarizationBillRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateNotarizationBillRequest self = new CreateNotarizationBillRequest();
        return TeaModel.build(map, self);
    }

    public CreateNotarizationBillRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateNotarizationBillRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateNotarizationBillRequest setAlipayOrderNo(String alipayOrderNo) {
        this.alipayOrderNo = alipayOrderNo;
        return this;
    }
    public String getAlipayOrderNo() {
        return this.alipayOrderNo;
    }

    public CreateNotarizationBillRequest setAlipayUid(String alipayUid) {
        this.alipayUid = alipayUid;
        return this;
    }
    public String getAlipayUid() {
        return this.alipayUid;
    }

    public CreateNotarizationBillRequest setCertName(String certName) {
        this.certName = certName;
        return this;
    }
    public String getCertName() {
        return this.certName;
    }

    public CreateNotarizationBillRequest setCertNo(String certNo) {
        this.certNo = certNo;
        return this;
    }
    public String getCertNo() {
        return this.certNo;
    }

    public CreateNotarizationBillRequest setENotarizationBiz(String eNotarizationBiz) {
        this.eNotarizationBiz = eNotarizationBiz;
        return this;
    }
    public String getENotarizationBiz() {
        return this.eNotarizationBiz;
    }

    public CreateNotarizationBillRequest setENotarizationDownloadUrl(String eNotarizationDownloadUrl) {
        this.eNotarizationDownloadUrl = eNotarizationDownloadUrl;
        return this;
    }
    public String getENotarizationDownloadUrl() {
        return this.eNotarizationDownloadUrl;
    }

    public CreateNotarizationBillRequest setENotarizationNo(String eNotarizationNo) {
        this.eNotarizationNo = eNotarizationNo;
        return this;
    }
    public String getENotarizationNo() {
        return this.eNotarizationNo;
    }

    public CreateNotarizationBillRequest setENotarizationPageNo(String eNotarizationPageNo) {
        this.eNotarizationPageNo = eNotarizationPageNo;
        return this;
    }
    public String getENotarizationPageNo() {
        return this.eNotarizationPageNo;
    }

    public CreateNotarizationBillRequest setENotarizationStatus(String eNotarizationStatus) {
        this.eNotarizationStatus = eNotarizationStatus;
        return this;
    }
    public String getENotarizationStatus() {
        return this.eNotarizationStatus;
    }

    public CreateNotarizationBillRequest setENotarizationUsage(String eNotarizationUsage) {
        this.eNotarizationUsage = eNotarizationUsage;
        return this;
    }
    public String getENotarizationUsage() {
        return this.eNotarizationUsage;
    }

    public CreateNotarizationBillRequest setENotarizationValidDate(String eNotarizationValidDate) {
        this.eNotarizationValidDate = eNotarizationValidDate;
        return this;
    }
    public String getENotarizationValidDate() {
        return this.eNotarizationValidDate;
    }

    public CreateNotarizationBillRequest setLegalPersonName(String legalPersonName) {
        this.legalPersonName = legalPersonName;
        return this;
    }
    public String getLegalPersonName() {
        return this.legalPersonName;
    }

    public CreateNotarizationBillRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public CreateNotarizationBillRequest setOrgId(String orgId) {
        this.orgId = orgId;
        return this;
    }
    public String getOrgId() {
        return this.orgId;
    }

    public CreateNotarizationBillRequest setPaymentAmount(Long paymentAmount) {
        this.paymentAmount = paymentAmount;
        return this;
    }
    public Long getPaymentAmount() {
        return this.paymentAmount;
    }

    public CreateNotarizationBillRequest setPhone(String phone) {
        this.phone = phone;
        return this;
    }
    public String getPhone() {
        return this.phone;
    }

    public CreateNotarizationBillRequest setScenario(String scenario) {
        this.scenario = scenario;
        return this;
    }
    public String getScenario() {
        return this.scenario;
    }

    public CreateNotarizationBillRequest setUserType(Long userType) {
        this.userType = userType;
        return this;
    }
    public Long getUserType() {
        return this.userType;
    }

    public CreateNotarizationBillRequest setFeeSplitting(Boolean feeSplitting) {
        this.feeSplitting = feeSplitting;
        return this;
    }
    public Boolean getFeeSplitting() {
        return this.feeSplitting;
    }

}
