// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class ListIpShopResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 总数量
    @NameInMap("total_count")
    public Long totalCount;

    // 店铺详情列表
    @NameInMap("shop_list")
    public java.util.List<IPShopInfo> shopList;

    public static ListIpShopResponse build(java.util.Map<String, ?> map) throws Exception {
        ListIpShopResponse self = new ListIpShopResponse();
        return TeaModel.build(map, self);
    }

    public ListIpShopResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ListIpShopResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ListIpShopResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ListIpShopResponse setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public ListIpShopResponse setShopList(java.util.List<IPShopInfo> shopList) {
        this.shopList = shopList;
        return this;
    }
    public java.util.List<IPShopInfo> getShopList() {
        return this.shopList;
    }

}
