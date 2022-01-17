// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.apigateway.models;

import com.aliyun.tea.*;

public class SystemConfigVO extends TeaModel {
    // config_key
    @NameInMap("config_key")
    public String configKey;

    // config_value
    @NameInMap("config_value")
    public String configValue;

    // 描述
    @NameInMap("description")
    public String description;

    // gateway_list
    @NameInMap("gateway_list")
    public java.util.List<GateWayConfigVO> gatewayList;

    // 创建时间
    @NameInMap("gmt_create")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String gmtCreate;

    // 更改时间
    @NameInMap("gmt_modified")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String gmtModified;

    // instance_id
    @NameInMap("instance_id")
    public String instanceId;

    // 创建人
    @NameInMap("operator")
    public String operator;

    // switch_list
    @NameInMap("switch_list")
    public java.util.List<SwitchVO> switchList;

    public static SystemConfigVO build(java.util.Map<String, ?> map) throws Exception {
        SystemConfigVO self = new SystemConfigVO();
        return TeaModel.build(map, self);
    }

    public SystemConfigVO setConfigKey(String configKey) {
        this.configKey = configKey;
        return this;
    }
    public String getConfigKey() {
        return this.configKey;
    }

    public SystemConfigVO setConfigValue(String configValue) {
        this.configValue = configValue;
        return this;
    }
    public String getConfigValue() {
        return this.configValue;
    }

    public SystemConfigVO setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public SystemConfigVO setGatewayList(java.util.List<GateWayConfigVO> gatewayList) {
        this.gatewayList = gatewayList;
        return this;
    }
    public java.util.List<GateWayConfigVO> getGatewayList() {
        return this.gatewayList;
    }

    public SystemConfigVO setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    public SystemConfigVO setGmtModified(String gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public String getGmtModified() {
        return this.gmtModified;
    }

    public SystemConfigVO setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public SystemConfigVO setOperator(String operator) {
        this.operator = operator;
        return this;
    }
    public String getOperator() {
        return this.operator;
    }

    public SystemConfigVO setSwitchList(java.util.List<SwitchVO> switchList) {
        this.switchList = switchList;
        return this;
    }
    public java.util.List<SwitchVO> getSwitchList() {
        return this.switchList;
    }

}
