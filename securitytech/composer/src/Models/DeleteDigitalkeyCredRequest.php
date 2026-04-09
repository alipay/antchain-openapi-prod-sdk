<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\SECURITYTECH\Models;

use AlibabaCloud\Tea\Model;

class DeleteDigitalkeyCredRequest extends Model
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

    // 客户id
    /**
     * @var string
     */
    public $secretId;

    // 中控id，不能和deviceSn同时为空
    /**
     * @var string
     */
    public $tuid;

    // 设备sn 不能和tuid同时为空
    /**
     * @var string
     */
    public $deviceSn;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'secretId'          => 'secret_id',
        'tuid'              => 'tuid',
        'deviceSn'          => 'device_sn',
    ];

    public function validate()
    {
        Model::validateRequired('secretId', $this->secretId, true);
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
        if (null !== $this->secretId) {
            $res['secret_id'] = $this->secretId;
        }
        if (null !== $this->tuid) {
            $res['tuid'] = $this->tuid;
        }
        if (null !== $this->deviceSn) {
            $res['device_sn'] = $this->deviceSn;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return DeleteDigitalkeyCredRequest
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
        if (isset($map['secret_id'])) {
            $model->secretId = $map['secret_id'];
        }
        if (isset($map['tuid'])) {
            $model->tuid = $map['tuid'];
        }
        if (isset($map['device_sn'])) {
            $model->deviceSn = $map['device_sn'];
        }

        return $model;
    }
}
