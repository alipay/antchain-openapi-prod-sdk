<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MQ\Models;

use AlibabaCloud\Tea\Model;

class QueueDescDTO extends Model
{
    // 关联应用名
    /**
     * @example asso_app
     *
     * @var string
     */
    public $assoApp;

    // 通道名
    /**
     * @example channel
     *
     * @var string
     */
    public $channel;

    // 队列id
    /**
     * @example 1
     *
     * @var int
     */
    public $id;

    // 队列管理器ip
    /**
     * @example ip
     *
     * @var string
     */
    public $ip;

    // 队列管理器名
    /**
     * @example manager
     *
     * @var string
     */
    public $manager;

    // 队列名
    /**
     * @example name
     *
     * @var string
     */
    public $name;

    // 队列管理器端口
    /**
     * @example port
     *
     * @var string
     */
    public $port;

    // 队列类型
    /**
     * @example type
     *
     * @var string
     */
    public $type;
    protected $_name = [
        'assoApp' => 'asso_app',
        'channel' => 'channel',
        'id'      => 'id',
        'ip'      => 'ip',
        'manager' => 'manager',
        'name'    => 'name',
        'port'    => 'port',
        'type'    => 'type',
    ];

    public function validate()
    {
        Model::validateRequired('assoApp', $this->assoApp, true);
        Model::validateRequired('channel', $this->channel, true);
        Model::validateRequired('id', $this->id, true);
        Model::validateRequired('ip', $this->ip, true);
        Model::validateRequired('manager', $this->manager, true);
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('port', $this->port, true);
        Model::validateRequired('type', $this->type, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->assoApp) {
            $res['asso_app'] = $this->assoApp;
        }
        if (null !== $this->channel) {
            $res['channel'] = $this->channel;
        }
        if (null !== $this->id) {
            $res['id'] = $this->id;
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
     * @return QueueDescDTO
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['asso_app'])) {
            $model->assoApp = $map['asso_app'];
        }
        if (isset($map['channel'])) {
            $model->channel = $map['channel'];
        }
        if (isset($map['id'])) {
            $model->id = $map['id'];
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
