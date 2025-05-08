// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.media_sms.models;

import com.aliyun.tea.*;

public class ShortUrlResult extends TeaModel {
    // 短链创建时的标记字符串，可以用该字段关联短链的发送目标
    @NameInMap("cust_flag")
    @Validation(required = true)
    public String custFlag;

    // 卡片模板的动参字符串
    @NameInMap("dync_param")
    @Validation(required = true)
    public String dyncParam;

    // 短链链接
    @NameInMap("aim_url")
    @Validation(required = true)
    public String aimUrl;

    // 短链码
    @NameInMap("aim_code")
    @Validation(required = true)
    public String aimCode;

    // 0:短链申请成功，非 0:短链申请失败
    @NameInMap("result_code")
    @Validation(required = true)
    public String resultCode;

    // 短链申请失败原因
    @NameInMap("error_msg")
    public String errorMsg;

    // 支持该短链的厂商
    @NameInMap("factorys")
    @Validation(required = true)
    public java.util.List<String> factorys;

    public static ShortUrlResult build(java.util.Map<String, ?> map) throws Exception {
        ShortUrlResult self = new ShortUrlResult();
        return TeaModel.build(map, self);
    }

    public ShortUrlResult setCustFlag(String custFlag) {
        this.custFlag = custFlag;
        return this;
    }
    public String getCustFlag() {
        return this.custFlag;
    }

    public ShortUrlResult setDyncParam(String dyncParam) {
        this.dyncParam = dyncParam;
        return this;
    }
    public String getDyncParam() {
        return this.dyncParam;
    }

    public ShortUrlResult setAimUrl(String aimUrl) {
        this.aimUrl = aimUrl;
        return this;
    }
    public String getAimUrl() {
        return this.aimUrl;
    }

    public ShortUrlResult setAimCode(String aimCode) {
        this.aimCode = aimCode;
        return this;
    }
    public String getAimCode() {
        return this.aimCode;
    }

    public ShortUrlResult setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ShortUrlResult setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public ShortUrlResult setFactorys(java.util.List<String> factorys) {
        this.factorys = factorys;
        return this;
    }
    public java.util.List<String> getFactorys() {
        return this.factorys;
    }

}
