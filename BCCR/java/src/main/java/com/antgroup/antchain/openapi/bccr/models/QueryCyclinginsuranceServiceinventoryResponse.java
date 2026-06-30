// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bccr.models;

import com.aliyun.tea.*;

public class QueryCyclinginsuranceServiceinventoryResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 商品库存列表
    @NameInMap("item_inventorys")
    public java.util.List<ItemInventoryVO> itemInventorys;

    public static QueryCyclinginsuranceServiceinventoryResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryCyclinginsuranceServiceinventoryResponse self = new QueryCyclinginsuranceServiceinventoryResponse();
        return TeaModel.build(map, self);
    }

    public QueryCyclinginsuranceServiceinventoryResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryCyclinginsuranceServiceinventoryResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryCyclinginsuranceServiceinventoryResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryCyclinginsuranceServiceinventoryResponse setItemInventorys(java.util.List<ItemInventoryVO> itemInventorys) {
        this.itemInventorys = itemInventorys;
        return this;
    }
    public java.util.List<ItemInventoryVO> getItemInventorys() {
        return this.itemInventorys;
    }

}
