// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.media_sms.models;

import com.aliyun.tea.*;

public class ShortUrlParseResult extends TeaModel {
    // 创建短链时传入的客户号，可以用该字段关联短链的发送目标
    @NameInMap("cust_flag")
    @Validation(required = true)
    public String custFlag;

    // 卡片模板id
    @NameInMap("smart_template_id")
    @Validation(required = true)
    public String smartTemplateId;

    // 短链地址
    @NameInMap("aim_url")
    @Validation(required = true)
    public String aimUrl;

    // 短链地址尾码
    @NameInMap("aim_code")
    @Validation(required = true)
    public String aimCode;

    // BULK 群发,PERSONAL个性化
    @NameInMap("aim_code_type")
    @Validation(required = true)
    public String aimCodeType;

    // 解析状态
    @NameInMap("status")
    @Validation(required = true)
    public String status;

    // 解析状态描述
    @NameInMap("describe")
    public String describe;

    public static ShortUrlParseResult build(java.util.Map<String, ?> map) throws Exception {
        ShortUrlParseResult self = new ShortUrlParseResult();
        return TeaModel.build(map, self);
    }

    public ShortUrlParseResult setCustFlag(String custFlag) {
        this.custFlag = custFlag;
        return this;
    }
    public String getCustFlag() {
        return this.custFlag;
    }

    public ShortUrlParseResult setSmartTemplateId(String smartTemplateId) {
        this.smartTemplateId = smartTemplateId;
        return this;
    }
    public String getSmartTemplateId() {
        return this.smartTemplateId;
    }

    public ShortUrlParseResult setAimUrl(String aimUrl) {
        this.aimUrl = aimUrl;
        return this;
    }
    public String getAimUrl() {
        return this.aimUrl;
    }

    public ShortUrlParseResult setAimCode(String aimCode) {
        this.aimCode = aimCode;
        return this;
    }
    public String getAimCode() {
        return this.aimCode;
    }

    public ShortUrlParseResult setAimCodeType(String aimCodeType) {
        this.aimCodeType = aimCodeType;
        return this;
    }
    public String getAimCodeType() {
        return this.aimCodeType;
    }

    public ShortUrlParseResult setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public ShortUrlParseResult setDescribe(String describe) {
        this.describe = describe;
        return this;
    }
    public String getDescribe() {
        return this.describe;
    }

}
