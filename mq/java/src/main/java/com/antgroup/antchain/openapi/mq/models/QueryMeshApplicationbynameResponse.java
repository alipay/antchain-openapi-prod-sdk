// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mq.models;

import com.aliyun.tea.*;

public class QueryMeshApplicationbynameResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 创建日期
    @NameInMap("gmt_created")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String gmtCreated;

    // 应用id
    @NameInMap("id")
    public Long id;

    // 应用名
    @NameInMap("name")
    public String name;

    // 服务端get队列
    @NameInMap("pub_get_queue")
    public String pubGetQueue;

    // 服务端put队列
    @NameInMap("pub_put_queue")
    public String pubPutQueue;

    // 服务端rpc开关
    @NameInMap("pub_rpc_status")
    public Long pubRpcStatus;

    // 返回状态
    @NameInMap("state")
    public Long state;

    // 客户端get队列
    @NameInMap("sub_get_queue")
    public String subGetQueue;

    // 客户端put队列
    @NameInMap("sub_put_queue")
    public String subPutQueue;

    // 客户端rpc比例
    @NameInMap("sub_rpc_scale")
    public Long subRpcScale;

    // 服务类型
    @NameInMap("type")
    public String type;

    public static QueryMeshApplicationbynameResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryMeshApplicationbynameResponse self = new QueryMeshApplicationbynameResponse();
        return TeaModel.build(map, self);
    }

    public QueryMeshApplicationbynameResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryMeshApplicationbynameResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryMeshApplicationbynameResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryMeshApplicationbynameResponse setGmtCreated(String gmtCreated) {
        this.gmtCreated = gmtCreated;
        return this;
    }
    public String getGmtCreated() {
        return this.gmtCreated;
    }

    public QueryMeshApplicationbynameResponse setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public QueryMeshApplicationbynameResponse setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public QueryMeshApplicationbynameResponse setPubGetQueue(String pubGetQueue) {
        this.pubGetQueue = pubGetQueue;
        return this;
    }
    public String getPubGetQueue() {
        return this.pubGetQueue;
    }

    public QueryMeshApplicationbynameResponse setPubPutQueue(String pubPutQueue) {
        this.pubPutQueue = pubPutQueue;
        return this;
    }
    public String getPubPutQueue() {
        return this.pubPutQueue;
    }

    public QueryMeshApplicationbynameResponse setPubRpcStatus(Long pubRpcStatus) {
        this.pubRpcStatus = pubRpcStatus;
        return this;
    }
    public Long getPubRpcStatus() {
        return this.pubRpcStatus;
    }

    public QueryMeshApplicationbynameResponse setState(Long state) {
        this.state = state;
        return this;
    }
    public Long getState() {
        return this.state;
    }

    public QueryMeshApplicationbynameResponse setSubGetQueue(String subGetQueue) {
        this.subGetQueue = subGetQueue;
        return this;
    }
    public String getSubGetQueue() {
        return this.subGetQueue;
    }

    public QueryMeshApplicationbynameResponse setSubPutQueue(String subPutQueue) {
        this.subPutQueue = subPutQueue;
        return this;
    }
    public String getSubPutQueue() {
        return this.subPutQueue;
    }

    public QueryMeshApplicationbynameResponse setSubRpcScale(Long subRpcScale) {
        this.subRpcScale = subRpcScale;
        return this;
    }
    public Long getSubRpcScale() {
        return this.subRpcScale;
    }

    public QueryMeshApplicationbynameResponse setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
