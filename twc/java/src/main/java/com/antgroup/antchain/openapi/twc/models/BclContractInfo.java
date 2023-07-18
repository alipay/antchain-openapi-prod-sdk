// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class BclContractInfo extends TeaModel {
    // 待签署,SIGNING
    // 拒签,REJECT
    // 签署失败,SIGN_FAIL
    // 签署完成,FINISH
    @NameInMap("sign_status")
    @Validation(required = true)
    public String signStatus;

    // 签署完成的合同文件 只有签署完成才有
    @NameInMap("signed_files")
    public java.util.List<BclFileInfo> signedFiles;

    // 签署链接，使用租赁宝代扣并且发起订单后才可以查询获取
    @NameInMap("sign_url")
    public String signUrl;

    // 签署场景
    @NameInMap("business_scene")
    public String businessScene;

    // 合同创建失败原因
    @NameInMap("flow_err_msg")
    public String flowErrMsg;

    // 签署区列表
    @NameInMap("sign_field_infos")
    public java.util.List<BclContractSignFieldInfo> signFieldInfos;

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

}
