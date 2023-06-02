<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\IAM\Models;

use AlibabaCloud\Tea\Model;

class PushOperationRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // {产品}.{资源}.{子资源}.{操作}
    /**
     * @var string
     */
    public $operationCode;

    // 操作参数
    /**
     * @var string
     */
    public $params;

    // 可用区域信息，非必填
    /**
     * @var string
     */
    public $region;

    // 资源ID
    /**
     * @var string
     */
    public $resourceId;

    // 资源类型
    /**
     * @var string
     */
    public $resourceType;

    // 相应结果
    /**
     * @var string
     */
    public $response;

    // 操作来源，由接入方上报自身系统host
    /**
     * @var string
     */
    public $source;

    // 操作来源IP，由接入方上报
    /**
     * @var string
     */
    public $sourceIpAddress;

    // 触发时间
    /**
     * @var string
     */
    public $time;

    // TraceId用于事件追踪
    /**
     * @var string
     */
    public $traceId;

    // agent信息
    /**
     * @var string
     */
    public $userAgent;

    // 用户ID
    /**
     * @var string
     */
    public $userId;

    // 租户8位ID
    /**
     * @var string
     */
    public $userTenant;
    protected $_name = [
        'authToken'       => 'auth_token',
        'operationCode'   => 'operation_code',
        'params'          => 'params',
        'region'          => 'region',
        'resourceId'      => 'resource_id',
        'resourceType'    => 'resource_type',
        'response'        => 'response',
        'source'          => 'source',
        'sourceIpAddress' => 'source_ip_address',
        'time'            => 'time',
        'traceId'         => 'trace_id',
        'userAgent'       => 'user_agent',
        'userId'          => 'user_id',
        'userTenant'      => 'user_tenant',
    ];

    public function validate()
    {
        Model::validateRequired('operationCode', $this->operationCode, true);
        Model::validateRequired('params', $this->params, true);
        Model::validateRequired('time', $this->time, true);
        Model::validateRequired('userId', $this->userId, true);
        Model::validateRequired('userTenant', $this->userTenant, true);
        Model::validatePattern('time', $this->time, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->operationCode) {
            $res['operation_code'] = $this->operationCode;
        }
        if (null !== $this->params) {
            $res['params'] = $this->params;
        }
        if (null !== $this->region) {
            $res['region'] = $this->region;
        }
        if (null !== $this->resourceId) {
            $res['resource_id'] = $this->resourceId;
        }
        if (null !== $this->resourceType) {
            $res['resource_type'] = $this->resourceType;
        }
        if (null !== $this->response) {
            $res['response'] = $this->response;
        }
        if (null !== $this->source) {
            $res['source'] = $this->source;
        }
        if (null !== $this->sourceIpAddress) {
            $res['source_ip_address'] = $this->sourceIpAddress;
        }
        if (null !== $this->time) {
            $res['time'] = $this->time;
        }
        if (null !== $this->traceId) {
            $res['trace_id'] = $this->traceId;
        }
        if (null !== $this->userAgent) {
            $res['user_agent'] = $this->userAgent;
        }
        if (null !== $this->userId) {
            $res['user_id'] = $this->userId;
        }
        if (null !== $this->userTenant) {
            $res['user_tenant'] = $this->userTenant;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return PushOperationRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['operation_code'])) {
            $model->operationCode = $map['operation_code'];
        }
        if (isset($map['params'])) {
            $model->params = $map['params'];
        }
        if (isset($map['region'])) {
            $model->region = $map['region'];
        }
        if (isset($map['resource_id'])) {
            $model->resourceId = $map['resource_id'];
        }
        if (isset($map['resource_type'])) {
            $model->resourceType = $map['resource_type'];
        }
        if (isset($map['response'])) {
            $model->response = $map['response'];
        }
        if (isset($map['source'])) {
            $model->source = $map['source'];
        }
        if (isset($map['source_ip_address'])) {
            $model->sourceIpAddress = $map['source_ip_address'];
        }
        if (isset($map['time'])) {
            $model->time = $map['time'];
        }
        if (isset($map['trace_id'])) {
            $model->traceId = $map['trace_id'];
        }
        if (isset($map['user_agent'])) {
            $model->userAgent = $map['user_agent'];
        }
        if (isset($map['user_id'])) {
            $model->userId = $map['user_id'];
        }
        if (isset($map['user_tenant'])) {
            $model->userTenant = $map['user_tenant'];
        }

        return $model;
    }
}
