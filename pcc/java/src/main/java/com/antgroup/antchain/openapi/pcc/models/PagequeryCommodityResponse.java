// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.pcc.models;

import com.aliyun.tea.*;

public class PagequeryCommodityResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 商品列表
    @NameInMap("commodities")
    public java.util.List<Commodity> commodities;

    // 商品总数
    @NameInMap("total_count")
    public Long totalCount;

    // 当前页数
    @NameInMap("page_no")
    public Long pageNo;

    // 每页页数
    @NameInMap("page_size")
    public Long pageSize;

    public static PagequeryCommodityResponse build(java.util.Map<String, ?> map) throws Exception {
        PagequeryCommodityResponse self = new PagequeryCommodityResponse();
        return TeaModel.build(map, self);
    }

    public PagequeryCommodityResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public PagequeryCommodityResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public PagequeryCommodityResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public PagequeryCommodityResponse setCommodities(java.util.List<Commodity> commodities) {
        this.commodities = commodities;
        return this;
    }
    public java.util.List<Commodity> getCommodities() {
        return this.commodities;
    }

    public PagequeryCommodityResponse setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public PagequeryCommodityResponse setPageNo(Long pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Long getPageNo() {
        return this.pageNo;
    }

    public PagequeryCommodityResponse setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

}
