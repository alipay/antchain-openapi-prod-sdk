<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class CreateDistributedeviceBychainperipheralidRequest extends Model
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

    // 链上外围设备Id
    //
    /**
     * @var string
     */
    public $chainPeripheralId;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'chainPeripheralId' => 'chain_peripheral_id',
    ];

    public function validate()
    {
        Model::validateRequired('chainPeripheralId', $this->chainPeripheralId, true);
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
        if (null !== $this->chainPeripheralId) {
            $res['chain_peripheral_id'] = $this->chainPeripheralId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateDistributedeviceBychainperipheralidRequest
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
        if (isset($map['chain_peripheral_id'])) {
            $model->chainPeripheralId = $map['chain_peripheral_id'];
        }

        return $model;
    }
}
