// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class ListUnireleaseSolutionsResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 解决方案列表返回
    @NameInMap("data")
    public java.util.List<UnireleaseSolution> data;

    // 总数
    @NameInMap("total_size")
    public Long totalSize;

    // 页大小
    @NameInMap("page_size")
    public Long pageSize;

    // 当前页
    @NameInMap("current_page")
    public Long currentPage;

    public static ListUnireleaseSolutionsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListUnireleaseSolutionsResponse self = new ListUnireleaseSolutionsResponse();
        return TeaModel.build(map, self);
    }

    public ListUnireleaseSolutionsResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ListUnireleaseSolutionsResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ListUnireleaseSolutionsResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ListUnireleaseSolutionsResponse setData(java.util.List<UnireleaseSolution> data) {
        this.data = data;
        return this;
    }
    public java.util.List<UnireleaseSolution> getData() {
        return this.data;
    }

    public ListUnireleaseSolutionsResponse setTotalSize(Long totalSize) {
        this.totalSize = totalSize;
        return this;
    }
    public Long getTotalSize() {
        return this.totalSize;
    }

    public ListUnireleaseSolutionsResponse setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListUnireleaseSolutionsResponse setCurrentPage(Long currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Long getCurrentPage() {
        return this.currentPage;
    }

}
