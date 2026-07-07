// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.stlr.models;

import com.aliyun.tea.*;

public class QueryProductDataResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 是否检查通过
    @NameInMap("success")
    public Boolean success;

    // 异常明细列表
    @NameInMap("abnormal_item_list")
    public java.util.List<GclAbnormalItem> abnormalItemList;

    public static QueryProductDataResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryProductDataResponse self = new QueryProductDataResponse();
        return TeaModel.build(map, self);
    }

    public QueryProductDataResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryProductDataResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryProductDataResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryProductDataResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryProductDataResponse setAbnormalItemList(java.util.List<GclAbnormalItem> abnormalItemList) {
        this.abnormalItemList = abnormalItemList;
        return this;
    }
    public java.util.List<GclAbnormalItem> getAbnormalItemList() {
        return this.abnormalItemList;
    }

}
