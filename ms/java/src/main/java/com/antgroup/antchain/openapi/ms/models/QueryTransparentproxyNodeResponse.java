// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ms.models;

import com.aliyun.tea.*;

public class QueryTransparentproxyNodeResponse extends TeaModel {
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
    @NameInMap("current_page")
    public Long currentPage;

    // 节点列表
    @NameInMap("list")
    public java.util.List<TransparentProxyNodeVo> list;

    // 页大小
    @NameInMap("page_size")
    public Long pageSize;

    // 起始位置
    @NameInMap("start_index")
    public Long startIndex;

    // 总数
    @NameInMap("total_size")
    public Long totalSize;

    public static QueryTransparentproxyNodeResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryTransparentproxyNodeResponse self = new QueryTransparentproxyNodeResponse();
        return TeaModel.build(map, self);
    }

    public QueryTransparentproxyNodeResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryTransparentproxyNodeResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryTransparentproxyNodeResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryTransparentproxyNodeResponse setCurrentPage(Long currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Long getCurrentPage() {
        return this.currentPage;
    }

    public QueryTransparentproxyNodeResponse setList(java.util.List<TransparentProxyNodeVo> list) {
        this.list = list;
        return this;
    }
    public java.util.List<TransparentProxyNodeVo> getList() {
        return this.list;
    }

    public QueryTransparentproxyNodeResponse setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryTransparentproxyNodeResponse setStartIndex(Long startIndex) {
        this.startIndex = startIndex;
        return this;
    }
    public Long getStartIndex() {
        return this.startIndex;
    }

    public QueryTransparentproxyNodeResponse setTotalSize(Long totalSize) {
        this.totalSize = totalSize;
        return this;
    }
    public Long getTotalSize() {
        return this.totalSize;
    }

}
