// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.aiidentify.models;

import com.aliyun.tea.*;

public class OperateIdentifyResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 鉴定单编号
    @NameInMap("identify_number")
    public String identifyNumber;

    // 品类名称
    @NameInMap("category_name")
    public String categoryName;

    // 品牌名称
    @NameInMap("brand_name")
    public String brandName;

    // 款式名称
    @NameInMap("style_name")
    public String styleName;

    //  整体鉴定结果
    // SUCCESS：符合鉴定标准
    // FAILED：不符合鉴定标准
    // NOT_IDENTIFY：无法鉴定
    @NameInMap("identify_result")
    public String identifyResult;

    // 鉴定描述
    @NameInMap("identify_desc")
    public String identifyDesc;

    // 鉴定点结果列表
    @NameInMap("identify_point_result_list")
    public java.util.List<IdentifyPointResultResp> identifyPointResultList;

    public static OperateIdentifyResponse build(java.util.Map<String, ?> map) throws Exception {
        OperateIdentifyResponse self = new OperateIdentifyResponse();
        return TeaModel.build(map, self);
    }

    public OperateIdentifyResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public OperateIdentifyResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public OperateIdentifyResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public OperateIdentifyResponse setIdentifyNumber(String identifyNumber) {
        this.identifyNumber = identifyNumber;
        return this;
    }
    public String getIdentifyNumber() {
        return this.identifyNumber;
    }

    public OperateIdentifyResponse setCategoryName(String categoryName) {
        this.categoryName = categoryName;
        return this;
    }
    public String getCategoryName() {
        return this.categoryName;
    }

    public OperateIdentifyResponse setBrandName(String brandName) {
        this.brandName = brandName;
        return this;
    }
    public String getBrandName() {
        return this.brandName;
    }

    public OperateIdentifyResponse setStyleName(String styleName) {
        this.styleName = styleName;
        return this;
    }
    public String getStyleName() {
        return this.styleName;
    }

    public OperateIdentifyResponse setIdentifyResult(String identifyResult) {
        this.identifyResult = identifyResult;
        return this;
    }
    public String getIdentifyResult() {
        return this.identifyResult;
    }

    public OperateIdentifyResponse setIdentifyDesc(String identifyDesc) {
        this.identifyDesc = identifyDesc;
        return this;
    }
    public String getIdentifyDesc() {
        return this.identifyDesc;
    }

    public OperateIdentifyResponse setIdentifyPointResultList(java.util.List<IdentifyPointResultResp> identifyPointResultList) {
        this.identifyPointResultList = identifyPointResultList;
        return this;
    }
    public java.util.List<IdentifyPointResultResp> getIdentifyPointResultList() {
        return this.identifyPointResultList;
    }

}
