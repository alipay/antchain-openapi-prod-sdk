// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ms.models;

import com.aliyun.tea.*;

public class QueryMeshSidecarResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 总结果数
    @NameInMap("total_cnt")
    public Long totalCnt;

    // SideCar实例列表
    @NameInMap("items")
    public java.util.List<SideCarDetailModel> items;

    public static QueryMeshSidecarResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryMeshSidecarResponse self = new QueryMeshSidecarResponse();
        return TeaModel.build(map, self);
    }

    public QueryMeshSidecarResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryMeshSidecarResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryMeshSidecarResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryMeshSidecarResponse setTotalCnt(Long totalCnt) {
        this.totalCnt = totalCnt;
        return this;
    }
    public Long getTotalCnt() {
        return this.totalCnt;
    }

    public QueryMeshSidecarResponse setItems(java.util.List<SideCarDetailModel> items) {
        this.items = items;
        return this;
    }
    public java.util.List<SideCarDetailModel> getItems() {
        return this.items;
    }

}
