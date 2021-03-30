<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\PROPERTYCHAIN\Models;

use AlibabaCloud\Tea\Model;

class RoleOrganization extends Model
{
    // 企业编号
    /**
     * @example A001
     *
     * @var string
     */
    public $companyNo;

    // 企业名称
    /**
     * @example 金融科技
     *
     * @var string
     */
    public $companyName;

    // 角色编码
    // 角色编码类型
    // 风险承担方：RISK_TAKER
    // 货物监管方：CARGO_SUPERVISION
    // 资金推荐方：CAPITAL_RECOMMEND
    // 融资推荐方：FUNDER_RECOMMEND
    // 运营管理方：MANAGEMENT
    // 技术支持方：TECHNICAL
    /**
     * @example roleCode
     *
     * @var string
     */
    public $roleCode;
    protected $_name = [
        'companyNo'   => 'company_no',
        'companyName' => 'company_name',
        'roleCode'    => 'role_code',
    ];

    public function validate()
    {
        Model::validateRequired('companyNo', $this->companyNo, true);
        Model::validateRequired('companyName', $this->companyName, true);
        Model::validateRequired('roleCode', $this->roleCode, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->companyNo) {
            $res['company_no'] = $this->companyNo;
        }
        if (null !== $this->companyName) {
            $res['company_name'] = $this->companyName;
        }
        if (null !== $this->roleCode) {
            $res['role_code'] = $this->roleCode;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return RoleOrganization
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['company_no'])) {
            $model->companyNo = $map['company_no'];
        }
        if (isset($map['company_name'])) {
            $model->companyName = $map['company_name'];
        }
        if (isset($map['role_code'])) {
            $model->roleCode = $map['role_code'];
        }

        return $model;
    }
}
