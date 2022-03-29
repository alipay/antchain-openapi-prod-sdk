<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RMS\Models;

use AlibabaCloud\Tea\Model;

class UpdateAlarmwebhookRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // workspace_name
    /**
     * @var string
     */
    public $workspaceName;

    // id
    /**
     * @var int
     */
    public $id;

    // name
    /**
     * @var string
     */
    public $name;

    // web hook http url
    /**
     * @var string
     */
    public $url;

    // web hook http method
    /**
     * @var string
     */
    public $httpMethod;

    // headers
    /**
     * @var KeySet[]
     */
    public $headers;

    // params
    /**
     * @var KeySet[]
     */
    public $params;

    // config
    /**
     * @var KeySet[]
     */
    public $config;

    // body_template
    /**
     * @var string
     */
    public $bodyTemplate;

    // scope_global
    /**
     * @var bool
     */
    public $scopeGlobal;
    protected $_name = [
        'authToken'     => 'auth_token',
        'workspaceName' => 'workspace_name',
        'id'            => 'id',
        'name'          => 'name',
        'url'           => 'url',
        'httpMethod'    => 'http_method',
        'headers'       => 'headers',
        'params'        => 'params',
        'config'        => 'config',
        'bodyTemplate'  => 'body_template',
        'scopeGlobal'   => 'scope_global',
    ];

    public function validate()
    {
        Model::validateRequired('workspaceName', $this->workspaceName, true);
        Model::validateRequired('id', $this->id, true);
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('url', $this->url, true);
        Model::validateRequired('httpMethod', $this->httpMethod, true);
        Model::validateRequired('scopeGlobal', $this->scopeGlobal, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->workspaceName) {
            $res['workspace_name'] = $this->workspaceName;
        }
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->url) {
            $res['url'] = $this->url;
        }
        if (null !== $this->httpMethod) {
            $res['http_method'] = $this->httpMethod;
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
        if (null !== $this->params) {
            $res['params'] = [];
            if (null !== $this->params && \is_array($this->params)) {
                $n = 0;
                foreach ($this->params as $item) {
                    $res['params'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->config) {
            $res['config'] = [];
            if (null !== $this->config && \is_array($this->config)) {
                $n = 0;
                foreach ($this->config as $item) {
                    $res['config'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->bodyTemplate) {
            $res['body_template'] = $this->bodyTemplate;
        }
        if (null !== $this->scopeGlobal) {
            $res['scope_global'] = $this->scopeGlobal;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return UpdateAlarmwebhookRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['workspace_name'])) {
            $model->workspaceName = $map['workspace_name'];
        }
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['url'])) {
            $model->url = $map['url'];
        }
        if (isset($map['http_method'])) {
            $model->httpMethod = $map['http_method'];
        }
        if (isset($map['headers'])) {
            if (!empty($map['headers'])) {
                $model->headers = [];
                $n              = 0;
                foreach ($map['headers'] as $item) {
                    $model->headers[$n++] = null !== $item ? KeySet::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['params'])) {
            if (!empty($map['params'])) {
                $model->params = [];
                $n             = 0;
                foreach ($map['params'] as $item) {
                    $model->params[$n++] = null !== $item ? KeySet::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['config'])) {
            if (!empty($map['config'])) {
                $model->config = [];
                $n             = 0;
                foreach ($map['config'] as $item) {
                    $model->config[$n++] = null !== $item ? KeySet::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['body_template'])) {
            $model->bodyTemplate = $map['body_template'];
        }
        if (isset($map['scope_global'])) {
            $model->scopeGlobal = $map['scope_global'];
        }

        return $model;
    }
}
