// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.stlr.models;

import com.aliyun.tea.*;

public class PushProductDataResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 是否填报成功
    @NameInMap("success")
    public Boolean success;

    // 异常明细列表，全部成功时返回为空
    @NameInMap("abnormal_item_list")
    public java.util.List<GclAbnormalItem> abnormalItemList;

    // 成功写入明细数
    @NameInMap("success_count")
    public Long successCount;

    public static PushProductDataResponse build(java.util.Map<String, ?> map) throws Exception {
        PushProductDataResponse self = new PushProductDataResponse();
        return TeaModel.build(map, self);
    }

    public PushProductDataResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public PushProductDataResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public PushProductDataResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public PushProductDataResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public PushProductDataResponse setAbnormalItemList(java.util.List<GclAbnormalItem> abnormalItemList) {
        this.abnormalItemList = abnormalItemList;
        return this;
    }
    public java.util.List<GclAbnormalItem> getAbnormalItemList() {
        return this.abnormalItemList;
    }

    public PushProductDataResponse setSuccessCount(Long successCount) {
        this.successCount = successCount;
        return this;
    }
    public Long getSuccessCount() {
        return this.successCount;
    }

}
