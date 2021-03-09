<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CAS\Models;

use AlibabaCloud\Tea\Model;

class ListenerHealthMonitor extends Model
{
    // check_type
    /**
     * @example check_type
     *
     * @var string
     */
    public $checkType;

    // 默认 80
    /**
     * @example
     *
     * @var int
     */
    public $connectPort;

    // 域名
    /**
     * @example xx.com
     *
     * @var string
     */
    public $domain;

    // 健康阈值
    /**
     * @example
     *
     * @var int
     */
    public $healthyThreshold;

    // health_check_http_code
    /**
     * @example
     *
     * @var string[]
     */
    public $healthCheckHttpCode;

    // http_method
    /**
     * @example http_method
     *
     * @var string
     */
    public $httpMethod;

    // id
    /**
     * @example id
     *
     * @var string
     */
    public $id;

    // 监控检查间隔
    /**
     * @example
     *
     * @var int
     */
    public $interval;

    // 超时时间
    /**
     * @example
     *
     * @var int
     */
    public $timeout;

    // 不健康阈值
    /**
     * @example
     *
     * @var int
     */
    public $unHealthyThreshold;

    // uri
    /**
     * @example /
     *
     * @var string
     */
    public $uri;
    protected $_name = [
        'checkType'           => 'check_type',
        'connectPort'         => 'connect_port',
        'domain'              => 'domain',
        'healthyThreshold'    => 'healthy_threshold',
        'healthCheckHttpCode' => 'health_check_http_code',
        'httpMethod'          => 'http_method',
        'id'                  => 'id',
        'interval'            => 'interval',
        'timeout'             => 'timeout',
        'unHealthyThreshold'  => 'un_healthy_threshold',
        'uri'                 => 'uri',
    ];

    public function validate()
    {
        Model::validateRequired('interval', $this->interval, true);
        Model::validateRequired('timeout', $this->timeout, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->checkType) {
            $res['check_type'] = $this->checkType;
        }
        if (null !== $this->connectPort) {
            $res['connect_port'] = $this->connectPort;
        }
        if (null !== $this->domain) {
            $res['domain'] = $this->domain;
        }
        if (null !== $this->healthyThreshold) {
            $res['healthy_threshold'] = $this->healthyThreshold;
        }
        if (null !== $this->healthCheckHttpCode) {
            $res['health_check_http_code'] = $this->healthCheckHttpCode;
        }
        if (null !== $this->httpMethod) {
            $res['http_method'] = $this->httpMethod;
        }
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->interval) {
            $res['interval'] = $this->interval;
        }
        if (null !== $this->timeout) {
            $res['timeout'] = $this->timeout;
        }
        if (null !== $this->unHealthyThreshold) {
            $res['un_healthy_threshold'] = $this->unHealthyThreshold;
        }
        if (null !== $this->uri) {
            $res['uri'] = $this->uri;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ListenerHealthMonitor
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['check_type'])) {
            $model->checkType = $map['check_type'];
        }
        if (isset($map['connect_port'])) {
            $model->connectPort = $map['connect_port'];
        }
        if (isset($map['domain'])) {
            $model->domain = $map['domain'];
        }
        if (isset($map['healthy_threshold'])) {
            $model->healthyThreshold = $map['healthy_threshold'];
        }
        if (isset($map['health_check_http_code'])) {
            if (!empty($map['health_check_http_code'])) {
                $model->healthCheckHttpCode = $map['health_check_http_code'];
            }
        }
        if (isset($map['http_method'])) {
            $model->httpMethod = $map['http_method'];
        }
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }
        if (isset($map['interval'])) {
            $model->interval = $map['interval'];
        }
        if (isset($map['timeout'])) {
            $model->timeout = $map['timeout'];
        }
        if (isset($map['un_healthy_threshold'])) {
            $model->unHealthyThreshold = $map['un_healthy_threshold'];
        }
        if (isset($map['uri'])) {
            $model->uri = $map['uri'];
        }

        return $model;
    }
}
