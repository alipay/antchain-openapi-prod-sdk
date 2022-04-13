// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class GrayReleaseConfig extends TeaModel {
    // 加到流量上的灰度标签
    @NameInMap("gray_label")
    @Validation(required = true)
    public String grayLabel;

    // 提供南北流量网关服务的类型
    @NameInMap("provider")
    @Validation(required = true)
    public String provider;

    // 给流量添加灰度label的策略，可选byWeight或者byRule
    // 在byWeight模式下，会按照用户指定的比例，给进入的流量加上灰度标签
    // 在byRule模式下，会按照用户指定的规则（条件），给进入的流量加上灰度标签。
    @NameInMap("label_apply_policy")
    @Validation(required = true)
    public String labelApplyPolicy;

    // 给进入的流量添加灰度label的比例，仅当label_apply_policy为byWeight时生效
    @NameInMap("weight")
    public Long weight;

    // 给进入的流量添加灰度label的规则，仅当label_apply_policy为byRule时生效
    @NameInMap("rule")
    public GrayLabelApplyRule rule;

    // 在各部署单元期望部署的pod个数，若应用服务当前不部署在其中的部署单元，则该不会在该部署单元上为应用进行部署
    @NameInMap("scale_replicas")
    public java.util.List<ReplicaCount> scaleReplicas;

    public static GrayReleaseConfig build(java.util.Map<String, ?> map) throws Exception {
        GrayReleaseConfig self = new GrayReleaseConfig();
        return TeaModel.build(map, self);
    }

    public GrayReleaseConfig setGrayLabel(String grayLabel) {
        this.grayLabel = grayLabel;
        return this;
    }
    public String getGrayLabel() {
        return this.grayLabel;
    }

    public GrayReleaseConfig setProvider(String provider) {
        this.provider = provider;
        return this;
    }
    public String getProvider() {
        return this.provider;
    }

    public GrayReleaseConfig setLabelApplyPolicy(String labelApplyPolicy) {
        this.labelApplyPolicy = labelApplyPolicy;
        return this;
    }
    public String getLabelApplyPolicy() {
        return this.labelApplyPolicy;
    }

    public GrayReleaseConfig setWeight(Long weight) {
        this.weight = weight;
        return this;
    }
    public Long getWeight() {
        return this.weight;
    }

    public GrayReleaseConfig setRule(GrayLabelApplyRule rule) {
        this.rule = rule;
        return this;
    }
    public GrayLabelApplyRule getRule() {
        return this.rule;
    }

    public GrayReleaseConfig setScaleReplicas(java.util.List<ReplicaCount> scaleReplicas) {
        this.scaleReplicas = scaleReplicas;
        return this;
    }
    public java.util.List<ReplicaCount> getScaleReplicas() {
        return this.scaleReplicas;
    }

}
