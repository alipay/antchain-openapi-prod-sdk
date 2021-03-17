// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class ContractSignFlowConfig extends TeaModel {
    // 回调通知地址 ,默认取项目配置通知地址
    @NameInMap("notice_developer_url")
    public String noticeDeveloperUrl;

    // 通知方式，逗号分割，1-短信，2-邮件 。默认值1，请务必请选择一个通知方式，否则客户将接收不到流程的签署通知和审批通知，如果流程需要审批，将导致审批无法完成；如果客户需要不通知，可以设置notice_type为""
    @NameInMap("notice_type")
    @Validation(required = true)
    public String noticeType;

    // 签署成功或者流程结束后的默认重定向地址，默认签署完成停在当前页面
    @NameInMap("redirect_url")
    public String redirectUrl;

    // 签署平台，逗号分割，1-开放服务h5，2-支付宝签 ，默认值1
    @NameInMap("sign_platform")
    public String signPlatform;

    // 签署失败时的跳转地址，如果不做单独配置，默认与redirect_url一致（配合twc.notary.contract.signflow.create接口使用）
    @NameInMap("redirect_url_on_failure")
    public String redirectUrlOnFailure;

    // 是否允许自由签署，默认false（配合twc.notary.contract.signflow.create接口使用）
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
