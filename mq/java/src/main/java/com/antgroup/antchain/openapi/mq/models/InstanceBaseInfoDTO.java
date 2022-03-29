// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mq.models;

import com.aliyun.tea.*;

public class InstanceBaseInfoDTO extends TeaModel {
    // 各个协议的接入点
    @NameInMap("endpoints")
    @Validation(required = true)
    public EndpointsDTO endpoints;

    // 实例是否有命名空间。取值说明如下：
    // 
    // true：拥有独立命名空间，资源命名确保实例内唯一，跨实例之间可重名
    // false：无独立命名空间，实例内或者跨实例之间，资源命名必须全局唯一
    @NameInMap("independent_naming")
    @Validation(required = true)
    public Boolean independentNaming;

    //  实例 ID
    @NameInMap("instance_id")
    @Validation(required = true)
    public String instanceId;

    // 实例名称
    @NameInMap("instance_name")
    @Validation(required = true)
    public String instanceName;

    // 实例状态。取值说明如下：
    // 
    // 0：铂金版实例部署中
    // 2：后付费实例已欠费
    // 5：后付费实例或铂金版实例服务中
    // 7：铂金版实例升级中且服务可用
    @NameInMap("instance_status")
    @Validation(required = true)
    public Long instanceStatus;

    // 实例类型。取值说明如下：
    // 
    // 1：后付费实例
    // 2：铂金版实例
    @NameInMap("instance_type")
    public Long instanceType;

    // 铂金版实例过期时间
    // 
    // 
    @NameInMap("release_time")
    public Long releaseTime;

    // 备注
    @NameInMap("remark")
    @Validation(required = true)
    public String remark;

    public static InstanceBaseInfoDTO build(java.util.Map<String, ?> map) throws Exception {
        InstanceBaseInfoDTO self = new InstanceBaseInfoDTO();
        return TeaModel.build(map, self);
    }

    public InstanceBaseInfoDTO setEndpoints(EndpointsDTO endpoints) {
        this.endpoints = endpoints;
        return this;
    }
    public EndpointsDTO getEndpoints() {
        return this.endpoints;
    }

    public InstanceBaseInfoDTO setIndependentNaming(Boolean independentNaming) {
        this.independentNaming = independentNaming;
        return this;
    }
    public Boolean getIndependentNaming() {
        return this.independentNaming;
    }

    public InstanceBaseInfoDTO setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public InstanceBaseInfoDTO setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

    public InstanceBaseInfoDTO setInstanceStatus(Long instanceStatus) {
        this.instanceStatus = instanceStatus;
        return this;
    }
    public Long getInstanceStatus() {
        return this.instanceStatus;
    }

    public InstanceBaseInfoDTO setInstanceType(Long instanceType) {
        this.instanceType = instanceType;
        return this;
    }
    public Long getInstanceType() {
        return this.instanceType;
    }

    public InstanceBaseInfoDTO setReleaseTime(Long releaseTime) {
        this.releaseTime = releaseTime;
        return this;
    }
    public Long getReleaseTime() {
        return this.releaseTime;
    }

    public InstanceBaseInfoDTO setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

}
