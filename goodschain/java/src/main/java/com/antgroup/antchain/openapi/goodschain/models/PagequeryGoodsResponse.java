// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.goodschain.models;

import com.aliyun.tea.*;

public class PagequeryGoodsResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 当前页
    @NameInMap("current_page")
    public Long currentPage;

    // 总页数
    @NameInMap("total_page")
    public Long totalPage;

    // 商品列表
    @NameInMap("goods_list")
    public java.util.List<GoodsDTO> goodsList;

    public static PagequeryGoodsResponse build(java.util.Map<String, ?> map) throws Exception {
        PagequeryGoodsResponse self = new PagequeryGoodsResponse();
        return TeaModel.build(map, self);
    }

    public PagequeryGoodsResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public PagequeryGoodsResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public PagequeryGoodsResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public PagequeryGoodsResponse setCurrentPage(Long currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Long getCurrentPage() {
        return this.currentPage;
    }

    public PagequeryGoodsResponse setTotalPage(Long totalPage) {
        this.totalPage = totalPage;
        return this;
    }
    public Long getTotalPage() {
        return this.totalPage;
    }

    public PagequeryGoodsResponse setGoodsList(java.util.List<GoodsDTO> goodsList) {
        this.goodsList = goodsList;
        return this;
    }
    public java.util.List<GoodsDTO> getGoodsList() {
        return this.goodsList;
    }

}
