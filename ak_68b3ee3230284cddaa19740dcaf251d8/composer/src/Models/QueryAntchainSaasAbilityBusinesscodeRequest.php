<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_68b3ee3230284cddaa19740dcaf251d8\Models;

use AlibabaCloud\Tea\Model;

class QueryAntchainSaasAbilityBusinesscodeRequest extends Model
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

    // 能力id
    /**
     * @var string
     */
    public $abilityId;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'abilityId'         => 'ability_id',
    ];

    public function validate()
    {
        Model::validateRequired('abilityId', $this->abilityId, true);
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
        if (null !== $this->abilityId) {
            $res['ability_id'] = $this->abilityId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryAntchainSaasAbilityBusinesscodeRequest
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
        if (isset($map['ability_id'])) {
            $model->abilityId = $map['ability_id'];
        }

        return $model;
    }
}
