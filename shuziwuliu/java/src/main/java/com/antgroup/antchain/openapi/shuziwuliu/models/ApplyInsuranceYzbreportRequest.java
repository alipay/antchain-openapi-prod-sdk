// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.shuziwuliu.models;

import com.aliyun.tea.*;

public class ApplyInsuranceYzbreportRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 调用方生成的唯一编码，格式为 yyyyMMdd_身份标识_其他编码，系统会根据该流水号做防重、幂等判断逻辑。
    // yyyyMMdd请传递当前时间。 
    // 身份标识可自定义。
    // 其他编码建议为随机值。
    // 当极端场景中，系统会返回处理中，错误码为2222，客户端应该保持该流水号不变，并使用原来的请求再次发送请求，系统会根据幂等逻辑返回处理结果；	
    @NameInMap("trade_no")
    @Validation(required = true, maxLength = 50)
    public String tradeNo;

    // 保司编码，PAIC---平安、CPIC---太保
    @NameInMap("external_channel_code")
    @Validation(required = true, maxLength = 10)
    public String externalChannelCode;

    // 险种编码，05-驿站宝
    @NameInMap("external_product_code")
    @Validation(required = true, maxLength = 2)
    public String externalProductCode;

    // 保单号，申请理赔的保单号
    @NameInMap("policy_no")
    @Validation(required = true, maxLength = 200)
    public String policyNo;

    // 报案号，用于报案材料更新
    @NameInMap("report_no")
    public String reportNo;

    // 报案唯一标识，申请理赔所关联的订单号，如一个订单会存在多次理赔，请用唯一标识
    @NameInMap("report_unique_key")
    @Validation(required = true, maxLength = 200)
    public String reportUniqueKey;

    // 理赔申请人
    @NameInMap("claim_apply_person")
    @Validation(required = true, maxLength = 100)
    public String claimApplyPerson;

    // 报案人名称
    @NameInMap("reporter_name")
    @Validation(required = true, maxLength = 100)
    public String reporterName;

    // 报案人联系方式
    @NameInMap("reporter_contact")
    @Validation(required = true, maxLength = 20)
    public String reporterContact;

    // 出险时间，发生损失的时间 yyyy-mm-dd hh:mm:ss
    @NameInMap("accident_time")
    @Validation(required = true)
    public String accidentTime;

    // 出险城市编码，国家地理位置编码6位城市编码
    @NameInMap("accident_city_code")
    @Validation(required = true, maxLength = 10)
    public String accidentCityCode;

    // 出险区县编码，国家地理位置编码6位城市编码
    @NameInMap("accident_district_code")
    @Validation(required = true, maxLength = 10)
    public String accidentDistrictCode;

    // 出险详细地址，事发出险地的详细地址
    @NameInMap("accident_address")
    @Validation(required = true, maxLength = 500)
    public String accidentAddress;

    // 出险原因代码，包裹破损丢失-R3028，火灾-R3025，爆炸-R3026，水湿-R3036，自燃-R3038，其他意外-R3039
    @NameInMap("accident_cause_code")
    @Validation(required = true, maxLength = 10)
    public String accidentCauseCode;

    // 出险详细经过
    @NameInMap("accident_detail")
    @Validation(required = true, maxLength = 500)
    public String accidentDetail;

    // 损失预估总金额，单位（元），最多支持2位小数
    @NameInMap("loss_estimate_total_amount")
    @Validation(required = true)
    public String lossEstimateTotalAmount;

    // 损失类型，1-人伤，2-车损,，3-物损，6-其它损失，多种损失以英文逗号分隔
    @NameInMap("loss_type")
    @Validation(required = true, maxLength = 50)
    public String lossType;

    // 快递公司，申请理赔所关联的快递公司名称，包裹出险可填
    @NameInMap("courier_company")
    @Validation(maxLength = 200)
    public String courierCompany;

    // 投诉工单号，申请理赔所关联的投诉工单号，包裹出险可填
    @NameInMap("complaint_job_no")
    @Validation(maxLength = 100)
    public String complaintJobNo;

    // 运单号，申请理赔所关联的运单号，包裹出险可填
    @NameInMap("way_bill_no")
    @Validation(maxLength = 100)
    public String wayBillNo;

    // 支付信息
    @NameInMap("payment_info")
    public PaymentInfo paymentInfo;

    // 人员伤残情况
    @NameInMap("person_loss")
    public PersonLoss personLoss;

    // 车辆损失详情
    @NameInMap("car_loss")
    public CarLoss carLoss;

    // 货物损失详情
    @NameInMap("cargo_loss")
    public CargoLoss cargoLoss;

    // 文档信息
    @NameInMap("documents")
    public java.util.List<Document> documents;

    // 判责工单号
    @NameInMap("duty_work_no")
    @Validation(maxLength = 100)
    public String dutyWorkNo;

    // 快递或包裹进入驿站仓储时间，yyyy-mm-dd hh:mm:ss
    @NameInMap("pkg_in_date")
    @Validation(maxLength = 20)
    public String pkgInDate;

    // 驿站针对快递或包裹的出库时间（配送上门传送待签收时间），yyyy-mm-dd hh:mm:ss
    @NameInMap("pkg_out_date")
    @Validation(maxLength = 20)
    public String pkgOutDate;

    // 发票工单投诉时间，yyyy-mm-dd hh:mm:ss
    @NameInMap("gen_work_date")
    @Validation(maxLength = 20)
    public String genWorkDate;

    // 工单类型
    @NameInMap("work_type")
    @Validation(maxLength = 20)
    public String workType;

    // 是否星级站点，0是，1否
    @NameInMap("is_star_station")
    public String isStarStation;

    // 被保人姓名，实际的保险被保人名称
    @NameInMap("bbr_name")
    public String bbrName;

    // 被保人证件类型，01--居民身份证、03--营业执照
    @NameInMap("bbr_id_type")
    public String bbrIdType;

    // 被保人证件号码
    @NameInMap("bbr_id_no")
    public String bbrIdNo;

    // 保险起期，格式：yyyy-MM-dd HH:mm:ss
    @NameInMap("insure_start")
    public String insureStart;

    // 保险止期，格式：yyyy-MM-dd HH:mm:ss
    @NameInMap("insure_end")
    public String insureEnd;

    public static ApplyInsuranceYzbreportRequest build(java.util.Map<String, ?> map) throws Exception {
        ApplyInsuranceYzbreportRequest self = new ApplyInsuranceYzbreportRequest();
        return TeaModel.build(map, self);
    }

    public ApplyInsuranceYzbreportRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ApplyInsuranceYzbreportRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ApplyInsuranceYzbreportRequest setTradeNo(String tradeNo) {
        this.tradeNo = tradeNo;
        return this;
    }
    public String getTradeNo() {
        return this.tradeNo;
    }

    public ApplyInsuranceYzbreportRequest setExternalChannelCode(String externalChannelCode) {
        this.externalChannelCode = externalChannelCode;
        return this;
    }
    public String getExternalChannelCode() {
        return this.externalChannelCode;
    }

    public ApplyInsuranceYzbreportRequest setExternalProductCode(String externalProductCode) {
        this.externalProductCode = externalProductCode;
        return this;
    }
    public String getExternalProductCode() {
        return this.externalProductCode;
    }

    public ApplyInsuranceYzbreportRequest setPolicyNo(String policyNo) {
        this.policyNo = policyNo;
        return this;
    }
    public String getPolicyNo() {
        return this.policyNo;
    }

    public ApplyInsuranceYzbreportRequest setReportNo(String reportNo) {
        this.reportNo = reportNo;
        return this;
    }
    public String getReportNo() {
        return this.reportNo;
    }

    public ApplyInsuranceYzbreportRequest setReportUniqueKey(String reportUniqueKey) {
        this.reportUniqueKey = reportUniqueKey;
        return this;
    }
    public String getReportUniqueKey() {
        return this.reportUniqueKey;
    }

    public ApplyInsuranceYzbreportRequest setClaimApplyPerson(String claimApplyPerson) {
        this.claimApplyPerson = claimApplyPerson;
        return this;
    }
    public String getClaimApplyPerson() {
        return this.claimApplyPerson;
    }

    public ApplyInsuranceYzbreportRequest setReporterName(String reporterName) {
        this.reporterName = reporterName;
        return this;
    }
    public String getReporterName() {
        return this.reporterName;
    }

    public ApplyInsuranceYzbreportRequest setReporterContact(String reporterContact) {
        this.reporterContact = reporterContact;
        return this;
    }
    public String getReporterContact() {
        return this.reporterContact;
    }

    public ApplyInsuranceYzbreportRequest setAccidentTime(String accidentTime) {
        this.accidentTime = accidentTime;
        return this;
    }
    public String getAccidentTime() {
        return this.accidentTime;
    }

    public ApplyInsuranceYzbreportRequest setAccidentCityCode(String accidentCityCode) {
        this.accidentCityCode = accidentCityCode;
        return this;
    }
    public String getAccidentCityCode() {
        return this.accidentCityCode;
    }

    public ApplyInsuranceYzbreportRequest setAccidentDistrictCode(String accidentDistrictCode) {
        this.accidentDistrictCode = accidentDistrictCode;
        return this;
    }
    public String getAccidentDistrictCode() {
        return this.accidentDistrictCode;
    }

    public ApplyInsuranceYzbreportRequest setAccidentAddress(String accidentAddress) {
        this.accidentAddress = accidentAddress;
        return this;
    }
    public String getAccidentAddress() {
        return this.accidentAddress;
    }

    public ApplyInsuranceYzbreportRequest setAccidentCauseCode(String accidentCauseCode) {
        this.accidentCauseCode = accidentCauseCode;
        return this;
    }
    public String getAccidentCauseCode() {
        return this.accidentCauseCode;
    }

    public ApplyInsuranceYzbreportRequest setAccidentDetail(String accidentDetail) {
        this.accidentDetail = accidentDetail;
        return this;
    }
    public String getAccidentDetail() {
        return this.accidentDetail;
    }

    public ApplyInsuranceYzbreportRequest setLossEstimateTotalAmount(String lossEstimateTotalAmount) {
        this.lossEstimateTotalAmount = lossEstimateTotalAmount;
        return this;
    }
    public String getLossEstimateTotalAmount() {
        return this.lossEstimateTotalAmount;
    }

    public ApplyInsuranceYzbreportRequest setLossType(String lossType) {
        this.lossType = lossType;
        return this;
    }
    public String getLossType() {
        return this.lossType;
    }

    public ApplyInsuranceYzbreportRequest setCourierCompany(String courierCompany) {
        this.courierCompany = courierCompany;
        return this;
    }
    public String getCourierCompany() {
        return this.courierCompany;
    }

    public ApplyInsuranceYzbreportRequest setComplaintJobNo(String complaintJobNo) {
        this.complaintJobNo = complaintJobNo;
        return this;
    }
    public String getComplaintJobNo() {
        return this.complaintJobNo;
    }

    public ApplyInsuranceYzbreportRequest setWayBillNo(String wayBillNo) {
        this.wayBillNo = wayBillNo;
        return this;
    }
    public String getWayBillNo() {
        return this.wayBillNo;
    }

    public ApplyInsuranceYzbreportRequest setPaymentInfo(PaymentInfo paymentInfo) {
        this.paymentInfo = paymentInfo;
        return this;
    }
    public PaymentInfo getPaymentInfo() {
        return this.paymentInfo;
    }

    public ApplyInsuranceYzbreportRequest setPersonLoss(PersonLoss personLoss) {
        this.personLoss = personLoss;
        return this;
    }
    public PersonLoss getPersonLoss() {
        return this.personLoss;
    }

    public ApplyInsuranceYzbreportRequest setCarLoss(CarLoss carLoss) {
        this.carLoss = carLoss;
        return this;
    }
    public CarLoss getCarLoss() {
        return this.carLoss;
    }

    public ApplyInsuranceYzbreportRequest setCargoLoss(CargoLoss cargoLoss) {
        this.cargoLoss = cargoLoss;
        return this;
    }
    public CargoLoss getCargoLoss() {
        return this.cargoLoss;
    }

    public ApplyInsuranceYzbreportRequest setDocuments(java.util.List<Document> documents) {
        this.documents = documents;
        return this;
    }
    public java.util.List<Document> getDocuments() {
        return this.documents;
    }

    public ApplyInsuranceYzbreportRequest setDutyWorkNo(String dutyWorkNo) {
        this.dutyWorkNo = dutyWorkNo;
        return this;
    }
    public String getDutyWorkNo() {
        return this.dutyWorkNo;
    }

    public ApplyInsuranceYzbreportRequest setPkgInDate(String pkgInDate) {
        this.pkgInDate = pkgInDate;
        return this;
    }
    public String getPkgInDate() {
        return this.pkgInDate;
    }

    public ApplyInsuranceYzbreportRequest setPkgOutDate(String pkgOutDate) {
        this.pkgOutDate = pkgOutDate;
        return this;
    }
    public String getPkgOutDate() {
        return this.pkgOutDate;
    }

    public ApplyInsuranceYzbreportRequest setGenWorkDate(String genWorkDate) {
        this.genWorkDate = genWorkDate;
        return this;
    }
    public String getGenWorkDate() {
        return this.genWorkDate;
    }

    public ApplyInsuranceYzbreportRequest setWorkType(String workType) {
        this.workType = workType;
        return this;
    }
    public String getWorkType() {
        return this.workType;
    }

    public ApplyInsuranceYzbreportRequest setIsStarStation(String isStarStation) {
        this.isStarStation = isStarStation;
        return this;
    }
    public String getIsStarStation() {
        return this.isStarStation;
    }

    public ApplyInsuranceYzbreportRequest setBbrName(String bbrName) {
        this.bbrName = bbrName;
        return this;
    }
    public String getBbrName() {
        return this.bbrName;
    }

    public ApplyInsuranceYzbreportRequest setBbrIdType(String bbrIdType) {
        this.bbrIdType = bbrIdType;
        return this;
    }
    public String getBbrIdType() {
        return this.bbrIdType;
    }

    public ApplyInsuranceYzbreportRequest setBbrIdNo(String bbrIdNo) {
        this.bbrIdNo = bbrIdNo;
        return this;
    }
    public String getBbrIdNo() {
        return this.bbrIdNo;
    }

    public ApplyInsuranceYzbreportRequest setInsureStart(String insureStart) {
        this.insureStart = insureStart;
        return this;
    }
    public String getInsureStart() {
        return this.insureStart;
    }

    public ApplyInsuranceYzbreportRequest setInsureEnd(String insureEnd) {
        this.insureEnd = insureEnd;
        return this;
    }
    public String getInsureEnd() {
        return this.insureEnd;
    }

}
