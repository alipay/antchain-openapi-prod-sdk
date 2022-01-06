<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MS\Models;

use AlibabaCloud\Tea\Model;

class AddSgDowngradesRequest extends Model
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

    // 处理动作 (返回为空 返回错误)
    /**
     * @var string
     */
    public $strategy;

    // 应用名称
    /**
     * @var string
     */
    public $appName;

    // 降级方法
    /**
     * @var string
     */
    public $downgradeMethod;

    // 降级服务
    /**
     * @var string
     */
    public $downgradeService;

    // 租户实例id
    /**
     * @var string
     */
    public $instanceId;

    // 运行模式
    /**
     * @var string
     */
    public $mode;

    // 规则名称
    /**
     * @var string
     */
    public $ruleName;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'strategy'          => 'strategy',
        'appName'           => 'app_name',
        'downgradeMethod'   => 'downgrade_method',
        'downgradeService'  => 'downgrade_service',
        'instanceId'        => 'instance_id',
        'mode'              => 'mode',
        'ruleName'          => 'rule_name',
    ];

    public function validate()
    {
        Model::validateRequired('strategy', $this->strategy, true);
        Model::validateRequired('appName', $this->appName, true);
        Model::validateRequired('downgradeMethod', $this->downgradeMethod, true);
        Model::validateRequired('downgradeService', $this->downgradeService, true);
        Model::validateRequired('instanceId', $this->instanceId, true);
        Model::validateRequired('mode', $this->mode, true);
        Model::validateRequired('ruleName', $this->ruleName, true);
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
        if (null !== $this->strategy) {
            $res['strategy'] = $this->strategy;
        }
        if (null !== $this->appName) {
            $res['app_name'] = $this->appName;
        }
        if (null !== $this->downgradeMethod) {
            $res['downgrade_method'] = $this->downgradeMethod;
        }
        if (null !== $this->downgradeService) {
            $res['downgrade_service'] = $this->downgradeService;
        }
        if (null !== $this->instanceId) {
            $res['instance_id'] = $this->instanceId;
        }
        if (null !== $this->mode) {
            $res['mode'] = $this->mode;
        }
        if (null !== $this->ruleName) {
            $res['rule_name'] = $this->ruleName;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return AddSgDowngradesRequest
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
        if (isset($map['strategy'])) {
            $model->strategy = $map['strategy'];
        }
        if (isset($map['app_name'])) {
            $model->appName = $map['app_name'];
        }
        if (isset($map['downgrade_method'])) {
            $model->downgradeMethod = $map['downgrade_method'];
        }
        if (isset($map['downgrade_service'])) {
            $model->downgradeService = $map['downgrade_service'];
        }
        if (isset($map['instance_id'])) {
            $model->instanceId = $map['instance_id'];
        }
        if (isset($map['mode'])) {
            $model->mode = $map['mode'];
        }
        if (isset($map['rule_name'])) {
            $model->ruleName = $map['rule_name'];
        }

        return $model;
    }
}
