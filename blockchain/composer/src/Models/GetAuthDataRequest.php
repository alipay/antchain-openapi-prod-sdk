<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class GetAuthDataRequest extends Model
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

    // 调用方在发起授权请求时创建的请求id
    /**
     * @var string
     */
    public $authId;

    // 授权数据类型
    /**
     * @var string
     */
    public $dataType;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'authId'            => 'auth_id',
        'dataType'          => 'data_type',
    ];

    public function validate()
    {
        Model::validateRequired('authId', $this->authId, true);
        Model::validateRequired('dataType', $this->dataType, true);
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
        if (null !== $this->authId) {
            $res['auth_id'] = $this->authId;
        }
        if (null !== $this->dataType) {
            $res['data_type'] = $this->dataType;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return GetAuthDataRequest
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
        if (isset($map['auth_id'])) {
            $model->authId = $map['auth_id'];
        }
        if (isset($map['data_type'])) {
            $model->dataType = $map['data_type'];
        }

        return $model;
    }
}
