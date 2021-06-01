// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class ContractSignFieldSealId extends TeaModel {
    // 文件file id
    @NameInMap("file_id")
    public String fileId;

    // 流程id
    @NameInMap("flow_id")
    public String flowId;

    // 印章id
    @NameInMap("seal_id")
    public String sealId;

    // 印章类型，支持多种类型时逗号分割，0-手绘印章，1-模版印章，为空不限制
    @NameInMap("seal_type")
    public String sealType;

    // 签署区Id
    @NameInMap("signfield_id")
    public String signfieldId;

    public static ContractSignFieldSealId build(java.util.Map<String, ?> map) throws Exception {
        ContractSignFieldSealId self = new ContractSignFieldSealId();
        return TeaModel.build(map, self);
    }

    public ContractSignFieldSealId setFileId(String fileId) {
        this.fileId = fileId;
        return this;
    }
    public String getFileId() {
        return this.fileId;
    }

    public ContractSignFieldSealId setFlowId(String flowId) {
        this.flowId = flowId;
        return this;
    }
    public String getFlowId() {
        return this.flowId;
    }

    public ContractSignFieldSealId setSealId(String sealId) {
        this.sealId = sealId;
        return this;
    }
    public String getSealId() {
        return this.sealId;
    }

    public ContractSignFieldSealId setSealType(String sealType) {
        this.sealType = sealType;
        return this;
    }
    public String getSealType() {
        return this.sealType;
    }

    public ContractSignFieldSealId setSignfieldId(String signfieldId) {
        this.signfieldId = signfieldId;
        return this;
    }
    public String getSignfieldId() {
        return this.signfieldId;
    }

}
