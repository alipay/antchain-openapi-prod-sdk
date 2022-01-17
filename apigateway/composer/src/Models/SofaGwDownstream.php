<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\APIGATEWAY\Models;

use AlibabaCloud\Tea\Model;

class SofaGwDownstream extends Model
{
    // 认证信息
    /**
     * @example
     *
     * @var SofaGwAuthenticationVO[]
     */
    public $auth;

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

    // url
    /**
     * @example /dsrconsole/resources
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
        'auth'   => 'auth',
        'method' => 'method',
        'schema' => 'schema',
        'url'    => 'url',
        'verify' => 'verify',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->auth) {
            $res['auth'] = [];
            if (null !== $this->auth && \is_array($this->auth)) {
                $n = 0;
                foreach ($this->auth as $item) {
                    $res['auth'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->method) {
            $res['method'] = $this->method;
        }
        if (null !== $this->schema) {
            $res['schema'] = $this->schema;
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
     * @return SofaGwDownstream
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth'])) {
            if (!empty($map['auth'])) {
                $model->auth = [];
                $n           = 0;
                foreach ($map['auth'] as $item) {
                    $model->auth[$n++] = null !== $item ? SofaGwAuthenticationVO::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['method'])) {
            $model->method = $map['method'];
        }
        if (isset($map['schema'])) {
            $model->schema = $map['schema'];
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
