<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\APIGATEWAY\Models;

use AlibabaCloud\Tea\Model;

class SofaGwUpstreamVO extends Model
{
    // GET/POST/PUT/DELETE
    /**
     * @example GET
     *
     * @var string
     */
    public $method;

    // 协议
    /**
     * @example http
     *
     * @var string
     */
    public $schema;

    // timeout
    /**
     * @example 3000
     *
     * @var int
     */
    public $timeout;

    // url
    /**
     * @example /resources
     *
     * @var string
     */
    public $url;

    // 是否签名
    /**
     * @example true, false
     *
     * @var bool
     */
    public $verify;
    protected $_name = [
        'method'  => 'method',
        'schema'  => 'schema',
        'timeout' => 'timeout',
        'url'     => 'url',
        'verify'  => 'verify',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->method) {
            $res['method'] = $this->method;
        }
        if (null !== $this->schema) {
            $res['schema'] = $this->schema;
        }
        if (null !== $this->timeout) {
            $res['timeout'] = $this->timeout;
        }
        if (null !== $this->url) {
            $res['url'] = $this->url;
        }
        if (null !== $this->verify) {
            $res['verify'] = $this->verify;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SofaGwUpstreamVO
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['method'])) {
            $model->method = $map['method'];
        }
        if (isset($map['schema'])) {
            $model->schema = $map['schema'];
        }
        if (isset($map['timeout'])) {
            $model->timeout = $map['timeout'];
        }
        if (isset($map['url'])) {
            $model->url = $map['url'];
        }
        if (isset($map['verify'])) {
            $model->verify = $map['verify'];
        }

        return $model;
    }
}
