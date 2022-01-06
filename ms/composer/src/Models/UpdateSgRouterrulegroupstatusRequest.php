<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MS\Models;

use AlibabaCloud\Tea\Model;

class UpdateSgRouterrulegroupstatusRequest extends Model
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

    // 主键
    /**
     * @var int
     */
    public $id;

    // 租户实例id
    /**
     * @var string
     */
    public $instanceId;

    // 0关闭/1开启
    /**
     * @var int
     */
    public $enabled;

    // 版本号
    /**
     * @var int
     */
    public $dispatchVersion;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'id'                => 'id',
        'instanceId'        => 'instance_id',
        'enabled'           => 'enabled',
        'dispatchVersion'   => 'dispatch_version',
    ];

    public function validate()
    {
        Model::validateRequired('id', $this->id, true);
        Model::validateRequired('instanceId', $this->instanceId, true);
        Model::validateRequired('enabled', $this->enabled, true);
        Model::validateRequired('dispatchVersion', $this->dispatchVersion, true);
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
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->instanceId) {
            $res['instance_id'] = $this->instanceId;
        }
        if (null !== $this->enabled) {
            $res['enabled'] = $this->enabled;
        }
        if (null !== $this->dispatchVersion) {
            $res['dispatch_version'] = $this->dispatchVersion;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return UpdateSgRouterrulegroupstatusRequest
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
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }
        if (isset($map['instance_id'])) {
            $model->instanceId = $map['instance_id'];
        }
        if (isset($map['enabled'])) {
            $model->enabled = $map['enabled'];
        }
        if (isset($map['dispatch_version'])) {
            $model->dispatchVersion = $map['dispatch_version'];
        }

        return $model;
    }
}
