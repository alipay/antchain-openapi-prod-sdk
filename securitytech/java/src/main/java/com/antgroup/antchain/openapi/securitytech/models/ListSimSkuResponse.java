// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.securitytech.models;

import com.aliyun.tea.*;

public class ListSimSkuResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 分页器
    @NameInMap("paginator")
    public Paginator paginator;

    // 车辆SKU列表
    @NameInMap("sku_info_list")
    public java.util.List<SimSkuInfo> skuInfoList;

    public static ListSimSkuResponse build(java.util.Map<String, ?> map) throws Exception {
        ListSimSkuResponse self = new ListSimSkuResponse();
        return TeaModel.build(map, self);
    }

    public ListSimSkuResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ListSimSkuResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ListSimSkuResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ListSimSkuResponse setPaginator(Paginator paginator) {
        this.paginator = paginator;
        return this;
    }
    public Paginator getPaginator() {
        return this.paginator;
    }

    public ListSimSkuResponse setSkuInfoList(java.util.List<SimSkuInfo> skuInfoList) {
        this.skuInfoList = skuInfoList;
        return this;
    }
    public java.util.List<SimSkuInfo> getSkuInfoList() {
        return this.skuInfoList;
    }

}
