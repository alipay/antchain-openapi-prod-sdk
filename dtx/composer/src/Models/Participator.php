<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\DTX\Models;

use AlibabaCloud\Tea\Model;

class Participator extends Model
{
    // 参与者名称
    /**
     * @example ADD_MONEY
     *
     * @var string
     */
    public $actionName;

    // 应用名
    /**
     * @example paycore
     *
     * @var string
     */
    public $appName;

    // 类全名，包括完整包名
    /**
     * @example com.alipay.Payment
     *
     * @var string
     */
    public $className;

    // 提交方法名称
    /**
     * @example commit
     *
     * @var string
     */
    public $commitMethodName;

    // 提交方法参数
    /**
     * @example 3
     *
     * @var int
     */
    public $commitMethodParamsType;

    // 弹性key
    /**
     * @example 无
     *
     * @var string
     */
    public $elasticKey;

    // 弹性路由规则（Groovy脚本）
    /**
     * @example 无
     *
     * @var string
     */
    public $elasticRouteRule;

    // 记录id，更新必传
    /**
     * @example 1111
     *
     * @var int
     */
    public $id;

    // instance_id
    /**
     * @example instance_id
     *
     * @var string
     */
    public $instanceId;

    // rpc是否ldc调用
    /**
     * @example true, false
     *
     * @var bool
     */
    public $isZoneRoute;

    // 回滚方法名称
    /**
     * @example rollback
     *
     * @var string
     */
    public $rollbackMethodName;

    // 回滚方法的参数类型
    /**
     * @example 3
     *
     * @var int
     */
    public $rollbackMethodParamsType;

    // rpc接口测试地址
    /**
     * @example http://local.alipay.net:12200
     *
     * @var string
     */
    public $testUrl;

    // rpc uniqueId
    /**
     * @example 无
     *
     * @var string
     */
    public $uniqueId;

    // 是否被使用
    /**
     * @example true, false
     *
     * @var bool
     */
    public $used;

    // rpc协议，ws或tr
    /**
     * @example tr
     *
     * @var string
     */
    public $wsTr;
    protected $_name = [
        'actionName'               => 'action_name',
        'appName'                  => 'app_name',
        'className'                => 'class_name',
        'commitMethodName'         => 'commit_method_name',
        'commitMethodParamsType'   => 'commit_method_params_type',
        'elasticKey'               => 'elastic_key',
        'elasticRouteRule'         => 'elastic_route_rule',
        'id'                       => 'id',
        'instanceId'               => 'instance_id',
        'isZoneRoute'              => 'is_zone_route',
        'rollbackMethodName'       => 'rollback_method_name',
        'rollbackMethodParamsType' => 'rollback_method_params_type',
        'testUrl'                  => 'test_url',
        'uniqueId'                 => 'unique_id',
        'used'                     => 'used',
        'wsTr'                     => 'ws_tr',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->actionName) {
            $res['action_name'] = $this->actionName;
        }
        if (null !== $this->appName) {
            $res['app_name'] = $this->appName;
        }
        if (null !== $this->className) {
            $res['class_name'] = $this->className;
        }
        if (null !== $this->commitMethodName) {
            $res['commit_method_name'] = $this->commitMethodName;
        }
        if (null !== $this->commitMethodParamsType) {
            $res['commit_method_params_type'] = $this->commitMethodParamsType;
        }
        if (null !== $this->elasticKey) {
            $res['elastic_key'] = $this->elasticKey;
        }
        if (null !== $this->elasticRouteRule) {
            $res['elastic_route_rule'] = $this->elasticRouteRule;
        }
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->instanceId) {
            $res['instance_id'] = $this->instanceId;
        }
        if (null !== $this->isZoneRoute) {
            $res['is_zone_route'] = $this->isZoneRoute;
        }
        if (null !== $this->rollbackMethodName) {
            $res['rollback_method_name'] = $this->rollbackMethodName;
        }
        if (null !== $this->rollbackMethodParamsType) {
            $res['rollback_method_params_type'] = $this->rollbackMethodParamsType;
        }
        if (null !== $this->testUrl) {
            $res['test_url'] = $this->testUrl;
        }
        if (null !== $this->uniqueId) {
            $res['unique_id'] = $this->uniqueId;
        }
        if (null !== $this->used) {
            $res['used'] = $this->used;
        }
        if (null !== $this->wsTr) {
            $res['ws_tr'] = $this->wsTr;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return Participator
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['action_name'])) {
            $model->actionName = $map['action_name'];
        }
        if (isset($map['app_name'])) {
            $model->appName = $map['app_name'];
        }
        if (isset($map['class_name'])) {
            $model->className = $map['class_name'];
        }
        if (isset($map['commit_method_name'])) {
            $model->commitMethodName = $map['commit_method_name'];
        }
        if (isset($map['commit_method_params_type'])) {
            $model->commitMethodParamsType = $map['commit_method_params_type'];
        }
        if (isset($map['elastic_key'])) {
            $model->elasticKey = $map['elastic_key'];
        }
        if (isset($map['elastic_route_rule'])) {
            $model->elasticRouteRule = $map['elastic_route_rule'];
        }
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }
        if (isset($map['instance_id'])) {
            $model->instanceId = $map['instance_id'];
        }
        if (isset($map['is_zone_route'])) {
            $model->isZoneRoute = $map['is_zone_route'];
        }
        if (isset($map['rollback_method_name'])) {
            $model->rollbackMethodName = $map['rollback_method_name'];
        }
        if (isset($map['rollback_method_params_type'])) {
            $model->rollbackMethodParamsType = $map['rollback_method_params_type'];
        }
        if (isset($map['test_url'])) {
            $model->testUrl = $map['test_url'];
        }
        if (isset($map['unique_id'])) {
            $model->uniqueId = $map['unique_id'];
        }
        if (isset($map['used'])) {
            $model->used = $map['used'];
        }
        if (isset($map['ws_tr'])) {
            $model->wsTr = $map['ws_tr'];
        }

        return $model;
    }
}
