// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class BclContractFlowInfo extends TeaModel {
    // 合同主题
    // 注：名称不支持以下9个字符：/ \ : * " < > | ？
    // 仅当使用合同服务时必填
    /**
     * <strong>example:</strong>
     * <p>主题信息</p>
     */
    @NameInMap("business_scene")
    @Validation(maxLength = 32)
    public String businessScene;

    // 流程中的签署文件信息
    // 本期只支持一个文件
    // 仅当使用合同服务时必填
    @NameInMap("file_info")
    public java.util.List<BclContractFileInfo> fileInfo;

    // 签署失败时的跳转地址
    // 如果不做单独配置，默认与redirect_url一致
    /**
     * <strong>example:</strong>
     * <p><a href="http://www.xxx.com">http://www.xxx.com</a></p>
     */
    @NameInMap("redirect_url_on_failure")
    @Validation(maxLength = 512)
    public String redirectUrlOnFailure;

    // 流程结束后的默认重定向地址
    // 默认签署完成停在当前页面
    /**
     * <strong>example:</strong>
     * <p><a href="http://www.xxx.com">http://www.xxx.com</a></p>
     */
    @NameInMap("redirect_url")
    @Validation(maxLength = 512)
    public String redirectUrl;

    // 签署平台，ALIPAY（支付宝小程序）或H5，默认H5
    /**
     * <strong>example:</strong>
     * <p>ALIPAY</p>
     */
    @NameInMap("sign_platform")
    public String signPlatform;

    // 收款方的ID，调用创建收款方接口获得
    /**
     * <strong>example:</strong>
     * <p>202308181123XXX</p>
     */
    @NameInMap("payee_id")
    public String payeeId;

    // 签署模式:
    // 模板签署:TEMPLATE_SIGN,使用同模板流程创建合同信息；
    // 原文签署:ORIGINAL_SIGN，使用原来的流程创建合同信息;
    // 未传值即为(原文签署:ORIGINAL_SIGN)
    /**
     * <strong>example:</strong>
     * <p>TEMPLATE_SIGN</p>
     */
    @NameInMap("sign_mode")
    public String signMode;

    public static BclContractFlowInfo build(java.util.Map<String, ?> map) throws Exception {
        BclContractFlowInfo self = new BclContractFlowInfo();
        return TeaModel.build(map, self);
    }

    public BclContractFlowInfo setBusinessScene(String businessScene) {
        this.businessScene = businessScene;
        return this;
    }
    public String getBusinessScene() {
        return this.businessScene;
    }

    public BclContractFlowInfo setFileInfo(java.util.List<BclContractFileInfo> fileInfo) {
        this.fileInfo = fileInfo;
        return this;
    }
    public java.util.List<BclContractFileInfo> getFileInfo() {
        return this.fileInfo;
    }

    public BclContractFlowInfo setRedirectUrlOnFailure(String redirectUrlOnFailure) {
        this.redirectUrlOnFailure = redirectUrlOnFailure;
        return this;
    }
    public String getRedirectUrlOnFailure() {
        return this.redirectUrlOnFailure;
    }

    public BclContractFlowInfo setRedirectUrl(String redirectUrl) {
        this.redirectUrl = redirectUrl;
        return this;
    }
    public String getRedirectUrl() {
        return this.redirectUrl;
    }

    public BclContractFlowInfo setSignPlatform(String signPlatform) {
        this.signPlatform = signPlatform;
        return this;
    }
    public String getSignPlatform() {
        return this.signPlatform;
    }

    public BclContractFlowInfo setPayeeId(String payeeId) {
        this.payeeId = payeeId;
        return this;
    }
    public String getPayeeId() {
        return this.payeeId;
    }

    public BclContractFlowInfo setSignMode(String signMode) {
        this.signMode = signMode;
        return this;
    }
    public String getSignMode() {
        return this.signMode;
    }

}
