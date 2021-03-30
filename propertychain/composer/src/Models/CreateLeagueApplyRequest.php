<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\PROPERTYCHAIN\Models;

use AlibabaCloud\Tea\Model;

class CreateLeagueApplyRequest extends Model
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

    // 联盟描述
    /**
     * @var string
     */
    public $leagueDesc;

    // 联盟名称
    /**
     * @var string
     */
    public $leagueName;

    // 费率
    /**
     * @var int
     */
    public $rate;

    // 角色类型【NONE 无，MEMBER 存货方，CUSTODIAN 保管方，LENDER 资金方，OPERATOR 运营方，WARRANTY 担保方 ALL 所有】
    /**
     * @var string
     */
    public $roleType;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'leagueDesc'        => 'league_desc',
        'leagueName'        => 'league_name',
        'rate'              => 'rate',
        'roleType'          => 'role_type',
    ];

    public function validate()
    {
        Model::validateRequired('leagueName', $this->leagueName, true);
        Model::validateRequired('roleType', $this->roleType, true);
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
        if (null !== $this->leagueDesc) {
            $res['league_desc'] = $this->leagueDesc;
        }
        if (null !== $this->leagueName) {
            $res['league_name'] = $this->leagueName;
        }
        if (null !== $this->rate) {
            $res['rate'] = $this->rate;
        }
        if (null !== $this->roleType) {
            $res['role_type'] = $this->roleType;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateLeagueApplyRequest
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
        if (isset($map['league_desc'])) {
            $model->leagueDesc = $map['league_desc'];
        }
        if (isset($map['league_name'])) {
            $model->leagueName = $map['league_name'];
        }
        if (isset($map['rate'])) {
            $model->rate = $map['rate'];
        }
        if (isset($map['role_type'])) {
            $model->roleType = $map['role_type'];
        }

        return $model;
    }
}
