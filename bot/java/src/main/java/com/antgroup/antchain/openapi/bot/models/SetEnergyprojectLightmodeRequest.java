// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class SetEnergyprojectLightmodeRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 节能项目编码
    @NameInMap("energy_project_code")
    @Validation(required = true)
    public String energyProjectCode;

    // 照明项目编码
    @NameInMap("light_project_code")
    public String lightProjectCode;

    // 运行模式。workday：工作日模式；holiday：节假日模式
    @NameInMap("run_mode")
    @Validation(required = true)
    public String runMode;

    public static SetEnergyprojectLightmodeRequest build(java.util.Map<String, ?> map) throws Exception {
        SetEnergyprojectLightmodeRequest self = new SetEnergyprojectLightmodeRequest();
        return TeaModel.build(map, self);
    }

    public SetEnergyprojectLightmodeRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public SetEnergyprojectLightmodeRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public SetEnergyprojectLightmodeRequest setEnergyProjectCode(String energyProjectCode) {
        this.energyProjectCode = energyProjectCode;
        return this;
    }
    public String getEnergyProjectCode() {
        return this.energyProjectCode;
    }

    public SetEnergyprojectLightmodeRequest setLightProjectCode(String lightProjectCode) {
        this.lightProjectCode = lightProjectCode;
        return this;
    }
    public String getLightProjectCode() {
        return this.lightProjectCode;
    }

    public SetEnergyprojectLightmodeRequest setRunMode(String runMode) {
        this.runMode = runMode;
        return this;
    }
    public String getRunMode() {
        return this.runMode;
    }

}
