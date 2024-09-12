<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ACS_USER\Models;

use AlibabaCloud\Tea\Model;

/**
 * Model for initing client.
 */
class Config extends Model
{
    /**
     * @description accesskey id
     *
     * @var string
     */
    public $accessKeyId;

    /**
     * @description accesskey secret
     *
     * @var string
     */
    public $accessKeySecret;

    /**
     * @description security token
     *
     * @var string
     */
    public $securityToken;

    /**
     * @description http protocol
     *
     * @example http
     *
     * @var string
     */
    public $protocol;

    /**
     * @description read timeout
     *
     * @example 10
     *
     * @var int
     */
    public $readTimeout;

    /**
     * @description connect timeout
     *
     * @example 10
     *
     * @var int
     */
    public $connectTimeout;

    /**
     * @description http proxy
     *
     * @example http://localhost
     *
     * @var string
     */
    public $httpProxy;

    /**
     * @description https proxy
     *
     * @example https://localhost
     *
     * @var string
     */
    public $httpsProxy;

    /**
     * @description endpoint
     *
     * @example cs.aliyuncs.com
     *
     * @var string
     */
    public $endpoint;

    /**
     * @description proxy white list
     *
     * @example http://localhost
     *
     * @var string
     */
    public $noProxy;

    /**
     * @description max idle conns
     *
     * @example 3
     *
     * @var int
     */
    public $maxIdleConns;

    /**
     * @description user agent
     *
     * @example Alibabacloud/1
     *
     * @var string
     */
    public $userAgent;

    /**
     * @description socks5 proxy
     *
     * @var string
     */
    public $socks5Proxy;

    /**
     * @description socks5 network
     *
     * @example TCP
     *
     * @var string
     */
    public $socks5NetWork;

    /**
     * @description 长链接最大空闲时长
     *
     * @var int
     */
    public $maxIdleTimeMillis;

    /**
     * @description 长链接最大连接时长
     *
     * @var int
     */
    public $keepAliveDurationMillis;

    /**
     * @description 最大连接数（长链接最大总数）
     *
     * @var int
     */
    public $maxRequests;

    /**
     * @description 每个目标主机的最大连接数（分主机域名的长链接最大总数
     *
     * @var int
     */
    public $maxRequestsPerHost;
    protected $_default = [
        'accessKeyId'             => '',
        'accessKeySecret'         => '',
        'securityToken'           => '',
        'protocol'                => 'http',
        'readTimeout'             => '',
        'connectTimeout'          => '',
        'httpProxy'               => '',
        'httpsProxy'              => '',
        'endpoint'                => '',
        'noProxy'                 => '',
        'maxIdleConns'            => '',
        'userAgent'               => '',
        'socks5Proxy'             => '',
        'socks5NetWork'           => '',
        'maxIdleTimeMillis'       => '60 * 1000L',
        'keepAliveDurationMillis' => '5000',
        'maxRequests'             => '100',
        'maxRequestsPerHost'      => '100',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->accessKeyId) {
            $res['accessKeyId'] = $this->accessKeyId;
        }
        if (null !== $this->accessKeySecret) {
            $res['accessKeySecret'] = $this->accessKeySecret;
        }
        if (null !== $this->securityToken) {
            $res['securityToken'] = $this->securityToken;
        }
        if (null !== $this->protocol) {
            $res['protocol'] = $this->protocol;
        }
        if (null !== $this->readTimeout) {
            $res['readTimeout'] = $this->readTimeout;
        }
        if (null !== $this->connectTimeout) {
            $res['connectTimeout'] = $this->connectTimeout;
        }
        if (null !== $this->httpProxy) {
            $res['httpProxy'] = $this->httpProxy;
        }
        if (null !== $this->httpsProxy) {
            $res['httpsProxy'] = $this->httpsProxy;
        }
        if (null !== $this->endpoint) {
            $res['endpoint'] = $this->endpoint;
        }
        if (null !== $this->noProxy) {
            $res['noProxy'] = $this->noProxy;
        }
        if (null !== $this->maxIdleConns) {
            $res['maxIdleConns'] = $this->maxIdleConns;
        }
        if (null !== $this->userAgent) {
            $res['userAgent'] = $this->userAgent;
        }
        if (null !== $this->socks5Proxy) {
            $res['socks5Proxy'] = $this->socks5Proxy;
        }
        if (null !== $this->socks5NetWork) {
            $res['socks5NetWork'] = $this->socks5NetWork;
        }
        if (null !== $this->maxIdleTimeMillis) {
            $res['maxIdleTimeMillis'] = $this->maxIdleTimeMillis;
        }
        if (null !== $this->keepAliveDurationMillis) {
            $res['keepAliveDurationMillis'] = $this->keepAliveDurationMillis;
        }
        if (null !== $this->maxRequests) {
            $res['maxRequests'] = $this->maxRequests;
        }
        if (null !== $this->maxRequestsPerHost) {
            $res['maxRequestsPerHost'] = $this->maxRequestsPerHost;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return Config
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['accessKeyId'])) {
            $model->accessKeyId = $map['accessKeyId'];
        }
        if (isset($map['accessKeySecret'])) {
            $model->accessKeySecret = $map['accessKeySecret'];
        }
        if (isset($map['securityToken'])) {
            $model->securityToken = $map['securityToken'];
        }
        if (isset($map['protocol'])) {
            $model->protocol = $map['protocol'];
        }
        if (isset($map['readTimeout'])) {
            $model->readTimeout = $map['readTimeout'];
        }
        if (isset($map['connectTimeout'])) {
            $model->connectTimeout = $map['connectTimeout'];
        }
        if (isset($map['httpProxy'])) {
            $model->httpProxy = $map['httpProxy'];
        }
        if (isset($map['httpsProxy'])) {
            $model->httpsProxy = $map['httpsProxy'];
        }
        if (isset($map['endpoint'])) {
            $model->endpoint = $map['endpoint'];
        }
        if (isset($map['noProxy'])) {
            $model->noProxy = $map['noProxy'];
        }
        if (isset($map['maxIdleConns'])) {
            $model->maxIdleConns = $map['maxIdleConns'];
        }
        if (isset($map['userAgent'])) {
            $model->userAgent = $map['userAgent'];
        }
        if (isset($map['socks5Proxy'])) {
            $model->socks5Proxy = $map['socks5Proxy'];
        }
        if (isset($map['socks5NetWork'])) {
            $model->socks5NetWork = $map['socks5NetWork'];
        }
        if (isset($map['maxIdleTimeMillis'])) {
            $model->maxIdleTimeMillis = $map['maxIdleTimeMillis'];
        }
        if (isset($map['keepAliveDurationMillis'])) {
            $model->keepAliveDurationMillis = $map['keepAliveDurationMillis'];
        }
        if (isset($map['maxRequests'])) {
            $model->maxRequests = $map['maxRequests'];
        }
        if (isset($map['maxRequestsPerHost'])) {
            $model->maxRequestsPerHost = $map['maxRequestsPerHost'];
        }

        return $model;
    }
}
