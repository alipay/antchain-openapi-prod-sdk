<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class StartVcVcrepoControlleradduserRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 集群ID
    /**
     * @var string
     */
    public $productInstanceId;

    // controller did标示
    /**
     * @var string
     */
    public $controller;

    // 操作缩写
    /**
     * @var string
     */
    public $operation;

    // 实际参数
    /**
     * @var VcControllerAddUserRegisterPayload
     */
    public $payload;

    // controller使用私钥对参数进行签名
    /**
     * @var string
     */
    public $signature;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'controller'        => 'controller',
        'operation'         => 'operation',
        'payload'           => 'payload',
        'signature'         => 'signature',
    ];

    public function validate()
    {
        Model::validateRequired('controller', $this->controller, true);
        Model::validateRequired('operation', $this->operation, true);
        Model::validateRequired('payload', $this->payload, true);
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
        if (null !== $this->controller) {
            $res['controller'] = $this->controller;
        }
        if (null !== $this->operation) {
            $res['operation'] = $this->operation;
        }
        if (null !== $this->payload) {
            $res['payload'] = null !== $this->payload ? $this->payload->toMap() : null;
        }
        if (null !== $this->signature) {
            $res['signature'] = $this->signature;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return StartVcVcrepoControlleradduserRequest
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
        if (isset($map['controller'])) {
            $model->controller = $map['controller'];
        }
        if (isset($map['operation'])) {
            $model->operation = $map['operation'];
        }
        if (isset($map['payload'])) {
            $model->payload = VcControllerAddUserRegisterPayload::fromMap($map['payload']);
        }
        if (isset($map['signature'])) {
            $model->signature = $map['signature'];
        }

        return $model;
    }
}
