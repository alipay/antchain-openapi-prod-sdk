// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class ContractSignFlowConfig extends TeaModel {
    // 回调通知地址 ,默认取项目配置通知地址
    /**
     * <strong>example:</strong>
     * <p><a href="http://127.0.0.1:9110/notice">http://127.0.0.1:9110/notice</a></p>
     */
    @NameInMap("notice_developer_url")
    public String noticeDeveloperUrl;

    // 签署通知和审批通知的通知方式，传 "" 表示不需要通知，传"1"表示短信通知。短信功能需要联系售后开白名单才会生效。
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("notice_type")
    @Validation(required = true)
    public String noticeType;

    // 签署成功或者流程结束后的默认重定向地址，默认签署完成停在当前页面
    /**
     * <strong>example:</strong>
     * <p><a href="http://127.0.0.1:8110/h5/forword">http://127.0.0.1:8110/h5/forword</a></p>
     */
    @NameInMap("redirect_url")
    public String redirectUrl;

    // 【该字段已废弃】签署平台，逗号分割，1-开放服务h5，2-支付宝签 ，默认值1
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("sign_platform")
    public String signPlatform;

    // 签署失败时的跳转地址，如果不做单独配置，默认与redirect_url一致（配合twc.notary.contract.signflow.create接口使用）
    /**
     * <strong>example:</strong>
     * <p><a href="http://127.0.0.1:8110/h5/forword/failure">http://127.0.0.1:8110/h5/forword/failure</a></p>
     */
    @NameInMap("redirect_url_on_failure")
    public String redirectUrlOnFailure;

    // 是否允许自由签署，默认false（配合twc.notary.contract.signflow.create接口使用）
    /**
     * <strong>example:</strong>
     * <p>true, false</p>
     */
    @NameInMap("free_signature")
    public Boolean freeSignature;

    public static ContractSignFlowConfig build(java.util.Map<String, ?> map) throws Exception {
        ContractSignFlowConfig self = new ContractSignFlowConfig();
        return TeaModel.build(map, self);
    }

    public ContractSignFlowConfig setNoticeDeveloperUrl(String noticeDeveloperUrl) {
        this.noticeDeveloperUrl = noticeDeveloperUrl;
        return this;
    }
    public String getNoticeDeveloperUrl() {
        return this.noticeDeveloperUrl;
    }

    public ContractSignFlowConfig setNoticeType(String noticeType) {
        this.noticeType = noticeType;
        return this;
    }
    public String getNoticeType() {
        return this.noticeType;
    }

    public ContractSignFlowConfig setRedirectUrl(String redirectUrl) {
        this.redirectUrl = redirectUrl;
        return this;
    }
    public String getRedirectUrl() {
        return this.redirectUrl;
    }

    public ContractSignFlowConfig setSignPlatform(String signPlatform) {
        this.signPlatform = signPlatform;
        return this;
    }
    public String getSignPlatform() {
        return this.signPlatform;
    }

    public ContractSignFlowConfig setRedirectUrlOnFailure(String redirectUrlOnFailure) {
        this.redirectUrlOnFailure = redirectUrlOnFailure;
        return this;
    }
    public String getRedirectUrlOnFailure() {
        return this.redirectUrlOnFailure;
    }

    public ContractSignFlowConfig setFreeSignature(Boolean freeSignature) {
        this.freeSignature = freeSignature;
        return this;
    }
    public Boolean getFreeSignature() {
        return this.freeSignature;
    }

}
