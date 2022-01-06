// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ms.models;

import com.aliyun.tea.*;

public class QueryTransparentproxyAppResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 当前页
    @NameInMap("current_page")
    public Long currentPage;

    // 应用列表
    @NameInMap("list")
    public java.util.List<TransparentProxyAppVo> list;

    // 页大小
    @NameInMap("page_size")
    public Long pageSize;

    // 开始位置
    @NameInMap("start_index")
    public Long startIndex;

    // 总数
    @NameInMap("total_size")
    public Long totalSize;

    public static QueryTransparentproxyAppResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryTransparentproxyAppResponse self = new QueryTransparentproxyAppResponse();
        return TeaModel.build(map, self);
    }

    public QueryTransparentproxyAppResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryTransparentproxyAppResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryTransparentproxyAppResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryTransparentproxyAppResponse setCurrentPage(Long currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Long getCurrentPage() {
        return this.currentPage;
    }

    public QueryTransparentproxyAppResponse setList(java.util.List<TransparentProxyAppVo> list) {
        this.list = list;
        return this;
    }
    public java.util.List<TransparentProxyAppVo> getList() {
        return this.list;
    }

    public QueryTransparentproxyAppResponse setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryTransparentproxyAppResponse setStartIndex(Long startIndex) {
        this.startIndex = startIndex;
        return this;
    }
    public Long getStartIndex() {
        return this.startIndex;
    }

    public QueryTransparentproxyAppResponse setTotalSize(Long totalSize) {
        this.totalSize = totalSize;
        return this;
    }
    public Long getTotalSize() {
        return this.totalSize;
    }

}
