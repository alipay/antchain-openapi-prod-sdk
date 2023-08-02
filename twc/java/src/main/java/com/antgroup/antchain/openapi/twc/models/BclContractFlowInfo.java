// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class BclContractFlowInfo extends TeaModel {
    // 合同主题
    // 注：名称不支持以下9个字符：/ \ : * " < > | ？
    @NameInMap("business_scene")
    @Validation(required = true, maxLength = 32)
    public String businessScene;

    // 流程中的签署文件信息，只支持一个文件
    @NameInMap("file_info")
    @Validation(required = true)
    public java.util.List<BclContractFileInfo> fileInfo;

    // 签署平台，ALIPAY（支付宝小程序）或H5，默认H5
    @NameInMap("sign_platform")
    @Validation(maxLength = 8)
    public String signPlatform;

    // 收款方的ID，调用创建收款方接口获得
    @NameInMap("payee_id")
    @Validation(required = true, maxLength = 32)
    public String payeeId;

    // 合同签署失败回调地址
    @NameInMap("redirect_url_on_failure")
    @Validation(maxLength = 512)
    public String redirectUrlOnFailure;

    // 合同签署成功回调地址
    @NameInMap("redirect_url")
    @Validation(maxLength = 512)
    public String redirectUrl;

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

}
