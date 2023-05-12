<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\DTX\Models;

use AlibabaCloud\Tea\Model;

class CreateAppsActionRequest extends Model
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

    // 参与者名称
    //
    /**
     * @var string
     */
    public $actionName;

    // app_name
    /**
     * @var string
     */
    public $appName;

    // 类全名，包括完整包名
    //
    /**
     * @var string
     */
    public $className;

    // 提交方法名称
    //
    /**
     * @var string
     */
    public $commitMethodName;

    // 提交方法参数
    //
    /**
     * @var int
     */
    public $commitMethodParamsType;

    // 弹性key
    //
    /**
     * @var string
     */
    public $elasticKey;

    // 弹性路由规则（Groovy脚本）
    //
    /**
     * @var string
     */
    public $elasticRouteRule;

    // 更新时需要
    /**
     * @var int
     */
    public $id;

    // 00001
    /**
     * @var string
     */
    public $instanceId;

    // rpc是否ldc调用
    //
    /**
     * @var bool
     */
    public $isZoneRoute;

    // 回滚方法名称
    //
    /**
     * @var string
     */
    public $rollbackMethodName;

    // 回滚方法的参数类型
    //
    /**
     * @var int
     */
    public $rollbackMethodParamsType;

    // rpc接口测试地址
    //
    /**
     * @var string
     */
    public $testUrl;

    // rpc uniqueId
    //
    /**
     * @var string
     */
    public $uniqueId;

    // rpc协议，ws或tr
    //
    /**
     * @var string
     */
    public $wsTr;
    protected $_name = [
        'authToken'                => 'auth_token',
        'productInstanceId'        => 'product_instance_id',
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
        'wsTr'                     => 'ws_tr',
    ];

    public function validate()
    {
        Model::validateRequired('actionName', $this->actionName, true);
        Model::validateRequired('appName', $this->appName, true);
        Model::validateRequired('className', $this->className, true);
        Model::validateRequired('commitMethodName', $this->commitMethodName, true);
        Model::validateRequired('commitMethodParamsType', $this->commitMethodParamsType, true);
        Model::validateRequired('instanceId', $this->instanceId, true);
        Model::validateRequired('isZoneRoute', $this->isZoneRoute, true);
        Model::validateRequired('rollbackMethodName', $this->rollbackMethodName, true);
        Model::validateRequired('rollbackMethodParamsType', $this->rollbackMethodParamsType, true);
        Model::validateRequired('wsTr', $this->wsTr, true);
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
        if (null !== $this->wsTr) {
            $res['ws_tr'] = $this->wsTr;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateAppsActionRequest
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
        if (isset($map['ws_tr'])) {
            $model->wsTr = $map['ws_tr'];
        }

        return $model;
    }
}
