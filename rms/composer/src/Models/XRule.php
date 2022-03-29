<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RMS\Models;

use AlibabaCloud\Tea\Model;

class XRule extends Model
{
    // rule type
    /**
     * @example
     *
     * @var string
     */
    public $type;

    /**
     * @example
     *
     * @var int
     */
    public $interval;

    // rule timeout
    /**
     * @example
     *
     * @var int
     */
    public $timeout;

    /**
     * @example
     *
     * @var XExpression[]
     */
    public $externalTags;

    // log rules
    /**
     * @example
     *
     * @var XLogSubRule[]
     */
    public $rules;

    // metrics
    /**
     * @example
     *
     * @var XExpression[]
     */
    public $metrics;

    // prometheus port
    /**
     * @example
     *
     * @var int
     */
    public $port;

    // prometheus path
    /**
     * @example /metrics
     *
     * @var string
     */
    public $path;

    /**
     * @example http
     *
     * @var string
     */
    public $scheme;

    /**
     * @example GET
     *
     * @var string
     */
    public $method;

    // tcp ports
    /**
     * @example [80, 8080]
     *
     * @var int[]
     */
    public $ports;

    /**
     * @example
     *
     * @var XExpression[]
     */
    public $tags;

    /**
     * @example
     *
     * @var string
     */
    public $expression;

    /**
     * @example
     *
     * @var XMatchExpression
     */
    public $target;

    /**
     * @example true, false
     *
     * @var bool
     */
    public $localHost;

    /**
     * @example
     *
     * @var string
     */
    public $caFile;

    /**
     * @example
     *
     * @var string
     */
    public $certFile;

    /**
     * @example
     *
     * @var string
     */
    public $keyFile;

    /**
     * @example
     *
     * @var string
     */
    public $bearerTokenFile;

    /**
     * @example true, false
     *
     * @var bool
     */
    public $insecureSkipVerify;
    protected $_name = [
        'type'               => 'type',
        'interval'           => 'interval',
        'timeout'            => 'timeout',
        'externalTags'       => 'external_tags',
        'rules'              => 'rules',
        'metrics'            => 'metrics',
        'port'               => 'port',
        'path'               => 'path',
        'scheme'             => 'scheme',
        'method'             => 'method',
        'ports'              => 'ports',
        'tags'               => 'tags',
        'expression'         => 'expression',
        'target'             => 'target',
        'localHost'          => 'local_host',
        'caFile'             => 'ca_file',
        'certFile'           => 'cert_file',
        'keyFile'            => 'key_file',
        'bearerTokenFile'    => 'bearer_token_file',
        'insecureSkipVerify' => 'insecure_skip_verify',
    ];

    public function validate()
    {
        Model::validateRequired('type', $this->type, true);
        Model::validateRequired('interval', $this->interval, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }
        if (null !== $this->interval) {
            $res['interval'] = $this->interval;
        }
        if (null !== $this->timeout) {
            $res['timeout'] = $this->timeout;
        }
        if (null !== $this->externalTags) {
            $res['external_tags'] = [];
            if (null !== $this->externalTags && \is_array($this->externalTags)) {
                $n = 0;
                foreach ($this->externalTags as $item) {
                    $res['external_tags'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->rules) {
            $res['rules'] = [];
            if (null !== $this->rules && \is_array($this->rules)) {
                $n = 0;
                foreach ($this->rules as $item) {
                    $res['rules'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->metrics) {
            $res['metrics'] = [];
            if (null !== $this->metrics && \is_array($this->metrics)) {
                $n = 0;
                foreach ($this->metrics as $item) {
                    $res['metrics'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->port) {
            $res['port'] = $this->port;
        }
        if (null !== $this->path) {
            $res['path'] = $this->path;
        }
        if (null !== $this->scheme) {
            $res['scheme'] = $this->scheme;
        }
        if (null !== $this->method) {
            $res['method'] = $this->method;
        }
        if (null !== $this->ports) {
            $res['ports'] = $this->ports;
        }
        if (null !== $this->tags) {
            $res['tags'] = [];
            if (null !== $this->tags && \is_array($this->tags)) {
                $n = 0;
                foreach ($this->tags as $item) {
                    $res['tags'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->expression) {
            $res['expression'] = $this->expression;
        }
        if (null !== $this->target) {
            $res['target'] = null !== $this->target ? $this->target->toMap() : null;
        }
        if (null !== $this->localHost) {
            $res['local_host'] = $this->localHost;
        }
        if (null !== $this->caFile) {
            $res['ca_file'] = $this->caFile;
        }
        if (null !== $this->certFile) {
            $res['cert_file'] = $this->certFile;
        }
        if (null !== $this->keyFile) {
            $res['key_file'] = $this->keyFile;
        }
        if (null !== $this->bearerTokenFile) {
            $res['bearer_token_file'] = $this->bearerTokenFile;
        }
        if (null !== $this->insecureSkipVerify) {
            $res['insecure_skip_verify'] = $this->insecureSkipVerify;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return XRule
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['type'])) {
            $model->type = $map['type'];
        }
        if (isset($map['interval'])) {
            $model->interval = $map['interval'];
        }
        if (isset($map['timeout'])) {
            $model->timeout = $map['timeout'];
        }
        if (isset($map['external_tags'])) {
            if (!empty($map['external_tags'])) {
                $model->externalTags = [];
                $n                   = 0;
                foreach ($map['external_tags'] as $item) {
                    $model->externalTags[$n++] = null !== $item ? XExpression::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['rules'])) {
            if (!empty($map['rules'])) {
                $model->rules = [];
                $n            = 0;
                foreach ($map['rules'] as $item) {
                    $model->rules[$n++] = null !== $item ? XLogSubRule::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['metrics'])) {
            if (!empty($map['metrics'])) {
                $model->metrics = [];
                $n              = 0;
                foreach ($map['metrics'] as $item) {
                    $model->metrics[$n++] = null !== $item ? XExpression::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['port'])) {
            $model->port = $map['port'];
        }
        if (isset($map['path'])) {
            $model->path = $map['path'];
        }
        if (isset($map['scheme'])) {
            $model->scheme = $map['scheme'];
        }
        if (isset($map['method'])) {
            $model->method = $map['method'];
        }
        if (isset($map['ports'])) {
            if (!empty($map['ports'])) {
                $model->ports = $map['ports'];
            }
        }
        if (isset($map['tags'])) {
            if (!empty($map['tags'])) {
                $model->tags = [];
                $n           = 0;
                foreach ($map['tags'] as $item) {
                    $model->tags[$n++] = null !== $item ? XExpression::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['expression'])) {
            $model->expression = $map['expression'];
        }
        if (isset($map['target'])) {
            $model->target = XMatchExpression::fromMap($map['target']);
        }
        if (isset($map['local_host'])) {
            $model->localHost = $map['local_host'];
        }
        if (isset($map['ca_file'])) {
            $model->caFile = $map['ca_file'];
        }
        if (isset($map['cert_file'])) {
            $model->certFile = $map['cert_file'];
        }
        if (isset($map['key_file'])) {
            $model->keyFile = $map['key_file'];
        }
        if (isset($map['bearer_token_file'])) {
            $model->bearerTokenFile = $map['bearer_token_file'];
        }
        if (isset($map['insecure_skip_verify'])) {
            $model->insecureSkipVerify = $map['insecure_skip_verify'];
        }

        return $model;
    }
}
