<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MQ\Models;

use AlibabaCloud\Tea\Model;

class GroupStatsItem extends Model
{
    // 每分钟消息大小
    /**
     * @example
     *
     * @var int
     */
    public $bpm;

    // 死信数量
    /**
     * @example
     *
     * @var int
     */
    public $dlq;

    // 消费组 Group ID
    /**
     * @example GID_XXX
     *
     * @var string
     */
    public $groupId;

    // 当前 Group 消息积压的数量
    /**
     * @example 1000
     *
     * @var int
     */
    public $msgBacklog;

    // 当前每分钟 Group ID 拉请求数量
    /**
     * @example 1000
     *
     * @var int
     */
    public $ppm;

    // Topic 名称
    /**
     * @example TP_TEST
     *
     * @var string
     */
    public $topic;

    // 每分钟拉取的消息数量
    /**
     * @example 1000
     *
     * @var int
     */
    public $tpm;

    // 每天拉取的消息数量
    /**
     * @example 100000
     *
     * @var int
     */
    public $tpd;
    protected $_name = [
        'bpm'        => 'bpm',
        'dlq'        => 'dlq',
        'groupId'    => 'group_id',
        'msgBacklog' => 'msg_backlog',
        'ppm'        => 'ppm',
        'topic'      => 'topic',
        'tpm'        => 'tpm',
        'tpd'        => 'tpd',
    ];

    public function validate()
    {
        Model::validateRequired('bpm', $this->bpm, true);
        Model::validateRequired('dlq', $this->dlq, true);
        Model::validateRequired('groupId', $this->groupId, true);
        Model::validateRequired('msgBacklog', $this->msgBacklog, true);
        Model::validateRequired('ppm', $this->ppm, true);
        Model::validateRequired('topic', $this->topic, true);
        Model::validateRequired('tpm', $this->tpm, true);
        Model::validateRequired('tpd', $this->tpd, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->bpm) {
            $res['bpm'] = $this->bpm;
        }
        if (null !== $this->dlq) {
            $res['dlq'] = $this->dlq;
        }
        if (null !== $this->groupId) {
            $res['group_id'] = $this->groupId;
        }
        if (null !== $this->msgBacklog) {
            $res['msg_backlog'] = $this->msgBacklog;
        }
        if (null !== $this->ppm) {
            $res['ppm'] = $this->ppm;
        }
        if (null !== $this->topic) {
            $res['topic'] = $this->topic;
        }
        if (null !== $this->tpm) {
            $res['tpm'] = $this->tpm;
        }
        if (null !== $this->tpd) {
            $res['tpd'] = $this->tpd;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return GroupStatsItem
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['bpm'])) {
            $model->bpm = $map['bpm'];
        }
        if (isset($map['dlq'])) {
            $model->dlq = $map['dlq'];
        }
        if (isset($map['group_id'])) {
            $model->groupId = $map['group_id'];
        }
        if (isset($map['msg_backlog'])) {
            $model->msgBacklog = $map['msg_backlog'];
        }
        if (isset($map['ppm'])) {
            $model->ppm = $map['ppm'];
        }
        if (isset($map['topic'])) {
            $model->topic = $map['topic'];
        }
        if (isset($map['tpm'])) {
            $model->tpm = $map['tpm'];
        }
        if (isset($map['tpd'])) {
            $model->tpd = $map['tpd'];
        }

        return $model;
    }
}
