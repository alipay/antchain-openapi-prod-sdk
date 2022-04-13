<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class LoadBalancerListener extends Model
{
    // 负载均衡实例后端使用的端口。
    // 取值：1-65535。
    /**
     * @example 80
     *
     * @var int
     */
    public $backendServerPort;

    // 监听的带宽峰值，取值：
    // -1：不限制带宽峰值。
    // 1~5120：监听的带宽峰值，所有监听的带宽峰值之和不能超过实例的带宽峰值。
    /**
     * @example 100
     *
     * @var int
     */
    public $bandWidth;

    // CA证书ID。
    // 若既上传CA证书又上传服务器证书，即采用双向认证。
    // 若用户只上传服务器证书，即为单向认证。
    /**
     * @example 139a00604ad-cn-east-hangzhou-01
     *
     * @var string
     */
    public $caCertificateId;

    // 服务器上配置的Cookie。
    // 长度为1~200个字符，只能包含ASCII英文字母和数字字符，不能包含逗号、分号或空格，也不能以开头。
    /**
     * @example SERVERID
     *
     * @var string
     */
    public $cookie;

    // Cookie超时时间
    /**
     * @example 100
     *
     * @var int
     */
    public $cookieTimeout;

    // 连接超时时间（秒）
    /**
     * @example 500
     *
     * @var int
     */
    public $establishedTimeout;

    // 健康检查连续成功多少次后，将后端服务器的健康检查状态由fail判定为success。
    // 取值: 2-10。
    /**
     * @example 4
     *
     * @var int
     */
    public $healthyThreshold;

    // 是否开启健康检查。
    // 取值：ON | OFF。
    /**
     * @example ON
     *
     * @var string
     */
    public $healthCheck;

    // 健康检查端口。
    /**
     * @example 80
     *
     * @var int
     */
    public $healthCheckConnectPort;

    // 健康检查链接超时时间。
    /**
     * @example 10
     *
     * @var int
     */
    public $healthCheckConnectTimeout;

    // 用于健康检查的域名。取值：
    // ip： 后端服务器的私网IP。当指定了IP或该参数未指定时，负载均衡会使用各后端服务器的私网IP当做健康检查使用的域名。
    // domain：域名长度为1-80，只能包含字母、数字、点号（.）和连字符（-）。
    /**
     * @example ip
     *
     * @var string
     */
    public $healthCheckDomain;

    // 健康检查正常的HTTP状态码，多个状态码用逗号分隔。
    // 默认值为http_2xx。
    /**
     * @example http_2xx
     *
     * @var string
     */
    public $healthCheckHttpCode;

    // 健康检查的时间间隔。
    // 取值:1-50（秒）。
    /**
     * @example 3
     *
     * @var int
     */
    public $healthCheckInterval;

    // 健康检查threshold。
    /**
     * @example 10
     *
     * @var int
     */
    public $healthCheckThreshold;

    // 接收来自运行状况检查的响应需要等待的时间。如果后端ECS在指定的时间内没有正确响应，则判定为健康检查失败。
    // 取值：1-300（秒）。
    /**
     * @example 3
     *
     * @var int
     */
    public $healthCheckTimeout;

    // 用于健康检查的URI。
    // 当TCP监听需要使用HTTP健康检查时可配置此参数，如不配置则按TCP健康检查。
    /**
     * @example /test/index.html
     *
     * @var string
     */
    public $healthCheckUri;

    // 负载均衡实例前端使用的端口。
    // 取值：1-65535。
    /**
     * @example 80
     *
     * @var int
     */
    public $listenerPort;

    // TCP 会话保持的超时时间（秒）
    /**
     * @example 0
     *
     * @var int
     */
    public $persistenceTimeout;

    // 监听使用协议。
    /**
     * @example TCP,UDP,HTTP,HTTPS
     *
     * @var string
     */
    public $protocol;

    // 负载均衡策略（RR 轮询 | WLC 最小连接数）
    /**
     * @example RR
     *
     * @var string
     */
    public $scheduler;

    // 0不开会话保持 / 1植入Cookie / 2重写Cookie。
    // 开启会话保持功能后，负载均衡会把来自同一客户端的访问请求分发到同一台后端服务器上进行处理。
    // HTTP协议会话保持基于Cookie。负载均衡提供了两种Cookie处理方式：
    // 植入Cookie：您只需要指定Cookie的过期时间。
    // 客户端第一次访问时，负载均衡会在返回请求中植入Cookie（即在HTTP/HTTPS响应报文中插入SERVERID），下次客户端携带此Cookie访问，负载均衡服务会将请求定向转发给之前记录到的后端服务器上。
    // 重写Cookie：可以根据需要指定HTTPS/HTTP响应中插入的Cookie。您需要在后端服务器上维护该Cookie的过期时间和生存时间。
    // 负载均衡服务发现用户自定义了Cookie，将会对原来的Cookie进行重写，下次客户端携带新的Cookie访问，负载均衡服务会将请求定向转发给之前记录到的后端服务器
    /**
     * @example 0
     *
     * @var int
     */
    public $sessionStickyType;

    // 健康检查连续失败多少次后，将后端服务器的健康检查状态由success判定为fail。
    // 取值：2-10。
    /**
     * @example 4
     *
     * @var int
     */
    public $unhealthyThreshold;

    // 是否开启通过 X-Forwarded-For 的方式获取来访者真实 IP
    /**
     * @example true, false
     *
     * @var bool
     */
    public $xforwardFor;

    // 统一接入域名
    /**
     * @example alipay.net
     *
     * @var string
     */
    public $domain;

    // 统一接入转发路径
    /**
     * @example /urlpath
     *
     * @var string
     */
    public $path;
    protected $_name = [
        'backendServerPort'         => 'backend_server_port',
        'bandWidth'                 => 'band_width',
        'caCertificateId'           => 'ca_certificate_id',
        'cookie'                    => 'cookie',
        'cookieTimeout'             => 'cookie_timeout',
        'establishedTimeout'        => 'established_timeout',
        'healthyThreshold'          => 'healthy_threshold',
        'healthCheck'               => 'health_check',
        'healthCheckConnectPort'    => 'health_check_connect_port',
        'healthCheckConnectTimeout' => 'health_check_connect_timeout',
        'healthCheckDomain'         => 'health_check_domain',
        'healthCheckHttpCode'       => 'health_check_http_code',
        'healthCheckInterval'       => 'health_check_interval',
        'healthCheckThreshold'      => 'health_check_threshold',
        'healthCheckTimeout'        => 'health_check_timeout',
        'healthCheckUri'            => 'health_check_uri',
        'listenerPort'              => 'listener_port',
        'persistenceTimeout'        => 'persistence_timeout',
        'protocol'                  => 'protocol',
        'scheduler'                 => 'scheduler',
        'sessionStickyType'         => 'session_sticky_type',
        'unhealthyThreshold'        => 'unhealthy_threshold',
        'xforwardFor'               => 'xforward_for',
        'domain'                    => 'domain',
        'path'                      => 'path',
    ];

    public function validate()
    {
        Model::validateRequired('backendServerPort', $this->backendServerPort, true);
        Model::validateRequired('sessionStickyType', $this->sessionStickyType, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->backendServerPort) {
            $res['backend_server_port'] = $this->backendServerPort;
        }
        if (null !== $this->bandWidth) {
            $res['band_width'] = $this->bandWidth;
        }
        if (null !== $this->caCertificateId) {
            $res['ca_certificate_id'] = $this->caCertificateId;
        }
        if (null !== $this->cookie) {
            $res['cookie'] = $this->cookie;
        }
        if (null !== $this->cookieTimeout) {
            $res['cookie_timeout'] = $this->cookieTimeout;
        }
        if (null !== $this->establishedTimeout) {
            $res['established_timeout'] = $this->establishedTimeout;
        }
        if (null !== $this->healthyThreshold) {
            $res['healthy_threshold'] = $this->healthyThreshold;
        }
        if (null !== $this->healthCheck) {
            $res['health_check'] = $this->healthCheck;
        }
        if (null !== $this->healthCheckConnectPort) {
            $res['health_check_connect_port'] = $this->healthCheckConnectPort;
        }
        if (null !== $this->healthCheckConnectTimeout) {
            $res['health_check_connect_timeout'] = $this->healthCheckConnectTimeout;
        }
        if (null !== $this->healthCheckDomain) {
            $res['health_check_domain'] = $this->healthCheckDomain;
        }
        if (null !== $this->healthCheckHttpCode) {
            $res['health_check_http_code'] = $this->healthCheckHttpCode;
        }
        if (null !== $this->healthCheckInterval) {
            $res['health_check_interval'] = $this->healthCheckInterval;
        }
        if (null !== $this->healthCheckThreshold) {
            $res['health_check_threshold'] = $this->healthCheckThreshold;
        }
        if (null !== $this->healthCheckTimeout) {
            $res['health_check_timeout'] = $this->healthCheckTimeout;
        }
        if (null !== $this->healthCheckUri) {
            $res['health_check_uri'] = $this->healthCheckUri;
        }
        if (null !== $this->listenerPort) {
            $res['listener_port'] = $this->listenerPort;
        }
        if (null !== $this->persistenceTimeout) {
            $res['persistence_timeout'] = $this->persistenceTimeout;
        }
        if (null !== $this->protocol) {
            $res['protocol'] = $this->protocol;
        }
        if (null !== $this->scheduler) {
            $res['scheduler'] = $this->scheduler;
        }
        if (null !== $this->sessionStickyType) {
            $res['session_sticky_type'] = $this->sessionStickyType;
        }
        if (null !== $this->unhealthyThreshold) {
            $res['unhealthy_threshold'] = $this->unhealthyThreshold;
        }
        if (null !== $this->xforwardFor) {
            $res['xforward_for'] = $this->xforwardFor;
        }
        if (null !== $this->domain) {
            $res['domain'] = $this->domain;
        }
        if (null !== $this->path) {
            $res['path'] = $this->path;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return LoadBalancerListener
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['backend_server_port'])) {
            $model->backendServerPort = $map['backend_server_port'];
        }
        if (isset($map['band_width'])) {
            $model->bandWidth = $map['band_width'];
        }
        if (isset($map['ca_certificate_id'])) {
            $model->caCertificateId = $map['ca_certificate_id'];
        }
        if (isset($map['cookie'])) {
            $model->cookie = $map['cookie'];
        }
        if (isset($map['cookie_timeout'])) {
            $model->cookieTimeout = $map['cookie_timeout'];
        }
        if (isset($map['established_timeout'])) {
            $model->establishedTimeout = $map['established_timeout'];
        }
        if (isset($map['healthy_threshold'])) {
            $model->healthyThreshold = $map['healthy_threshold'];
        }
        if (isset($map['health_check'])) {
            $model->healthCheck = $map['health_check'];
        }
        if (isset($map['health_check_connect_port'])) {
            $model->healthCheckConnectPort = $map['health_check_connect_port'];
        }
        if (isset($map['health_check_connect_timeout'])) {
            $model->healthCheckConnectTimeout = $map['health_check_connect_timeout'];
        }
        if (isset($map['health_check_domain'])) {
            $model->healthCheckDomain = $map['health_check_domain'];
        }
        if (isset($map['health_check_http_code'])) {
            $model->healthCheckHttpCode = $map['health_check_http_code'];
        }
        if (isset($map['health_check_interval'])) {
            $model->healthCheckInterval = $map['health_check_interval'];
        }
        if (isset($map['health_check_threshold'])) {
            $model->healthCheckThreshold = $map['health_check_threshold'];
        }
        if (isset($map['health_check_timeout'])) {
            $model->healthCheckTimeout = $map['health_check_timeout'];
        }
        if (isset($map['health_check_uri'])) {
            $model->healthCheckUri = $map['health_check_uri'];
        }
        if (isset($map['listener_port'])) {
            $model->listenerPort = $map['listener_port'];
        }
        if (isset($map['persistence_timeout'])) {
            $model->persistenceTimeout = $map['persistence_timeout'];
        }
        if (isset($map['protocol'])) {
            $model->protocol = $map['protocol'];
        }
        if (isset($map['scheduler'])) {
            $model->scheduler = $map['scheduler'];
        }
        if (isset($map['session_sticky_type'])) {
            $model->sessionStickyType = $map['session_sticky_type'];
        }
        if (isset($map['unhealthy_threshold'])) {
            $model->unhealthyThreshold = $map['unhealthy_threshold'];
        }
        if (isset($map['xforward_for'])) {
            $model->xforwardFor = $map['xforward_for'];
        }
        if (isset($map['domain'])) {
            $model->domain = $map['domain'];
        }
        if (isset($map['path'])) {
            $model->path = $map['path'];
        }

        return $model;
    }
}
