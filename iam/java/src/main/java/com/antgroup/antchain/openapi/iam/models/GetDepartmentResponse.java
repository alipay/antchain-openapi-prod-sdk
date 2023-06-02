// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.iam.models;

import com.aliyun.tea.*;

public class GetDepartmentResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 部门唯一代码
    @NameInMap("code")
    public String code;

    // 部门名称
    @NameInMap("name")
    public String name;

    // 部门描述信息
    @NameInMap("description")
    public String description;

    // 父部门 code
    @NameInMap("parent_code")
    public String parentCode;

    // 企业 id
    @NameInMap("customer_id")
    public String customerId;

    // 是否为叶子结点
    @NameInMap("is_leaf")
    public Boolean isLeaf;

    // 创建时间，ISO8601格式
    @NameInMap("creation_time")
    public String creationTime;

    // 更新时间，ISO8601格式
    @NameInMap("update_time")
    public String updateTime;

    public static GetDepartmentResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDepartmentResponse self = new GetDepartmentResponse();
        return TeaModel.build(map, self);
    }

    public GetDepartmentResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public GetDepartmentResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetDepartmentResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public GetDepartmentResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetDepartmentResponse setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public GetDepartmentResponse setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public GetDepartmentResponse setParentCode(String parentCode) {
        this.parentCode = parentCode;
        return this;
    }
    public String getParentCode() {
        return this.parentCode;
    }

    public GetDepartmentResponse setCustomerId(String customerId) {
        this.customerId = customerId;
        return this;
    }
    public String getCustomerId() {
        return this.customerId;
    }

    public GetDepartmentResponse setIsLeaf(Boolean isLeaf) {
        this.isLeaf = isLeaf;
        return this;
    }
    public Boolean getIsLeaf() {
        return this.isLeaf;
    }

    public GetDepartmentResponse setCreationTime(String creationTime) {
        this.creationTime = creationTime;
        return this;
    }
    public String getCreationTime() {
        return this.creationTime;
    }

    public GetDepartmentResponse setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }
    public String getUpdateTime() {
        return this.updateTime;
    }

}
