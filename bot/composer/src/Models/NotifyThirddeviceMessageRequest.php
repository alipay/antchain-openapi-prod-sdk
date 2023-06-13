<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class NotifyThirddeviceMessageRequest extends Model
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

    // 设备did
    /**
     * @var string
     */
    public $deviceDid;

    // 设备信息同步命令
    /**
     * @var string
     */
    public $command;

    // 设备签名，用设备pri_key 进行签名，只对deviceDid加签
    /**
     * @var string
     */
    public $signature;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'deviceDid'         => 'device_did',
        'command'           => 'command',
        'signature'         => 'signature',
    ];

    public function validate()
    {
        Model::validateRequired('deviceDid', $this->deviceDid, true);
        Model::validateRequired('command', $this->command, true);
        Model::validateRequired('signature', $this->signature, true);
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
        if (null !== $this->deviceDid) {
            $res['device_did'] = $this->deviceDid;
        }
        if (null !== $this->command) {
            $res['command'] = $this->command;
        }
        if (null !== $this->signature) {
            $res['signature'] = $this->signature;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return NotifyThirddeviceMessageRequest
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
        if (isset($map['device_did'])) {
            $model->deviceDid = $map['device_did'];
        }
        if (isset($map['command'])) {
            $model->command = $map['command'];
        }
        if (isset($map['signature'])) {
            $model->signature = $map['signature'];
        }

        return $model;
    }
}
