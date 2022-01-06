<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MS\Models;

use AlibabaCloud\Tea\Model;

class AddSgRouterrulegroupsRequest extends Model
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

    // 下发版本
    /**
     * @var string
     */
    public $dispatchVersion;

    // 是否生效，1 生效，0 未生效。默认未生效
    /**
     * @var int
     */
    public $enabled;

    // id
    /**
     * @var int
     */
    public $id;

    // 实例id
    /**
     * @var string
     */
    public $instanceId;

    // 编辑人
    /**
     * @var string
     */
    public $operator;

    // JSON格式：路由规则
    /**
     * @var string
     */
    public $rules;

    // dataID的类型，应用/服务；默认为0，服务级
    /**
     * @var string
     */
    public $type;

    // 规则组名称
    /**
     * @var string
     */
    public $name;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'appName'           => 'app_name',
        'dataId'            => 'data_id',
        'dispatchVersion'   => 'dispatch_version',
        'enabled'           => 'enabled',
        'id'                => 'id',
        'instanceId'        => 'instance_id',
        'operator'          => 'operator',
        'rules'             => 'rules',
        'type'              => 'type',
        'name'              => 'name',
    ];

    public function validate()
    {
        Model::validateRequired('dataId', $this->dataId, true);
        Model::validateRequired('instanceId', $this->instanceId, true);
        Model::validateRequired('rules', $this->rules, true);
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
        if (null !== $this->dispatchVersion) {
            $res['dispatch_version'] = $this->dispatchVersion;
        }
        if (null !== $this->enabled) {
            $res['enabled'] = $this->enabled;
        }
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->instanceId) {
            $res['instance_id'] = $this->instanceId;
        }
        if (null !== $this->operator) {
            $res['operator'] = $this->operator;
        }
        if (null !== $this->rules) {
            $res['rules'] = $this->rules;
        }
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return AddSgRouterrulegroupsRequest
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
        if (isset($map['dispatch_version'])) {
            $model->dispatchVersion = $map['dispatch_version'];
        }
        if (isset($map['enabled'])) {
            $model->enabled = $map['enabled'];
        }
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }
        if (isset($map['instance_id'])) {
            $model->instanceId = $map['instance_id'];
        }
        if (isset($map['operator'])) {
            $model->operator = $map['operator'];
        }
        if (isset($map['rules'])) {
            $model->rules = $map['rules'];
        }
        if (isset($map['type'])) {
            $model->type = $map['type'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }

        return $model;
    }
}
