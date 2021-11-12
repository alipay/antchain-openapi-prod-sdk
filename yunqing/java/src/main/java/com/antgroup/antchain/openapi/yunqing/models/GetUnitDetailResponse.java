// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.yunqing.models;

import com.aliyun.tea.*;

public class GetUnitDetailResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 单元内资源列表
    @NameInMap("resources")
    public java.util.List<UnitResource> resources;

    // 单元状态
    @NameInMap("status")
    public String status;

    public static GetUnitDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        GetUnitDetailResponse self = new GetUnitDetailResponse();
        return TeaModel.build(map, self);
    }

    public GetUnitDetailResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public GetUnitDetailResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetUnitDetailResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public GetUnitDetailResponse setResources(java.util.List<UnitResource> resources) {
        this.resources = resources;
        return this;
    }
    public java.util.List<UnitResource> getResources() {
        return this.resources;
    }

    public GetUnitDetailResponse setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
