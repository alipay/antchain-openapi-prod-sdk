// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.securitytech.models;

import com.aliyun.tea.*;

public class QuerySimSkuResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 车辆SKU，如果查无返回空列表
    @NameInMap("sku_info_list")
    public java.util.List<SimSkuInfo> skuInfoList;

    public static QuerySimSkuResponse build(java.util.Map<String, ?> map) throws Exception {
        QuerySimSkuResponse self = new QuerySimSkuResponse();
        return TeaModel.build(map, self);
    }

    public QuerySimSkuResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QuerySimSkuResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QuerySimSkuResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QuerySimSkuResponse setSkuInfoList(java.util.List<SimSkuInfo> skuInfoList) {
        this.skuInfoList = skuInfoList;
        return this;
    }
    public java.util.List<SimSkuInfo> getSkuInfoList() {
        return this.skuInfoList;
    }

}
