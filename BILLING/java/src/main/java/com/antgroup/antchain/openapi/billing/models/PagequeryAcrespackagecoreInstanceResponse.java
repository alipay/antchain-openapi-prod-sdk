// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.billing.models;

import com.aliyun.tea.*;

public class PagequeryAcrespackagecoreInstanceResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 查询结果
    @NameInMap("data")
    public java.util.List<ResourcePackageInstanceVO> data;

    // 当前页
    @NameInMap("current_page")
    public Long currentPage;

    // 分页大小
    @NameInMap("page_size")
    public Long pageSize;

    // 查询结果总数
    @NameInMap("total_count")
    public Long totalCount;

    // 状态
    @NameInMap("success")
    public Boolean success;

    public static PagequeryAcrespackagecoreInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        PagequeryAcrespackagecoreInstanceResponse self = new PagequeryAcrespackagecoreInstanceResponse();
        return TeaModel.build(map, self);
    }

    public PagequeryAcrespackagecoreInstanceResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public PagequeryAcrespackagecoreInstanceResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public PagequeryAcrespackagecoreInstanceResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public PagequeryAcrespackagecoreInstanceResponse setData(java.util.List<ResourcePackageInstanceVO> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ResourcePackageInstanceVO> getData() {
        return this.data;
    }

    public PagequeryAcrespackagecoreInstanceResponse setCurrentPage(Long currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Long getCurrentPage() {
        return this.currentPage;
    }

    public PagequeryAcrespackagecoreInstanceResponse setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public PagequeryAcrespackagecoreInstanceResponse setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public PagequeryAcrespackagecoreInstanceResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
