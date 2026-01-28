<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\DUANKA\Models;

use AlibabaCloud\Tea\Model;

class QueryBpserviceHttpRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 请求地址
    /**
     * @var string
     */
    public $url;

    // 请求头参数
    /**
     * @var NameValuePair[]
     */
    public $headers;

    // 请求体JSON String
    /**
     * @var string
     */
    public $requestBody;

    // 0-GET，1-POST，2-PUT，3-DELETE
    /**
     * @var int
     */
    public $httpMethod;
    protected $_name = [
        'authToken'   => 'auth_token',
        'url'         => 'url',
        'headers'     => 'headers',
        'requestBody' => 'request_body',
        'httpMethod'  => 'http_method',
    ];

    public function validate()
    {
        Model::validateRequired('url', $this->url, true);
        Model::validateRequired('httpMethod', $this->httpMethod, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->url) {
            $res['url'] = $this->url;
        }
        if (null !== $this->headers) {
            $res['headers'] = [];
            if (null !== $this->headers && \is_array($this->headers)) {
                $n = 0;
                foreach ($this->headers as $item) {
                    $res['headers'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->requestBody) {
            $res['request_body'] = $this->requestBody;
        }
        if (null !== $this->httpMethod) {
            $res['http_method'] = $this->httpMethod;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryBpserviceHttpRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['url'])) {
            $model->url = $map['url'];
        }
        if (isset($map['headers'])) {
            if (!empty($map['headers'])) {
                $model->headers = [];
                $n              = 0;
                foreach ($map['headers'] as $item) {
                    $model->headers[$n++] = null !== $item ? NameValuePair::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['request_body'])) {
            $model->requestBody = $map['request_body'];
        }
        if (isset($map['http_method'])) {
            $model->httpMethod = $map['http_method'];
        }

        return $model;
    }
}
