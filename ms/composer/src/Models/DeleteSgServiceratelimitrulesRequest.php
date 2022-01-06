<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MS\Models;

use AlibabaCloud\Tea\Model;

class DeleteSgServiceratelimitrulesRequest extends Model
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

    // 应用名
    /**
     * @var string
     */
    public $appName;

    // 服务id
    /**
     * @var string
     */
    public $dataId;

    // 是否启用
    /**
     * @var bool
     */
    public $enable;

    // 限流规则id
    /**
     * @var string
     */
    public $id;

    // 租户实例id
    /**
     * @var string
     */
    public $instanceId;

    // 限流规则名称
    /**
     * @var string
     */
    public $name;

    // 操作人
    /**
     * @var string
     */
    public $operator;

    // 资源类型
    /**
     * @var string
     */
    public $resourceType;

    // {"limitStrategy":"ScaledRateLimiter","actionConfig":{"actionType":"LIMIT_EXCEPTION","responseContent":"ssssssssssddd"},"maxBurstRatio":"1","resourceConfigs":[{"method":"方法名","interface":"接口名","baseName":"com.alipay.uctcloud.service.IndicatorClient:1.0@DEFAULT.query","resourceType":"DATA_ID_METHOD"}],"runMode":"CONTROL","calculationConfigs":[{"calculationType":"INVOKE_BY_TIME","period":1000,"trafficType":"ALL","maxAllow":0}],"desc":"测试规则2","resourceType":"DATA_ID_METHOD"}
    /**
     * @var string
     */
    public $ruleConfig;

    // 运行模式
    /**
     * @var string
     */
    public $runMode;

    // 服务框架类型
    /**
     * @var string
     */
    public $serviceType;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'appName'           => 'app_name',
        'dataId'            => 'data_id',
        'enable'            => 'enable',
        'id'                => 'id',
        'instanceId'        => 'instance_id',
        'name'              => 'name',
        'operator'          => 'operator',
        'resourceType'      => 'resource_type',
        'ruleConfig'        => 'rule_config',
        'runMode'           => 'run_mode',
        'serviceType'       => 'service_type',
    ];

    public function validate()
    {
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
        if (null !== $this->appName) {
            $res['app_name'] = $this->appName;
        }
        if (null !== $this->dataId) {
            $res['data_id'] = $this->dataId;
        }
        if (null !== $this->enable) {
            $res['enable'] = $this->enable;
        }
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->instanceId) {
            $res['instance_id'] = $this->instanceId;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->operator) {
            $res['operator'] = $this->operator;
        }
        if (null !== $this->resourceType) {
            $res['resource_type'] = $this->resourceType;
        }
        if (null !== $this->ruleConfig) {
            $res['rule_config'] = $this->ruleConfig;
        }
        if (null !== $this->runMode) {
            $res['run_mode'] = $this->runMode;
        }
        if (null !== $this->serviceType) {
            $res['service_type'] = $this->serviceType;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return DeleteSgServiceratelimitrulesRequest
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
        if (isset($map['app_name'])) {
            $model->appName = $map['app_name'];
        }
        if (isset($map['data_id'])) {
            $model->dataId = $map['data_id'];
        }
        if (isset($map['enable'])) {
            $model->enable = $map['enable'];
        }
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }
        if (isset($map['instance_id'])) {
            $model->instanceId = $map['instance_id'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['operator'])) {
            $model->operator = $map['operator'];
        }
        if (isset($map['resource_type'])) {
            $model->resourceType = $map['resource_type'];
        }
        if (isset($map['rule_config'])) {
            $model->ruleConfig = $map['rule_config'];
        }
        if (isset($map['run_mode'])) {
            $model->runMode = $map['run_mode'];
        }
        if (isset($map['service_type'])) {
            $model->serviceType = $map['service_type'];
        }

        return $model;
    }
}
