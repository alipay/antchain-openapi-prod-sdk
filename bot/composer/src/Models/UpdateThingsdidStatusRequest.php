<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class UpdateThingsdidStatusRequest extends Model
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

    // 交易唯一ID
    /**
     * @var string
     */
    public $nonce;

    // 状态取如下状态，注册设备身份，默认处于STATUS_REGISTERED，
    // 要更新为STATUS_COMMAND_STOP的设备必须处于STATUS_COMMAND_START，
    // 更新为STATUS_COMMAND_UNREGISTER后，无法更新为其他状态。
    // STATUS_COMMAND_UNREGISTER(注销),
    // STATUS_COMMAND_START(启用),
    // STATUS_COMMAND_STOP(),
    // STATUS_REGISTERED(3),
    /**
     * @var string
     */
    public $status;

    // 需要更新的实体did
    /**
     * @var string
     */
    public $thingDid;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'nonce'             => 'nonce',
        'status'            => 'status',
        'thingDid'          => 'thing_did',
    ];

    public function validate()
    {
        Model::validateRequired('nonce', $this->nonce, true);
        Model::validateRequired('status', $this->status, true);
        Model::validateRequired('thingDid', $this->thingDid, true);
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
        if (null !== $this->nonce) {
            $res['nonce'] = $this->nonce;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->thingDid) {
            $res['thing_did'] = $this->thingDid;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return UpdateThingsdidStatusRequest
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
        if (isset($map['nonce'])) {
            $model->nonce = $map['nonce'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }
        if (isset($map['thing_did'])) {
            $model->thingDid = $map['thing_did'];
        }

        return $model;
    }
}
