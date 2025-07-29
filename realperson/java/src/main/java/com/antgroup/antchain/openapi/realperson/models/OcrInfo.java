// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.realperson.models;

import com.aliyun.tea.*;

public class OcrInfo extends TeaModel {
    // 当识别到身份证是人像面时返回FACE，国徽面时返回BACK
    /**
     * <strong>example:</strong>
     * <p>FACE</p>
     */
    @NameInMap("side")
    public String side;

    // 当请求参数 return_photo = true时返回，头像切图的 base64 编码（无编码头，需自行处理）
    // *当服务降级时，返回null
    /**
     * <strong>example:</strong>
     * <p>BASE64String</p>
     */
    @NameInMap("photo")
    public String photo;

    // {}	当请求参数 return_photo = true时返回，头像的位置信息（坐标0点为左上角）
    // *当服务降级时，返回null
    /**
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("photo_location")
    public OcrLocation photoLocation;

    // 当请求参数 return_card = true时返回，身份证裁剪切图的 base64 编码（无编码头，需自行处理）
    // *当服务降级时，返回null
    /**
     * <strong>example:</strong>
     * <p>BASE64String</p>
     */
    @NameInMap("card_image")
    public String cardImage;

    // 当请求参数 return_card = true时返回，身份证裁剪切图的位置信息（坐标0点为左上角）
    // *当服务降级时，返回null
    /**
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("card_location")
    public OcrLocation cardLocation;

    // 姓名
    /**
     * <strong>example:</strong>
     * <p>张三</p>
     */
    @NameInMap("name")
    public String name;

    // 性别
    /**
     * <strong>example:</strong>
     * <p>女</p>
     */
    @NameInMap("sex")
    public String sex;

    // 民族
    /**
     * <strong>example:</strong>
     * <p>汉</p>
     */
    @NameInMap("nationality")
    public String nationality;

    // 出生日期（yyyyMMdd格式）
    /**
     * <strong>example:</strong>
     * <p>19620710</p>
     */
    @NameInMap("birth")
    public String birth;

    // 住址
    /**
     * <strong>example:</strong>
     * <p>江苏省睢宁县xxxx</p>
     */
    @NameInMap("address")
    public String address;

    // 身份证号
    /**
     * <strong>example:</strong>
     * <p>320324196207101234</p>
     */
    @NameInMap("num")
    public String num;

    // 发证日期（yyyyMMdd格式）
    /**
     * <strong>example:</strong>
     * <p>20120912</p>
     */
    @NameInMap("start_date")
    public String startDate;

    // 到期日（yyyyMMdd格式）。
    // 如果是长期身份证，该字段内容为“长期”（不含引号）。
    /**
     * <strong>example:</strong>
     * <p>20220912</p>
     */
    @NameInMap("end_date")
    public String endDate;

    // 签发机关
    /**
     * <strong>example:</strong>
     * <p>宜川县公安局</p>
     */
    @NameInMap("issue")
    public String issue;

    // 银行卡类型（CC（贷记卡），SCC（准贷记卡），DCC（存贷合一卡），DC（储蓄卡），PC（预付卡））
    /**
     * <strong>example:</strong>
     * <p>CC</p>
     */
    @NameInMap("bank_card_type")
    public String bankCardType;

    // 银行名，不能识别时为空
    /**
     * <strong>example:</strong>
     * <p>中国建设银行</p>
     */
    @NameInMap("bank_name")
    public String bankName;

    // 银行卡号
    /**
     * <strong>example:</strong>
     * <p>6227001223456784765</p>
     */
    @NameInMap("card_number")
    public String cardNumber;

    // 有效期至
    /**
     * <strong>example:</strong>
     * <p>10/30</p>
     */
    @NameInMap("valid_to_date")
    public String validToDate;

    // 证件类别
    /**
     * <strong>example:</strong>
     * <p>港澳居民来往内地通行证</p>
     */
    @NameInMap("title")
    public String title;

    // 有效期限(yyyy.MM.dd-yyyy.MM.dd格式)
    /**
     * <strong>example:</strong>
     * <p>2017.07.13-2027.07.12</p>
     */
    @NameInMap("date_of_expiry")
    public String dateOfExpiry;

    // 换证次数
    /**
     * <strong>example:</strong>
     * <p>01</p>
     */
    @NameInMap("change_num")
    public String changeNum;

    // 初次领证日期
    /**
     * <strong>example:</strong>
     * <p>20200202</p>
     */
    @NameInMap("first_issue")
    public String firstIssue;

    // 准驾车型
    /**
     * <strong>example:</strong>
     * <p>C1</p>
     */
    @NameInMap("driver_class")
    public String driverClass;

    // 档案编号
    /**
     * <strong>example:</strong>
     * <p>110012345678</p>
     */
    @NameInMap("doc_num")
    public String docNum;

    // 电子驾驶证生成时间
    /**
     * <strong>example:</strong>
     * <p>2021年08月06日</p>
     */
    @NameInMap("issue_time")
    public String issueTime;

    // 当前时间
    /**
     * <strong>example:</strong>
     * <p>2021年04月16日14:09:39</p>
     */
    @NameInMap("current_time")
    public String currentTime;

    // 条形码编号
    /**
     * <strong>example:</strong>
     * <p><em>4360028416316</em></p>
     */
    @NameInMap("bar_code")
    public String barCode;

    // 累计记分
    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("points")
    public String points;

    // 记录
    /**
     * <strong>example:</strong>
     * <p>请于每个记分周期结束后三十日接受审验。无记分的，免予本次审验。</p>
     */
    @NameInMap("remark")
    public String remark;

    // 状态
    /**
     * <strong>example:</strong>
     * <p>正常</p>
     */
    @NameInMap("status")
    public String status;

    // 车辆识别代号
    /**
     * <strong>example:</strong>
     * <p>SSVUDDTT2J2022558</p>
     */
    @NameInMap("vehicle")
    public String vehicle;

    // 品牌型号
    /**
     * <strong>example:</strong>
     * <p>大众汽车牌SVW6474DFD</p>
     */
    @NameInMap("model")
    public String model;

    // 车辆类型
    /**
     * <strong>example:</strong>
     * <p>小型普通客车</p>
     */
    @NameInMap("type")
    public String type;

    // 使用性质
    /**
     * <strong>example:</strong>
     * <p>非运营</p>
     */
    @NameInMap("useage")
    public String useage;

    // 发动机号码
    /**
     * <strong>example:</strong>
     * <p>111533</p>
     */
    @NameInMap("eng_num")
    public String engNum;

    // 车牌号码
    /**
     * <strong>example:</strong>
     * <p>浙BF12345</p>
     */
    @NameInMap("plate")
    public String plate;

    // 检验记录
    /**
     * <strong>example:</strong>
     * <p>2018年11月渝A()</p>
     */
    @NameInMap("inspec_record")
    public String inspecRecord;

    // 核定载质量
    /**
     * <strong>example:</strong>
     * <p>1490kg</p>
     */
    @NameInMap("load")
    public String load;

    // 整备质量
    /**
     * <strong>example:</strong>
     * <p>2600kg</p>
     */
    @NameInMap("curb_mass")
    public String curbMass;

    // 外廓尺寸
    /**
     * <strong>example:</strong>
     * <p>5990X2500X4400mm</p>
     */
    @NameInMap("overall_dimension")
    public String overallDimension;

    // 核定载人数
    /**
     * <strong>example:</strong>
     * <p>5人</p>
     */
    @NameInMap("seating")
    public String seating;

    // 总质量
    /**
     * <strong>example:</strong>
     * <p>4290kg</p>
     */
    @NameInMap("gross_mass")
    public String grossMass;

    // 燃油类型
    /**
     * <strong>example:</strong>
     * <p>柴油</p>
     */
    @NameInMap("fuel")
    public String fuel;

    // 准牵引总质量
    /**
     * <strong>example:</strong>
     * <p>2700kg</p>
     */
    @NameInMap("traction_mass")
    public String tractionMass;

    // 证芯编号
    /**
     * <strong>example:</strong>
     * <p>50027372380230106</p>
     */
    @NameInMap("chip_num")
    public String chipNum;

    public static OcrInfo build(java.util.Map<String, ?> map) throws Exception {
        OcrInfo self = new OcrInfo();
        return TeaModel.build(map, self);
    }

    public OcrInfo setSide(String side) {
        this.side = side;
        return this;
    }
    public String getSide() {
        return this.side;
    }

    public OcrInfo setPhoto(String photo) {
        this.photo = photo;
        return this;
    }
    public String getPhoto() {
        return this.photo;
    }

    public OcrInfo setPhotoLocation(OcrLocation photoLocation) {
        this.photoLocation = photoLocation;
        return this;
    }
    public OcrLocation getPhotoLocation() {
        return this.photoLocation;
    }

    public OcrInfo setCardImage(String cardImage) {
        this.cardImage = cardImage;
        return this;
    }
    public String getCardImage() {
        return this.cardImage;
    }

    public OcrInfo setCardLocation(OcrLocation cardLocation) {
        this.cardLocation = cardLocation;
        return this;
    }
    public OcrLocation getCardLocation() {
        return this.cardLocation;
    }

    public OcrInfo setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public OcrInfo setSex(String sex) {
        this.sex = sex;
        return this;
    }
    public String getSex() {
        return this.sex;
    }

    public OcrInfo setNationality(String nationality) {
        this.nationality = nationality;
        return this;
    }
    public String getNationality() {
        return this.nationality;
    }

    public OcrInfo setBirth(String birth) {
        this.birth = birth;
        return this;
    }
    public String getBirth() {
        return this.birth;
    }

    public OcrInfo setAddress(String address) {
        this.address = address;
        return this;
    }
    public String getAddress() {
        return this.address;
    }

    public OcrInfo setNum(String num) {
        this.num = num;
        return this;
    }
    public String getNum() {
        return this.num;
    }

    public OcrInfo setStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }
    public String getStartDate() {
        return this.startDate;
    }

    public OcrInfo setEndDate(String endDate) {
        this.endDate = endDate;
        return this;
    }
    public String getEndDate() {
        return this.endDate;
    }

    public OcrInfo setIssue(String issue) {
        this.issue = issue;
        return this;
    }
    public String getIssue() {
        return this.issue;
    }

    public OcrInfo setBankCardType(String bankCardType) {
        this.bankCardType = bankCardType;
        return this;
    }
    public String getBankCardType() {
        return this.bankCardType;
    }

    public OcrInfo setBankName(String bankName) {
        this.bankName = bankName;
        return this;
    }
    public String getBankName() {
        return this.bankName;
    }

    public OcrInfo setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
        return this;
    }
    public String getCardNumber() {
        return this.cardNumber;
    }

    public OcrInfo setValidToDate(String validToDate) {
        this.validToDate = validToDate;
        return this;
    }
    public String getValidToDate() {
        return this.validToDate;
    }

    public OcrInfo setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

    public OcrInfo setDateOfExpiry(String dateOfExpiry) {
        this.dateOfExpiry = dateOfExpiry;
        return this;
    }
    public String getDateOfExpiry() {
        return this.dateOfExpiry;
    }

    public OcrInfo setChangeNum(String changeNum) {
        this.changeNum = changeNum;
        return this;
    }
    public String getChangeNum() {
        return this.changeNum;
    }

    public OcrInfo setFirstIssue(String firstIssue) {
        this.firstIssue = firstIssue;
        return this;
    }
    public String getFirstIssue() {
        return this.firstIssue;
    }

    public OcrInfo setDriverClass(String driverClass) {
        this.driverClass = driverClass;
        return this;
    }
    public String getDriverClass() {
        return this.driverClass;
    }

    public OcrInfo setDocNum(String docNum) {
        this.docNum = docNum;
        return this;
    }
    public String getDocNum() {
        return this.docNum;
    }

    public OcrInfo setIssueTime(String issueTime) {
        this.issueTime = issueTime;
        return this;
    }
    public String getIssueTime() {
        return this.issueTime;
    }

    public OcrInfo setCurrentTime(String currentTime) {
        this.currentTime = currentTime;
        return this;
    }
    public String getCurrentTime() {
        return this.currentTime;
    }

    public OcrInfo setBarCode(String barCode) {
        this.barCode = barCode;
        return this;
    }
    public String getBarCode() {
        return this.barCode;
    }

    public OcrInfo setPoints(String points) {
        this.points = points;
        return this;
    }
    public String getPoints() {
        return this.points;
    }

    public OcrInfo setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

    public OcrInfo setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public OcrInfo setVehicle(String vehicle) {
        this.vehicle = vehicle;
        return this;
    }
    public String getVehicle() {
        return this.vehicle;
    }

    public OcrInfo setModel(String model) {
        this.model = model;
        return this;
    }
    public String getModel() {
        return this.model;
    }

    public OcrInfo setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public OcrInfo setUseage(String useage) {
        this.useage = useage;
        return this;
    }
    public String getUseage() {
        return this.useage;
    }

    public OcrInfo setEngNum(String engNum) {
        this.engNum = engNum;
        return this;
    }
    public String getEngNum() {
        return this.engNum;
    }

    public OcrInfo setPlate(String plate) {
        this.plate = plate;
        return this;
    }
    public String getPlate() {
        return this.plate;
    }

    public OcrInfo setInspecRecord(String inspecRecord) {
        this.inspecRecord = inspecRecord;
        return this;
    }
    public String getInspecRecord() {
        return this.inspecRecord;
    }

    public OcrInfo setLoad(String load) {
        this.load = load;
        return this;
    }
    public String getLoad() {
        return this.load;
    }

    public OcrInfo setCurbMass(String curbMass) {
        this.curbMass = curbMass;
        return this;
    }
    public String getCurbMass() {
        return this.curbMass;
    }

    public OcrInfo setOverallDimension(String overallDimension) {
        this.overallDimension = overallDimension;
        return this;
    }
    public String getOverallDimension() {
        return this.overallDimension;
    }

    public OcrInfo setSeating(String seating) {
        this.seating = seating;
        return this;
    }
    public String getSeating() {
        return this.seating;
    }

    public OcrInfo setGrossMass(String grossMass) {
        this.grossMass = grossMass;
        return this;
    }
    public String getGrossMass() {
        return this.grossMass;
    }

    public OcrInfo setFuel(String fuel) {
        this.fuel = fuel;
        return this;
    }
    public String getFuel() {
        return this.fuel;
    }

    public OcrInfo setTractionMass(String tractionMass) {
        this.tractionMass = tractionMass;
        return this;
    }
    public String getTractionMass() {
        return this.tractionMass;
    }

    public OcrInfo setChipNum(String chipNum) {
        this.chipNum = chipNum;
        return this;
    }
    public String getChipNum() {
        return this.chipNum;
    }

}
