<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_68b3ee3230284cddaa19740dcaf251d8\Models;

use AlibabaCloud\Tea\Model;

class BindAntchainSaasAbilityRequest extends Model
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

    // api名称
    /**
     * @var string
     */
    public $apiName;

    // 能力id列表
    /**
     * @var string[]
     */
    public $abilityIds;

    // 操作人的域账号
    /**
     * @var string
     */
    public $operatorId;

    // api信息
    /**
     * @var ApiInfoModel
     */
    public $apiInfoModel;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'apiName'           => 'api_name',
        'abilityIds'        => 'ability_ids',
        'operatorId'        => 'operator_id',
        'apiInfoModel'      => 'api_info_model',
    ];

    public function validate()
    {
        Model::validateRequired('apiName', $this->apiName, true);
        Model::validateRequired('abilityIds', $this->abilityIds, true);
        Model::validateRequired('operatorId', $this->operatorId, true);
        Model::validateRequired('apiInfoModel', $this->apiInfoModel, true);
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
        if (null !== $this->apiName) {
            $res['api_name'] = $this->apiName;
        }
        if (null !== $this->abilityIds) {
            $res['ability_ids'] = $this->abilityIds;
        }
        if (null !== $this->operatorId) {
            $res['operator_id'] = $this->operatorId;
        }
        if (null !== $this->apiInfoModel) {
            $res['api_info_model'] = null !== $this->apiInfoModel ? $this->apiInfoModel->toMap() : null;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return BindAntchainSaasAbilityRequest
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
        if (isset($map['api_name'])) {
            $model->apiName = $map['api_name'];
        }
        if (isset($map['ability_ids'])) {
            if (!empty($map['ability_ids'])) {
                $model->abilityIds = $map['ability_ids'];
            }
        }
        if (isset($map['operator_id'])) {
            $model->operatorId = $map['operator_id'];
        }
        if (isset($map['api_info_model'])) {
            $model->apiInfoModel = ApiInfoModel::fromMap($map['api_info_model']);
        }

        return $model;
    }
}
