// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.stlr.models;

import com.aliyun.tea.*;

public class QueryEsgOrganizationunittreeResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 组织单元编码
    @NameInMap("organization_no")
    public String organizationNo;

    // 组织单元名称
    @NameInMap("organization_name")
    public String organizationName;

    // 从根到直接父级的组织编码链
    @NameInMap("parent_organization_no_list")
    public java.util.List<String> parentOrganizationNoList;

    // 直接父级组织名称；根节点为空
    @NameInMap("parent_organization_name")
    public String parentOrganizationName;

    // 最后更新时间
    @NameInMap("gmt_modified")
    public String gmtModified;

    // 重复结构体
    @NameInMap("children")
    public java.util.List<OrganizationUnitTree> children;

    public static QueryEsgOrganizationunittreeResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryEsgOrganizationunittreeResponse self = new QueryEsgOrganizationunittreeResponse();
        return TeaModel.build(map, self);
    }

    public QueryEsgOrganizationunittreeResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryEsgOrganizationunittreeResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryEsgOrganizationunittreeResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryEsgOrganizationunittreeResponse setOrganizationNo(String organizationNo) {
        this.organizationNo = organizationNo;
        return this;
    }
    public String getOrganizationNo() {
        return this.organizationNo;
    }

    public QueryEsgOrganizationunittreeResponse setOrganizationName(String organizationName) {
        this.organizationName = organizationName;
        return this;
    }
    public String getOrganizationName() {
        return this.organizationName;
    }

    public QueryEsgOrganizationunittreeResponse setParentOrganizationNoList(java.util.List<String> parentOrganizationNoList) {
        this.parentOrganizationNoList = parentOrganizationNoList;
        return this;
    }
    public java.util.List<String> getParentOrganizationNoList() {
        return this.parentOrganizationNoList;
    }

    public QueryEsgOrganizationunittreeResponse setParentOrganizationName(String parentOrganizationName) {
        this.parentOrganizationName = parentOrganizationName;
        return this;
    }
    public String getParentOrganizationName() {
        return this.parentOrganizationName;
    }

    public QueryEsgOrganizationunittreeResponse setGmtModified(String gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public String getGmtModified() {
        return this.gmtModified;
    }

    public QueryEsgOrganizationunittreeResponse setChildren(java.util.List<OrganizationUnitTree> children) {
        this.children = children;
        return this;
    }
    public java.util.List<OrganizationUnitTree> getChildren() {
        return this.children;
    }

}
