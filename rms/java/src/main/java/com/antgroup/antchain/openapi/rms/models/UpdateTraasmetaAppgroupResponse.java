// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class UpdateTraasmetaAppgroupResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // app_group
    @NameInMap("app_group")
    public TraasAppGroupDto appGroup;

    public static UpdateTraasmetaAppgroupResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateTraasmetaAppgroupResponse self = new UpdateTraasmetaAppgroupResponse();
        return TeaModel.build(map, self);
    }

    public UpdateTraasmetaAppgroupResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public UpdateTraasmetaAppgroupResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public UpdateTraasmetaAppgroupResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public UpdateTraasmetaAppgroupResponse setAppGroup(TraasAppGroupDto appGroup) {
        this.appGroup = appGroup;
        return this;
    }
    public TraasAppGroupDto getAppGroup() {
        return this.appGroup;
    }

}
