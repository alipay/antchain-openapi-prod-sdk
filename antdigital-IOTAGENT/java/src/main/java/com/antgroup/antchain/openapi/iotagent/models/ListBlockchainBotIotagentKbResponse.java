// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.iotagent.models;

import com.aliyun.tea.*;

public class ListBlockchainBotIotagentKbResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // Agent ID
    @NameInMap("agent_id")
    public String agentId;

    // 挂载的知识库总数
    @NameInMap("total")
    @Validation(required = true)
    public Long total;

    // 当前页码
    @NameInMap("page_index")
    @Validation(required = true)
    public Long pageIndex;

    // 每页数量
    @NameInMap("page_size")
    @Validation(required = true)
    public Long pageSize;

    // 当前页挂载的知识库列表
    @NameInMap("items")
    @Validation(required = true)
    public java.util.List<OpenApiKbMountItem> items;

    public static ListBlockchainBotIotagentKbResponse build(java.util.Map<String, ?> map) throws Exception {
        ListBlockchainBotIotagentKbResponse self = new ListBlockchainBotIotagentKbResponse();
        return TeaModel.build(map, self);
    }

    public ListBlockchainBotIotagentKbResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ListBlockchainBotIotagentKbResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ListBlockchainBotIotagentKbResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ListBlockchainBotIotagentKbResponse setAgentId(String agentId) {
        this.agentId = agentId;
        return this;
    }
    public String getAgentId() {
        return this.agentId;
    }

    public ListBlockchainBotIotagentKbResponse setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public ListBlockchainBotIotagentKbResponse setPageIndex(Long pageIndex) {
        this.pageIndex = pageIndex;
        return this;
    }
    public Long getPageIndex() {
        return this.pageIndex;
    }

    public ListBlockchainBotIotagentKbResponse setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListBlockchainBotIotagentKbResponse setItems(java.util.List<OpenApiKbMountItem> items) {
        this.items = items;
        return this;
    }
    public java.util.List<OpenApiKbMountItem> getItems() {
        return this.items;
    }

}
