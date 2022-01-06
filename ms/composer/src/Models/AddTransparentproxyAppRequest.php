<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MS\Models;

use AlibabaCloud\Tea\Model;

class AddTransparentproxyAppRequest extends Model
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

    // 应用名称
    /**
     * @var string
     */
    public $appName;

    // 租户实例 ID
    /**
     * @var string
     */
    public $instanceId;

    // 包含的节点
    /**
     * @var string
     */
    public $nodes;

    // 支持的协议
    /**
     * @var string
     */
    public $supportProtocols;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'appName'           => 'app_name',
        'instanceId'        => 'instance_id',
        'nodes'             => 'nodes',
        'supportProtocols'  => 'support_protocols',
    ];

    public function validate()
    {
        Model::validateRequired('appName', $this->appName, true);
        Model::validateRequired('instanceId', $this->instanceId, true);
        Model::validateRequired('supportProtocols', $this->supportProtocols, true);
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
        if (null !== $this->appName) {
            $res['app_name'] = $this->appName;
        }
        if (null !== $this->instanceId) {
            $res['instance_id'] = $this->instanceId;
        }
        if (null !== $this->nodes) {
            $res['nodes'] = $this->nodes;
        }
        if (null !== $this->supportProtocols) {
            $res['support_protocols'] = $this->supportProtocols;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return AddTransparentproxyAppRequest
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
        if (isset($map['app_name'])) {
            $model->appName = $map['app_name'];
        }
        if (isset($map['instance_id'])) {
            $model->instanceId = $map['instance_id'];
        }
        if (isset($map['nodes'])) {
            $model->nodes = $map['nodes'];
        }
        if (isset($map['support_protocols'])) {
            $model->supportProtocols = $map['support_protocols'];
        }

        return $model;
    }
}
