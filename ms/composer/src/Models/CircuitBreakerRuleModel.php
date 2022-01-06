<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MS\Models;

use AlibabaCloud\Tea\Model;

class CircuitBreakerRuleModel extends Model
{
    // 应用名，数组形式，一般只有一个
    /**
     * @example ["testApp"]
     *
     * @var string[]
     */
    public $appNames;

    // 统一熔断模型
    // "circuit_breaker_rule_items": [
    // {
    // "ruleType": "avgRt",
    // "action": {
    // "type": "REJECT"
    // },
    // "configs": {
    // "totalMetricWindow": 10,
    // "requestVolumeThreshold": 10,
    // "averageRtThreshold": 50,
    // "sleepWindow": 1000
    // },
    // "trafficConditions": [
    // {
    // "type": "system",
    // "field": "trafficType",
    // "operation": "EQUAL",
    // "value": [
    // "online"
    // ]
    // }
    // ]
    // }
    // ],
    /**
     * @example 详见描述
     *
     * @var CircuitBreakerRuleItemModel[]
     */
    public $circuitBreakerRuleItems;

    // 熔断生效条件
    /**
     * @example [{"type": "system", "field": "method","operation": "equal","value": ["echo"]}
     *
     * @var CircuitRuleBaseConditionModel[]
     */
    public $conditions;

    // 熔断配置
    /**
     * @example {“totalMetricWindow”: 10,"requestVolumeThreshold": 20, "errorPercentThreshold": 50, "sleepWindow": 5000, "providerTimeout": 1000 }
     *
     * @var CircuitBreakerConfigModel
     */
    public $config;

    // 服务id
    /**
     * @example 00001
     *
     * @var string
     */
    public $dataId;

    // 修改时间
    /**
     * @example 15003403
     *
     * @var int
     */
    public $gmtModified;

    // 取值GET、POST、DELETE、PUT(serviceType为SPRINGCLOUD时才有值)
    /**
     * @example GET
     *
     * @var string
     */
    public $httpMethod;

    // 可以传*表示通配符(serviceType为SPRINGCLOUD时才有值)
    /**
     * @example /aa
     *
     * @var string
     */
    public $httpPath;

    // 数据库自增id
    /**
     * @example 1
     *
     * @var string
     */
    public $id;

    // 租户id
    /**
     * @example instance-00001
     *
     * @var string
     */
    public $instanceId;

    // 方法名称(serviceType为SPRINGCLOUD时不传)
    /**
     * @example test
     *
     * @var string
     */
    public $methodName;

    // 熔断生效模式
    /**
     * @example REJECT
     *
     * @var string
     */
    public $mode;

    // 熔断规则名
    /**
     * @example 规则一
     *
     * @var string
     */
    public $name;

    // 操作人
    /**
     * @example 树嘉
     *
     * @var string
     */
    public $operator;

    // dataId.methodName:trfficType:resType(当serviceType类型为SPRINGCLOUD时结构为dataId:trfficType:resType)
    /**
     * @example dataId.methodName:r:i
     *
     * @var string
     */
    public $resource;

    // res的类型(r-rpc,g-gateway,q-mq)
    /**
     * @example r
     *
     * @var string
     */
    public $resType;

    // 服务类型
    /**
     * @example sofa
     *
     * @var string
     */
    public $serviceType;

    // 规则是否生效
    /**
     * @example 0
     *
     * @var int
     */
    public $status;

    // 流量方向(i-inbound,o-outbound)
    /**
     * @example i
     *
     * @var string
     */
    public $trafficType;
    protected $_name = [
        'appNames'                => 'app_names',
        'circuitBreakerRuleItems' => 'circuit_breaker_rule_items',
        'conditions'              => 'conditions',
        'config'                  => 'config',
        'dataId'                  => 'data_id',
        'gmtModified'             => 'gmt_modified',
        'httpMethod'              => 'http_method',
        'httpPath'                => 'http_path',
        'id'                      => 'id',
        'instanceId'              => 'instance_id',
        'methodName'              => 'method_name',
        'mode'                    => 'mode',
        'name'                    => 'name',
        'operator'                => 'operator',
        'resource'                => 'resource',
        'resType'                 => 'res_type',
        'serviceType'             => 'service_type',
        'status'                  => 'status',
        'trafficType'             => 'traffic_type',
    ];

    public function validate()
    {
        Model::validateRequired('appNames', $this->appNames, true);
        Model::validateRequired('dataId', $this->dataId, true);
        Model::validateRequired('gmtModified', $this->gmtModified, true);
        Model::validateRequired('id', $this->id, true);
        Model::validateRequired('instanceId', $this->instanceId, true);
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('serviceType', $this->serviceType, true);
        Model::validateRequired('status', $this->status, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->appNames) {
            $res['app_names'] = $this->appNames;
        }
        if (null !== $this->circuitBreakerRuleItems) {
            $res['circuit_breaker_rule_items'] = [];
            if (null !== $this->circuitBreakerRuleItems && \is_array($this->circuitBreakerRuleItems)) {
                $n = 0;
                foreach ($this->circuitBreakerRuleItems as $item) {
                    $res['circuit_breaker_rule_items'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->conditions) {
            $res['conditions'] = [];
            if (null !== $this->conditions && \is_array($this->conditions)) {
                $n = 0;
                foreach ($this->conditions as $item) {
                    $res['conditions'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->config) {
            $res['config'] = null !== $this->config ? $this->config->toMap() : null;
        }
        if (null !== $this->dataId) {
            $res['data_id'] = $this->dataId;
        }
        if (null !== $this->gmtModified) {
            $res['gmt_modified'] = $this->gmtModified;
        }
        if (null !== $this->httpMethod) {
            $res['http_method'] = $this->httpMethod;
        }
        if (null !== $this->httpPath) {
            $res['http_path'] = $this->httpPath;
        }
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->instanceId) {
            $res['instance_id'] = $this->instanceId;
        }
        if (null !== $this->methodName) {
            $res['method_name'] = $this->methodName;
        }
        if (null !== $this->mode) {
            $res['mode'] = $this->mode;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->operator) {
            $res['operator'] = $this->operator;
        }
        if (null !== $this->resource) {
            $res['resource'] = $this->resource;
        }
        if (null !== $this->resType) {
            $res['res_type'] = $this->resType;
        }
        if (null !== $this->serviceType) {
            $res['service_type'] = $this->serviceType;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->trafficType) {
            $res['traffic_type'] = $this->trafficType;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CircuitBreakerRuleModel
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['app_names'])) {
            if (!empty($map['app_names'])) {
                $model->appNames = $map['app_names'];
            }
        }
        if (isset($map['circuit_breaker_rule_items'])) {
            if (!empty($map['circuit_breaker_rule_items'])) {
                $model->circuitBreakerRuleItems = [];
                $n                              = 0;
                foreach ($map['circuit_breaker_rule_items'] as $item) {
                    $model->circuitBreakerRuleItems[$n++] = null !== $item ? CircuitBreakerRuleItemModel::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['conditions'])) {
            if (!empty($map['conditions'])) {
                $model->conditions = [];
                $n                 = 0;
                foreach ($map['conditions'] as $item) {
                    $model->conditions[$n++] = null !== $item ? CircuitRuleBaseConditionModel::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['config'])) {
            $model->config = CircuitBreakerConfigModel::fromMap($map['config']);
        }
        if (isset($map['data_id'])) {
            $model->dataId = $map['data_id'];
        }
        if (isset($map['gmt_modified'])) {
            $model->gmtModified = $map['gmt_modified'];
        }
        if (isset($map['http_method'])) {
            $model->httpMethod = $map['http_method'];
        }
        if (isset($map['http_path'])) {
            $model->httpPath = $map['http_path'];
        }
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }
        if (isset($map['instance_id'])) {
            $model->instanceId = $map['instance_id'];
        }
        if (isset($map['method_name'])) {
            $model->methodName = $map['method_name'];
        }
        if (isset($map['mode'])) {
            $model->mode = $map['mode'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['operator'])) {
            $model->operator = $map['operator'];
        }
        if (isset($map['resource'])) {
            $model->resource = $map['resource'];
        }
        if (isset($map['res_type'])) {
            $model->resType = $map['res_type'];
        }
        if (isset($map['service_type'])) {
            $model->serviceType = $map['service_type'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }
        if (isset($map['traffic_type'])) {
            $model->trafficType = $map['traffic_type'];
        }

        return $model;
    }
}
