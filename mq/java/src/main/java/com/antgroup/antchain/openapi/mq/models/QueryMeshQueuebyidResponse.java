// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mq.models;

import com.aliyun.tea.*;

public class QueryMeshQueuebyidResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 关联应用
    @NameInMap("asso_app")
    public String assoApp;

    // 通道名
    @NameInMap("channel")
    public String channel;

    // 队列管理器ip
    @NameInMap("ip")
    public String ip;

    // 队列管理器名
    @NameInMap("manager")
    public String manager;

    // 队列名
    @NameInMap("name")
    public String name;

    // 队列管理器端口
    @NameInMap("port")
    public String port;

    // 状态码
    @NameInMap("state")
    public Long state;

    // 类型
    @NameInMap("type")
    public String type;

    public static QueryMeshQueuebyidResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryMeshQueuebyidResponse self = new QueryMeshQueuebyidResponse();
        return TeaModel.build(map, self);
    }

    public QueryMeshQueuebyidResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryMeshQueuebyidResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryMeshQueuebyidResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryMeshQueuebyidResponse setAssoApp(String assoApp) {
        this.assoApp = assoApp;
        return this;
    }
    public String getAssoApp() {
        return this.assoApp;
    }

    public QueryMeshQueuebyidResponse setChannel(String channel) {
        this.channel = channel;
        return this;
    }
    public String getChannel() {
        return this.channel;
    }

    public QueryMeshQueuebyidResponse setIp(String ip) {
        this.ip = ip;
        return this;
    }
    public String getIp() {
        return this.ip;
    }

    public QueryMeshQueuebyidResponse setManager(String manager) {
        this.manager = manager;
        return this;
    }
    public String getManager() {
        return this.manager;
    }

    public QueryMeshQueuebyidResponse setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public QueryMeshQueuebyidResponse setPort(String port) {
        this.port = port;
        return this;
    }
    public String getPort() {
        return this.port;
    }

    public QueryMeshQueuebyidResponse setState(Long state) {
        this.state = state;
        return this;
    }
    public Long getState() {
        return this.state;
    }

    public QueryMeshQueuebyidResponse setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
