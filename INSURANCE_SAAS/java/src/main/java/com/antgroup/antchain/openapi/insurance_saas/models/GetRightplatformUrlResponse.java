// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.insurance_saas.models;

import com.aliyun.tea.*;

public class GetRightplatformUrlResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 权益申请编号
    @NameInMap("right_apply_no")
    public String rightApplyNo;

    // 权益产品地址
    @NameInMap("right_url")
    public String rightUrl;

    // 两轮车延保险产品id
    // 
    @NameInMap("product_id")
    public String productId;

    public static GetRightplatformUrlResponse build(java.util.Map<String, ?> map) throws Exception {
        GetRightplatformUrlResponse self = new GetRightplatformUrlResponse();
        return TeaModel.build(map, self);
    }

    public GetRightplatformUrlResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public GetRightplatformUrlResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetRightplatformUrlResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public GetRightplatformUrlResponse setRightApplyNo(String rightApplyNo) {
        this.rightApplyNo = rightApplyNo;
        return this;
    }
    public String getRightApplyNo() {
        return this.rightApplyNo;
    }

    public GetRightplatformUrlResponse setRightUrl(String rightUrl) {
        this.rightUrl = rightUrl;
        return this;
    }
    public String getRightUrl() {
        return this.rightUrl;
    }

    public GetRightplatformUrlResponse setProductId(String productId) {
        this.productId = productId;
        return this;
    }
    public String getProductId() {
        return this.productId;
    }

}
