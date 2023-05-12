<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\DTX\Models;

use AlibabaCloud\Tea\Model;

class CreateAppsRequest extends Model
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

    // 1：同库模式，事务记录表在业务侧；
    // 2：异库模式。
    /**
     * @var int
     */
    public $activityMode;

    // 应用名
    /**
     * @var string
     */
    public $appName;

    // 应用描述
    /**
     * @var string
     */
    public $desc;

    // 环境唯一标识
    /**
     * @var string
     */
    public $instanceId;

    // 分库分表规则
    /**
     * @var SplitRule
     */
    public $splitRule;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'activityMode'      => 'activity_mode',
        'appName'           => 'app_name',
        'desc'              => 'desc',
        'instanceId'        => 'instance_id',
        'splitRule'         => 'split_rule',
    ];

    public function validate()
    {
        Model::validateRequired('activityMode', $this->activityMode, true);
        Model::validateRequired('appName', $this->appName, true);
        Model::validateRequired('desc', $this->desc, true);
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
        if (null !== $this->activityMode) {
            $res['activity_mode'] = $this->activityMode;
        }
        if (null !== $this->appName) {
            $res['app_name'] = $this->appName;
        }
        if (null !== $this->desc) {
            $res['desc'] = $this->desc;
        }
        if (null !== $this->instanceId) {
            $res['instance_id'] = $this->instanceId;
        }
        if (null !== $this->splitRule) {
            $res['split_rule'] = null !== $this->splitRule ? $this->splitRule->toMap() : null;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateAppsRequest
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
        if (isset($map['activity_mode'])) {
            $model->activityMode = $map['activity_mode'];
        }
        if (isset($map['app_name'])) {
            $model->appName = $map['app_name'];
        }
        if (isset($map['desc'])) {
            $model->desc = $map['desc'];
        }
        if (isset($map['instance_id'])) {
            $model->instanceId = $map['instance_id'];
        }
        if (isset($map['split_rule'])) {
            $model->splitRule = SplitRule::fromMap($map['split_rule']);
        }

        return $model;
    }
}
