// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class BclContractFlowInfo extends TeaModel {
    // 合同主题
    // 注：名称不支持以下9个字符：/ \ : * " < > | ？
    // 仅当使用合同服务时必填
    @NameInMap("business_scene")
    @Validation(maxLength = 32)
    public String businessScene;

    // 流程中的签署文件信息
    // 本期只支持一个文件
    // 仅当使用合同服务时必填
    @NameInMap("file_info")
    public java.util.List<BclContractFileInfo> fileInfo;

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
