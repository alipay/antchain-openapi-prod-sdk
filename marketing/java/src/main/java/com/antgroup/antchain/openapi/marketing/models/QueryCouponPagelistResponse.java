// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.marketing.models;

import com.aliyun.tea.*;

public class QueryCouponPagelistResponse extends TeaModel {
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
    // 
    @NameInMap("current_page")
    public Long currentPage;

    // 每页显示行数	
    // 
    @NameInMap("page_size")
    public Long pageSize;

    // 总数量	
    // 
    @NameInMap("total_count")
    public Long totalCount;

    public static QueryCouponPagelistResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryCouponPagelistResponse self = new QueryCouponPagelistResponse();
        return TeaModel.build(map, self);
    }

    public QueryCouponPagelistResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryCouponPagelistResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryCouponPagelistResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryCouponPagelistResponse setCouponList(java.util.List<Coupon> couponList) {
        this.couponList = couponList;
        return this;
    }
    public java.util.List<Coupon> getCouponList() {
        return this.couponList;
    }

    public QueryCouponPagelistResponse setCurrentPage(Long currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Long getCurrentPage() {
        return this.currentPage;
    }

    public QueryCouponPagelistResponse setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryCouponPagelistResponse setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

}
