<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MQ\Models;

use AlibabaCloud\Tea\Model;

class EndpointDTO extends Model
{
    // endpoint接口相关的文档
    /**
     * @example https://yuque.antfin-inc.com/middleware/sofamq/endpoint
     *
     * @var string
     */
    public $doc;

    // https类型公网的endpoint接入点
    /**
     * @example https://111111111111.mqrest.cn-qingdao-internal.aliyuncs.com
     *
     * @var string
     */
    public $httpsInternet;

    // http类型内网的endpoint接口
    /**
     * @example http://111111111111.mqrest.cn-qingdao-internal.aliyuncs.com
     *
     * @var string
     */
    public $httpInternal;

    // http类型的公网接入点
    /**
     * @example http://111111111111.mqrest.cn-qingdao-public.aliyuncs.com
     *
     * @var string
     */
    public $httpInternet;

    // tcp类型的endpoint接口
    /**
     * @example http://MQ_INST_DO.mq-internet-access.mq-internet.aliyuncs.com:80
     *
     * @var string
     */
    public $tcp;
    protected $_name = [
        'doc'           => 'doc',
        'httpsInternet' => 'https_internet',
        'httpInternal'  => 'http_internal',
        'httpInternet'  => 'http_internet',
        'tcp'           => 'tcp',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->doc) {
            $res['doc'] = $this->doc;
        }
        if (null !== $this->httpsInternet) {
            $res['https_internet'] = $this->httpsInternet;
        }
        if (null !== $this->httpInternal) {
            $res['http_internal'] = $this->httpInternal;
        }
        if (null !== $this->httpInternet) {
            $res['http_internet'] = $this->httpInternet;
        }
        if (null !== $this->tcp) {
            $res['tcp'] = $this->tcp;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return EndpointDTO
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['doc'])) {
            $model->doc = $map['doc'];
        }
        if (isset($map['https_internet'])) {
            $model->httpsInternet = $map['https_internet'];
        }
        if (isset($map['http_internal'])) {
            $model->httpInternal = $map['http_internal'];
        }
        if (isset($map['http_internet'])) {
            $model->httpInternet = $map['http_internet'];
        }
        if (isset($map['tcp'])) {
            $model->tcp = $map['tcp'];
        }

        return $model;
    }
}
