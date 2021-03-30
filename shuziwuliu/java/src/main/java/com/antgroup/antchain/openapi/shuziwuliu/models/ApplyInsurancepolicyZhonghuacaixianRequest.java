// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.shuziwuliu.models;

import com.aliyun.tea.*;

public class ApplyInsurancepolicyZhonghuacaixianRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 被保险人地址
    @NameInMap("bbr_addr")
    @Validation(maxLength = 80)
    public String bbrAddr;

    // 被保险人证件号码
    @NameInMap("bbr_id_no")
    @Validation(required = true, maxLength = 40)
    public String bbrIdNo;

    // 被保险人证件类型。按照如下值填写
    // 464001	身份证
    // 464002	护照
    // 464003	其他
    // 464004	组织机构代码
    // 464005	军人证
    // 464006	工商注册号码
    // 464007	统一社会信用代码
    // 464008	临时身份证
    // 464009	外国护照
    // 464010	中国人民武装警察身份证件
    // 464011	军官证
    // 464012	企业营业执照号码
    // 464013	统一社会信用代码（五证合一号码）
    // 464014	个体工商户营业执照号码
    // 464015	户口本
    // 464016	其他类境内个人身份有效证件
    // 464017	其他类境外个人身份有效证件
    // 464018	税务登记证
    // 464019	金融许可证号码
    // 464020	国家主管部门颁外国驻华机构批文号码
    // 464021	其他类境外机构代码
    @NameInMap("bbr_id_type")
    @Validation(required = true, maxLength = 40)
    public String bbrIdType;

    // 被保险人姓名
    @NameInMap("bbr_name")
    @Validation(required = true, maxLength = 40)
    public String bbrName;

    // 被保险人联系电话
    @NameInMap("bbr_tel")
    @Validation(required = true, maxLength = 40)
    public String bbrTel;

    // 运费,四舍五入精确到小数点两位。系统将根据运费和费率计算含税保费，计算的保费结果为四舍五入，精确到两位小数
    @NameInMap("carriage")
    @Validation(required = true, maxLength = 20)
    public String carriage;

    // 货物名称
    @NameInMap("car_go")
    @Validation(required = true, maxLength = 40)
    public String carGo;

    // 厂牌型号
    @NameInMap("cp_model")
    @Validation(required = true, maxLength = 80)
    public String cpModel;

    // 目的地
    @NameInMap("destination")
    @Validation(maxLength = 200)
    public String destination;

    // 行驶证车主
    @NameInMap("driv_per")
    @Validation(required = true, maxLength = 40)
    public String drivPer;

    // 保险起期，精确到天；最短起保时间为次日0点，最长延时起保时间为次日0点后24h
    @NameInMap("eff_date")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String effDate;

    // 发动机编号
    @NameInMap("engine_no")
    @Validation(required = true, maxLength = 40)
    public String engineNo;

    // 车架号
    @NameInMap("frame_no")
    @Validation(required = true, maxLength = 40)
    public String frameNo;

    // 运单所属集团分布式身份标识
    @NameInMap("group_platform_did")
    @Validation(required = true, maxLength = 80)
    public String groupPlatformDid;

    // 投保人证件类型有效止期
    @NameInMap("identify_period_end")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String identifyPeriodEnd;

    // 投保人证件类型有效起期
    @NameInMap("identify_period_start")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String identifyPeriodStart;

    // 车牌号码
    @NameInMap("license_no")
    @Validation(required = true, maxLength = 40)
    public String licenseNo;

    // 运单所属平台分布式身份标识
    @NameInMap("platform_did")
    @Validation(required = true, maxLength = 80)
    public String platformDid;

    // 运营证号
    @NameInMap("run_no")
    @Validation(required = true, maxLength = 40)
    public String runNo;

    // 起运地
    @NameInMap("start_place")
    @Validation(maxLength = 200)
    public String startPlace;

    // 投保人地址
    @NameInMap("tbr_addr")
    @Validation(maxLength = 80)
    public String tbrAddr;

    // 投保人邮箱
    @NameInMap("tbr_email")
    @Validation(maxLength = 40)
    public String tbrEmail;

    // 投保人证件号
    @NameInMap("tbr_id_no")
    @Validation(required = true, maxLength = 40)
    public String tbrIdNo;

    // 投保人证件类型，按照如下状态进行填写 
    // 464001	身份证
    // 464002	护照
    // 464003	其他
    // 464004	组织机构代码
    // 464005	军人证
    // 464006	工商注册号码
    // 464007	统一社会信用代码
    // 464008	临时身份证
    // 464009	外国护照
    // 464010	中国人民武装警察身份证件
    // 464011	军官证
    // 464012	企业营业执照号码
    // 464013	统一社会信用代码（五证合一号码）
    // 464014	个体工商户营业执照号码
    // 464015	户口本
    // 464016	其他类境内个人身份有效证件
    // 464017	其他类境外个人身份有效证件
    // 464018	税务登记证
    // 464019	金融许可证号码
    // 464020	国家主管部门颁外国驻华机构批文号码
    // 464021	其他类境外机构代码
    @NameInMap("tbr_id_type")
    @Validation(required = true, maxLength = 40)
    public String tbrIdType;

    // 投保人姓名
    @NameInMap("tbr_name")
    @Validation(required = true, maxLength = 40)
    public String tbrName;

    // 投保人联系电话
    @NameInMap("tbr_tel")
    @Validation(required = true, maxLength = 40)
    public String tbrTel;

    // 保险止期，保期时间间隔为1-30天。
    @NameInMap("term_date")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String termDate;

    // 吨位
    @NameInMap("ton_nage")
    @Validation(required = true, maxLength = 20)
    public String tonNage;

    // 交易流水号,全局唯一；格式为 yyyyMMdd+身份标识+其他编码。系统会根据该流水号做防重、幂等判断逻辑。当极端场景中，系统会返回处理中状态，客户端应该保持该流水号不变，并使用原来的请求再次发送请求，系统会根据幂等逻辑返回处理结果
    @NameInMap("trade_no")
    @Validation(required = true, maxLength = 32, minLength = 32)
    public String tradeNo;

    // 运输货物
    @NameInMap("ts_car_go")
    @Validation(required = true, maxLength = 80)
    public String tsCarGo;

    // 运单id。通过运单创建接口上传运单时指定的运单标识。系统会根据该标识查询运单相关信息做投保业务校验
    @NameInMap("waybill_id")
    @Validation(required = true, maxLength = 128)
    public String waybillId;

    // 重量
    @NameInMap("weight")
    @Validation(maxLength = 20)
    public String weight;

    public static ApplyInsurancepolicyZhonghuacaixianRequest build(java.util.Map<String, ?> map) throws Exception {
        ApplyInsurancepolicyZhonghuacaixianRequest self = new ApplyInsurancepolicyZhonghuacaixianRequest();
        return TeaModel.build(map, self);
    }

    public ApplyInsurancepolicyZhonghuacaixianRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ApplyInsurancepolicyZhonghuacaixianRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ApplyInsurancepolicyZhonghuacaixianRequest setBbrAddr(String bbrAddr) {
        this.bbrAddr = bbrAddr;
        return this;
    }
    public String getBbrAddr() {
        return this.bbrAddr;
    }

    public ApplyInsurancepolicyZhonghuacaixianRequest setBbrIdNo(String bbrIdNo) {
        this.bbrIdNo = bbrIdNo;
        return this;
    }
    public String getBbrIdNo() {
        return this.bbrIdNo;
    }

    public ApplyInsurancepolicyZhonghuacaixianRequest setBbrIdType(String bbrIdType) {
        this.bbrIdType = bbrIdType;
        return this;
    }
    public String getBbrIdType() {
        return this.bbrIdType;
    }

    public ApplyInsurancepolicyZhonghuacaixianRequest setBbrName(String bbrName) {
        this.bbrName = bbrName;
        return this;
    }
    public String getBbrName() {
        return this.bbrName;
    }

    public ApplyInsurancepolicyZhonghuacaixianRequest setBbrTel(String bbrTel) {
        this.bbrTel = bbrTel;
        return this;
    }
    public String getBbrTel() {
        return this.bbrTel;
    }

    public ApplyInsurancepolicyZhonghuacaixianRequest setCarriage(String carriage) {
        this.carriage = carriage;
        return this;
    }
    public String getCarriage() {
        return this.carriage;
    }

    public ApplyInsurancepolicyZhonghuacaixianRequest setCarGo(String carGo) {
        this.carGo = carGo;
        return this;
    }
    public String getCarGo() {
        return this.carGo;
    }

    public ApplyInsurancepolicyZhonghuacaixianRequest setCpModel(String cpModel) {
        this.cpModel = cpModel;
        return this;
    }
    public String getCpModel() {
        return this.cpModel;
    }

    public ApplyInsurancepolicyZhonghuacaixianRequest setDestination(String destination) {
        this.destination = destination;
        return this;
    }
    public String getDestination() {
        return this.destination;
    }

    public ApplyInsurancepolicyZhonghuacaixianRequest setDrivPer(String drivPer) {
        this.drivPer = drivPer;
        return this;
    }
    public String getDrivPer() {
        return this.drivPer;
    }

    public ApplyInsurancepolicyZhonghuacaixianRequest setEffDate(String effDate) {
        this.effDate = effDate;
        return this;
    }
    public String getEffDate() {
        return this.effDate;
    }

    public ApplyInsurancepolicyZhonghuacaixianRequest setEngineNo(String engineNo) {
        this.engineNo = engineNo;
        return this;
    }
    public String getEngineNo() {
        return this.engineNo;
    }

    public ApplyInsurancepolicyZhonghuacaixianRequest setFrameNo(String frameNo) {
        this.frameNo = frameNo;
        return this;
    }
    public String getFrameNo() {
        return this.frameNo;
    }

    public ApplyInsurancepolicyZhonghuacaixianRequest setGroupPlatformDid(String groupPlatformDid) {
        this.groupPlatformDid = groupPlatformDid;
        return this;
    }
    public String getGroupPlatformDid() {
        return this.groupPlatformDid;
    }

    public ApplyInsurancepolicyZhonghuacaixianRequest setIdentifyPeriodEnd(String identifyPeriodEnd) {
        this.identifyPeriodEnd = identifyPeriodEnd;
        return this;
    }
    public String getIdentifyPeriodEnd() {
        return this.identifyPeriodEnd;
    }

    public ApplyInsurancepolicyZhonghuacaixianRequest setIdentifyPeriodStart(String identifyPeriodStart) {
        this.identifyPeriodStart = identifyPeriodStart;
        return this;
    }
    public String getIdentifyPeriodStart() {
        return this.identifyPeriodStart;
    }

    public ApplyInsurancepolicyZhonghuacaixianRequest setLicenseNo(String licenseNo) {
        this.licenseNo = licenseNo;
        return this;
    }
    public String getLicenseNo() {
        return this.licenseNo;
    }

    public ApplyInsurancepolicyZhonghuacaixianRequest setPlatformDid(String platformDid) {
        this.platformDid = platformDid;
        return this;
    }
    public String getPlatformDid() {
        return this.platformDid;
    }

    public ApplyInsurancepolicyZhonghuacaixianRequest setRunNo(String runNo) {
        this.runNo = runNo;
        return this;
    }
    public String getRunNo() {
        return this.runNo;
    }

    public ApplyInsurancepolicyZhonghuacaixianRequest setStartPlace(String startPlace) {
        this.startPlace = startPlace;
        return this;
    }
    public String getStartPlace() {
        return this.startPlace;
    }

    public ApplyInsurancepolicyZhonghuacaixianRequest setTbrAddr(String tbrAddr) {
        this.tbrAddr = tbrAddr;
        return this;
    }
    public String getTbrAddr() {
        return this.tbrAddr;
    }

    public ApplyInsurancepolicyZhonghuacaixianRequest setTbrEmail(String tbrEmail) {
        this.tbrEmail = tbrEmail;
        return this;
    }
    public String getTbrEmail() {
        return this.tbrEmail;
    }

    public ApplyInsurancepolicyZhonghuacaixianRequest setTbrIdNo(String tbrIdNo) {
        this.tbrIdNo = tbrIdNo;
        return this;
    }
    public String getTbrIdNo() {
        return this.tbrIdNo;
    }

    public ApplyInsurancepolicyZhonghuacaixianRequest setTbrIdType(String tbrIdType) {
        this.tbrIdType = tbrIdType;
        return this;
    }
    public String getTbrIdType() {
        return this.tbrIdType;
    }

    public ApplyInsurancepolicyZhonghuacaixianRequest setTbrName(String tbrName) {
        this.tbrName = tbrName;
        return this;
    }
    public String getTbrName() {
        return this.tbrName;
    }

    public ApplyInsurancepolicyZhonghuacaixianRequest setTbrTel(String tbrTel) {
        this.tbrTel = tbrTel;
        return this;
    }
    public String getTbrTel() {
        return this.tbrTel;
    }

    public ApplyInsurancepolicyZhonghuacaixianRequest setTermDate(String termDate) {
        this.termDate = termDate;
        return this;
    }
    public String getTermDate() {
        return this.termDate;
    }

    public ApplyInsurancepolicyZhonghuacaixianRequest setTonNage(String tonNage) {
        this.tonNage = tonNage;
        return this;
    }
    public String getTonNage() {
        return this.tonNage;
    }

    public ApplyInsurancepolicyZhonghuacaixianRequest setTradeNo(String tradeNo) {
        this.tradeNo = tradeNo;
        return this;
    }
    public String getTradeNo() {
        return this.tradeNo;
    }

    public ApplyInsurancepolicyZhonghuacaixianRequest setTsCarGo(String tsCarGo) {
        this.tsCarGo = tsCarGo;
        return this;
    }
    public String getTsCarGo() {
        return this.tsCarGo;
    }

    public ApplyInsurancepolicyZhonghuacaixianRequest setWaybillId(String waybillId) {
        this.waybillId = waybillId;
        return this;
    }
    public String getWaybillId() {
        return this.waybillId;
    }

    public ApplyInsurancepolicyZhonghuacaixianRequest setWeight(String weight) {
        this.weight = weight;
        return this;
    }
    public String getWeight() {
        return this.weight;
    }

}
