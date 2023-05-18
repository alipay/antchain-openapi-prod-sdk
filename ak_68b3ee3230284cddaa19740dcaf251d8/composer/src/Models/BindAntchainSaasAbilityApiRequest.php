<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_68b3ee3230284cddaa19740dcaf251d8\Models;

use AlibabaCloud\Tea\Model;

class BindAntchainSaasAbilityApiRequest extends Model
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

    // 共享能力id
    /**
     * @var string
     */
    public $abilityId;

    // qiujianglong.qjl
    /**
     * @var string
     */
    public $operatorId;

    // api模型集合
    /**
     * @var ApiInfoModel[]
     */
    public $apiInfoModels;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'abilityId'         => 'ability_id',
        'operatorId'        => 'operator_id',
        'apiInfoModels'     => 'api_info_models',
    ];

    public function validate()
    {
        Model::validateRequired('abilityId', $this->abilityId, true);
        Model::validateRequired('operatorId', $this->operatorId, true);
        Model::validateRequired('apiInfoModels', $this->apiInfoModels, true);
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
        if (null !== $this->operatorId) {
            $res['operator_id'] = $this->operatorId;
        }
        if (null !== $this->apiInfoModels) {
            $res['api_info_models'] = [];
            if (null !== $this->apiInfoModels && \is_array($this->apiInfoModels)) {
                $n = 0;
                foreach ($this->apiInfoModels as $item) {
                    $res['api_info_models'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return BindAntchainSaasAbilityApiRequest
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
        if (isset($map['operator_id'])) {
            $model->operatorId = $map['operator_id'];
        }
        if (isset($map['api_info_models'])) {
            if (!empty($map['api_info_models'])) {
                $model->apiInfoModels = [];
                $n                    = 0;
                foreach ($map['api_info_models'] as $item) {
                    $model->apiInfoModels[$n++] = null !== $item ? ApiInfoModel::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
