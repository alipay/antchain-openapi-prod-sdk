<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class UpdateThingsdidDevicespaceRequest extends Model
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

    // 参考结构体定义
    /**
     * @var UpdateDeviceSpaceReq
     */
    public $updateDeviceSpaceReq;

    // 交易唯一ID
    /**
     * @var string
     */
    public $nonce;
    protected $_name = [
        'authToken'            => 'auth_token',
        'productInstanceId'    => 'product_instance_id',
        'updateDeviceSpaceReq' => 'update_device_space_req',
        'nonce'                => 'nonce',
    ];

    public function validate()
    {
        Model::validateRequired('updateDeviceSpaceReq', $this->updateDeviceSpaceReq, true);
        Model::validateRequired('nonce', $this->nonce, true);
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
        if (null !== $this->updateDeviceSpaceReq) {
            $res['update_device_space_req'] = null !== $this->updateDeviceSpaceReq ? $this->updateDeviceSpaceReq->toMap() : null;
        }
        if (null !== $this->nonce) {
            $res['nonce'] = $this->nonce;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return UpdateThingsdidDevicespaceRequest
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
        if (isset($map['update_device_space_req'])) {
            $model->updateDeviceSpaceReq = UpdateDeviceSpaceReq::fromMap($map['update_device_space_req']);
        }
        if (isset($map['nonce'])) {
            $model->nonce = $map['nonce'];
        }

        return $model;
    }
}
