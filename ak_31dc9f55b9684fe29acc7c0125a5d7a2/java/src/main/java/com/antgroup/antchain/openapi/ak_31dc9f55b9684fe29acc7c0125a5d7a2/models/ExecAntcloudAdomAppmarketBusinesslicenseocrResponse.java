// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_31dc9f55b9684fe29acc7c0125a5d7a2.models;

import com.aliyun.tea.*;

public class ExecAntcloudAdomAppmarketBusinesslicenseocrResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 地址
    @NameInMap("address")
    public String address;

    // 经营范围
    @NameInMap("business")
    public String business;

    // 注册资本
    @NameInMap("captial")
    public String captial;

    // 企业成立日期
    @NameInMap("establish_date")
    public String establishDate;

    // 名称，控股股东名称
    @NameInMap("name")
    public String name;

    // 法定代表人
    @NameInMap("person")
    public String person;

    // 统一社会信用代码，控股股东证件号码
    @NameInMap("reg_num")
    public String regNum;

    // 印章
    @NameInMap("stamp")
    public String stamp;

    // 类型，如：有限责任公司(自然人独资)
    @NameInMap("type")
    public String type;

    // 营业期限，营业执照有效期，控股股东证件有效期
    @NameInMap("valid_period")
    public String validPeriod;

    // 标题，如"营业执照"
    @NameInMap("title")
    public String title;

    // 颁发日期
    @NameInMap("date")
    public String date;

    // 编号
    @NameInMap("num")
    public String num;

    // 投资人
    @NameInMap("investors")
    public String investors;

    // 组成形式
    @NameInMap("formation")
    public String formation;

    // 注册日期
    @NameInMap("date_of_registration")
    public String dateOfRegistration;

    // 经营者
    @NameInMap("operators")
    public String operators;

    public static ExecAntcloudAdomAppmarketBusinesslicenseocrResponse build(java.util.Map<String, ?> map) throws Exception {
        ExecAntcloudAdomAppmarketBusinesslicenseocrResponse self = new ExecAntcloudAdomAppmarketBusinesslicenseocrResponse();
        return TeaModel.build(map, self);
    }

    public ExecAntcloudAdomAppmarketBusinesslicenseocrResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ExecAntcloudAdomAppmarketBusinesslicenseocrResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ExecAntcloudAdomAppmarketBusinesslicenseocrResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ExecAntcloudAdomAppmarketBusinesslicenseocrResponse setAddress(String address) {
        this.address = address;
        return this;
    }
    public String getAddress() {
        return this.address;
    }

    public ExecAntcloudAdomAppmarketBusinesslicenseocrResponse setBusiness(String business) {
        this.business = business;
        return this;
    }
    public String getBusiness() {
        return this.business;
    }

    public ExecAntcloudAdomAppmarketBusinesslicenseocrResponse setCaptial(String captial) {
        this.captial = captial;
        return this;
    }
    public String getCaptial() {
        return this.captial;
    }

    public ExecAntcloudAdomAppmarketBusinesslicenseocrResponse setEstablishDate(String establishDate) {
        this.establishDate = establishDate;
        return this;
    }
    public String getEstablishDate() {
        return this.establishDate;
    }

    public ExecAntcloudAdomAppmarketBusinesslicenseocrResponse setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ExecAntcloudAdomAppmarketBusinesslicenseocrResponse setPerson(String person) {
        this.person = person;
        return this;
    }
    public String getPerson() {
        return this.person;
    }

    public ExecAntcloudAdomAppmarketBusinesslicenseocrResponse setRegNum(String regNum) {
        this.regNum = regNum;
        return this;
    }
    public String getRegNum() {
        return this.regNum;
    }

    public ExecAntcloudAdomAppmarketBusinesslicenseocrResponse setStamp(String stamp) {
        this.stamp = stamp;
        return this;
    }
    public String getStamp() {
        return this.stamp;
    }

    public ExecAntcloudAdomAppmarketBusinesslicenseocrResponse setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public ExecAntcloudAdomAppmarketBusinesslicenseocrResponse setValidPeriod(String validPeriod) {
        this.validPeriod = validPeriod;
        return this;
    }
    public String getValidPeriod() {
        return this.validPeriod;
    }

    public ExecAntcloudAdomAppmarketBusinesslicenseocrResponse setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

    public ExecAntcloudAdomAppmarketBusinesslicenseocrResponse setDate(String date) {
        this.date = date;
        return this;
    }
    public String getDate() {
        return this.date;
    }

    public ExecAntcloudAdomAppmarketBusinesslicenseocrResponse setNum(String num) {
        this.num = num;
        return this;
    }
    public String getNum() {
        return this.num;
    }

    public ExecAntcloudAdomAppmarketBusinesslicenseocrResponse setInvestors(String investors) {
        this.investors = investors;
        return this;
    }
    public String getInvestors() {
        return this.investors;
    }

    public ExecAntcloudAdomAppmarketBusinesslicenseocrResponse setFormation(String formation) {
        this.formation = formation;
        return this;
    }
    public String getFormation() {
        return this.formation;
    }

    public ExecAntcloudAdomAppmarketBusinesslicenseocrResponse setDateOfRegistration(String dateOfRegistration) {
        this.dateOfRegistration = dateOfRegistration;
        return this;
    }
    public String getDateOfRegistration() {
        return this.dateOfRegistration;
    }

    public ExecAntcloudAdomAppmarketBusinesslicenseocrResponse setOperators(String operators) {
        this.operators = operators;
        return this;
    }
    public String getOperators() {
        return this.operators;
    }

}
