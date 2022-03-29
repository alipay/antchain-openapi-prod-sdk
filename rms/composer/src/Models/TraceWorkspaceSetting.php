<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RMS\Models;

use AlibabaCloud\Tea\Model;

class TraceWorkspaceSetting extends Model
{
    // 工作空间名
    /**
     * @example workspace_name
     *
     * @var string
     */
    public $workspaceName;

    // 是否开启采样率，false代表全采
    /**
     * @example true, false
     *
     * @var bool
     */
    public $sampleEnabled;

    // 采样率
    /**
     * @example "0.1"
     *
     * @var string
     */
    public $sampleRate;

    // 是否开启链路
    /**
     * @example true, false
     *
     * @var bool
     */
    public $traceEnabled;

    // 是否开启异常链路全采样
    /**
     * @example true, false
     *
     * @var bool
     */
    public $errorTraceEnabled;

    // 是否开启链路瘦身
    /**
     * @example true, false
     *
     * @var bool
     */
    public $narrowSpanEnabled;
    protected $_name = [
        'workspaceName'     => 'workspace_name',
        'sampleEnabled'     => 'sample_enabled',
        'sampleRate'        => 'sample_rate',
        'traceEnabled'      => 'trace_enabled',
        'errorTraceEnabled' => 'error_trace_enabled',
        'narrowSpanEnabled' => 'narrow_span_enabled',
    ];

    public function validate()
    {
        Model::validateRequired('workspaceName', $this->workspaceName, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->workspaceName) {
            $res['workspace_name'] = $this->workspaceName;
        }
        if (null !== $this->sampleEnabled) {
            $res['sample_enabled'] = $this->sampleEnabled;
        }
        if (null !== $this->sampleRate) {
            $res['sample_rate'] = $this->sampleRate;
        }
        if (null !== $this->traceEnabled) {
            $res['trace_enabled'] = $this->traceEnabled;
        }
        if (null !== $this->errorTraceEnabled) {
            $res['error_trace_enabled'] = $this->errorTraceEnabled;
        }
        if (null !== $this->narrowSpanEnabled) {
            $res['narrow_span_enabled'] = $this->narrowSpanEnabled;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return TraceWorkspaceSetting
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['workspace_name'])) {
            $model->workspaceName = $map['workspace_name'];
        }
        if (isset($map['sample_enabled'])) {
            $model->sampleEnabled = $map['sample_enabled'];
        }
        if (isset($map['sample_rate'])) {
            $model->sampleRate = $map['sample_rate'];
        }
        if (isset($map['trace_enabled'])) {
            $model->traceEnabled = $map['trace_enabled'];
        }
        if (isset($map['error_trace_enabled'])) {
            $model->errorTraceEnabled = $map['error_trace_enabled'];
        }
        if (isset($map['narrow_span_enabled'])) {
            $model->narrowSpanEnabled = $map['narrow_span_enabled'];
        }

        return $model;
    }
}
