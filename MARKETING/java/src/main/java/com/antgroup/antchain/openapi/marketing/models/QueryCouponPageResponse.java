// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.marketing.models;

import com.aliyun.tea.*;

public class QueryCouponPageResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 优惠券列表
    @NameInMap("coupon_list")
    public java.util.List<Coupon> couponList;

    // 当前页
    @NameInMap("current_page")
    public Long currentPage;

    // 每页显示行数
    @NameInMap("page_size")
    public Long pageSize;

    // 总数量
    @NameInMap("total_count")
    public Long totalCount;

    public static QueryCouponPageResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryCouponPageResponse self = new QueryCouponPageResponse();
        return TeaModel.build(map, self);
    }

    public QueryCouponPageResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryCouponPageResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryCouponPageResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryCouponPageResponse setCouponList(java.util.List<Coupon> couponList) {
        this.couponList = couponList;
        return this;
    }
    public java.util.List<Coupon> getCouponList() {
        return this.couponList;
    }

    public QueryCouponPageResponse setCurrentPage(Long currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Long getCurrentPage() {
        return this.currentPage;
    }

    public QueryCouponPageResponse setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryCouponPageResponse setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

}
