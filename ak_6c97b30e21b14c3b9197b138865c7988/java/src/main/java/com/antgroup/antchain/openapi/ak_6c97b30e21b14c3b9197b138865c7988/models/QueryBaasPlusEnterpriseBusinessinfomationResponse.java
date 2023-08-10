// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_6c97b30e21b14c3b9197b138865c7988.models;

import com.aliyun.tea.*;

public class QueryBaasPlusEnterpriseBusinessinfomationResponse extends TeaModel {
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

    public static QueryBaasPlusEnterpriseBusinessinfomationResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryBaasPlusEnterpriseBusinessinfomationResponse self = new QueryBaasPlusEnterpriseBusinessinfomationResponse();
        return TeaModel.build(map, self);
    }

    public QueryBaasPlusEnterpriseBusinessinfomationResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryBaasPlusEnterpriseBusinessinfomationResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryBaasPlusEnterpriseBusinessinfomationResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryBaasPlusEnterpriseBusinessinfomationResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryBaasPlusEnterpriseBusinessinfomationResponse setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

    public QueryBaasPlusEnterpriseBusinessinfomationResponse setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

}
