<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MQ\Models;

use AlibabaCloud\Tea\Model;

class QueryMeshQueuebyidResponse extends Model
{
    // 请求唯一ID，用于链路跟踪和问题排查
    /**
     * @var string
     */
    public $reqMsgId;

    // 结果码，一般OK表示调用成功
    /**
     * @var string
     */
    public $resultCode;

    // 异常信息的文本描述
    /**
     * @var string
     */
    public $resultMsg;

    // 关联应用
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

    // 队列名
    /**
     * @var string
     */
    public $name;

    // 队列管理器端口
    /**
     * @var string
     */
    public $port;

    // 状态码
    /**
     * @var int
     */
    public $state;

    // 类型
    /**
     * @var string
     */
    public $type;
    protected $_name = [
        'reqMsgId'   => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg'  => 'result_msg',
        'assoApp'    => 'asso_app',
        'channel'    => 'channel',
        'ip'         => 'ip',
        'manager'    => 'manager',
        'name'       => 'name',
        'port'       => 'port',
        'state'      => 'state',
        'type'       => 'type',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->reqMsgId) {
            $res['req_msg_id'] = $this->reqMsgId;
        }
        if (null !== $this->resultCode) {
            $res['result_code'] = $this->resultCode;
        }
        if (null !== $this->resultMsg) {
            $res['result_msg'] = $this->resultMsg;
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
        if (null !== $this->state) {
            $res['state'] = $this->state;
        }
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryMeshQueuebyidResponse
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['req_msg_id'])) {
            $model->reqMsgId = $map['req_msg_id'];
        }
        if (isset($map['result_code'])) {
            $model->resultCode = $map['result_code'];
        }
        if (isset($map['result_msg'])) {
            $model->resultMsg = $map['result_msg'];
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
        if (isset($map['state'])) {
            $model->state = $map['state'];
        }
        if (isset($map['type'])) {
            $model->type = $map['type'];
        }

        return $model;
    }
}
