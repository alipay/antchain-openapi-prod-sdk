// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.partner.models;

import com.aliyun.tea.*;

public class QueryAreaProvinceResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 省份信息列表
    @NameInMap("provinces")
    public java.util.List<Province> provinces;

    public static QueryAreaProvinceResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryAreaProvinceResponse self = new QueryAreaProvinceResponse();
        return TeaModel.build(map, self);
    }

    public QueryAreaProvinceResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryAreaProvinceResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryAreaProvinceResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryAreaProvinceResponse setProvinces(java.util.List<Province> provinces) {
        this.provinces = provinces;
        return this;
    }
    public java.util.List<Province> getProvinces() {
        return this.provinces;
    }

}
