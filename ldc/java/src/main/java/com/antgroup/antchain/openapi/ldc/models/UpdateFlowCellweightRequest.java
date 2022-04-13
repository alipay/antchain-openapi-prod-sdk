// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class UpdateFlowCellweightRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 部署单元组
    @NameInMap("cell_group")
    @Validation(required = true)
    public String cellGroup;

    // 操作人
    @NameInMap("operator")
    @Validation(required = true)
    public String operator;

    // 是否压测流量，默认 false
    @NameInMap("press")
    public Boolean press;

    // 部署单元权重信息
    @NameInMap("weight_info_list")
    @Validation(required = true)
    public CellWeightInfoList weightInfoList;

    // 工作空间组
    @NameInMap("workspace_group")
    @Validation(required = true)
    public String workspaceGroup;

    public static UpdateFlowCellweightRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateFlowCellweightRequest self = new UpdateFlowCellweightRequest();
        return TeaModel.build(map, self);
    }

    public UpdateFlowCellweightRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UpdateFlowCellweightRequest setCellGroup(String cellGroup) {
        this.cellGroup = cellGroup;
        return this;
    }
    public String getCellGroup() {
        return this.cellGroup;
    }

    public UpdateFlowCellweightRequest setOperator(String operator) {
        this.operator = operator;
        return this;
    }
    public String getOperator() {
        return this.operator;
    }

    public UpdateFlowCellweightRequest setPress(Boolean press) {
        this.press = press;
        return this;
    }
    public Boolean getPress() {
        return this.press;
    }

    public UpdateFlowCellweightRequest setWeightInfoList(CellWeightInfoList weightInfoList) {
        this.weightInfoList = weightInfoList;
        return this;
    }
    public CellWeightInfoList getWeightInfoList() {
        return this.weightInfoList;
    }

    public UpdateFlowCellweightRequest setWorkspaceGroup(String workspaceGroup) {
        this.workspaceGroup = workspaceGroup;
        return this;
    }
    public String getWorkspaceGroup() {
        return this.workspaceGroup;
    }

}
