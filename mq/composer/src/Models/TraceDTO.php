<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MQ\Models;

use AlibabaCloud\Tea\Model;

class TraceDTO extends Model
{
    // 查询的 Cell
    /**
     * @example RZ001
     *
     * @var string
     */
    public $cell;

    // 创建时间
    /**
     * @example
     *
     * @var int
     */
    public $gmtCreate;

    // 修改时间
    /**
     * @example
     *
     * @var int
     */
    public $gmtModified;

    // 实例 ID
    /**
     * @example SOFAMQ_INSTANCE_000001
     *
     * @var string
     */
    public $instanceId;

    // 消息查询所用的 Message ID
    /**
     * @example 1E05791C117818B4AAC23B1BB0CE****
     *
     * @var string
     */
    public $msgId;

    // 消息查询所用的 Message Key
    /**
     * @example ORDERID_100
     *
     * @var string
     */
    public $msgKey;

    // 查询 ID
    /**
     * @example 272967562652883649157096685****
     *
     * @var string
     */
    public $queryId;

    // 状态
    /**
     * @example QUERYING
     *
     * @var string
     */
    public $status;

    // 查询的 Topic
    /**
     * @example TP_xxx
     *
     * @var string
     */
    public $topic;
    protected $_name = [
        'cell'        => 'cell',
        'gmtCreate'   => 'gmt_create',
        'gmtModified' => 'gmt_modified',
        'instanceId'  => 'instance_id',
        'msgId'       => 'msg_id',
        'msgKey'      => 'msg_key',
        'queryId'     => 'query_id',
        'status'      => 'status',
        'topic'       => 'topic',
    ];

    public function validate()
    {
        Model::validateRequired('gmtCreate', $this->gmtCreate, true);
        Model::validateRequired('gmtModified', $this->gmtModified, true);
        Model::validateRequired('instanceId', $this->instanceId, true);
        Model::validateRequired('queryId', $this->queryId, true);
        Model::validateRequired('status', $this->status, true);
        Model::validateRequired('topic', $this->topic, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->cell) {
            $res['cell'] = $this->cell;
        }
        if (null !== $this->gmtCreate) {
            $res['gmt_create'] = $this->gmtCreate;
        }
        if (null !== $this->gmtModified) {
            $res['gmt_modified'] = $this->gmtModified;
        }
        if (null !== $this->instanceId) {
            $res['instance_id'] = $this->instanceId;
        }
        if (null !== $this->msgId) {
            $res['msg_id'] = $this->msgId;
        }
        if (null !== $this->msgKey) {
            $res['msg_key'] = $this->msgKey;
        }
        if (null !== $this->queryId) {
            $res['query_id'] = $this->queryId;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->topic) {
            $res['topic'] = $this->topic;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return TraceDTO
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['cell'])) {
            $model->cell = $map['cell'];
        }
        if (isset($map['gmt_create'])) {
            $model->gmtCreate = $map['gmt_create'];
        }
        if (isset($map['gmt_modified'])) {
            $model->gmtModified = $map['gmt_modified'];
        }
        if (isset($map['instance_id'])) {
            $model->instanceId = $map['instance_id'];
        }
        if (isset($map['msg_id'])) {
            $model->msgId = $map['msg_id'];
        }
        if (isset($map['msg_key'])) {
            $model->msgKey = $map['msg_key'];
        }
        if (isset($map['query_id'])) {
            $model->queryId = $map['query_id'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }
        if (isset($map['topic'])) {
            $model->topic = $map['topic'];
        }

        return $model;
    }
}
