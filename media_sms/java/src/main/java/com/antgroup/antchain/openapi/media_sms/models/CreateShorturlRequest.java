// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.media_sms.models;

import com.aliyun.tea.*;

public class CreateShorturlRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 卡片模板id
    @NameInMap("smart_template_id")
    @Validation(required = true)
    public String smartTemplateId;

    // 申请好的签名，最多 10 个签名
    @NameInMap("sms_signs")
    @Validation(required = true)
    public java.util.List<String> smsSigns;

    // 个性化短链建议10次
    @NameInMap("show_times")
    @Validation(required = true)
    public Long showTimes;

    // BULK 群发
    // PERSONAL个性化
    @NameInMap("aim_code_type")
    @Validation(required = true)
    public String aimCodeType;

    // 个性化短链：时间最小 1天，最大 7 天，不填则默认 7 天；
    @NameInMap("expire_time")
    @Validation(required = true)
    public Long expireTime;

    // 短链所属生成批次，最长 50 位。
    // 也是请求唯一id，每次请求不能重复，重复将返回该批次id上一次请求结果
    @NameInMap("cust_batch_id")
    @Validation(required = true)
    public String custBatchId;

    // 接收智能短信测试短信手机号及动态参数对象列表，最大为 100 个
    // 注：oppo 模板一次最多只能申请 10 个（模板审核厂商中包含oppo厂商就视为oppo模板）
    @NameInMap("param_list")
    @Validation(required = true)
    public java.util.List<SmartTemplateDyncParam> paramList;

    // 租户id
    @NameInMap("tenant_id")
    @Validation(required = true)
    public String tenantId;

    public static CreateShorturlRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateShorturlRequest self = new CreateShorturlRequest();
        return TeaModel.build(map, self);
    }

    public CreateShorturlRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateShorturlRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateShorturlRequest setSmartTemplateId(String smartTemplateId) {
        this.smartTemplateId = smartTemplateId;
        return this;
    }
    public String getSmartTemplateId() {
        return this.smartTemplateId;
    }

    public CreateShorturlRequest setSmsSigns(java.util.List<String> smsSigns) {
        this.smsSigns = smsSigns;
        return this;
    }
    public java.util.List<String> getSmsSigns() {
        return this.smsSigns;
    }

    public CreateShorturlRequest setShowTimes(Long showTimes) {
        this.showTimes = showTimes;
        return this;
    }
    public Long getShowTimes() {
        return this.showTimes;
    }

    public CreateShorturlRequest setAimCodeType(String aimCodeType) {
        this.aimCodeType = aimCodeType;
        return this;
    }
    public String getAimCodeType() {
        return this.aimCodeType;
    }

    public CreateShorturlRequest setExpireTime(Long expireTime) {
        this.expireTime = expireTime;
        return this;
    }
    public Long getExpireTime() {
        return this.expireTime;
    }

    public CreateShorturlRequest setCustBatchId(String custBatchId) {
        this.custBatchId = custBatchId;
        return this;
    }
    public String getCustBatchId() {
        return this.custBatchId;
    }

    public CreateShorturlRequest setParamList(java.util.List<SmartTemplateDyncParam> paramList) {
        this.paramList = paramList;
        return this;
    }
    public java.util.List<SmartTemplateDyncParam> getParamList() {
        return this.paramList;
    }

    public CreateShorturlRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
