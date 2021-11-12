// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.yunqing.models;

import com.aliyun.tea.*;

public class QueryProdinstanceResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 当前页码。
    @NameInMap("page_num")
    public Long pageNum;

    // 分页大小。
    @NameInMap("page_size")
    public Long pageSize;

    // 产品实例列表。
    @NameInMap("product_instances")
    public java.util.List<ProductInstance> productInstances;

    // 总数。
    @NameInMap("total_count")
    public Long totalCount;

    public static QueryProdinstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryProdinstanceResponse self = new QueryProdinstanceResponse();
        return TeaModel.build(map, self);
    }

    public QueryProdinstanceResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryProdinstanceResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryProdinstanceResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryProdinstanceResponse setPageNum(Long pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Long getPageNum() {
        return this.pageNum;
    }

    public QueryProdinstanceResponse setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryProdinstanceResponse setProductInstances(java.util.List<ProductInstance> productInstances) {
        this.productInstances = productInstances;
        return this;
    }
    public java.util.List<ProductInstance> getProductInstances() {
        return this.productInstances;
    }

    public QueryProdinstanceResponse setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

}
