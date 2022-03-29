<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MQ\Models;

use AlibabaCloud\Tea\Model;

class EndpointsDTO extends Model
{
    // HTTP 内网接入点
    /**
     * @example http://111111111111.mqrest.cn-qingdao-internal.aliyuncs.com
     *
     * @var string
     */
    public $httpInternalEndpoint;

    // HTTP 公网接入点
    /**
     * @example http://111111111111.mqrest.cn-qingdao-public.aliyuncs.com
     *
     * @var string
     */
    public $httpInternetEndpoint;

    // HTTPS 公网接入点
    /**
     * @example https://111111111111.mqrest.cn-qingdao-internal.aliyuncs.com
     *
     * @var string
     */
    public $httpInternetSecureEndpoint;

    // TCP 协议接入点
    /**
     * @example http://MQ_INST_111111111111_DOxxxxxx.mq-internet-access.mq-internet.aliyuncs.com:80
     *
     * @var string
     */
    public $tcpEndpoint;
    protected $_name = [
        'httpInternalEndpoint'       => 'http_internal_endpoint',
        'httpInternetEndpoint'       => 'http_internet_endpoint',
        'httpInternetSecureEndpoint' => 'http_internet_secure_endpoint',
        'tcpEndpoint'                => 'tcp_endpoint',
    ];

    public function validate()
    {
        Model::validateRequired('httpInternalEndpoint', $this->httpInternalEndpoint, true);
        Model::validateRequired('httpInternetEndpoint', $this->httpInternetEndpoint, true);
        Model::validateRequired('httpInternetSecureEndpoint', $this->httpInternetSecureEndpoint, true);
        Model::validateRequired('tcpEndpoint', $this->tcpEndpoint, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->httpInternalEndpoint) {
            $res['http_internal_endpoint'] = $this->httpInternalEndpoint;
        }
        if (null !== $this->httpInternetEndpoint) {
            $res['http_internet_endpoint'] = $this->httpInternetEndpoint;
        }
        if (null !== $this->httpInternetSecureEndpoint) {
            $res['http_internet_secure_endpoint'] = $this->httpInternetSecureEndpoint;
        }
        if (null !== $this->tcpEndpoint) {
            $res['tcp_endpoint'] = $this->tcpEndpoint;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return EndpointsDTO
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['http_internal_endpoint'])) {
            $model->httpInternalEndpoint = $map['http_internal_endpoint'];
        }
        if (isset($map['http_internet_endpoint'])) {
            $model->httpInternetEndpoint = $map['http_internet_endpoint'];
        }
        if (isset($map['http_internet_secure_endpoint'])) {
            $model->httpInternetSecureEndpoint = $map['http_internet_secure_endpoint'];
        }
        if (isset($map['tcp_endpoint'])) {
            $model->tcpEndpoint = $map['tcp_endpoint'];
        }

        return $model;
    }
}
