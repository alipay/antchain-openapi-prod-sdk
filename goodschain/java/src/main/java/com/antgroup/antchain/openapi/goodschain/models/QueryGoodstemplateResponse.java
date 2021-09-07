// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.goodschain.models;

import com.aliyun.tea.*;

public class QueryGoodstemplateResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 商品模板列表
    @NameInMap("goodstemplate_list")
    public java.util.List<GoodsTemplateDTO> goodstemplateList;

    // 总页数
    @NameInMap("total_page")
    public Long totalPage;

    // 当前页数
    @NameInMap("current_page")
    public Long currentPage;

    public static QueryGoodstemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryGoodstemplateResponse self = new QueryGoodstemplateResponse();
        return TeaModel.build(map, self);
    }

    public QueryGoodstemplateResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryGoodstemplateResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryGoodstemplateResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryGoodstemplateResponse setGoodstemplateList(java.util.List<GoodsTemplateDTO> goodstemplateList) {
        this.goodstemplateList = goodstemplateList;
        return this;
    }
    public java.util.List<GoodsTemplateDTO> getGoodstemplateList() {
        return this.goodstemplateList;
    }

    public QueryGoodstemplateResponse setTotalPage(Long totalPage) {
        this.totalPage = totalPage;
        return this;
    }
    public Long getTotalPage() {
        return this.totalPage;
    }

    public QueryGoodstemplateResponse setCurrentPage(Long currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Long getCurrentPage() {
        return this.currentPage;
    }

}
