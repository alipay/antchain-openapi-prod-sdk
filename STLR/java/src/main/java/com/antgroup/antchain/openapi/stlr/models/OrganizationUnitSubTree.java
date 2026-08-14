// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.stlr.models;

import com.aliyun.tea.*;

public class OrganizationUnitSubTree extends TeaModel {
    // 组织单元编码。
    /**
     * <strong>example:</strong>
     * <p>xxxxxx</p>
     */
    @NameInMap("organization_no")
    @Validation(required = true)
    public String organizationNo;

    // 组织单元名称。
    /**
     * <strong>example:</strong>
     * <p>xxxxxx</p>
     */
    @NameInMap("organization_name")
    @Validation(required = true)
    public String organizationName;

    // 从根到直接父级的组织编码链；根节点为空。
    /**
     * <strong>example:</strong>
     * <p>[xxx,xxx]</p>
     */
    @NameInMap("parent_organization_no_list")
    public java.util.List<String> parentOrganizationNoList;

    // 直接父级组织名称；根节点为空。
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
    public String children;

    public static OrganizationUnitSubTree build(java.util.Map<String, ?> map) throws Exception {
        OrganizationUnitSubTree self = new OrganizationUnitSubTree();
        return TeaModel.build(map, self);
    }

    public OrganizationUnitSubTree setOrganizationNo(String organizationNo) {
        this.organizationNo = organizationNo;
        return this;
    }
    public String getOrganizationNo() {
        return this.organizationNo;
    }

    public OrganizationUnitSubTree setOrganizationName(String organizationName) {
        this.organizationName = organizationName;
        return this;
    }
    public String getOrganizationName() {
        return this.organizationName;
    }

    public OrganizationUnitSubTree setParentOrganizationNoList(java.util.List<String> parentOrganizationNoList) {
        this.parentOrganizationNoList = parentOrganizationNoList;
        return this;
    }
    public java.util.List<String> getParentOrganizationNoList() {
        return this.parentOrganizationNoList;
    }

    public OrganizationUnitSubTree setParentOrganizationName(String parentOrganizationName) {
        this.parentOrganizationName = parentOrganizationName;
        return this;
    }
    public String getParentOrganizationName() {
        return this.parentOrganizationName;
    }

    public OrganizationUnitSubTree setGmtModified(String gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public String getGmtModified() {
        return this.gmtModified;
    }

    public OrganizationUnitSubTree setChildren(String children) {
        this.children = children;
        return this;
    }
    public String getChildren() {
        return this.children;
    }

}
