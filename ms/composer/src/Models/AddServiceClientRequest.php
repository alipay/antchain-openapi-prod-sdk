<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MS\Models;

use AlibabaCloud\Tea\Model;

class AddServiceClientRequest extends Model
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

    // middleware instance id
    /**
     * @var string
     */
    public $instanceId;

    // 服务器 IP 列表，多个 IP 间以英文逗号分隔
    /**
     * @var string
     */
    public $serverIps;

    // Client operation type: (logout)
    /**
     * @var string
     */
    public $operationType;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'instanceId'        => 'instance_id',
        'serverIps'         => 'server_ips',
        'operationType'     => 'operation_type',
    ];

    public function validate()
    {
        Model::validateRequired('instanceId', $this->instanceId, true);
        Model::validateRequired('serverIps', $this->serverIps, true);
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
        if (null !== $this->instanceId) {
            $res['instance_id'] = $this->instanceId;
        }
        if (null !== $this->serverIps) {
            $res['server_ips'] = $this->serverIps;
        }
        if (null !== $this->operationType) {
            $res['operation_type'] = $this->operationType;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return AddServiceClientRequest
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
        if (isset($map['instance_id'])) {
            $model->instanceId = $map['instance_id'];
        }
        if (isset($map['server_ips'])) {
            $model->serverIps = $map['server_ips'];
        }
        if (isset($map['operation_type'])) {
            $model->operationType = $map['operation_type'];
        }

        return $model;
    }
}
