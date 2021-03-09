<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CAS\Models;

use AlibabaCloud\Tea\Model;

class ResourceLog extends Model
{
    // host
    /**
     * @example host
     *
     * @var string
     */
    public $host;

    // log_time
    /**
     * @example 2018-10-10T10:10:00Z
     *
     * @var string
     */
    public $logTime;

    // message
    /**
     * @example message
     *
     * @var string
     */
    public $message;

    // resource_id
    /**
     * @example resource_id
     *
     * @var string
     */
    public $resourceId;

    // resource_type
    /**
     * @example resource_type
     *
     * @var string
     */
    public $resourceType;

    // severity
    /**
     * @example severity
     *
     * @var string
     */
    public $severity;

    // source
    /**
     * @example source
     *
     * @var string
     */
    public $source;

    // task_id
    /**
     * @example task_id
     *
     * @var string
     */
    public $taskId;

    // task_times
    /**
     * @example task_times
     *
     * @var int
     */
    public $taskTimes;

    // type
    /**
     * @example type
     *
     * @var string
     */
    public $type;

    // iaas_error_info
    /**
     * @example
     *
     * @var IaasErrorInfo
     */
    public $iaasErrorInfo;

    // iaas_request
    /**
     * @example
     *
     * @var IaasRequest
     */
    public $iaasRequest;

    // iaas_response
    /**
     * @example
     *
     * @var IaasResponse
     */
    public $iaasResponse;
    protected $_name = [
        'host'          => 'host',
        'logTime'       => 'log_time',
        'message'       => 'message',
        'resourceId'    => 'resource_id',
        'resourceType'  => 'resource_type',
        'severity'      => 'severity',
        'source'        => 'source',
        'taskId'        => 'task_id',
        'taskTimes'     => 'task_times',
        'type'          => 'type',
        'iaasErrorInfo' => 'iaas_error_info',
        'iaasRequest'   => 'iaas_request',
        'iaasResponse'  => 'iaas_response',
    ];

    public function validate()
    {
        Model::validateRequired('logTime', $this->logTime, true);
        Model::validateRequired('message', $this->message, true);
        Model::validateRequired('taskId', $this->taskId, true);
        Model::validateRequired('taskTimes', $this->taskTimes, true);
        Model::validatePattern('logTime', $this->logTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]');
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->host) {
            $res['host'] = $this->host;
        }
        if (null !== $this->logTime) {
            $res['log_time'] = $this->logTime;
        }
        if (null !== $this->message) {
            $res['message'] = $this->message;
        }
        if (null !== $this->resourceId) {
            $res['resource_id'] = $this->resourceId;
        }
        if (null !== $this->resourceType) {
            $res['resource_type'] = $this->resourceType;
        }
        if (null !== $this->severity) {
            $res['severity'] = $this->severity;
        }
        if (null !== $this->source) {
            $res['source'] = $this->source;
        }
        if (null !== $this->taskId) {
            $res['task_id'] = $this->taskId;
        }
        if (null !== $this->taskTimes) {
            $res['task_times'] = $this->taskTimes;
        }
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }
        if (null !== $this->iaasErrorInfo) {
            $res['iaas_error_info'] = null !== $this->iaasErrorInfo ? $this->iaasErrorInfo->toMap() : null;
        }
        if (null !== $this->iaasRequest) {
            $res['iaas_request'] = null !== $this->iaasRequest ? $this->iaasRequest->toMap() : null;
        }
        if (null !== $this->iaasResponse) {
            $res['iaas_response'] = null !== $this->iaasResponse ? $this->iaasResponse->toMap() : null;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ResourceLog
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['host'])) {
            $model->host = $map['host'];
        }
        if (isset($map['log_time'])) {
            $model->logTime = $map['log_time'];
        }
        if (isset($map['message'])) {
            $model->message = $map['message'];
        }
        if (isset($map['resource_id'])) {
            $model->resourceId = $map['resource_id'];
        }
        if (isset($map['resource_type'])) {
            $model->resourceType = $map['resource_type'];
        }
        if (isset($map['severity'])) {
            $model->severity = $map['severity'];
        }
        if (isset($map['source'])) {
            $model->source = $map['source'];
        }
        if (isset($map['task_id'])) {
            $model->taskId = $map['task_id'];
        }
        if (isset($map['task_times'])) {
            $model->taskTimes = $map['task_times'];
        }
        if (isset($map['type'])) {
            $model->type = $map['type'];
        }
        if (isset($map['iaas_error_info'])) {
            $model->iaasErrorInfo = IaasErrorInfo::fromMap($map['iaas_error_info']);
        }
        if (isset($map['iaas_request'])) {
            $model->iaasRequest = IaasRequest::fromMap($map['iaas_request']);
        }
        if (isset($map['iaas_response'])) {
            $model->iaasResponse = IaasResponse::fromMap($map['iaas_response']);
        }

        return $model;
    }
}
