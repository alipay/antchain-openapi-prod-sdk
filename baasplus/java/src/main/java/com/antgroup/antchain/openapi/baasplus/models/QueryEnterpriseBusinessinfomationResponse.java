// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasplus.models;

import com.aliyun.tea.*;

public class QueryEnterpriseBusinessinfomationResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 业务结果码  0:企业经营正常   1:企业异常经营  2:企业查询失败
    @NameInMap("code")
    public String code;

    // 业务结果说明
    @NameInMap("msg")
    public String msg;

    // 企业经营信息详情
    @NameInMap("data")
    public String data;

    public static QueryEnterpriseBusinessinfomationResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryEnterpriseBusinessinfomationResponse self = new QueryEnterpriseBusinessinfomationResponse();
        return TeaModel.build(map, self);
    }

    public QueryEnterpriseBusinessinfomationResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryEnterpriseBusinessinfomationResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryEnterpriseBusinessinfomationResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryEnterpriseBusinessinfomationResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryEnterpriseBusinessinfomationResponse setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

    public QueryEnterpriseBusinessinfomationResponse setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

}
