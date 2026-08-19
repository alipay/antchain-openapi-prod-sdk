// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.stlr.models;

import com.aliyun.tea.*;

public class OrganizationUnitTree extends TeaModel {
    // 组织单元编码
    /**
     * <strong>example:</strong>
     * <p>xxxxx</p>
     */
    @NameInMap("organization_no")
    @Validation(required = true)
    public String organizationNo;

    // 组织单元名称
    /**
     * <strong>example:</strong>
     * <p>xxxxxx</p>
     */
    @NameInMap("organization_name")
    @Validation(required = true)
    public String organizationName;

    // 从根到直接父级的组织编码链；根节点为空
    /**
     * <strong>example:</strong>
     * <p>[xxx,xxx]</p>
     */
    @NameInMap("parent_organization_no_list")
    public java.util.List<String> parentOrganizationNoList;

    // 直接父级组织名称；根节点为空
    /**
     * <strong>example:</strong>
     * <p>xxxxxx</p>
     */
    @NameInMap("parent_organization_name")
    public String parentOrganizationName;

    // 最后更新时间
    /**
     * <strong>example:</strong>
     * <p>xxxxxx</p>
     */
    @NameInMap("gmt_modified")
    @Validation(required = true)
    public String gmtModified;

    // 重复结构体
    /**
     * <strong>example:</strong>
     * <p>[{}]</p>
     */
    @NameInMap("children")
    @Validation(required = true)
    public java.util.List<String> children;

    public static OrganizationUnitTree build(java.util.Map<String, ?> map) throws Exception {
        OrganizationUnitTree self = new OrganizationUnitTree();
        return TeaModel.build(map, self);
    }

    public OrganizationUnitTree setOrganizationNo(String organizationNo) {
        this.organizationNo = organizationNo;
        return this;
    }
    public String getOrganizationNo() {
        return this.organizationNo;
    }

    public OrganizationUnitTree setOrganizationName(String organizationName) {
        this.organizationName = organizationName;
        return this;
    }
    public String getOrganizationName() {
        return this.organizationName;
    }

    public OrganizationUnitTree setParentOrganizationNoList(java.util.List<String> parentOrganizationNoList) {
        this.parentOrganizationNoList = parentOrganizationNoList;
        return this;
    }
    public java.util.List<String> getParentOrganizationNoList() {
        return this.parentOrganizationNoList;
    }

    public OrganizationUnitTree setParentOrganizationName(String parentOrganizationName) {
        this.parentOrganizationName = parentOrganizationName;
        return this;
    }
    public String getParentOrganizationName() {
        return this.parentOrganizationName;
    }

    public OrganizationUnitTree setGmtModified(String gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public String getGmtModified() {
        return this.gmtModified;
    }

    public OrganizationUnitTree setChildren(java.util.List<String> children) {
        this.children = children;
        return this;
    }
    public java.util.List<String> getChildren() {
        return this.children;
    }

}
