<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class ExecContainerserviceApihookRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // url地址
    /**
     * @var string
     */
    public $url;

    // GET/POST
    /**
     * @var string
     */
    public $httpMethod;

    // 请求参数
    /**
     * @var string
     */
    public $queryParams;

    // 请求body
    /**
     * @var string
     */
    public $body;

    // application/x-www-form-urlencoded或application/json
    /**
     * @var string
     */
    public $contentType;
    protected $_name = [
        'authToken'   => 'auth_token',
        'url'         => 'url',
        'httpMethod'  => 'http_method',
        'queryParams' => 'query_params',
        'body'        => 'body',
        'contentType' => 'content_type',
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
        if (null !== $this->httpMethod) {
            $res['http_method'] = $this->httpMethod;
        }
        if (null !== $this->queryParams) {
            $res['query_params'] = $this->queryParams;
        }
        if (null !== $this->body) {
            $res['body'] = $this->body;
        }
        if (null !== $this->contentType) {
            $res['content_type'] = $this->contentType;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ExecContainerserviceApihookRequest
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
        if (isset($map['http_method'])) {
            $model->httpMethod = $map['http_method'];
        }
        if (isset($map['query_params'])) {
            $model->queryParams = $map['query_params'];
        }
        if (isset($map['body'])) {
            $model->body = $map['body'];
        }
        if (isset($map['content_type'])) {
            $model->contentType = $map['content_type'];
        }

        return $model;
    }
}
