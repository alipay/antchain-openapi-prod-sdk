// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasplus.models;

import com.aliyun.tea.*;

public class QueryIdcocrIdcardResponse extends TeaModel {
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

    // 出生年月日
    @NameInMap("birth")
    public String birth;

    // 信息抽取失败后详细错误原因
    @NameInMap("error_content")
    public String errorContent;

    // 身份证号码
    @NameInMap("num")
    public String num;

    // 性别：男/女
    @NameInMap("sex")
    public String sex;

    // 解析成功
    @NameInMap("success")
    public Boolean success;

    // 有效期截止时间
    @NameInMap("end_date")
    public String endDate;

    // 公安局分案
    @NameInMap("issue")
    public String issue;

    // 有效期开始时间
    @NameInMap("start_date")
    public String startDate;

    // 民族
    @NameInMap("nationality")
    public String nationality;

    public static QueryIdcocrIdcardResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryIdcocrIdcardResponse self = new QueryIdcocrIdcardResponse();
        return TeaModel.build(map, self);
    }

    public QueryIdcocrIdcardResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryIdcocrIdcardResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryIdcocrIdcardResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryIdcocrIdcardResponse setAddress(String address) {
        this.address = address;
        return this;
    }
    public String getAddress() {
        return this.address;
    }

    public QueryIdcocrIdcardResponse setBirth(String birth) {
        this.birth = birth;
        return this;
    }
    public String getBirth() {
        return this.birth;
    }

    public QueryIdcocrIdcardResponse setErrorContent(String errorContent) {
        this.errorContent = errorContent;
        return this;
    }
    public String getErrorContent() {
        return this.errorContent;
    }

    public QueryIdcocrIdcardResponse setNum(String num) {
        this.num = num;
        return this;
    }
    public String getNum() {
        return this.num;
    }

    public QueryIdcocrIdcardResponse setSex(String sex) {
        this.sex = sex;
        return this;
    }
    public String getSex() {
        return this.sex;
    }

    public QueryIdcocrIdcardResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryIdcocrIdcardResponse setEndDate(String endDate) {
        this.endDate = endDate;
        return this;
    }
    public String getEndDate() {
        return this.endDate;
    }

    public QueryIdcocrIdcardResponse setIssue(String issue) {
        this.issue = issue;
        return this;
    }
    public String getIssue() {
        return this.issue;
    }

    public QueryIdcocrIdcardResponse setStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }
    public String getStartDate() {
        return this.startDate;
    }

    public QueryIdcocrIdcardResponse setNationality(String nationality) {
        this.nationality = nationality;
        return this;
    }
    public String getNationality() {
        return this.nationality;
    }

}
