// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class GetConfigSitetreeResponse extends TeaModel {
    @NameInMap("req_msg_id")
    public String reqMsgId;

    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // 当前租户下的所有 region 列表
    @NameInMap("data")
    public java.util.List<RegionView> data;

    public static GetConfigSitetreeResponse build(java.util.Map<String, ?> map) throws Exception {
        GetConfigSitetreeResponse self = new GetConfigSitetreeResponse();
        return TeaModel.build(map, self);
    }

    public GetConfigSitetreeResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public GetConfigSitetreeResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetConfigSitetreeResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public GetConfigSitetreeResponse setData(java.util.List<RegionView> data) {
        this.data = data;
        return this;
    }
    public java.util.List<RegionView> getData() {
        return this.data;
    }

}
