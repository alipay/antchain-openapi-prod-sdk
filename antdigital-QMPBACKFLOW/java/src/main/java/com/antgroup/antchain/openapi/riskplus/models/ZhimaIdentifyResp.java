// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class ZhimaIdentifyResp extends TeaModel {
    // 唯一ID，接口正常的话有此字段
    /**
     * <strong>example:</strong>
     * <p>ZM201505190ad422641448624704506270407</p>
     */
    @NameInMap("biz_no")
    public String bizNo;

    // 带参数的回调地址，接口正常的话有此字段
    /**
     * <strong>example:</strong>
     * <p><a href="http://zmmcportal.stable.zhimaxy.net/index.htm?biz_content=%7B%22biz_no%22%3A%225f491814480fafe7dc0779a1c452c9f7%22%7D&sign=dsgdsfhgdsfh">http://zmmcportal.stable.zhimaxy.net/index.htm?biz_content=%7B%22biz_no%22%3A%225f491814480fafe7dc0779a1c452c9f7%22%7D&amp;sign=dsgdsfhgdsfh</a></p>
     */
    @NameInMap("certify_url")
    public String certifyUrl;

    // 蚂蚁调用芝麻的错误码
    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("result_code")
    @Validation(required = true)
    public String resultCode;

    // 蚂蚁调用芝麻的结果描述
    /**
     * <strong>example:</strong>
     * <p>Success/Invalid Arguments</p>
     */
    @NameInMap("result_msg")
    @Validation(required = true)
    public String resultMsg;

    // 蚂蚁调用芝麻的错误码
    /**
     * <strong>example:</strong>
     * <p>isv.invalid-app-id</p>
     */
    @NameInMap("sub_code")
    public String subCode;

    // 蚂蚁调用芝麻信息
    /**
     * <strong>example:</strong>
     * <p>无效的AppID参数</p>
     */
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
