// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class CreateLeaseOrderinfoRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 集群ID
    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 实际预授权金额，芝麻信用免押金额 精确到毫厘，即123400表示12.34元
    @NameInMap("acutal_pre_auth_free")
    @Validation(required = true)
    public Long acutalPreAuthFree;

    // 融资租赁业务id，由资方控制台创建返回
    @NameInMap("application_id")
    public String applicationId;

    // 是否启动异步处理订单
    @NameInMap("async")
    public Long async;

    // 采购发票地址
    @NameInMap("bill_url")
    public String billUrl;

    // 到期买断价 精确到毫厘，即123400表示12.34元
    @NameInMap("buy_out_price")
    @Validation(required = true)
    public Long buyOutPrice;

    // 市编码
    @NameInMap("city_code")
    public String cityCode;

    // 免押金额 精确到毫厘，即123400表示12.34元
    @NameInMap("deposit_free")
    @Validation(required = true)
    public Long depositFree;

    // 区编码
    @NameInMap("district_code")
    public String districtCode;

    // 融资租赁额外字段
    @NameInMap("extra_info")
    public String extraInfo;

    // 安装服务记录哈希
    @NameInMap("install_hash")
    public String installHash;

    // 安装拆卸费 精确到毫厘，即123400表示12.34元
    @NameInMap("install_price")
    public Long installPrice;

    // 安装服务记录链上存证交易哈希
    @NameInMap("install_tx_hash")
    public String installTxHash;

    // 保险单号
    @NameInMap("insurance_number")
    public String insuranceNumber;

    // 保险链接
    @NameInMap("insurance_url")
    public String insuranceUrl;

    // 租赁物入库日  格式为2019-8-31 12:00:00
    @NameInMap("in_store_time")
    public String inStoreTime;

    // 订单额外信息
    @NameInMap("lease_order_extra")
    public java.util.List<LeaseOrderExtra> leaseOrderExtra;

    // 融资租赁及服务协议之补充协议文件
    @NameInMap("lease_service_additional_file_hash")
    public String leaseServiceAdditionalFileHash;

    // 融资租赁及服务协议之补充协议文件链上存证交易哈希
    @NameInMap("lease_service_additional_file_tx_hash")
    public String leaseServiceAdditionalFileTxHash;

    // 融资租赁及服务协议文件hash，三方协议
    @NameInMap("lease_service_file_hash")
    @Validation(required = true)
    public String leaseServiceFileHash;

    // 融资租赁及服务协议文件链上存证交易哈希
    @NameInMap("lease_service_file_tx_hash")
    @Validation(required = true)
    public String leaseServiceFileTxHash;

    // 订单创建时间 格式为2019-8-31 12:00:00
    @NameInMap("order_create_time")
    @Validation(required = true)
    public String orderCreateTime;

    // 订单id 长度不可超过50
    @NameInMap("order_id")
    @Validation(required = true)
    public String orderId;

    // 支付订单ID
    @NameInMap("order_pay_id")
    public String orderPayId;

    // 订单支付时间 格式为2019-8-31 12:00:00
    @NameInMap("order_pay_time")
    @Validation(required = true)
    public String orderPayTime;

    // 订单支付类型 1 预授权，2信用套餐，3支付宝代扣，4其他
    @NameInMap("order_pay_type")
    public Long orderPayType;

    // 租赁物出库物流编号
    @NameInMap("out_store_deliver_number")
    public String outStoreDeliverNumber;

    // 租赁物出库日  格式为2019-8-31 12:00:00
    @NameInMap("out_store_time")
    public String outStoreTime;

    // 支付凭证地址
    @NameInMap("pay_proof_url")
    public String payProofUrl;

    // 预授权支付订单ID
    @NameInMap("pre_auth_pay_order_id")
    public String preAuthPayOrderId;

    // 产品详细信息
    @NameInMap("product_info")
    @Validation(required = true)
    public java.util.List<ProductInfo> productInfo;

    // 省编码
    @NameInMap("province_code")
    public String provinceCode;

    // 采购发票文件哈希
    @NameInMap("purchase_contract_bill_hash")
    public String purchaseContractBillHash;

    // 采购发票文件链上存证交易哈希
    @NameInMap("purchase_contract_bill_tx_hash")
    public String purchaseContractBillTxHash;

    // 采购合同文件哈希
    @NameInMap("purchase_contract_hash")
    public String purchaseContractHash;

    // 采购合同文件链上存证交易哈希
    @NameInMap("purchase_contract_tx_hash")
    public String purchaseContractTxHash;

    // 采购合同地址
    @NameInMap("purchase_contract_url")
    public String purchaseContractUrl;

    // 额外通知第三方，如果需要通知相关方外的第三方，需要在此设置关联方的租户id，若不设置则只通知资方	
    // 
    @NameInMap("related_notify")
    public java.util.List<String> relatedNotify;

    // 租赁合同地址
    @NameInMap("rent_contract_url")
    public String rentContractUrl;

    // 月租金 精确到毫厘，即123400表示12.34元
    @NameInMap("rent_price_per_month")
    @Validation(required = true)
    public Long rentPricePerMonth;

    // 租期
    @NameInMap("rent_term")
    @Validation(required = true)
    public Long rentTerm;

    // 承租人签收记录哈希
    @NameInMap("sign_hash")
    public String signHash;

    // 承租人签收时间  格式为2019-8-31 12:00:00
    @NameInMap("sign_time")
    public String signTime;

    // 承租人签收记录链上存证哈希
    @NameInMap("sign_tx_hash")
    public String signTxHash;

    // 仓库类型 1实体仓 2虚拟仓
    @NameInMap("store_type")
    public Long storeType;

    // 补充协议地址
    @NameInMap("supplement_protocol_url")
    public String supplementProtocolUrl;

    // 供应商对应的金融科技租户id，若有此字段，则会授权相应的供应商上传采购等相关信息
    @NameInMap("supplier_isv_account")
    public String supplierIsvAccount;

    // 承租人收货地址
    @NameInMap("user_address")
    @Validation(required = true)
    public String userAddress;

    // 智能合同的合同id
    @NameInMap("lease_service_contract_id")
    public String leaseServiceContractId;

    // 网商直付通模式的代扣协议号
    @NameInMap("agreement_no")
    public String agreementNo;

    // 直付通代扣受理订单号
    @NameInMap("agreement_order_id")
    public String agreementOrderId;

    // 单位是毫厘，123400
    @NameInMap("down_payment")
    public Long downPayment;

    public static CreateLeaseOrderinfoRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateLeaseOrderinfoRequest self = new CreateLeaseOrderinfoRequest();
        return TeaModel.build(map, self);
    }

    public CreateLeaseOrderinfoRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateLeaseOrderinfoRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateLeaseOrderinfoRequest setAcutalPreAuthFree(Long acutalPreAuthFree) {
        this.acutalPreAuthFree = acutalPreAuthFree;
        return this;
    }
    public Long getAcutalPreAuthFree() {
        return this.acutalPreAuthFree;
    }

    public CreateLeaseOrderinfoRequest setApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }
    public String getApplicationId() {
        return this.applicationId;
    }

    public CreateLeaseOrderinfoRequest setAsync(Long async) {
        this.async = async;
        return this;
    }
    public Long getAsync() {
        return this.async;
    }

    public CreateLeaseOrderinfoRequest setBillUrl(String billUrl) {
        this.billUrl = billUrl;
        return this;
    }
    public String getBillUrl() {
        return this.billUrl;
    }

    public CreateLeaseOrderinfoRequest setBuyOutPrice(Long buyOutPrice) {
        this.buyOutPrice = buyOutPrice;
        return this;
    }
    public Long getBuyOutPrice() {
        return this.buyOutPrice;
    }

    public CreateLeaseOrderinfoRequest setCityCode(String cityCode) {
        this.cityCode = cityCode;
        return this;
    }
    public String getCityCode() {
        return this.cityCode;
    }

    public CreateLeaseOrderinfoRequest setDepositFree(Long depositFree) {
        this.depositFree = depositFree;
        return this;
    }
    public Long getDepositFree() {
        return this.depositFree;
    }

    public CreateLeaseOrderinfoRequest setDistrictCode(String districtCode) {
        this.districtCode = districtCode;
        return this;
    }
    public String getDistrictCode() {
        return this.districtCode;
    }

    public CreateLeaseOrderinfoRequest setExtraInfo(String extraInfo) {
        this.extraInfo = extraInfo;
        return this;
    }
    public String getExtraInfo() {
        return this.extraInfo;
    }

    public CreateLeaseOrderinfoRequest setInstallHash(String installHash) {
        this.installHash = installHash;
        return this;
    }
    public String getInstallHash() {
        return this.installHash;
    }

    public CreateLeaseOrderinfoRequest setInstallPrice(Long installPrice) {
        this.installPrice = installPrice;
        return this;
    }
    public Long getInstallPrice() {
        return this.installPrice;
    }

    public CreateLeaseOrderinfoRequest setInstallTxHash(String installTxHash) {
        this.installTxHash = installTxHash;
        return this;
    }
    public String getInstallTxHash() {
        return this.installTxHash;
    }

    public CreateLeaseOrderinfoRequest setInsuranceNumber(String insuranceNumber) {
        this.insuranceNumber = insuranceNumber;
        return this;
    }
    public String getInsuranceNumber() {
        return this.insuranceNumber;
    }

    public CreateLeaseOrderinfoRequest setInsuranceUrl(String insuranceUrl) {
        this.insuranceUrl = insuranceUrl;
        return this;
    }
    public String getInsuranceUrl() {
        return this.insuranceUrl;
    }

    public CreateLeaseOrderinfoRequest setInStoreTime(String inStoreTime) {
        this.inStoreTime = inStoreTime;
        return this;
    }
    public String getInStoreTime() {
        return this.inStoreTime;
    }

    public CreateLeaseOrderinfoRequest setLeaseOrderExtra(java.util.List<LeaseOrderExtra> leaseOrderExtra) {
        this.leaseOrderExtra = leaseOrderExtra;
        return this;
    }
    public java.util.List<LeaseOrderExtra> getLeaseOrderExtra() {
        return this.leaseOrderExtra;
    }

    public CreateLeaseOrderinfoRequest setLeaseServiceAdditionalFileHash(String leaseServiceAdditionalFileHash) {
        this.leaseServiceAdditionalFileHash = leaseServiceAdditionalFileHash;
        return this;
    }
    public String getLeaseServiceAdditionalFileHash() {
        return this.leaseServiceAdditionalFileHash;
    }

    public CreateLeaseOrderinfoRequest setLeaseServiceAdditionalFileTxHash(String leaseServiceAdditionalFileTxHash) {
        this.leaseServiceAdditionalFileTxHash = leaseServiceAdditionalFileTxHash;
        return this;
    }
    public String getLeaseServiceAdditionalFileTxHash() {
        return this.leaseServiceAdditionalFileTxHash;
    }

    public CreateLeaseOrderinfoRequest setLeaseServiceFileHash(String leaseServiceFileHash) {
        this.leaseServiceFileHash = leaseServiceFileHash;
        return this;
    }
    public String getLeaseServiceFileHash() {
        return this.leaseServiceFileHash;
    }

    public CreateLeaseOrderinfoRequest setLeaseServiceFileTxHash(String leaseServiceFileTxHash) {
        this.leaseServiceFileTxHash = leaseServiceFileTxHash;
        return this;
    }
    public String getLeaseServiceFileTxHash() {
        return this.leaseServiceFileTxHash;
    }

    public CreateLeaseOrderinfoRequest setOrderCreateTime(String orderCreateTime) {
        this.orderCreateTime = orderCreateTime;
        return this;
    }
    public String getOrderCreateTime() {
        return this.orderCreateTime;
    }

    public CreateLeaseOrderinfoRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public CreateLeaseOrderinfoRequest setOrderPayId(String orderPayId) {
        this.orderPayId = orderPayId;
        return this;
    }
    public String getOrderPayId() {
        return this.orderPayId;
    }

    public CreateLeaseOrderinfoRequest setOrderPayTime(String orderPayTime) {
        this.orderPayTime = orderPayTime;
        return this;
    }
    public String getOrderPayTime() {
        return this.orderPayTime;
    }

    public CreateLeaseOrderinfoRequest setOrderPayType(Long orderPayType) {
        this.orderPayType = orderPayType;
        return this;
    }
    public Long getOrderPayType() {
        return this.orderPayType;
    }

    public CreateLeaseOrderinfoRequest setOutStoreDeliverNumber(String outStoreDeliverNumber) {
        this.outStoreDeliverNumber = outStoreDeliverNumber;
        return this;
    }
    public String getOutStoreDeliverNumber() {
        return this.outStoreDeliverNumber;
    }

    public CreateLeaseOrderinfoRequest setOutStoreTime(String outStoreTime) {
        this.outStoreTime = outStoreTime;
        return this;
    }
    public String getOutStoreTime() {
        return this.outStoreTime;
    }

    public CreateLeaseOrderinfoRequest setPayProofUrl(String payProofUrl) {
        this.payProofUrl = payProofUrl;
        return this;
    }
    public String getPayProofUrl() {
        return this.payProofUrl;
    }

    public CreateLeaseOrderinfoRequest setPreAuthPayOrderId(String preAuthPayOrderId) {
        this.preAuthPayOrderId = preAuthPayOrderId;
        return this;
    }
    public String getPreAuthPayOrderId() {
        return this.preAuthPayOrderId;
    }

    public CreateLeaseOrderinfoRequest setProductInfo(java.util.List<ProductInfo> productInfo) {
        this.productInfo = productInfo;
        return this;
    }
    public java.util.List<ProductInfo> getProductInfo() {
        return this.productInfo;
    }

    public CreateLeaseOrderinfoRequest setProvinceCode(String provinceCode) {
        this.provinceCode = provinceCode;
        return this;
    }
    public String getProvinceCode() {
        return this.provinceCode;
    }

    public CreateLeaseOrderinfoRequest setPurchaseContractBillHash(String purchaseContractBillHash) {
        this.purchaseContractBillHash = purchaseContractBillHash;
        return this;
    }
    public String getPurchaseContractBillHash() {
        return this.purchaseContractBillHash;
    }

    public CreateLeaseOrderinfoRequest setPurchaseContractBillTxHash(String purchaseContractBillTxHash) {
        this.purchaseContractBillTxHash = purchaseContractBillTxHash;
        return this;
    }
    public String getPurchaseContractBillTxHash() {
        return this.purchaseContractBillTxHash;
    }

    public CreateLeaseOrderinfoRequest setPurchaseContractHash(String purchaseContractHash) {
        this.purchaseContractHash = purchaseContractHash;
        return this;
    }
    public String getPurchaseContractHash() {
        return this.purchaseContractHash;
    }

    public CreateLeaseOrderinfoRequest setPurchaseContractTxHash(String purchaseContractTxHash) {
        this.purchaseContractTxHash = purchaseContractTxHash;
        return this;
    }
    public String getPurchaseContractTxHash() {
        return this.purchaseContractTxHash;
    }

    public CreateLeaseOrderinfoRequest setPurchaseContractUrl(String purchaseContractUrl) {
        this.purchaseContractUrl = purchaseContractUrl;
        return this;
    }
    public String getPurchaseContractUrl() {
        return this.purchaseContractUrl;
    }

    public CreateLeaseOrderinfoRequest setRelatedNotify(java.util.List<String> relatedNotify) {
        this.relatedNotify = relatedNotify;
        return this;
    }
    public java.util.List<String> getRelatedNotify() {
        return this.relatedNotify;
    }

    public CreateLeaseOrderinfoRequest setRentContractUrl(String rentContractUrl) {
        this.rentContractUrl = rentContractUrl;
        return this;
    }
    public String getRentContractUrl() {
        return this.rentContractUrl;
    }

    public CreateLeaseOrderinfoRequest setRentPricePerMonth(Long rentPricePerMonth) {
        this.rentPricePerMonth = rentPricePerMonth;
        return this;
    }
    public Long getRentPricePerMonth() {
        return this.rentPricePerMonth;
    }

    public CreateLeaseOrderinfoRequest setRentTerm(Long rentTerm) {
        this.rentTerm = rentTerm;
        return this;
    }
    public Long getRentTerm() {
        return this.rentTerm;
    }

    public CreateLeaseOrderinfoRequest setSignHash(String signHash) {
        this.signHash = signHash;
        return this;
    }
    public String getSignHash() {
        return this.signHash;
    }

    public CreateLeaseOrderinfoRequest setSignTime(String signTime) {
        this.signTime = signTime;
        return this;
    }
    public String getSignTime() {
        return this.signTime;
    }

    public CreateLeaseOrderinfoRequest setSignTxHash(String signTxHash) {
        this.signTxHash = signTxHash;
        return this;
    }
    public String getSignTxHash() {
        return this.signTxHash;
    }

    public CreateLeaseOrderinfoRequest setStoreType(Long storeType) {
        this.storeType = storeType;
        return this;
    }
    public Long getStoreType() {
        return this.storeType;
    }

    public CreateLeaseOrderinfoRequest setSupplementProtocolUrl(String supplementProtocolUrl) {
        this.supplementProtocolUrl = supplementProtocolUrl;
        return this;
    }
    public String getSupplementProtocolUrl() {
        return this.supplementProtocolUrl;
    }

    public CreateLeaseOrderinfoRequest setSupplierIsvAccount(String supplierIsvAccount) {
        this.supplierIsvAccount = supplierIsvAccount;
        return this;
    }
    public String getSupplierIsvAccount() {
        return this.supplierIsvAccount;
    }

    public CreateLeaseOrderinfoRequest setUserAddress(String userAddress) {
        this.userAddress = userAddress;
        return this;
    }
    public String getUserAddress() {
        return this.userAddress;
    }

    public CreateLeaseOrderinfoRequest setLeaseServiceContractId(String leaseServiceContractId) {
        this.leaseServiceContractId = leaseServiceContractId;
        return this;
    }
    public String getLeaseServiceContractId() {
        return this.leaseServiceContractId;
    }

    public CreateLeaseOrderinfoRequest setAgreementNo(String agreementNo) {
        this.agreementNo = agreementNo;
        return this;
    }
    public String getAgreementNo() {
        return this.agreementNo;
    }

    public CreateLeaseOrderinfoRequest setAgreementOrderId(String agreementOrderId) {
        this.agreementOrderId = agreementOrderId;
        return this;
    }
    public String getAgreementOrderId() {
        return this.agreementOrderId;
    }

    public CreateLeaseOrderinfoRequest setDownPayment(Long downPayment) {
        this.downPayment = downPayment;
        return this;
    }
    public Long getDownPayment() {
        return this.downPayment;
    }

}
