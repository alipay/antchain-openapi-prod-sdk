<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\DTX\Models;

use AlibabaCloud\Tea\Model;

class CreateRecoveryConfigurationRequest extends Model
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

    // actionMode取值：1代表TCC模式，2是FMT模式
    /**
     * @var int
     */
    public $actionMode;

    // activityMode取值：1是同库模式，2是异库模式，3是Saga模式
    /**
     * @var int
     */
    public $activityMode;

    // 应用名
    /**
     * @var string
     */
    public $appName;

    // 业务码
    /**
     * @var string
     */
    public $bizType;

    // 应用描述
    /**
     * @var string
     */
    public $desc;

    // 环境的唯一标识
    /**
     * @var string
     */
    public $instanceId;

    // 如果修改biztype，要穿老的bizType
    /**
     * @var string
     */
    public $oldBiztype;

    // role取值：1是发起方，2是参与者
    /**
     * @var int
     */
    public $role;

    // split_rule
    /**
     * @var SplitRule
     */
    public $splitRule;

    // Saga状态机的json定义
    /**
     * @var string
     */
    public $content;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'actionMode'        => 'action_mode',
        'activityMode'      => 'activity_mode',
        'appName'           => 'app_name',
        'bizType'           => 'biz_type',
        'desc'              => 'desc',
        'instanceId'        => 'instance_id',
        'oldBiztype'        => 'old_biztype',
        'role'              => 'role',
        'splitRule'         => 'split_rule',
        'content'           => 'content',
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
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
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
        if (null !== $this->oldBiztype) {
            $res['old_biztype'] = $this->oldBiztype;
        }
        if (null !== $this->role) {
            $res['role'] = $this->role;
        }
        if (null !== $this->splitRule) {
            $res['split_rule'] = null !== $this->splitRule ? $this->splitRule->toMap() : null;
        }
        if (null !== $this->content) {
            $res['content'] = $this->content;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateRecoveryConfigurationRequest
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
        if (isset($map['old_biztype'])) {
            $model->oldBiztype = $map['old_biztype'];
        }
        if (isset($map['role'])) {
            $model->role = $map['role'];
        }
        if (isset($map['split_rule'])) {
            $model->splitRule = SplitRule::fromMap($map['split_rule']);
        }
        if (isset($map['content'])) {
            $model->content = $map['content'];
        }

        return $model;
    }
}
