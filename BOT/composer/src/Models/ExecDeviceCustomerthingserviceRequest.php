<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class ExecDeviceCustomerthingserviceRequest extends Model
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

    // 设备sn
    /**
     * @var string
     */
    public $sn;

    // 设备厂商
    /**
     * @var string
     */
    public $corp;

    // 设备所属用户
    /**
     * @var string
     */
    public $user;

    // 服务调用标识符
    /**
     * @var string
     */
    public $serviceIdentifier;

    // 服务调用参数 key-value，json字符串
    /**
     * @var string
     */
    public $serviceArgs;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'sn'                => 'sn',
        'corp'              => 'corp',
        'user'              => 'user',
        'serviceIdentifier' => 'service_identifier',
        'serviceArgs'       => 'service_args',
    ];

    public function validate()
    {
        Model::validateRequired('sn', $this->sn, true);
        Model::validateRequired('corp', $this->corp, true);
        Model::validateRequired('user', $this->user, true);
        Model::validateRequired('serviceIdentifier', $this->serviceIdentifier, true);
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
        if (null !== $this->sn) {
            $res['sn'] = $this->sn;
        }
        if (null !== $this->corp) {
            $res['corp'] = $this->corp;
        }
        if (null !== $this->user) {
            $res['user'] = $this->user;
        }
        if (null !== $this->serviceIdentifier) {
            $res['service_identifier'] = $this->serviceIdentifier;
        }
        if (null !== $this->serviceArgs) {
            $res['service_args'] = $this->serviceArgs;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ExecDeviceCustomerthingserviceRequest
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
        if (isset($map['sn'])) {
            $model->sn = $map['sn'];
        }
        if (isset($map['corp'])) {
            $model->corp = $map['corp'];
        }
        if (isset($map['user'])) {
            $model->user = $map['user'];
        }
        if (isset($map['service_identifier'])) {
            $model->serviceIdentifier = $map['service_identifier'];
        }
        if (isset($map['service_args'])) {
            $model->serviceArgs = $map['service_args'];
        }

        return $model;
    }
}
