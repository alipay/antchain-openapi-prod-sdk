<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\DTX\Models;

use AlibabaCloud\Tea\Model;

class GetRecoveryParticipatorsResponse extends Model
{
    // 请求唯一ID，用于链路跟踪和问题排查
    /**
     * @var string
     */
    public $reqMsgId;

    // 结果码，一般OK表示调用成功
    /**
     * @var string
     */
    public $resultCode;

    // 异常信息的文本描述
    /**
     * @var string
     */
    public $resultMsg;

    // action_name
    /**
     * @var string
     */
    public $actionName;

    // app_name
    /**
     * @var string
     */
    public $appName;

    // biz_type
    /**
     * @var string
     */
    public $bizType;

    // 关联关系表的id，用于更新
    /**
     * @var int
     */
    public $bizTypeId;

    // class_name
    /**
     * @var string
     */
    public $className;

    // commit_method_name
    /**
     * @var string
     */
    public $commitMethodName;

    // commit_method_params_type
    /**
     * @var int
     */
    public $commitMethodParamsType;

    // elastic_key
    /**
     * @var string
     */
    public $elasticKey;

    // elastic_route_rule
    /**
     * @var string
     */
    public $elasticRouteRule;

    // id
    /**
     * @var int
     */
    public $id;

    // instance_id
    /**
     * @var string
     */
    public $instanceId;

    // is_zone_route
    /**
     * @var bool
     */
    public $isZoneRoute;

    // rollback_method_name
    /**
     * @var string
     */
    public $rollbackMethodName;

    // rollback_method_params_type
    /**
     * @var int
     */
    public $rollbackMethodParamsType;

    // test_url
    /**
     * @var string
     */
    public $testUrl;

    // unique_id
    /**
     * @var string
     */
    public $uniqueId;

    // ws_tr
    /**
     * @var string
     */
    public $wsTr;
    protected $_name = [
        'reqMsgId'                 => 'req_msg_id',
        'resultCode'               => 'result_code',
        'resultMsg'                => 'result_msg',
        'actionName'               => 'action_name',
        'appName'                  => 'app_name',
        'bizType'                  => 'biz_type',
        'bizTypeId'                => 'biz_type_id',
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
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->reqMsgId) {
            $res['req_msg_id'] = $this->reqMsgId;
        }
        if (null !== $this->resultCode) {
            $res['result_code'] = $this->resultCode;
        }
        if (null !== $this->resultMsg) {
            $res['result_msg'] = $this->resultMsg;
        }
        if (null !== $this->actionName) {
            $res['action_name'] = $this->actionName;
        }
        if (null !== $this->appName) {
            $res['app_name'] = $this->appName;
        }
        if (null !== $this->bizType) {
            $res['biz_type'] = $this->bizType;
        }
        if (null !== $this->bizTypeId) {
            $res['biz_type_id'] = $this->bizTypeId;
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
     * @return GetRecoveryParticipatorsResponse
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['req_msg_id'])) {
            $model->reqMsgId = $map['req_msg_id'];
        }
        if (isset($map['result_code'])) {
            $model->resultCode = $map['result_code'];
        }
        if (isset($map['result_msg'])) {
            $model->resultMsg = $map['result_msg'];
        }
        if (isset($map['action_name'])) {
            $model->actionName = $map['action_name'];
        }
        if (isset($map['app_name'])) {
            $model->appName = $map['app_name'];
        }
        if (isset($map['biz_type'])) {
            $model->bizType = $map['biz_type'];
        }
        if (isset($map['biz_type_id'])) {
            $model->bizTypeId = $map['biz_type_id'];
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
