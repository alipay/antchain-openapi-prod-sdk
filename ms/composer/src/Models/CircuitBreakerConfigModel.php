<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MS\Models;

use AlibabaCloud\Tea\Model;

class CircuitBreakerConfigModel extends Model
{
    // 熔断错误比率条件
    /**
     * @example 50
     *
     * @var int
     */
    public $errorPercentThreshold;

    // 请求超时时间
    /**
     * @example 5000
     *
     * @var int
     */
    public $providerTimeout;

    // 发生熔断的总请求数
    /**
     * @example 20
     *
     * @var int
     */
    public $requestVolumeThreshold;

    // 熔断之后时间窗口
    /**
     * @example 1000
     *
     * @var int
     */
    public $sleepWindow;

    // metric窗口
    /**
     * @example 10
     *
     * @var int
     */
    public $totalMetricWindow;

    // rpc超时时间>0
    /**
     * @example 100
     *
     * @var int
     */
    public $rpcTimeout;

    // 平均RT阈值>0
    /**
     * @example 100
     *
     * @var int
     */
    public $averageRtThreshold;
    protected $_name = [
        'errorPercentThreshold'  => 'error_percent_threshold',
        'providerTimeout'        => 'provider_timeout',
        'requestVolumeThreshold' => 'request_volume_threshold',
        'sleepWindow'            => 'sleep_window',
        'totalMetricWindow'      => 'total_metric_window',
        'rpcTimeout'             => 'rpc_timeout',
        'averageRtThreshold'     => 'average_rt_threshold',
    ];

    public function validate()
    {
        Model::validateRequired('sleepWindow', $this->sleepWindow, true);
        Model::validateRequired('totalMetricWindow', $this->totalMetricWindow, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->errorPercentThreshold) {
            $res['error_percent_threshold'] = $this->errorPercentThreshold;
        }
        if (null !== $this->providerTimeout) {
            $res['provider_timeout'] = $this->providerTimeout;
        }
        if (null !== $this->requestVolumeThreshold) {
            $res['request_volume_threshold'] = $this->requestVolumeThreshold;
        }
        if (null !== $this->sleepWindow) {
            $res['sleep_window'] = $this->sleepWindow;
        }
        if (null !== $this->totalMetricWindow) {
            $res['total_metric_window'] = $this->totalMetricWindow;
        }
        if (null !== $this->rpcTimeout) {
            $res['rpc_timeout'] = $this->rpcTimeout;
        }
        if (null !== $this->averageRtThreshold) {
            $res['average_rt_threshold'] = $this->averageRtThreshold;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CircuitBreakerConfigModel
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['error_percent_threshold'])) {
            $model->errorPercentThreshold = $map['error_percent_threshold'];
        }
        if (isset($map['provider_timeout'])) {
            $model->providerTimeout = $map['provider_timeout'];
        }
        if (isset($map['request_volume_threshold'])) {
            $model->requestVolumeThreshold = $map['request_volume_threshold'];
        }
        if (isset($map['sleep_window'])) {
            $model->sleepWindow = $map['sleep_window'];
        }
        if (isset($map['total_metric_window'])) {
            $model->totalMetricWindow = $map['total_metric_window'];
        }
        if (isset($map['rpc_timeout'])) {
            $model->rpcTimeout = $map['rpc_timeout'];
        }
        if (isset($map['average_rt_threshold'])) {
            $model->averageRtThreshold = $map['average_rt_threshold'];
        }

        return $model;
    }
}
