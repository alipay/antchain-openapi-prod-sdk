// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class ListApplevelResponse extends TeaModel {
    @NameInMap("req_msg_id")
    public String reqMsgId;

    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // 应用等级列表
    @NameInMap("data")
    public java.util.List<AppLevelView> data;

    // 总数
    @NameInMap("total_count")
    public Long totalCount;

    public static ListApplevelResponse build(java.util.Map<String, ?> map) throws Exception {
        ListApplevelResponse self = new ListApplevelResponse();
        return TeaModel.build(map, self);
    }

    public ListApplevelResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ListApplevelResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ListApplevelResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ListApplevelResponse setData(java.util.List<AppLevelView> data) {
        this.data = data;
        return this;
    }
    public java.util.List<AppLevelView> getData() {
        return this.data;
    }

    public ListApplevelResponse setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

}
