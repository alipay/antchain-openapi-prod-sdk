<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MS\Models;

use AlibabaCloud\Tea\Model;

class AddSgFaultinjectruleRequest extends Model
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

    // 应用名称
    /**
     * @var string
     */
    public $appName;

    // 服务id
    /**
     * @var string
     */
    public $dataId;

    // 服务类型（SOFA DUBBO SPRINGCLOUD）
    /**
     * @var string
     */
    public $serviceType;

    // 规则名称
    /**
     * @var string
     */
    public $ruleName;

    // 故障注入规则配置（json串）
    /**
     * @var string
     */
    public $ruleConfig;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'instanceId'        => 'instance_id',
        'appName'           => 'app_name',
        'dataId'            => 'data_id',
        'serviceType'       => 'service_type',
        'ruleName'          => 'rule_name',
        'ruleConfig'        => 'rule_config',
    ];

    public function validate()
    {
        Model::validateRequired('instanceId', $this->instanceId, true);
        Model::validateRequired('appName', $this->appName, true);
        Model::validateRequired('dataId', $this->dataId, true);
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
        if (null !== $this->appName) {
            $res['app_name'] = $this->appName;
        }
        if (null !== $this->dataId) {
            $res['data_id'] = $this->dataId;
        }
        if (null !== $this->serviceType) {
            $res['service_type'] = $this->serviceType;
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
     * @return AddSgFaultinjectruleRequest
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
        if (isset($map['app_name'])) {
            $model->appName = $map['app_name'];
        }
        if (isset($map['data_id'])) {
            $model->dataId = $map['data_id'];
        }
        if (isset($map['service_type'])) {
            $model->serviceType = $map['service_type'];
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
