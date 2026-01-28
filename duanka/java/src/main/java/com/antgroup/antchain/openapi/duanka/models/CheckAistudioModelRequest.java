// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.duanka.models;

import com.aliyun.tea.*;

public class CheckAistudioModelRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 业务唯一码（可填model_id）
    @NameInMap("biz_code")
    @Validation(required = true)
    public String bizCode;

    // 业务类型（TDI平台填TDI）
    @NameInMap("biz_type")
    @Validation(required = true)
    public String bizType;

    // 模型类型（1：离线模型，2：在线模型，3：既是离线也是在线）
    @NameInMap("model_type")
    @Validation(required = true)
    public Long modelType;

    // 所需要验收服务的list
    // 1. PRESSURE
    // 2. RUNTIMUE
    // 3. SAFETY
    @NameInMap("service_selector")
    @Validation(required = true)
    public String serviceSelector;

    // 离线模型oss路径
    @NameInMap("offline_model_path")
    public String offlineModelPath;

    // 在线模型oss路径
    @NameInMap("online_model_path")
    public String onlineModelPath;

    // 模型脚本oss路径
    @NameInMap("script_path")
    @Validation(required = true)
    public String scriptPath;

    // 验证样本（csv格式，包括保留列、特征列和分数）的OSS路径
    @NameInMap("sample_path")
    @Validation(required = true)
    public String samplePath;

    // 验证样本保留列的list
    @NameInMap("remain_list")
    @Validation(required = true)
    public String remainList;

    // 验证样本特征列的list
    @NameInMap("feature_list")
    @Validation(required = true)
    public String featureList;

    // 验证样本分数列
    @NameInMap("score_col")
    @Validation(required = true)
    public String scoreCol;

    // aistudio docker镜像指定，若未指定，则默认为
    // reg.docker.alibaba-inc.com/aii/aistudio:aistudio-108521006-1633157052-1690290565806
    @NameInMap("docker_image")
    public String dockerImage;

    // 在线模型压测核数，默认为1
    @NameInMap("pm_core")
    public Long pmCore;

    // 在线模型压测内存大小（GB），默认为2
    @NameInMap("pm_mem")
    public Long pmMem;

    // 离线模型批次大小，默认2000
    @NameInMap("batch_size")
    public Long batchSize;

    // 验证所用样本数，默认50000
    @NameInMap("verification_num")
    public Long verificationNum;

    public static CheckAistudioModelRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckAistudioModelRequest self = new CheckAistudioModelRequest();
        return TeaModel.build(map, self);
    }

    public CheckAistudioModelRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CheckAistudioModelRequest setBizCode(String bizCode) {
        this.bizCode = bizCode;
        return this;
    }
    public String getBizCode() {
        return this.bizCode;
    }

    public CheckAistudioModelRequest setBizType(String bizType) {
        this.bizType = bizType;
        return this;
    }
    public String getBizType() {
        return this.bizType;
    }

    public CheckAistudioModelRequest setModelType(Long modelType) {
        this.modelType = modelType;
        return this;
    }
    public Long getModelType() {
        return this.modelType;
    }

    public CheckAistudioModelRequest setServiceSelector(String serviceSelector) {
        this.serviceSelector = serviceSelector;
        return this;
    }
    public String getServiceSelector() {
        return this.serviceSelector;
    }

    public CheckAistudioModelRequest setOfflineModelPath(String offlineModelPath) {
        this.offlineModelPath = offlineModelPath;
        return this;
    }
    public String getOfflineModelPath() {
        return this.offlineModelPath;
    }

    public CheckAistudioModelRequest setOnlineModelPath(String onlineModelPath) {
        this.onlineModelPath = onlineModelPath;
        return this;
    }
    public String getOnlineModelPath() {
        return this.onlineModelPath;
    }

    public CheckAistudioModelRequest setScriptPath(String scriptPath) {
        this.scriptPath = scriptPath;
        return this;
    }
    public String getScriptPath() {
        return this.scriptPath;
    }

    public CheckAistudioModelRequest setSamplePath(String samplePath) {
        this.samplePath = samplePath;
        return this;
    }
    public String getSamplePath() {
        return this.samplePath;
    }

    public CheckAistudioModelRequest setRemainList(String remainList) {
        this.remainList = remainList;
        return this;
    }
    public String getRemainList() {
        return this.remainList;
    }

    public CheckAistudioModelRequest setFeatureList(String featureList) {
        this.featureList = featureList;
        return this;
    }
    public String getFeatureList() {
        return this.featureList;
    }

    public CheckAistudioModelRequest setScoreCol(String scoreCol) {
        this.scoreCol = scoreCol;
        return this;
    }
    public String getScoreCol() {
        return this.scoreCol;
    }

    public CheckAistudioModelRequest setDockerImage(String dockerImage) {
        this.dockerImage = dockerImage;
        return this;
    }
    public String getDockerImage() {
        return this.dockerImage;
    }

    public CheckAistudioModelRequest setPmCore(Long pmCore) {
        this.pmCore = pmCore;
        return this;
    }
    public Long getPmCore() {
        return this.pmCore;
    }

    public CheckAistudioModelRequest setPmMem(Long pmMem) {
        this.pmMem = pmMem;
        return this;
    }
    public Long getPmMem() {
        return this.pmMem;
    }

    public CheckAistudioModelRequest setBatchSize(Long batchSize) {
        this.batchSize = batchSize;
        return this;
    }
    public Long getBatchSize() {
        return this.batchSize;
    }

    public CheckAistudioModelRequest setVerificationNum(Long verificationNum) {
        this.verificationNum = verificationNum;
        return this;
    }
    public Long getVerificationNum() {
        return this.verificationNum;
    }

}
