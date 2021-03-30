<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\PROPERTYCHAIN\Models;

use AlibabaCloud\Tea\Model;

class RoleRatio extends Model
{
    // 角色编号
    // 角色编号类型
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

    // 分润比例，保留两位小数的百分比
    /**
     * @example 99.99
     *
     * @var string
     */
    public $ratio;
    protected $_name = [
        'roleCode' => 'role_code',
        'ratio'    => 'ratio',
    ];

    public function validate()
    {
        Model::validateRequired('roleCode', $this->roleCode, true);
        Model::validateRequired('ratio', $this->ratio, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->roleCode) {
            $res['role_code'] = $this->roleCode;
        }
        if (null !== $this->ratio) {
            $res['ratio'] = $this->ratio;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return RoleRatio
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['role_code'])) {
            $model->roleCode = $map['role_code'];
        }
        if (isset($map['ratio'])) {
            $model->ratio = $map['ratio'];
        }

        return $model;
    }
}
