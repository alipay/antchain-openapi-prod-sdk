// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class BindIpShopResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 淘宝店铺数据授权跳转链接
    @NameInMap("auth_uri")
    public String authUri;

    // 授权申请的内部编码
    @NameInMap("item_code")
    public String itemCode;

    public static BindIpShopResponse build(java.util.Map<String, ?> map) throws Exception {
        BindIpShopResponse self = new BindIpShopResponse();
        return TeaModel.build(map, self);
    }

    public BindIpShopResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public BindIpShopResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public BindIpShopResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public BindIpShopResponse setAuthUri(String authUri) {
        this.authUri = authUri;
        return this;
    }
    public String getAuthUri() {
        return this.authUri;
    }

    public BindIpShopResponse setItemCode(String itemCode) {
        this.itemCode = itemCode;
        return this;
    }
    public String getItemCode() {
        return this.itemCode;
    }

}
