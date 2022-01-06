<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MS\Models;

use AlibabaCloud\Tea\Model;

class UpdateSgCircuitbreakerrulesRequest extends Model
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

    // 应用名称
    /**
     * @var string
     */
    public $appNames;

    // 熔断规则配置  [{
    // "ruleType": "",//熔断规则类型 ce,crt,pe,prt(c代表消费方,p代表服务方,e代表错误率,rt响应时间)
    // "configs": {
    // "errorPercentThreshold": 50,//请求错误率阈值
    // "requestVolumeThreshold": 100,//请求数阈值
    // "averageRtThreshold":50,//平均RT阈值
    // "providerTimeout": 100,//服务超时时间
    // "sleepWindow": 10000,//熔断时间段
    // "totalMetricWindow": 60,//熔断指标窗口
    // "codeType": "error/success",
    // "codes": [
    // "200",
    // "201",
    // "202"
    // ]
    // },
    // "trafficConditions": [{
    // "field": "sourceApp",//sourceApp,trafficType(此时value取online,test),header
    // "operation": "EQUAL",//EQUAL,NOT_EQUAL,IN,NOT_IN,REGEX
    // "type": "system",//system,tracer,header_info
    // "value": [//当field取trafficType时value取online,test
    // "cloudinc"
    // ]
    // }],
    // "action": {
    // "type": "REJECT/PASS"
    // }
    // }]
    /**
     * @var string
     */
    public $circuitBreakerRuleItems;

    // 生效条件，JSON数组
    /**
     * @var string
     */
    public $conditions;

    // 熔断配置
    /**
     * @var string
     */
    public $config;

    // 资源id
    /**
     * @var string
     */
    public $dataId;

    // 当service_type的值为SPRINGCLOUD时必传，值取(GET、POST、PUT、DELETE)，后端拼接到trafficConditions中
    /**
     * @var string
     */
    public $httpMethod;

    // 当service_type的值为SPRINGCLOUD时必传，后端拼接到trafficConditions中
    /**
     * @var string
     */
    public $httpPath;

    //
    // 熔断规则id
    /**
     * @var int
     */
    public $id;

    // 租户id
    /**
     * @var string
     */
    public $instanceId;

    // 方法名称，当service_type的值为SPRINGCLOUD时不传
    /**
     * @var string
     */
    public $methodName;

    // 熔断规则运行模式
    /**
     * @var string
     */
    public $mode;

    // 规则名
    /**
     * @var string
     */
    public $name;

    // 资源标识，资源格式是serviceId:trafficType:resType
    /**
     * @var string
     */
    public $resource;

    // res的type,组成resource，取值r-rpc(默认), g-gateway, q-mq
    /**
     * @var string
     */
    public $resType;

    // 取值i-inbound, o-outbound,组成resource的部分
    // i代表服务端，o代表消费端
    /**
     * @var string
     */
    public $trafficType;
    protected $_name = [
        'authToken'               => 'auth_token',
        'productInstanceId'       => 'product_instance_id',
        'appNames'                => 'app_names',
        'circuitBreakerRuleItems' => 'circuit_breaker_rule_items',
        'conditions'              => 'conditions',
        'config'                  => 'config',
        'dataId'                  => 'data_id',
        'httpMethod'              => 'http_method',
        'httpPath'                => 'http_path',
        'id'                      => 'id',
        'instanceId'              => 'instance_id',
        'methodName'              => 'method_name',
        'mode'                    => 'mode',
        'name'                    => 'name',
        'resource'                => 'resource',
        'resType'                 => 'res_type',
        'trafficType'             => 'traffic_type',
    ];

    public function validate()
    {
        Model::validateRequired('appNames', $this->appNames, true);
        Model::validateRequired('dataId', $this->dataId, true);
        Model::validateRequired('id', $this->id, true);
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
        if (null !== $this->appNames) {
            $res['app_names'] = $this->appNames;
        }
        if (null !== $this->circuitBreakerRuleItems) {
            $res['circuit_breaker_rule_items'] = $this->circuitBreakerRuleItems;
        }
        if (null !== $this->conditions) {
            $res['conditions'] = $this->conditions;
        }
        if (null !== $this->config) {
            $res['config'] = $this->config;
        }
        if (null !== $this->dataId) {
            $res['data_id'] = $this->dataId;
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
        if (null !== $this->resource) {
            $res['resource'] = $this->resource;
        }
        if (null !== $this->resType) {
            $res['res_type'] = $this->resType;
        }
        if (null !== $this->trafficType) {
            $res['traffic_type'] = $this->trafficType;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return UpdateSgCircuitbreakerrulesRequest
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
        if (isset($map['app_names'])) {
            $model->appNames = $map['app_names'];
        }
        if (isset($map['circuit_breaker_rule_items'])) {
            $model->circuitBreakerRuleItems = $map['circuit_breaker_rule_items'];
        }
        if (isset($map['conditions'])) {
            $model->conditions = $map['conditions'];
        }
        if (isset($map['config'])) {
            $model->config = $map['config'];
        }
        if (isset($map['data_id'])) {
            $model->dataId = $map['data_id'];
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
        if (isset($map['resource'])) {
            $model->resource = $map['resource'];
        }
        if (isset($map['res_type'])) {
            $model->resType = $map['res_type'];
        }
        if (isset($map['traffic_type'])) {
            $model->trafficType = $map['traffic_type'];
        }

        return $model;
    }
}
