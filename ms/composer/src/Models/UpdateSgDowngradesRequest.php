<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MS\Models;

use AlibabaCloud\Tea\Model;

class UpdateSgDowngradesRequest extends Model
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

    // 降级规则组id
    /**
     * @var int
     */
    public $groupId;

    // 租户实例id
    /**
     * @var string
     */
    public $instanceId;

    // 降级规则id
    /**
     * @var int
     */
    public $ruleId;

    // 应用名称
    /**
     * @var string
     */
    public $appName;

    // 降级服务
    /**
     * @var string
     */
    public $downgradeService;

    // 规则名称
    /**
     * @var string
     */
    public $ruleName;

    // 降级方法
    /**
     * @var string
     */
    public $downgradeMethod;

    // 运行模式
    /**
     * @var string
     */
    public $mode;

    // 处理动作 (返回为空 返回错误)
    /**
     * @var string
     */
    public $strategy;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'groupId'           => 'group_id',
        'instanceId'        => 'instance_id',
        'ruleId'            => 'rule_id',
        'appName'           => 'app_name',
        'downgradeService'  => 'downgrade_service',
        'ruleName'          => 'rule_name',
        'downgradeMethod'   => 'downgrade_method',
        'mode'              => 'mode',
        'strategy'          => 'strategy',
    ];

    public function validate()
    {
        Model::validateRequired('groupId', $this->groupId, true);
        Model::validateRequired('instanceId', $this->instanceId, true);
        Model::validateRequired('ruleId', $this->ruleId, true);
        Model::validateRequired('appName', $this->appName, true);
        Model::validateRequired('downgradeService', $this->downgradeService, true);
        Model::validateRequired('ruleName', $this->ruleName, true);
        Model::validateRequired('downgradeMethod', $this->downgradeMethod, true);
        Model::validateRequired('mode', $this->mode, true);
        Model::validateRequired('strategy', $this->strategy, true);
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
        if (null !== $this->groupId) {
            $res['group_id'] = $this->groupId;
        }
        if (null !== $this->instanceId) {
            $res['instance_id'] = $this->instanceId;
        }
        if (null !== $this->ruleId) {
            $res['rule_id'] = $this->ruleId;
        }
        if (null !== $this->appName) {
            $res['app_name'] = $this->appName;
        }
        if (null !== $this->downgradeService) {
            $res['downgrade_service'] = $this->downgradeService;
        }
        if (null !== $this->ruleName) {
            $res['rule_name'] = $this->ruleName;
        }
        if (null !== $this->downgradeMethod) {
            $res['downgrade_method'] = $this->downgradeMethod;
        }
        if (null !== $this->mode) {
            $res['mode'] = $this->mode;
        }
        if (null !== $this->strategy) {
            $res['strategy'] = $this->strategy;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return UpdateSgDowngradesRequest
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
        if (isset($map['group_id'])) {
            $model->groupId = $map['group_id'];
        }
        if (isset($map['instance_id'])) {
            $model->instanceId = $map['instance_id'];
        }
        if (isset($map['rule_id'])) {
            $model->ruleId = $map['rule_id'];
        }
        if (isset($map['app_name'])) {
            $model->appName = $map['app_name'];
        }
        if (isset($map['downgrade_service'])) {
            $model->downgradeService = $map['downgrade_service'];
        }
        if (isset($map['rule_name'])) {
            $model->ruleName = $map['rule_name'];
        }
        if (isset($map['downgrade_method'])) {
            $model->downgradeMethod = $map['downgrade_method'];
        }
        if (isset($map['mode'])) {
            $model->mode = $map['mode'];
        }
        if (isset($map['strategy'])) {
            $model->strategy = $map['strategy'];
        }

        return $model;
    }
}
