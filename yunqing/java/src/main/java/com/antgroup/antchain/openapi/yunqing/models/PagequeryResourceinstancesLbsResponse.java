// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.yunqing.models;

import com.aliyun.tea.*;

public class PagequeryResourceinstancesLbsResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 当前页面index
    @NameInMap("current_page")
    public Long currentPage;

    // 页面大小
    @NameInMap("page_size")
    public Long pageSize;

    // 总数
    @NameInMap("total_count")
    public Long totalCount;

    // 总页数
    @NameInMap("total_page")
    public Long totalPage;

    // 产品应用所属的lb实例
    @NameInMap("lb_instances")
    public java.util.List<LbInstance> lbInstances;

    public static PagequeryResourceinstancesLbsResponse build(java.util.Map<String, ?> map) throws Exception {
        PagequeryResourceinstancesLbsResponse self = new PagequeryResourceinstancesLbsResponse();
        return TeaModel.build(map, self);
    }

    public PagequeryResourceinstancesLbsResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public PagequeryResourceinstancesLbsResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public PagequeryResourceinstancesLbsResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public PagequeryResourceinstancesLbsResponse setCurrentPage(Long currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Long getCurrentPage() {
        return this.currentPage;
    }

    public PagequeryResourceinstancesLbsResponse setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public PagequeryResourceinstancesLbsResponse setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public PagequeryResourceinstancesLbsResponse setTotalPage(Long totalPage) {
        this.totalPage = totalPage;
        return this;
    }
    public Long getTotalPage() {
        return this.totalPage;
    }

    public PagequeryResourceinstancesLbsResponse setLbInstances(java.util.List<LbInstance> lbInstances) {
        this.lbInstances = lbInstances;
        return this;
    }
    public java.util.List<LbInstance> getLbInstances() {
        return this.lbInstances;
    }

}
