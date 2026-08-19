<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\STLR\Models;

use AlibabaCloud\Tea\Model;

class OrganizationUnitTree extends Model {
    protected $_name = [
        'organizationNo' => 'organization_no',
        'organizationName' => 'organization_name',
        'parentOrganizationNoList' => 'parent_organization_no_list',
        'parentOrganizationName' => 'parent_organization_name',
        'gmtModified' => 'gmt_modified',
        'children' => 'children',
    ];
    public function validate() {
        Model::validateRequired('organizationNo', $this->organizationNo, true);
        Model::validateRequired('organizationName', $this->organizationName, true);
        Model::validateRequired('gmtModified', $this->gmtModified, true);
        Model::validateRequired('children', $this->children, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->organizationNo) {
            $res['organization_no'] = $this->organizationNo;
        }
        if (null !== $this->organizationName) {
            $res['organization_name'] = $this->organizationName;
        }
        if (null !== $this->parentOrganizationNoList) {
            $res['parent_organization_no_list'] = $this->parentOrganizationNoList;
        }
        if (null !== $this->parentOrganizationName) {
            $res['parent_organization_name'] = $this->parentOrganizationName;
        }
        if (null !== $this->gmtModified) {
            $res['gmt_modified'] = $this->gmtModified;
        }
        if (null !== $this->children) {
            $res['children'] = $this->children;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return OrganizationUnitTree
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['organization_no'])){
            $model->organizationNo = $map['organization_no'];
        }
        if(isset($map['organization_name'])){
            $model->organizationName = $map['organization_name'];
        }
        if(isset($map['parent_organization_no_list'])){
            if(!empty($map['parent_organization_no_list'])){
                $model->parentOrganizationNoList = $map['parent_organization_no_list'];
            }
        }
        if(isset($map['parent_organization_name'])){
            $model->parentOrganizationName = $map['parent_organization_name'];
        }
        if(isset($map['gmt_modified'])){
            $model->gmtModified = $map['gmt_modified'];
        }
        if(isset($map['children'])){
            if(!empty($map['children'])){
                $model->children = $map['children'];
            }
        }
        return $model;
    }
    // 组织单元编码
    /**
     * @example xxxxx
     * @var string
     */
    public $organizationNo;

    // 组织单元名称
    /**
     * @example xxxxxx
     * @var string
     */
    public $organizationName;

    // 从根到直接父级的组织编码链；根节点为空
    /**
     * @example [xxx,xxx]
     * @var string[]
     */
    public $parentOrganizationNoList;

    // 直接父级组织名称；根节点为空
    /**
     * @example xxxxxx
     * @var string
     */
    public $parentOrganizationName;

    // 最后更新时间
    /**
     * @example xxxxxx
     * @var string
     */
    public $gmtModified;

    // 重复结构体
    /**
     * @example [{}]
     * @var string[]
     */
    public $children;

}
