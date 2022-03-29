<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RMS\Models;

use AlibabaCloud\Tea\Model;

class AlarmWebHook extends Model
{
    // 主键 ID
    /**
     * @example 15
     *
     * @var int
     */
    public $id;

    // 名称
    /**
     * @example testcase
     *
     * @var string
     */
    public $name;

    // url
    /**
     * @example url
     *
     * @var string
     */
    public $url;

    // method (POST, GET等)
    /**
     * @example GET
     *
     * @var string
     */
    public $method;

    // headers
    /**
     * @example
     *
     * @var KeySet[]
     */
    public $headers;

    // params
    /**
     * @example
     *
     * @var KeySet[]
     */
    public $params;

    // config
    /**
     * @example
     *
     * @var KeySet[]
     */
    public $config;

    // body_template
    /**
     * @example {"alarm_title":${real_title}}
     *
     * @var string
     */
    public $bodyTemplate;

    // 是否该 scope 内全局
    /**
     * @example true, false
     *
     * @var bool
     */
    public $scopeGlobal;

    // creator
    /**
     * @example the creator
     *
     * @var string
     */
    public $creator;

    // modifier
    /**
     * @example the modifier
     *
     * @var string
     */
    public $modifier;

    // gmtCreate
    /**
     * @example
     *
     * @var int
     */
    public $gmtCreate;

    // gmtModified
    /**
     * @example
     *
     * @var int
     */
    public $gmtModified;

    // webhook订阅的规则数量
    /**
     * @example 0
     *
     * @var int
     */
    public $subscribeCount;

    // 当前租户有效还是当前workspace有效
    /**
     * @example 0,1
     *
     * @var int
     */
    public $validScope;
    protected $_name = [
        'id'             => 'id',
        'name'           => 'name',
        'url'            => 'url',
        'method'         => 'method',
        'headers'        => 'headers',
        'params'         => 'params',
        'config'         => 'config',
        'bodyTemplate'   => 'body_template',
        'scopeGlobal'    => 'scope_global',
        'creator'        => 'creator',
        'modifier'       => 'modifier',
        'gmtCreate'      => 'gmt_create',
        'gmtModified'    => 'gmt_modified',
        'subscribeCount' => 'subscribe_count',
        'validScope'     => 'valid_scope',
    ];

    public function validate()
    {
        Model::validateRequired('id', $this->id, true);
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('url', $this->url, true);
        Model::validateRequired('method', $this->method, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->url) {
            $res['url'] = $this->url;
        }
        if (null !== $this->method) {
            $res['method'] = $this->method;
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
        if (null !== $this->creator) {
            $res['creator'] = $this->creator;
        }
        if (null !== $this->modifier) {
            $res['modifier'] = $this->modifier;
        }
        if (null !== $this->gmtCreate) {
            $res['gmt_create'] = $this->gmtCreate;
        }
        if (null !== $this->gmtModified) {
            $res['gmt_modified'] = $this->gmtModified;
        }
        if (null !== $this->subscribeCount) {
            $res['subscribe_count'] = $this->subscribeCount;
        }
        if (null !== $this->validScope) {
            $res['valid_scope'] = $this->validScope;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return AlarmWebHook
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['url'])) {
            $model->url = $map['url'];
        }
        if (isset($map['method'])) {
            $model->method = $map['method'];
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
        if (isset($map['creator'])) {
            $model->creator = $map['creator'];
        }
        if (isset($map['modifier'])) {
            $model->modifier = $map['modifier'];
        }
        if (isset($map['gmt_create'])) {
            $model->gmtCreate = $map['gmt_create'];
        }
        if (isset($map['gmt_modified'])) {
            $model->gmtModified = $map['gmt_modified'];
        }
        if (isset($map['subscribe_count'])) {
            $model->subscribeCount = $map['subscribe_count'];
        }
        if (isset($map['valid_scope'])) {
            $model->validScope = $map['valid_scope'];
        }

        return $model;
    }
}
