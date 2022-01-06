<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MS\Models;

use AlibabaCloud\Tea\Model;

class UpdateGuardianGuardianrulesRequest extends Model
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

    // app name
    /**
     * @var string
     */
    public $appName;

    // 是否可用
    /**
     * @var bool
     */
    public $enable;

    // 创建
    /**
     * @var string
     */
    public $gmtCreate;

    // 更新
    /**
     * @var string
     */
    public $gmtModified;

    // 监控规则id
    /**
     * @var int
     */
    public $id;

    // 实例id
    /**
     * @var string
     */
    public $instanceId;

    // 描述字段
    /**
     * @var string
     */
    public $name;

    // 编辑人
    /**
     * @var string
     */
    public $operator;

    // 资源类型
    /**
     * @var string
     */
    public $resourceType;

    // 规则配置
    /**
     * @var string
     */
    public $ruleConfig;

    // 运行模式
    /**
     * @var string
     */
    public $runMode;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'appName'           => 'app_name',
        'enable'            => 'enable',
        'gmtCreate'         => 'gmt_create',
        'gmtModified'       => 'gmt_modified',
        'id'                => 'id',
        'instanceId'        => 'instance_id',
        'name'              => 'name',
        'operator'          => 'operator',
        'resourceType'      => 'resource_type',
        'ruleConfig'        => 'rule_config',
        'runMode'           => 'run_mode',
    ];

    public function validate()
    {
        Model::validateRequired('appName', $this->appName, true);
        Model::validateRequired('id', $this->id, true);
        Model::validateRequired('instanceId', $this->instanceId, true);
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('resourceType', $this->resourceType, true);
        Model::validateRequired('ruleConfig', $this->ruleConfig, true);
        Model::validateRequired('runMode', $this->runMode, true);
        Model::validatePattern('gmtCreate', $this->gmtCreate, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
        Model::validatePattern('gmtModified', $this->gmtModified, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
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
        if (null !== $this->enable) {
            $res['enable'] = $this->enable;
        }
        if (null !== $this->gmtCreate) {
            $res['gmt_create'] = $this->gmtCreate;
        }
        if (null !== $this->gmtModified) {
            $res['gmt_modified'] = $this->gmtModified;
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

        return $res;
    }

    /**
     * @param array $map
     *
     * @return UpdateGuardianGuardianrulesRequest
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
        if (isset($map['enable'])) {
            $model->enable = $map['enable'];
        }
        if (isset($map['gmt_create'])) {
            $model->gmtCreate = $map['gmt_create'];
        }
        if (isset($map['gmt_modified'])) {
            $model->gmtModified = $map['gmt_modified'];
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

        return $model;
    }
}
