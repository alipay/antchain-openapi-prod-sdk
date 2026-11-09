// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.sds.models;

import com.aliyun.tea.*;

public class BatchqueryScenedataTaskresultResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 0-未开始
    // 1-可继续
    // 2-结束
    @NameInMap("sync_status")
    public String syncStatus;

    // 本次的最后一个游标，保存起来下一次使用
    @NameInMap("last_cursor")
    public String lastCursor;

    // 结果列表
    @NameInMap("result_list")
    public java.util.List<BatchResult> resultList;

    public static BatchqueryScenedataTaskresultResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchqueryScenedataTaskresultResponse self = new BatchqueryScenedataTaskresultResponse();
        return TeaModel.build(map, self);
    }

    public BatchqueryScenedataTaskresultResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public BatchqueryScenedataTaskresultResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public BatchqueryScenedataTaskresultResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public BatchqueryScenedataTaskresultResponse setSyncStatus(String syncStatus) {
        this.syncStatus = syncStatus;
        return this;
    }
    public String getSyncStatus() {
        return this.syncStatus;
    }

    public BatchqueryScenedataTaskresultResponse setLastCursor(String lastCursor) {
        this.lastCursor = lastCursor;
        return this;
    }
    public String getLastCursor() {
        return this.lastCursor;
    }

    public BatchqueryScenedataTaskresultResponse setResultList(java.util.List<BatchResult> resultList) {
        this.resultList = resultList;
        return this;
    }
    public java.util.List<BatchResult> getResultList() {
        return this.resultList;
    }

}
