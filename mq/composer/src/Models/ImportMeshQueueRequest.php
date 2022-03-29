<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MQ\Models;

use AlibabaCloud\Tea\Model;

class ImportMeshQueueRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    /**
     * @var string
     */
    public $productInstanceId;

    // 关联应用名
    /**
     * @var string
     */
    public $assoApp;

    // 通道名
    /**
     * @var string
     */
    public $channel;

    // 队列管理器ip
    /**
     * @var string
     */
    public $ip;

    // 队列管理器名
    /**
     * @var string
     */
    public $manager;

    // 队列名称
    /**
     * @var string
     */
    public $name;

    // 队列管理器端口
    /**
     * @var string
     */
    public $port;

    // 队列类型
    /**
     * @var string
     */
    public $type;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'assoApp'           => 'asso_app',
        'channel'           => 'channel',
        'ip'                => 'ip',
        'manager'           => 'manager',
        'name'              => 'name',
        'port'              => 'port',
        'type'              => 'type',
    ];

    public function validate()
    {
        Model::validateRequired('assoApp', $this->assoApp, true);
        Model::validateRequired('channel', $this->channel, true);
        Model::validateRequired('ip', $this->ip, true);
        Model::validateRequired('manager', $this->manager, true);
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('port', $this->port, true);
        Model::validateRequired('type', $this->type, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->assoApp) {
            $res['asso_app'] = $this->assoApp;
        }
        if (null !== $this->channel) {
            $res['channel'] = $this->channel;
        }
        if (null !== $this->ip) {
            $res['ip'] = $this->ip;
        }
        if (null !== $this->manager) {
            $res['manager'] = $this->manager;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->port) {
            $res['port'] = $this->port;
        }
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ImportMeshQueueRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['product_instance_id'])) {
            $model->productInstanceId = $map['product_instance_id'];
        }
        if (isset($map['asso_app'])) {
            $model->assoApp = $map['asso_app'];
        }
        if (isset($map['channel'])) {
            $model->channel = $map['channel'];
        }
        if (isset($map['ip'])) {
            $model->ip = $map['ip'];
        }
        if (isset($map['manager'])) {
            $model->manager = $map['manager'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['port'])) {
            $model->port = $map['port'];
        }
        if (isset($map['type'])) {
            $model->type = $map['type'];
        }

        return $model;
    }
}
