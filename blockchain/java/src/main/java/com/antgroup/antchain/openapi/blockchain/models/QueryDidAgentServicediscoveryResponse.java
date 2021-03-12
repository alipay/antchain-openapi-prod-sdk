// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class QueryDidAgentServicediscoveryResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 异常信息的文本描述
    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // 当前页数
    @NameInMap("current_page")
    public Long currentPage;

    // 服务列表
    @NameInMap("services")
    public java.util.List<DisServiceInfo> services;

    // 总个数
    @NameInMap("total_num")
    public Long totalNum;

    // 总页数
    @NameInMap("total_page")
    public Long totalPage;

    public static QueryDidAgentServicediscoveryResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryDidAgentServicediscoveryResponse self = new QueryDidAgentServicediscoveryResponse();
        return TeaModel.build(map, self);
    }

    public QueryDidAgentServicediscoveryResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryDidAgentServicediscoveryResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryDidAgentServicediscoveryResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryDidAgentServicediscoveryResponse setCurrentPage(Long currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Long getCurrentPage() {
        return this.currentPage;
    }

    public QueryDidAgentServicediscoveryResponse setServices(java.util.List<DisServiceInfo> services) {
        this.services = services;
        return this;
    }
    public java.util.List<DisServiceInfo> getServices() {
        return this.services;
    }

    public QueryDidAgentServicediscoveryResponse setTotalNum(Long totalNum) {
        this.totalNum = totalNum;
        return this;
    }
    public Long getTotalNum() {
        return this.totalNum;
    }

    public QueryDidAgentServicediscoveryResponse setTotalPage(Long totalPage) {
        this.totalPage = totalPage;
        return this;
    }
    public Long getTotalPage() {
        return this.totalPage;
    }

}
