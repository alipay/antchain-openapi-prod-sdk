<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\YUNQING\Models;

use AlibabaCloud\Tea\Model;

class LbListener extends Model
{
    // lb监听器协议：HTTP、TCP
    /**
     * @example TCP
     *
     * @var string
     */
    public $protocol;

    // 监听器端口
    /**
     * @example 80
     *
     * @var int
     */
    public $listenerPort;

    // 监听器后端端口
    /**
     * @example 80
     *
     * @var int
     */
    public $backendServerPort;

    // 后端转发端口
    /**
     * @example 31474
     *
     * @var int
     */
    public $backendServerForwardPort;

    // 健康检查开关
    /**
     * @example true, false
     *
     * @var bool
     */
    public $healthMonitor;

    // 健康检查端口
    /**
     * @example 9500
     *
     * @var int
     */
    public $healthCheckPort;

    // 健康检查阈值
    /**
     * @example 3
     *
     * @var int
     */
    public $healthCheckThreadhold;

    // 健康检查uri
    /**
     * @example /checkService
     *
     * @var string
     */
    public $healthCheckUri;

    // 健康检查间隔
    /**
     * @example 3
     *
     * @var int
     */
    public $healthCheckInterval;

    // 健康检查http方法
    /**
     * @example GET
     *
     * @var string
     */
    public $httpMethod;

    // 健康检查期望返回的http code
    /**
     * @example ["http_2xx"]
     *
     * @var string
     */
    public $expectCodes;
    protected $_name = [
        'protocol'                 => 'protocol',
        'listenerPort'             => 'listener_port',
        'backendServerPort'        => 'backend_server_port',
        'backendServerForwardPort' => 'backend_server_forward_port',
        'healthMonitor'            => 'health_monitor',
        'healthCheckPort'          => 'health_check_port',
        'healthCheckThreadhold'    => 'health_check_threadhold',
        'healthCheckUri'           => 'health_check_uri',
        'healthCheckInterval'      => 'health_check_interval',
        'httpMethod'               => 'http_method',
        'expectCodes'              => 'expect_codes',
    ];

    public function validate()
    {
        Model::validateRequired('protocol', $this->protocol, true);
        Model::validateRequired('listenerPort', $this->listenerPort, true);
        Model::validateRequired('backendServerPort', $this->backendServerPort, true);
        Model::validateRequired('backendServerForwardPort', $this->backendServerForwardPort, true);
        Model::validateRequired('healthMonitor', $this->healthMonitor, true);
        Model::validateRequired('healthCheckPort', $this->healthCheckPort, true);
        Model::validateRequired('healthCheckThreadhold', $this->healthCheckThreadhold, true);
        Model::validateRequired('healthCheckInterval', $this->healthCheckInterval, true);
        Model::validateRequired('httpMethod', $this->httpMethod, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->protocol) {
            $res['protocol'] = $this->protocol;
        }
        if (null !== $this->listenerPort) {
            $res['listener_port'] = $this->listenerPort;
        }
        if (null !== $this->backendServerPort) {
            $res['backend_server_port'] = $this->backendServerPort;
        }
        if (null !== $this->backendServerForwardPort) {
            $res['backend_server_forward_port'] = $this->backendServerForwardPort;
        }
        if (null !== $this->healthMonitor) {
            $res['health_monitor'] = $this->healthMonitor;
        }
        if (null !== $this->healthCheckPort) {
            $res['health_check_port'] = $this->healthCheckPort;
        }
        if (null !== $this->healthCheckThreadhold) {
            $res['health_check_threadhold'] = $this->healthCheckThreadhold;
        }
        if (null !== $this->healthCheckUri) {
            $res['health_check_uri'] = $this->healthCheckUri;
        }
        if (null !== $this->healthCheckInterval) {
            $res['health_check_interval'] = $this->healthCheckInterval;
        }
        if (null !== $this->httpMethod) {
            $res['http_method'] = $this->httpMethod;
        }
        if (null !== $this->expectCodes) {
            $res['expect_codes'] = $this->expectCodes;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return LbListener
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['protocol'])) {
            $model->protocol = $map['protocol'];
        }
        if (isset($map['listener_port'])) {
            $model->listenerPort = $map['listener_port'];
        }
        if (isset($map['backend_server_port'])) {
            $model->backendServerPort = $map['backend_server_port'];
        }
        if (isset($map['backend_server_forward_port'])) {
            $model->backendServerForwardPort = $map['backend_server_forward_port'];
        }
        if (isset($map['health_monitor'])) {
            $model->healthMonitor = $map['health_monitor'];
        }
        if (isset($map['health_check_port'])) {
            $model->healthCheckPort = $map['health_check_port'];
        }
        if (isset($map['health_check_threadhold'])) {
            $model->healthCheckThreadhold = $map['health_check_threadhold'];
        }
        if (isset($map['health_check_uri'])) {
            $model->healthCheckUri = $map['health_check_uri'];
        }
        if (isset($map['health_check_interval'])) {
            $model->healthCheckInterval = $map['health_check_interval'];
        }
        if (isset($map['http_method'])) {
            $model->httpMethod = $map['http_method'];
        }
        if (isset($map['expect_codes'])) {
            $model->expectCodes = $map['expect_codes'];
        }

        return $model;
    }
}
