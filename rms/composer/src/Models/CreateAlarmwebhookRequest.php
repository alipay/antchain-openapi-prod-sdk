<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RMS\Models;

use AlibabaCloud\Tea\Model;

class CreateAlarmwebhookRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 工作区名
    /**
     * @var string
     */
    public $workspaceName;

    // web hook 名称
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

    // web hook http headers
    /**
     * @var KeySet[]
     */
    public $headers;

    // web hook http params
    /**
     * @var KeySet[]
     */
    public $params;

    // 配置项（timeOut，retryCount）
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

    // 当前workspace有效，还是当前租户有效
    /**
     * @var int
     */
    public $validScope;
    protected $_name = [
        'authToken'     => 'auth_token',
        'workspaceName' => 'workspace_name',
        'name'          => 'name',
        'url'           => 'url',
        'httpMethod'    => 'http_method',
        'headers'       => 'headers',
        'params'        => 'params',
        'config'        => 'config',
        'bodyTemplate'  => 'body_template',
        'scopeGlobal'   => 'scope_global',
        'validScope'    => 'valid_scope',
    ];

    public function validate()
    {
        Model::validateRequired('workspaceName', $this->workspaceName, true);
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('url', $this->url, true);
        Model::validateRequired('httpMethod', $this->httpMethod, true);
        Model::validateRequired('scopeGlobal', $this->scopeGlobal, true);
        Model::validateRequired('validScope', $this->validScope, true);
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
        if (null !== $this->validScope) {
            $res['valid_scope'] = $this->validScope;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateAlarmwebhookRequest
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
        if (isset($map['valid_scope'])) {
            $model->validScope = $map['valid_scope'];
        }

        return $model;
    }
}
