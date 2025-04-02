// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class ZhimaIdentifyResp extends TeaModel {
    // 唯一ID，接口正常的话有此字段
    @NameInMap("biz_no")
    public String bizNo;

    // 带参数的回调地址，接口正常的话有此字段
    @NameInMap("certify_url")
    public String certifyUrl;

    // 蚂蚁调用芝麻的错误码
    @NameInMap("result_code")
    @Validation(required = true)
    public String resultCode;

    // 蚂蚁调用芝麻的结果描述
    @NameInMap("result_msg")
    @Validation(required = true)
    public String resultMsg;

    // 蚂蚁调用芝麻的错误码
    @NameInMap("sub_code")
    public String subCode;

    // 蚂蚁调用芝麻信息
    @NameInMap("sub_msg")
    public String subMsg;

    public static ZhimaIdentifyResp build(java.util.Map<String, ?> map) throws Exception {
        ZhimaIdentifyResp self = new ZhimaIdentifyResp();
        return TeaModel.build(map, self);
    }

    public ZhimaIdentifyResp setBizNo(String bizNo) {
        this.bizNo = bizNo;
        return this;
    }
    public String getBizNo() {
        return this.bizNo;
    }

    public ZhimaIdentifyResp setCertifyUrl(String certifyUrl) {
        this.certifyUrl = certifyUrl;
        return this;
    }
    public String getCertifyUrl() {
        return this.certifyUrl;
    }

    public ZhimaIdentifyResp setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ZhimaIdentifyResp setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ZhimaIdentifyResp setSubCode(String subCode) {
        this.subCode = subCode;
        return this;
    }
    public String getSubCode() {
        return this.subCode;
    }

    public ZhimaIdentifyResp setSubMsg(String subMsg) {
        this.subMsg = subMsg;
        return this;
    }
    public String getSubMsg() {
        return this.subMsg;
    }

}
