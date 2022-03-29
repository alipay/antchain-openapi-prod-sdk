<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MQ\Models;

use AlibabaCloud\Tea\Model;

class TopicStatsItem extends Model
{
    // 该 Topic 每分钟发送的消息大小（byte）
    /**
     * @example 1000
     *
     * @var int
     */
    public $bpm;

    // Topic 名称
    /**
     * @example TP_XXX
     *
     * @var string
     */
    public $topic;

    // 该 Topic 每分钟发送的消息数量
    /**
     * @example 1000
     *
     * @var int
     */
    public $tpm;

    // 该 Topic 每天发送的消息数量
    //
    /**
     * @example 100000
     *
     * @var int
     */
    public $tpd;

    // 该 Topic 每天发送的消息大小（byte）
    //
    /**
     * @example 100000
     *
     * @var int
     */
    public $bpd;
    protected $_name = [
        'bpm'   => 'bpm',
        'topic' => 'topic',
        'tpm'   => 'tpm',
        'tpd'   => 'tpd',
        'bpd'   => 'bpd',
    ];

    public function validate()
    {
        Model::validateRequired('bpm', $this->bpm, true);
        Model::validateRequired('topic', $this->topic, true);
        Model::validateRequired('tpm', $this->tpm, true);
        Model::validateRequired('tpd', $this->tpd, true);
        Model::validateRequired('bpd', $this->bpd, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->bpm) {
            $res['bpm'] = $this->bpm;
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
        if (null !== $this->bpd) {
            $res['bpd'] = $this->bpd;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return TopicStatsItem
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['bpm'])) {
            $model->bpm = $map['bpm'];
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
        if (isset($map['bpd'])) {
            $model->bpd = $map['bpd'];
        }

        return $model;
    }
}
