// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasplus.models;

import com.aliyun.tea.*;

public class UpdateBaicorpInternalsearchlibraryResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // NounceId
    @NameInMap("custom_id")
    public String customId;

    // 更新是否成功
    @NameInMap("update_result")
    public String updateResult;

    // 更新描述、更新失败原因
    @NameInMap("update_desc")
    public String updateDesc;

    public static UpdateBaicorpInternalsearchlibraryResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateBaicorpInternalsearchlibraryResponse self = new UpdateBaicorpInternalsearchlibraryResponse();
        return TeaModel.build(map, self);
    }

    public UpdateBaicorpInternalsearchlibraryResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public UpdateBaicorpInternalsearchlibraryResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public UpdateBaicorpInternalsearchlibraryResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public UpdateBaicorpInternalsearchlibraryResponse setCustomId(String customId) {
        this.customId = customId;
        return this;
    }
    public String getCustomId() {
        return this.customId;
    }

    public UpdateBaicorpInternalsearchlibraryResponse setUpdateResult(String updateResult) {
        this.updateResult = updateResult;
        return this;
    }
    public String getUpdateResult() {
        return this.updateResult;
    }

    public UpdateBaicorpInternalsearchlibraryResponse setUpdateDesc(String updateDesc) {
        this.updateDesc = updateDesc;
        return this;
    }
    public String getUpdateDesc() {
        return this.updateDesc;
    }

}
