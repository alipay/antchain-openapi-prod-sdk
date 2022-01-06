<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MS\Models;

use AlibabaCloud\Tea\Model;

class AddSgTrafficmirrorruleRequest extends Model
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

    // 租户实例id
    /**
     * @var string
     */
    public $instanceId;

    // 源应用
    /**
     * @var string
     */
    public $sourceApp;

    // 源服务
    /**
     * @var string
     */
    public $sourceDataId;

    // demo_mirror
    /**
     * @var string
     */
    public $targetApp;

    // 目标服务id
    /**
     * @var string
     */
    public $targetDataId;

    // 规则名
    /**
     * @var string
     */
    public $ruleName;

    // 规则配置（json字符串）
    /**
     * @var string
     */
    public $ruleConfig;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'instanceId'        => 'instance_id',
        'sourceApp'         => 'source_app',
        'sourceDataId'      => 'source_data_id',
        'targetApp'         => 'target_app',
        'targetDataId'      => 'target_data_id',
        'ruleName'          => 'rule_name',
        'ruleConfig'        => 'rule_config',
    ];

    public function validate()
    {
        Model::validateRequired('instanceId', $this->instanceId, true);
        Model::validateRequired('sourceApp', $this->sourceApp, true);
        Model::validateRequired('sourceDataId', $this->sourceDataId, true);
        Model::validateRequired('targetApp', $this->targetApp, true);
        Model::validateRequired('targetDataId', $this->targetDataId, true);
        Model::validateRequired('ruleName', $this->ruleName, true);
        Model::validateRequired('ruleConfig', $this->ruleConfig, true);
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
        if (null !== $this->sourceApp) {
            $res['source_app'] = $this->sourceApp;
        }
        if (null !== $this->sourceDataId) {
            $res['source_data_id'] = $this->sourceDataId;
        }
        if (null !== $this->targetApp) {
            $res['target_app'] = $this->targetApp;
        }
        if (null !== $this->targetDataId) {
            $res['target_data_id'] = $this->targetDataId;
        }
        if (null !== $this->ruleName) {
            $res['rule_name'] = $this->ruleName;
        }
        if (null !== $this->ruleConfig) {
            $res['rule_config'] = $this->ruleConfig;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return AddSgTrafficmirrorruleRequest
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
        if (isset($map['source_app'])) {
            $model->sourceApp = $map['source_app'];
        }
        if (isset($map['source_data_id'])) {
            $model->sourceDataId = $map['source_data_id'];
        }
        if (isset($map['target_app'])) {
            $model->targetApp = $map['target_app'];
        }
        if (isset($map['target_data_id'])) {
            $model->targetDataId = $map['target_data_id'];
        }
        if (isset($map['rule_name'])) {
            $model->ruleName = $map['rule_name'];
        }
        if (isset($map['rule_config'])) {
            $model->ruleConfig = $map['rule_config'];
        }

        return $model;
    }
}
