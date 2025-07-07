// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class QueryAuthCarpriceResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 总页数
    @NameInMap("total_pages")
    public Long totalPages;

    // 当前页码
    @NameInMap("page_num")
    public Long pageNum;

    // 车辆业务价格
    @NameInMap("data")
    public java.util.List<CarBusinessPrice> data;

    public static QueryAuthCarpriceResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryAuthCarpriceResponse self = new QueryAuthCarpriceResponse();
        return TeaModel.build(map, self);
    }

    public QueryAuthCarpriceResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryAuthCarpriceResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryAuthCarpriceResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryAuthCarpriceResponse setTotalPages(Long totalPages) {
        this.totalPages = totalPages;
        return this;
    }
    public Long getTotalPages() {
        return this.totalPages;
    }

    public QueryAuthCarpriceResponse setPageNum(Long pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Long getPageNum() {
        return this.pageNum;
    }

    public QueryAuthCarpriceResponse setData(java.util.List<CarBusinessPrice> data) {
        this.data = data;
        return this;
    }
    public java.util.List<CarBusinessPrice> getData() {
        return this.data;
    }

}
