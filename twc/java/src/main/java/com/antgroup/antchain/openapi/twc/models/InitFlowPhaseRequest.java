// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class InitFlowPhaseRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 流程id，通过twc.notary.instance.create(创建存证流程实例)获取
    @NameInMap("flow_id")
    @Validation(required = true)
    public String flowId;

    // 阶段编号，与模板阶段编号保持一致，不同阶段阶段编号不一样，要与阶段存证内容保持一致
    @NameInMap("phase_no")
    @Validation(required = true)
    public Long phaseNo;

    // 阶段存证内容，如果模板数据类型定义是Hash(哈希)则填入Hash即可，如果定义是Structure(结构化)，则填入模板所有字段json对象的字符串Base64后的值
    @NameInMap("notary_content")
    @Validation(required = true)
    public String notaryContent;

    // 业务方原始数据ID，方便与业务方进行数据核对使用
    @NameInMap("origin_data_id")
    @Validation(required = true)
    public String originDataId;

    public static InitFlowPhaseRequest build(java.util.Map<String, ?> map) throws Exception {
        InitFlowPhaseRequest self = new InitFlowPhaseRequest();
        return TeaModel.build(map, self);
    }

    public InitFlowPhaseRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public InitFlowPhaseRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public InitFlowPhaseRequest setFlowId(String flowId) {
        this.flowId = flowId;
        return this;
    }
    public String getFlowId() {
        return this.flowId;
    }

    public InitFlowPhaseRequest setPhaseNo(Long phaseNo) {
        this.phaseNo = phaseNo;
        return this;
    }
    public Long getPhaseNo() {
        return this.phaseNo;
    }

    public InitFlowPhaseRequest setNotaryContent(String notaryContent) {
        this.notaryContent = notaryContent;
        return this;
    }
    public String getNotaryContent() {
        return this.notaryContent;
    }

    public InitFlowPhaseRequest setOriginDataId(String originDataId) {
        this.originDataId = originDataId;
        return this;
    }
    public String getOriginDataId() {
        return this.originDataId;
    }

}
