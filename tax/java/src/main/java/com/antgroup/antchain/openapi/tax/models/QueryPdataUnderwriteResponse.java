// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.tax.models;

import com.aliyun.tea.*;

public class QueryPdataUnderwriteResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 姓名（md5）
    @NameInMap("name")
    public String name;

    // 身份证(md5)
    @NameInMap("card_no")
    public String cardNo;

    // 成功的请求省份行政区划代码
    @NameInMap("success_recommand_province_list")
    public java.util.List<String> successRecommandProvinceList;

    // 失败的请求省份行政区划代码
    @NameInMap("fail_recommand_province_list")
    public java.util.List<String> failRecommandProvinceList;

    // 加密后的出参数据
    @NameInMap("encrypt_data")
    public String encryptData;

    public static QueryPdataUnderwriteResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryPdataUnderwriteResponse self = new QueryPdataUnderwriteResponse();
        return TeaModel.build(map, self);
    }

    public QueryPdataUnderwriteResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryPdataUnderwriteResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryPdataUnderwriteResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryPdataUnderwriteResponse setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public QueryPdataUnderwriteResponse setCardNo(String cardNo) {
        this.cardNo = cardNo;
        return this;
    }
    public String getCardNo() {
        return this.cardNo;
    }

    public QueryPdataUnderwriteResponse setSuccessRecommandProvinceList(java.util.List<String> successRecommandProvinceList) {
        this.successRecommandProvinceList = successRecommandProvinceList;
        return this;
    }
    public java.util.List<String> getSuccessRecommandProvinceList() {
        return this.successRecommandProvinceList;
    }

    public QueryPdataUnderwriteResponse setFailRecommandProvinceList(java.util.List<String> failRecommandProvinceList) {
        this.failRecommandProvinceList = failRecommandProvinceList;
        return this;
    }
    public java.util.List<String> getFailRecommandProvinceList() {
        return this.failRecommandProvinceList;
    }

    public QueryPdataUnderwriteResponse setEncryptData(String encryptData) {
        this.encryptData = encryptData;
        return this;
    }
    public String getEncryptData() {
        return this.encryptData;
    }

}
