<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\SAAS\Models;

use AlibabaCloud\Tea\Model;

class CallbackAbilityRequest extends Model
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

    // api名称集合
    /**
     * @var string[]
     */
    public $apiNames;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'apiNames'          => 'api_names',
    ];

    public function validate()
    {
        Model::validateRequired('apiNames', $this->apiNames, true);
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
        if (null !== $this->apiNames) {
            $res['api_names'] = $this->apiNames;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CallbackAbilityRequest
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
        if (isset($map['api_names'])) {
            if (!empty($map['api_names'])) {
                $model->apiNames = $map['api_names'];
            }
        }

        return $model;
    }
}
