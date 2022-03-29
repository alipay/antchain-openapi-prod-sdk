// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class AllTraasmetaAppgroupResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // appgroupsdto
    @NameInMap("app_groups")
    public java.util.List<TraasAppGroupDto> appGroups;

    public static AllTraasmetaAppgroupResponse build(java.util.Map<String, ?> map) throws Exception {
        AllTraasmetaAppgroupResponse self = new AllTraasmetaAppgroupResponse();
        return TeaModel.build(map, self);
    }

    public AllTraasmetaAppgroupResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public AllTraasmetaAppgroupResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public AllTraasmetaAppgroupResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public AllTraasmetaAppgroupResponse setAppGroups(java.util.List<TraasAppGroupDto> appGroups) {
        this.appGroups = appGroups;
        return this;
    }
    public java.util.List<TraasAppGroupDto> getAppGroups() {
        return this.appGroups;
    }

}
