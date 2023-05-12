<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\DTX\Models;

use AlibabaCloud\Tea\Model;

class CreateAppsConfigsRequest extends Model
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

    // 发起方配置
    /**
     * @var Initiator
     */
    public $initiator;

    // 参与者列表
    /**
     * @var Participator[]
     */
    public $participators;

    // 应用名
    /**
     * @var string
     */
    public $appName;

    // 应用的描述
    /**
     * @var string
     */
    public $desc;

    // 环境唯一标识
    /**
     * @var string
     */
    public $instanceId;

    // 1：同库模式，事务记录表在业务侧； 2：异库模式。
    /**
     * @var int
     */
    public $activityMode;

    // 分表分表规则
    /**
     * @var SplitRule
     */
    public $shardingRule;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'initiator'         => 'initiator',
        'participators'     => 'participators',
        'appName'           => 'app_name',
        'desc'              => 'desc',
        'instanceId'        => 'instance_id',
        'activityMode'      => 'activity_mode',
        'shardingRule'      => 'sharding_rule',
    ];

    public function validate()
    {
        Model::validateRequired('appName', $this->appName, true);
        Model::validateRequired('instanceId', $this->instanceId, true);
        Model::validateRequired('activityMode', $this->activityMode, true);
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
        if (null !== $this->initiator) {
            $res['initiator'] = null !== $this->initiator ? $this->initiator->toMap() : null;
        }
        if (null !== $this->participators) {
            $res['participators'] = [];
            if (null !== $this->participators && \is_array($this->participators)) {
                $n = 0;
                foreach ($this->participators as $item) {
                    $res['participators'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
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
        if (null !== $this->activityMode) {
            $res['activity_mode'] = $this->activityMode;
        }
        if (null !== $this->shardingRule) {
            $res['sharding_rule'] = null !== $this->shardingRule ? $this->shardingRule->toMap() : null;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateAppsConfigsRequest
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
        if (isset($map['initiator'])) {
            $model->initiator = Initiator::fromMap($map['initiator']);
        }
        if (isset($map['participators'])) {
            if (!empty($map['participators'])) {
                $model->participators = [];
                $n                    = 0;
                foreach ($map['participators'] as $item) {
                    $model->participators[$n++] = null !== $item ? Participator::fromMap($item) : $item;
                }
            }
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
        if (isset($map['activity_mode'])) {
            $model->activityMode = $map['activity_mode'];
        }
        if (isset($map['sharding_rule'])) {
            $model->shardingRule = SplitRule::fromMap($map['sharding_rule']);
        }

        return $model;
    }
}
