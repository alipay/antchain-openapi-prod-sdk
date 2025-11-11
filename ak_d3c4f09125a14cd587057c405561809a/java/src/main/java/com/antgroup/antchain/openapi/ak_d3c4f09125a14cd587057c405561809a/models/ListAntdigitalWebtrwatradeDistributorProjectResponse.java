// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_d3c4f09125a14cd587057c405561809a.models;

import com.aliyun.tea.*;

public class ListAntdigitalWebtrwatradeDistributorProjectResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 项目基础信息
    @NameInMap("data")
    public java.util.List<ProjectBaseInfoVo> data;

    public static ListAntdigitalWebtrwatradeDistributorProjectResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAntdigitalWebtrwatradeDistributorProjectResponse self = new ListAntdigitalWebtrwatradeDistributorProjectResponse();
        return TeaModel.build(map, self);
    }

    public ListAntdigitalWebtrwatradeDistributorProjectResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ListAntdigitalWebtrwatradeDistributorProjectResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ListAntdigitalWebtrwatradeDistributorProjectResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ListAntdigitalWebtrwatradeDistributorProjectResponse setData(java.util.List<ProjectBaseInfoVo> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ProjectBaseInfoVo> getData() {
        return this.data;
    }

}
