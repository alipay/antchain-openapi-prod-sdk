<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MS\Models;

use AlibabaCloud\Tea\Model;

class RollbackSgRouterrulesnapshotsRequest extends Model
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

    // ConfigSnapshotModel
    /**
     * @var string
     */
    public $configSnapshot;

    // RouterRuleGroupModel
    /**
     * @var string
     */
    public $routerRuleGroup;

    // 实例id
    /**
     * @var string
     */
    public $instanceId;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'configSnapshot'    => 'config_snapshot',
        'routerRuleGroup'   => 'router_rule_group',
        'instanceId'        => 'instance_id',
    ];

    public function validate()
    {
        Model::validateRequired('configSnapshot', $this->configSnapshot, true);
        Model::validateRequired('routerRuleGroup', $this->routerRuleGroup, true);
        Model::validateRequired('instanceId', $this->instanceId, true);
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
        if (null !== $this->configSnapshot) {
            $res['config_snapshot'] = $this->configSnapshot;
        }
        if (null !== $this->routerRuleGroup) {
            $res['router_rule_group'] = $this->routerRuleGroup;
        }
        if (null !== $this->instanceId) {
            $res['instance_id'] = $this->instanceId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return RollbackSgRouterrulesnapshotsRequest
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
        if (isset($map['config_snapshot'])) {
            $model->configSnapshot = $map['config_snapshot'];
        }
        if (isset($map['router_rule_group'])) {
            $model->routerRuleGroup = $map['router_rule_group'];
        }
        if (isset($map['instance_id'])) {
            $model->instanceId = $map['instance_id'];
        }

        return $model;
    }
}
