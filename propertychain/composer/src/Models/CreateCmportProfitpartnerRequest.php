<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\PROPERTYCHAIN\Models;

use AlibabaCloud\Tea\Model;

class CreateCmportProfitpartnerRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    /**
     * @var string
     */
    public $productInstanceId;

    // 企业编号
    /**
     * @var string
     */
    public $companyNo;

    // 企业名称
    /**
     * @var string
     */
    public $companyName;

    // 组织类别
    /**
     * @var string
     */
    public $organizationCategory;

    // 角色编号对应组织信息
    // 组织对应角色编码：
    // 风险承担方：RISK_TAKER
    // 货物监管方：CARGO_SUPERVISION
    // 资金推荐方：CAPITAL_RECOMMEND
    // 融资推荐方：FUNDER_RECOMMEND
    // 运营管理方：MANAGEMENT
    // 技术支持方：TECHNICAL
    /**
     * @var RoleOrganization[]
     */
    public $roleOrganizationList;
    protected $_name = [
        'authToken'            => 'auth_token',
        'productInstanceId'    => 'product_instance_id',
        'companyNo'            => 'company_no',
        'companyName'          => 'company_name',
        'organizationCategory' => 'organization_category',
        'roleOrganizationList' => 'role_organization_list',
    ];

    public function validate()
    {
        Model::validateRequired('companyNo', $this->companyNo, true);
        Model::validateRequired('companyName', $this->companyName, true);
        Model::validateRequired('organizationCategory', $this->organizationCategory, true);
        Model::validateRequired('roleOrganizationList', $this->roleOrganizationList, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->companyNo) {
            $res['company_no'] = $this->companyNo;
        }
        if (null !== $this->companyName) {
            $res['company_name'] = $this->companyName;
        }
        if (null !== $this->organizationCategory) {
            $res['organization_category'] = $this->organizationCategory;
        }
        if (null !== $this->roleOrganizationList) {
            $res['role_organization_list'] = [];
            if (null !== $this->roleOrganizationList && \is_array($this->roleOrganizationList)) {
                $n = 0;
                foreach ($this->roleOrganizationList as $item) {
                    $res['role_organization_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateCmportProfitpartnerRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['product_instance_id'])) {
            $model->productInstanceId = $map['product_instance_id'];
        }
        if (isset($map['company_no'])) {
            $model->companyNo = $map['company_no'];
        }
        if (isset($map['company_name'])) {
            $model->companyName = $map['company_name'];
        }
        if (isset($map['organization_category'])) {
            $model->organizationCategory = $map['organization_category'];
        }
        if (isset($map['role_organization_list'])) {
            if (!empty($map['role_organization_list'])) {
                $model->roleOrganizationList = [];
                $n                           = 0;
                foreach ($map['role_organization_list'] as $item) {
                    $model->roleOrganizationList[$n++] = null !== $item ? RoleOrganization::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
