// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.agorax.models;

import com.aliyun.tea.*;

public class QueryBaasPromotionCouponResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 记录总数
    @NameInMap("total_count")
    public Long totalCount;

    // 当前页码
    @NameInMap("page_num")
    public Long pageNum;

    // 每页数量
    @NameInMap("page_size")
    public Long pageSize;

    // 发券记录列表
    @NameInMap("list")
    public java.util.List<List> list;

    public static QueryBaasPromotionCouponResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryBaasPromotionCouponResponse self = new QueryBaasPromotionCouponResponse();
        return TeaModel.build(map, self);
    }

    public QueryBaasPromotionCouponResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryBaasPromotionCouponResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryBaasPromotionCouponResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryBaasPromotionCouponResponse setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public QueryBaasPromotionCouponResponse setPageNum(Long pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Long getPageNum() {
        return this.pageNum;
    }

    public QueryBaasPromotionCouponResponse setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryBaasPromotionCouponResponse setList(java.util.List<List> list) {
        this.list = list;
        return this;
    }
    public java.util.List<List> getList() {
        return this.list;
    }

}
