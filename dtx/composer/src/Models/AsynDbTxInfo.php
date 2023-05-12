<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\DTX\Models;

use AlibabaCloud\Tea\Model;

class AsynDbTxInfo extends Model
{
    // action_mode
    /**
     * @example
     *
     * @var int
     */
    public $actionMode;

    // activity_mode
    /**
     * @example
     *
     * @var int
     */
    public $activityMode;

    // app_name
    /**
     * @example app_name
     *
     * @var string
     */
    public $appName;

    // biz_type
    /**
     * @example biz_type
     *
     * @var string
     */
    public $bizType;

    // desc
    /**
     * @example desc
     *
     * @var string
     */
    public $desc;

    // instance_id
    /**
     * @example instance_id
     *
     * @var string
     */
    public $instanceId;

    // role
    /**
     * @example
     *
     * @var int
     */
    public $role;

    // split_rule
    /**
     * @example
     *
     * @var SplitRule
     */
    public $splitRule;
    protected $_name = [
        'actionMode'   => 'action_mode',
        'activityMode' => 'activity_mode',
        'appName'      => 'app_name',
        'bizType'      => 'biz_type',
        'desc'         => 'desc',
        'instanceId'   => 'instance_id',
        'role'         => 'role',
        'splitRule'    => 'split_rule',
    ];

    public function validate()
    {
        Model::validateRequired('activityMode', $this->activityMode, true);
        Model::validateRequired('appName', $this->appName, true);
        Model::validateRequired('bizType', $this->bizType, true);
        Model::validateRequired('instanceId', $this->instanceId, true);
        Model::validateRequired('role', $this->role, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->actionMode) {
            $res['action_mode'] = $this->actionMode;
        }
        if (null !== $this->activityMode) {
            $res['activity_mode'] = $this->activityMode;
        }
        if (null !== $this->appName) {
            $res['app_name'] = $this->appName;
        }
        if (null !== $this->bizType) {
            $res['biz_type'] = $this->bizType;
        }
        if (null !== $this->desc) {
            $res['desc'] = $this->desc;
        }
        if (null !== $this->instanceId) {
            $res['instance_id'] = $this->instanceId;
        }
        if (null !== $this->role) {
            $res['role'] = $this->role;
        }
        if (null !== $this->splitRule) {
            $res['split_rule'] = null !== $this->splitRule ? $this->splitRule->toMap() : null;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return AsynDbTxInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['action_mode'])) {
            $model->actionMode = $map['action_mode'];
        }
        if (isset($map['activity_mode'])) {
            $model->activityMode = $map['activity_mode'];
        }
        if (isset($map['app_name'])) {
            $model->appName = $map['app_name'];
        }
        if (isset($map['biz_type'])) {
            $model->bizType = $map['biz_type'];
        }
        if (isset($map['desc'])) {
            $model->desc = $map['desc'];
        }
        if (isset($map['instance_id'])) {
            $model->instanceId = $map['instance_id'];
        }
        if (isset($map['role'])) {
            $model->role = $map['role'];
        }
        if (isset($map['split_rule'])) {
            $model->splitRule = SplitRule::fromMap($map['split_rule']);
        }

        return $model;
    }
}
