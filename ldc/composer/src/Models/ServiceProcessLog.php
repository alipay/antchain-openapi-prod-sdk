<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class ServiceProcessLog extends Model
{
    // Logs属性
    /**
     * @example Error
     *
     * @var string
     */
    public $attributes;

    // 错误追溯
    /**
     * @example Init Process
     *
     * @var string
     */
    public $errorStackTraces;

    // 发布阶段，INIT，PARSE， EXECUTE
    /**
     * @example INIT
     *
     * @var string
     */
    public $execPhase;

    // 关联对象类型，RPV2，RP_STAGE，POD
    /**
     * @example RPv2
     *
     * @var string
     */
    public $invObjectKind;

    // 对应object的name
    /**
     * @example pipeline-0000000000000001
     *
     * @var string
     */
    public $invObjectName;

    // 对应object的namespace
    /**
     * @example default
     *
     * @var string
     */
    public $invObjectNamespace;

    // log_time
    /**
     * @example 2018-10-10T10:10:00Z
     *
     * @var string
     */
    public $logTime;

    // Logs详情
    /**
     * @example pulling image "nginx:1.9.1"
     *
     * @var string
     */
    public $message;

    // Logs原因
    /**
     * @example Pulling
     *
     * @var string
     */
    public $reason;

    // 关联的ldc_plan id
    /**
     * @example 0000000000000001
     *
     * @var string
     */
    public $refPlan;

    // 关联的lks_service id
    /**
     * @example 0000000000000001
     *
     * @var string
     */
    public $refService;

    // Logs的来源，ldcconsole，orch_event，opsware_event
    /**
     * @example ldcconsole
     *
     * @var string
     */
    public $source;
    protected $_name = [
        'attributes'         => 'attributes',
        'errorStackTraces'   => 'error_stack_traces',
        'execPhase'          => 'exec_phase',
        'invObjectKind'      => 'inv_object_kind',
        'invObjectName'      => 'inv_object_name',
        'invObjectNamespace' => 'inv_object_namespace',
        'logTime'            => 'log_time',
        'message'            => 'message',
        'reason'             => 'reason',
        'refPlan'            => 'ref_plan',
        'refService'         => 'ref_service',
        'source'             => 'source',
    ];

    public function validate()
    {
        Model::validateRequired('attributes', $this->attributes, true);
        Model::validateRequired('errorStackTraces', $this->errorStackTraces, true);
        Model::validateRequired('execPhase', $this->execPhase, true);
        Model::validateRequired('invObjectKind', $this->invObjectKind, true);
        Model::validateRequired('invObjectName', $this->invObjectName, true);
        Model::validateRequired('invObjectNamespace', $this->invObjectNamespace, true);
        Model::validateRequired('logTime', $this->logTime, true);
        Model::validateRequired('message', $this->message, true);
        Model::validateRequired('reason', $this->reason, true);
        Model::validateRequired('refPlan', $this->refPlan, true);
        Model::validateRequired('refService', $this->refService, true);
        Model::validateRequired('source', $this->source, true);
        Model::validatePattern('logTime', $this->logTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->attributes) {
            $res['attributes'] = $this->attributes;
        }
        if (null !== $this->errorStackTraces) {
            $res['error_stack_traces'] = $this->errorStackTraces;
        }
        if (null !== $this->execPhase) {
            $res['exec_phase'] = $this->execPhase;
        }
        if (null !== $this->invObjectKind) {
            $res['inv_object_kind'] = $this->invObjectKind;
        }
        if (null !== $this->invObjectName) {
            $res['inv_object_name'] = $this->invObjectName;
        }
        if (null !== $this->invObjectNamespace) {
            $res['inv_object_namespace'] = $this->invObjectNamespace;
        }
        if (null !== $this->logTime) {
            $res['log_time'] = $this->logTime;
        }
        if (null !== $this->message) {
            $res['message'] = $this->message;
        }
        if (null !== $this->reason) {
            $res['reason'] = $this->reason;
        }
        if (null !== $this->refPlan) {
            $res['ref_plan'] = $this->refPlan;
        }
        if (null !== $this->refService) {
            $res['ref_service'] = $this->refService;
        }
        if (null !== $this->source) {
            $res['source'] = $this->source;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ServiceProcessLog
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['attributes'])) {
            $model->attributes = $map['attributes'];
        }
        if (isset($map['error_stack_traces'])) {
            $model->errorStackTraces = $map['error_stack_traces'];
        }
        if (isset($map['exec_phase'])) {
            $model->execPhase = $map['exec_phase'];
        }
        if (isset($map['inv_object_kind'])) {
            $model->invObjectKind = $map['inv_object_kind'];
        }
        if (isset($map['inv_object_name'])) {
            $model->invObjectName = $map['inv_object_name'];
        }
        if (isset($map['inv_object_namespace'])) {
            $model->invObjectNamespace = $map['inv_object_namespace'];
        }
        if (isset($map['log_time'])) {
            $model->logTime = $map['log_time'];
        }
        if (isset($map['message'])) {
            $model->message = $map['message'];
        }
        if (isset($map['reason'])) {
            $model->reason = $map['reason'];
        }
        if (isset($map['ref_plan'])) {
            $model->refPlan = $map['ref_plan'];
        }
        if (isset($map['ref_service'])) {
            $model->refService = $map['ref_service'];
        }
        if (isset($map['source'])) {
            $model->source = $map['source'];
        }

        return $model;
    }
}
