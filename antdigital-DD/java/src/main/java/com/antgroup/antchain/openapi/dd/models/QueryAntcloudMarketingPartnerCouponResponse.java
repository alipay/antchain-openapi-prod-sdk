// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dd.models;

import com.aliyun.tea.*;

public class QueryAntcloudMarketingPartnerCouponResponse extends TeaModel {
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
    @NameInMap("page_no")
    public Long pageNo;

    // 当前每页记录数
    @NameInMap("page_size")
    public Long pageSize;

    // 满足全部查询条件的优惠券总数
    @NameInMap("total_count")
    public Long totalCount;

    // 优惠券列表
    @NameInMap("coupons")
    public java.util.List<Coupon> coupons;

    public static QueryAntcloudMarketingPartnerCouponResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryAntcloudMarketingPartnerCouponResponse self = new QueryAntcloudMarketingPartnerCouponResponse();
        return TeaModel.build(map, self);
    }

    public QueryAntcloudMarketingPartnerCouponResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryAntcloudMarketingPartnerCouponResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryAntcloudMarketingPartnerCouponResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryAntcloudMarketingPartnerCouponResponse setPageNo(Long pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Long getPageNo() {
        return this.pageNo;
    }

    public QueryAntcloudMarketingPartnerCouponResponse setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryAntcloudMarketingPartnerCouponResponse setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public QueryAntcloudMarketingPartnerCouponResponse setCoupons(java.util.List<Coupon> coupons) {
        this.coupons = coupons;
        return this;
    }
    public java.util.List<Coupon> getCoupons() {
        return this.coupons;
    }

}
