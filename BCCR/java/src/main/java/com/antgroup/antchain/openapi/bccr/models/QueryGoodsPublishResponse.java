// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bccr.models;

import com.aliyun.tea.*;

public class QueryGoodsPublishResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 发布id
    @NameInMap("pubilsh_id")
    public String pubilshId;

    // 发布状态
    @NameInMap("publish_status")
    public String publishStatus;

    // 商品id
    @NameInMap("goods_id")
    public String goodsId;

    public static QueryGoodsPublishResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryGoodsPublishResponse self = new QueryGoodsPublishResponse();
        return TeaModel.build(map, self);
    }

    public QueryGoodsPublishResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryGoodsPublishResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryGoodsPublishResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryGoodsPublishResponse setPubilshId(String pubilshId) {
        this.pubilshId = pubilshId;
        return this;
    }
    public String getPubilshId() {
        return this.pubilshId;
    }

    public QueryGoodsPublishResponse setPublishStatus(String publishStatus) {
        this.publishStatus = publishStatus;
        return this;
    }
    public String getPublishStatus() {
        return this.publishStatus;
    }

    public QueryGoodsPublishResponse setGoodsId(String goodsId) {
        this.goodsId = goodsId;
        return this;
    }
    public String getGoodsId() {
        return this.goodsId;
    }

}
