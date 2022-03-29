<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MQ\Models;

use AlibabaCloud\Tea\Model;

class TraceMapResultDTO extends Model
{
    // 该查询任务的创建时间
    //
    //
    /**
     * @example 1570966857000
     *
     * @var int
     */
    public $createTime;

    // 实例 ID
    /**
     * @example MQ_INST_111111111111_DOxxxxxx
     *
     * @var string
     */
    public $instanceId;

    // 该查询任务对应的 Message ID
    /**
     * @example 1E05791C117818B4AAC23B1BB0CE****
     *
     * @var string
     */
    public $msgId;

    // 该查询任务对应的 Message Key
    /**
     * @example keyA
     *
     * @var string
     */
    public $msgKey;

    // 查询任务 ID
    /**
     * @example 272967562652883649157096685****
     *
     * @var string
     */
    public $queryId;

    // 该查询任务的结果。取值说明如下：finish：查询完成；working：查询中；removed：任务已删除。
    /**
     * @example finish
     *
     * @var string
     */
    public $status;

    // 该查询任务的 Topic
    /**
     * @example topic_a
     *
     * @var string
     */
    public $topic;

    // 该查询任务的匹配轨迹列表
    //
    /**
     * @example
     *
     * @var TraceMapDTO[]
     */
    public $traceList;

    // 该查询任务的最后更新时间
    /**
     * @example 1570966857000
     *
     * @var int
     */
    public $updateTime;

    // 查询用户 ID
    /**
     * @example 27296756265288****
     *
     * @var string
     */
    public $userId;
    protected $_name = [
        'createTime' => 'create_time',
        'instanceId' => 'instance_id',
        'msgId'      => 'msg_id',
        'msgKey'     => 'msg_key',
        'queryId'    => 'query_id',
        'status'     => 'status',
        'topic'      => 'topic',
        'traceList'  => 'trace_list',
        'updateTime' => 'update_time',
        'userId'     => 'user_id',
    ];

    public function validate()
    {
        Model::validateRequired('createTime', $this->createTime, true);
        Model::validateRequired('instanceId', $this->instanceId, true);
        Model::validateRequired('msgId', $this->msgId, true);
        Model::validateRequired('msgKey', $this->msgKey, true);
        Model::validateRequired('queryId', $this->queryId, true);
        Model::validateRequired('status', $this->status, true);
        Model::validateRequired('topic', $this->topic, true);
        Model::validateRequired('traceList', $this->traceList, true);
        Model::validateRequired('updateTime', $this->updateTime, true);
        Model::validateRequired('userId', $this->userId, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->createTime) {
            $res['create_time'] = $this->createTime;
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
        if (null !== $this->traceList) {
            $res['trace_list'] = [];
            if (null !== $this->traceList && \is_array($this->traceList)) {
                $n = 0;
                foreach ($this->traceList as $item) {
                    $res['trace_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->updateTime) {
            $res['update_time'] = $this->updateTime;
        }
        if (null !== $this->userId) {
            $res['user_id'] = $this->userId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return TraceMapResultDTO
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['create_time'])) {
            $model->createTime = $map['create_time'];
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
        if (isset($map['trace_list'])) {
            if (!empty($map['trace_list'])) {
                $model->traceList = [];
                $n                = 0;
                foreach ($map['trace_list'] as $item) {
                    $model->traceList[$n++] = null !== $item ? TraceMapDTO::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['update_time'])) {
            $model->updateTime = $map['update_time'];
        }
        if (isset($map['user_id'])) {
            $model->userId = $map['user_id'];
        }

        return $model;
    }
}
