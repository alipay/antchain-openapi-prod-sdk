// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_dc040d759c7a442f89b4b6590b1e39a0.models;

import com.aliyun.tea.*;

public class QueryBlockchainBotIotbasicDevicecollectResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 当前页码
    @NameInMap("current")
    public Long current;

    // 每页数据大小
    @NameInMap("page_size")
    public Long pageSize;

    // 数据总条数
    @NameInMap("total")
    public Long total;

    // 总页数
    @NameInMap("total_page")
    public Long totalPage;

    // 查询结果
    @NameInMap("data")
    public java.util.List<ChainModelResult> data;

    public static QueryBlockchainBotIotbasicDevicecollectResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryBlockchainBotIotbasicDevicecollectResponse self = new QueryBlockchainBotIotbasicDevicecollectResponse();
        return TeaModel.build(map, self);
    }

    public QueryBlockchainBotIotbasicDevicecollectResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryBlockchainBotIotbasicDevicecollectResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryBlockchainBotIotbasicDevicecollectResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryBlockchainBotIotbasicDevicecollectResponse setCurrent(Long current) {
        this.current = current;
        return this;
    }
    public Long getCurrent() {
        return this.current;
    }

    public QueryBlockchainBotIotbasicDevicecollectResponse setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryBlockchainBotIotbasicDevicecollectResponse setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public QueryBlockchainBotIotbasicDevicecollectResponse setTotalPage(Long totalPage) {
        this.totalPage = totalPage;
        return this;
    }
    public Long getTotalPage() {
        return this.totalPage;
    }

    public QueryBlockchainBotIotbasicDevicecollectResponse setData(java.util.List<ChainModelResult> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ChainModelResult> getData() {
        return this.data;
    }

}
