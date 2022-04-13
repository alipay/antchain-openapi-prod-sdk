<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class HealthCheckProbe extends Model
{
    // 基于命令行类型的探针必填
    /**
     * @example
     *
     * @var ExecAction
     */
    public $execAction;

    // 探针运行失败阈值
    //
    /**
     * @example 1
     *
     * @var int
     */
    public $failureThreshold;

    // 基于HTTP GET请求的探针必填
    //
    /**
     * @example
     *
     * @var HttpGetAction
     */
    public $httpGetAction;

    // 探针初始运行延迟时间
    //
    /**
     * @example 1
     *
     * @var int
     */
    public $initialDelaySeconds;

    // 探针运行间隔时间
    //
    /**
     * @example 1
     *
     * @var int
     */
    public $periodSeconds;

    // 探针运行成功阈值
    //
    /**
     * @example 1
     *
     * @var int
     */
    public $successThreshold;

    // 基于TCP连接的探针必填
    //
    /**
     * @example
     *
     * @var TcpSocketAction
     */
    public $tcpSocketAction;

    // 探针运行超时时间
    //
    /**
     * @example 1
     *
     * @var int
     */
    public $timeOutSeconds;
    protected $_name = [
        'execAction'          => 'exec_action',
        'failureThreshold'    => 'failure_threshold',
        'httpGetAction'       => 'http_get_action',
        'initialDelaySeconds' => 'initial_delay_seconds',
        'periodSeconds'       => 'period_seconds',
        'successThreshold'    => 'success_threshold',
        'tcpSocketAction'     => 'tcp_socket_action',
        'timeOutSeconds'      => 'time_out_seconds',
    ];

    public function validate()
    {
        Model::validateRequired('failureThreshold', $this->failureThreshold, true);
        Model::validateRequired('initialDelaySeconds', $this->initialDelaySeconds, true);
        Model::validateRequired('periodSeconds', $this->periodSeconds, true);
        Model::validateRequired('successThreshold', $this->successThreshold, true);
        Model::validateRequired('timeOutSeconds', $this->timeOutSeconds, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->execAction) {
            $res['exec_action'] = null !== $this->execAction ? $this->execAction->toMap() : null;
        }
        if (null !== $this->failureThreshold) {
            $res['failure_threshold'] = $this->failureThreshold;
        }
        if (null !== $this->httpGetAction) {
            $res['http_get_action'] = null !== $this->httpGetAction ? $this->httpGetAction->toMap() : null;
        }
        if (null !== $this->initialDelaySeconds) {
            $res['initial_delay_seconds'] = $this->initialDelaySeconds;
        }
        if (null !== $this->periodSeconds) {
            $res['period_seconds'] = $this->periodSeconds;
        }
        if (null !== $this->successThreshold) {
            $res['success_threshold'] = $this->successThreshold;
        }
        if (null !== $this->tcpSocketAction) {
            $res['tcp_socket_action'] = null !== $this->tcpSocketAction ? $this->tcpSocketAction->toMap() : null;
        }
        if (null !== $this->timeOutSeconds) {
            $res['time_out_seconds'] = $this->timeOutSeconds;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return HealthCheckProbe
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['exec_action'])) {
            $model->execAction = ExecAction::fromMap($map['exec_action']);
        }
        if (isset($map['failure_threshold'])) {
            $model->failureThreshold = $map['failure_threshold'];
        }
        if (isset($map['http_get_action'])) {
            $model->httpGetAction = HttpGetAction::fromMap($map['http_get_action']);
        }
        if (isset($map['initial_delay_seconds'])) {
            $model->initialDelaySeconds = $map['initial_delay_seconds'];
        }
        if (isset($map['period_seconds'])) {
            $model->periodSeconds = $map['period_seconds'];
        }
        if (isset($map['success_threshold'])) {
            $model->successThreshold = $map['success_threshold'];
        }
        if (isset($map['tcp_socket_action'])) {
            $model->tcpSocketAction = TcpSocketAction::fromMap($map['tcp_socket_action']);
        }
        if (isset($map['time_out_seconds'])) {
            $model->timeOutSeconds = $map['time_out_seconds'];
        }

        return $model;
    }
}
