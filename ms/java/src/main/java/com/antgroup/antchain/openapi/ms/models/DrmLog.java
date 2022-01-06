// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ms.models;

import com.aliyun.tea.*;

public class DrmLog extends TeaModel {
    // 触发推送客户端IP
    @NameInMap("client_ip")
    public String clientIp;

    // 资源标识
    @NameInMap("data_id")
    public String dataId;

    // 推送失败目标
    @NameInMap("fail_target")
    public String failTarget;

    // 创建时间
    @NameInMap("gmt_create")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String gmtCreate;

    // 修改时间
    @NameInMap("gmt_modified")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String gmtModified;

    // id
    @NameInMap("id")
    public Long id;

    // 实例ID
    @NameInMap("instance_id")
    public String instanceId;

    // 操作者
    @NameInMap("operator")
    public String operator;

    // 推送类型
    @NameInMap("push_mode")
    public String pushMode;

    // 推送结果
    @NameInMap("result")
    public String result;

    // 来源应用
    @NameInMap("source_app")
    public String sourceApp;

    // 目标
    @NameInMap("target")
    public String target;

    // 推送值
    @NameInMap("value")
    public String value;

    public static DrmLog build(java.util.Map<String, ?> map) throws Exception {
        DrmLog self = new DrmLog();
        return TeaModel.build(map, self);
    }

    public DrmLog setClientIp(String clientIp) {
        this.clientIp = clientIp;
        return this;
    }
    public String getClientIp() {
        return this.clientIp;
    }

    public DrmLog setDataId(String dataId) {
        this.dataId = dataId;
        return this;
    }
    public String getDataId() {
        return this.dataId;
    }

    public DrmLog setFailTarget(String failTarget) {
        this.failTarget = failTarget;
        return this;
    }
    public String getFailTarget() {
        return this.failTarget;
    }

    public DrmLog setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    public DrmLog setGmtModified(String gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public String getGmtModified() {
        return this.gmtModified;
    }

    public DrmLog setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public DrmLog setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DrmLog setOperator(String operator) {
        this.operator = operator;
        return this;
    }
    public String getOperator() {
        return this.operator;
    }

    public DrmLog setPushMode(String pushMode) {
        this.pushMode = pushMode;
        return this;
    }
    public String getPushMode() {
        return this.pushMode;
    }

    public DrmLog setResult(String result) {
        this.result = result;
        return this;
    }
    public String getResult() {
        return this.result;
    }

    public DrmLog setSourceApp(String sourceApp) {
        this.sourceApp = sourceApp;
        return this;
    }
    public String getSourceApp() {
        return this.sourceApp;
    }

    public DrmLog setTarget(String target) {
        this.target = target;
        return this;
    }
    public String getTarget() {
        return this.target;
    }

    public DrmLog setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

}
