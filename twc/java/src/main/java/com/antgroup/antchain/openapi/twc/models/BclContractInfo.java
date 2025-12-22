// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class BclContractInfo extends TeaModel {
    // 签署状态
    // 1.合同待签署：SIGNING 
    // 2.代扣待签署：PROXY_SIGNING 
    // 3.合同拒签：REJECT 
    // 4.代扣拒签：PROXY_REJECT 
    // 5.合同签署失败：SIGN_FAIL 
    // 6.签署完成：FINISH
    /**
     * <strong>example:</strong>
     * <p>SIGNING</p>
     */
    @NameInMap("sign_status")
    @Validation(required = true)
    public String signStatus;

    // 签署完成的合同文件
    // 如果使用合同服务，只有签署完成才可获取
    @NameInMap("signed_files")
    public java.util.List<BclFileInfo> signedFiles;

    // 签署链接，使用租赁宝代扣并且发起订单后才可以查询获取
    /**
     * <strong>example:</strong>
     * <p><a href="https://xxxx">https://xxxx</a></p>
     */
    @NameInMap("sign_url")
    public String signUrl;

    // 签署场景
    /**
     * <strong>example:</strong>
     * <p>签署场景</p>
     */
    @NameInMap("business_scene")
    public String businessScene;

    // 合同创建失败原因
    /**
     * <strong>example:</strong>
     * <p>合同创建失败原因</p>
     */
    @NameInMap("flow_err_msg")
    public String flowErrMsg;

    // 签署区列表
    @NameInMap("sign_field_infos")
    public java.util.List<BclContractSignFieldInfo> signFieldInfos;

    // 签署长链接，使用租赁宝代扣并且发起订单后才可以查询获取
    /**
     * <strong>example:</strong>
     * <p><a href="http://www.xxx.com">http://www.xxx.com</a></p>
     */
    @NameInMap("dest_url")
    public String destUrl;

    // 签署模式：
    // 模板签署:TEMPLATE_SIGN,使用同模板流程创建合同信息；
    // 原文签署:ORIGINAL_SIGN，使用原来的流程创建合同信息
    /**
     * <strong>example:</strong>
     * <p>TEMPLATE_SIGN</p>
     */
    @NameInMap("sign_mode")
    public String signMode;

    public static BclContractInfo build(java.util.Map<String, ?> map) throws Exception {
        BclContractInfo self = new BclContractInfo();
        return TeaModel.build(map, self);
    }

    public BclContractInfo setSignStatus(String signStatus) {
        this.signStatus = signStatus;
        return this;
    }
    public String getSignStatus() {
        return this.signStatus;
    }

    public BclContractInfo setSignedFiles(java.util.List<BclFileInfo> signedFiles) {
        this.signedFiles = signedFiles;
        return this;
    }
    public java.util.List<BclFileInfo> getSignedFiles() {
        return this.signedFiles;
    }

    public BclContractInfo setSignUrl(String signUrl) {
        this.signUrl = signUrl;
        return this;
    }
    public String getSignUrl() {
        return this.signUrl;
    }

    public BclContractInfo setBusinessScene(String businessScene) {
        this.businessScene = businessScene;
        return this;
    }
    public String getBusinessScene() {
        return this.businessScene;
    }

    public BclContractInfo setFlowErrMsg(String flowErrMsg) {
        this.flowErrMsg = flowErrMsg;
        return this;
    }
    public String getFlowErrMsg() {
        return this.flowErrMsg;
    }

    public BclContractInfo setSignFieldInfos(java.util.List<BclContractSignFieldInfo> signFieldInfos) {
        this.signFieldInfos = signFieldInfos;
        return this;
    }
    public java.util.List<BclContractSignFieldInfo> getSignFieldInfos() {
        return this.signFieldInfos;
    }

    public BclContractInfo setDestUrl(String destUrl) {
        this.destUrl = destUrl;
        return this;
    }
    public String getDestUrl() {
        return this.destUrl;
    }

    public BclContractInfo setSignMode(String signMode) {
        this.signMode = signMode;
        return this;
    }
    public String getSignMode() {
        return this.signMode;
    }

}
