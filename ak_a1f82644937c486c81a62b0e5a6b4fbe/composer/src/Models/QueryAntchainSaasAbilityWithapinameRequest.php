<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_a1f82644937c486c81a62b0e5a6b4fbe\Models;

use AlibabaCloud\Tea\Model;

class QueryAntchainSaasAbilityWithapinameRequest extends Model
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

    // api名称列表
    /**
     * @var string[]
     */
    public $apiNameList;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'apiNameList'       => 'api_name_list',
    ];

    public function validate()
    {
        Model::validateRequired('apiNameList', $this->apiNameList, true);
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
        if (null !== $this->apiNameList) {
            $res['api_name_list'] = $this->apiNameList;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryAntchainSaasAbilityWithapinameRequest
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
        if (isset($map['api_name_list'])) {
            if (!empty($map['api_name_list'])) {
                $model->apiNameList = $map['api_name_list'];
            }
        }

        return $model;
    }
}
