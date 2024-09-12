// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.unitycs.models;

import com.aliyun.tea.*;

public class VerifyDataResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 核验结果
    @NameInMap("result")
    public Boolean result;

    // 数据标识
    @NameInMap("attr_identify")
    public String attrIdentify;

    // 区块高度
    @NameInMap("block_count")
    public Long blockCount;

    // 核验属性集合
    @NameInMap("attrs")
    public java.util.List<MetaDataAttr> attrs;

    public static VerifyDataResponse build(java.util.Map<String, ?> map) throws Exception {
        VerifyDataResponse self = new VerifyDataResponse();
        return TeaModel.build(map, self);
    }

    public VerifyDataResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public VerifyDataResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public VerifyDataResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public VerifyDataResponse setResult(Boolean result) {
        this.result = result;
        return this;
    }
    public Boolean getResult() {
        return this.result;
    }

    public VerifyDataResponse setAttrIdentify(String attrIdentify) {
        this.attrIdentify = attrIdentify;
        return this;
    }
    public String getAttrIdentify() {
        return this.attrIdentify;
    }

    public VerifyDataResponse setBlockCount(Long blockCount) {
        this.blockCount = blockCount;
        return this;
    }
    public Long getBlockCount() {
        return this.blockCount;
    }

    public VerifyDataResponse setAttrs(java.util.List<MetaDataAttr> attrs) {
        this.attrs = attrs;
        return this;
    }
    public java.util.List<MetaDataAttr> getAttrs() {
        return this.attrs;
    }

}
