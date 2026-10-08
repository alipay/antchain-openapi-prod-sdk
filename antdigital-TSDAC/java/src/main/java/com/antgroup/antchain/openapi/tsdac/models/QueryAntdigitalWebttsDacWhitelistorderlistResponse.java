// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.tsdac.models;

import com.aliyun.tea.*;

public class QueryAntdigitalWebttsDacWhitelistorderlistResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 订单列表
    @NameInMap("list")
    public java.util.List<WhitelistOrderListItem> list;

    // 当前第几页，为前端的请求值
    @NameInMap("page_num")
    public Long pageNum;

    // 每页展示多少条，为前端的请求值
    @NameInMap("page_size")
    public Long pageSize;

    // 总共有多少条数据
    @NameInMap("total_count")
    public Long totalCount;

    public static QueryAntdigitalWebttsDacWhitelistorderlistResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryAntdigitalWebttsDacWhitelistorderlistResponse self = new QueryAntdigitalWebttsDacWhitelistorderlistResponse();
        return TeaModel.build(map, self);
    }

    public QueryAntdigitalWebttsDacWhitelistorderlistResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryAntdigitalWebttsDacWhitelistorderlistResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryAntdigitalWebttsDacWhitelistorderlistResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryAntdigitalWebttsDacWhitelistorderlistResponse setList(java.util.List<WhitelistOrderListItem> list) {
        this.list = list;
        return this;
    }
    public java.util.List<WhitelistOrderListItem> getList() {
        return this.list;
    }

    public QueryAntdigitalWebttsDacWhitelistorderlistResponse setPageNum(Long pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Long getPageNum() {
        return this.pageNum;
    }

    public QueryAntdigitalWebttsDacWhitelistorderlistResponse setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryAntdigitalWebttsDacWhitelistorderlistResponse setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

}
