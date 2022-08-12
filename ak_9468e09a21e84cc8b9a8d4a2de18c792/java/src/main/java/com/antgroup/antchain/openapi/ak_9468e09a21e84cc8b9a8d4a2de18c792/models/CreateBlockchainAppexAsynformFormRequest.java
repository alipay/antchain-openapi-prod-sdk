// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_9468e09a21e84cc8b9a8d4a2de18c792.models;

import com.aliyun.tea.*;

public class CreateBlockchainAppexAsynformFormRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 上链账户
    @NameInMap("user_did")
    @Validation(required = true)
    public String userDid;

    // 联盟ID
    // 
    @NameInMap("union_id")
    @Validation(required = true)
    public Long unionId;

    // Channel名称
    // 
    @NameInMap("channel_name")
    @Validation(required = true)
    public String channelName;

    // 业务单据号
    // 
    @NameInMap("form_id")
    @Validation(required = true)
    public String formId;

    // 业务单据类型
    // 
    @NameInMap("form_type")
    @Validation(required = true)
    public String formType;

    // 原生单据json字符串
    @NameInMap("form_body")
    @Validation(required = true)
    public String formBody;

    // 用户自定义的图ID，开启图功能时传入
    // 
    @NameInMap("graph_id")
    public String graphId;

    // 用户自定义的LineNode名称
    // 
    @NameInMap("line_node")
    public String lineNode;

    // 业务数据关联键，一个业务流产生的表单用相同的traceId进行关联
    @NameInMap("trace_id")
    public String traceId;

    // 表单的直接上游节点formId
    // 
    @NameInMap("parent_form_id_list")
    public java.util.List<String> parentFormIdList;

    // 表单的直接下游节点formId
    // 
    @NameInMap("child_form_id_list")
    public java.util.List<String> childFormIdList;

    public static CreateBlockchainAppexAsynformFormRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateBlockchainAppexAsynformFormRequest self = new CreateBlockchainAppexAsynformFormRequest();
        return TeaModel.build(map, self);
    }

    public CreateBlockchainAppexAsynformFormRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateBlockchainAppexAsynformFormRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateBlockchainAppexAsynformFormRequest setUserDid(String userDid) {
        this.userDid = userDid;
        return this;
    }
    public String getUserDid() {
        return this.userDid;
    }

    public CreateBlockchainAppexAsynformFormRequest setUnionId(Long unionId) {
        this.unionId = unionId;
        return this;
    }
    public Long getUnionId() {
        return this.unionId;
    }

    public CreateBlockchainAppexAsynformFormRequest setChannelName(String channelName) {
        this.channelName = channelName;
        return this;
    }
    public String getChannelName() {
        return this.channelName;
    }

    public CreateBlockchainAppexAsynformFormRequest setFormId(String formId) {
        this.formId = formId;
        return this;
    }
    public String getFormId() {
        return this.formId;
    }

    public CreateBlockchainAppexAsynformFormRequest setFormType(String formType) {
        this.formType = formType;
        return this;
    }
    public String getFormType() {
        return this.formType;
    }

    public CreateBlockchainAppexAsynformFormRequest setFormBody(String formBody) {
        this.formBody = formBody;
        return this;
    }
    public String getFormBody() {
        return this.formBody;
    }

    public CreateBlockchainAppexAsynformFormRequest setGraphId(String graphId) {
        this.graphId = graphId;
        return this;
    }
    public String getGraphId() {
        return this.graphId;
    }

    public CreateBlockchainAppexAsynformFormRequest setLineNode(String lineNode) {
        this.lineNode = lineNode;
        return this;
    }
    public String getLineNode() {
        return this.lineNode;
    }

    public CreateBlockchainAppexAsynformFormRequest setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public CreateBlockchainAppexAsynformFormRequest setParentFormIdList(java.util.List<String> parentFormIdList) {
        this.parentFormIdList = parentFormIdList;
        return this;
    }
    public java.util.List<String> getParentFormIdList() {
        return this.parentFormIdList;
    }

    public CreateBlockchainAppexAsynformFormRequest setChildFormIdList(java.util.List<String> childFormIdList) {
        this.childFormIdList = childFormIdList;
        return this;
    }
    public java.util.List<String> getChildFormIdList() {
        return this.childFormIdList;
    }

}
