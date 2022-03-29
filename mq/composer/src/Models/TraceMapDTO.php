<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MQ\Models;

use AlibabaCloud\Tea\Model;

class TraceMapDTO extends Model
{
    // 消息发送方的客户端地址
    /**
     * @example 30.5.**.**
     *
     * @var string
     */
    public $bornHost;

    // 生产端的cell name
    /**
     * @example RZ00A
     *
     * @var string
     */
    public $cell;

    // 发送耗时，单位毫秒
    /**
     * @example 24
     *
     * @var int
     */
    public $costTime;

    // 消息的 ID，即 Message ID
    /**
     * @example 0BC1F01800002A9F000000531246****
     *
     * @var string
     */
    public $msgId;

    // 消息的 Key ，即 Message Key
    /**
     * @example ORDERID_100
     *
     * @var string
     */
    public $msgKey;

    // 发送方客户端配置的 Group ID
    /**
     * @example GID_test
     *
     * @var string
     */
    public $pubGroupName;

    // 消息发送时间
    /**
     * @example 1570850870478
     *
     * @var int
     */
    public $pubTime;

    // 发送状态。取值说明如下：
    //
    // SEND_SUCCESS：发送成功
    // SEND_FAILED：发送失败
    // SEND_ROLLBACK：事务消息回滚
    // SEND_UNKNOWN：事务消息未提交
    // SEND_DELAY：定时(延时)消息定时中
    /**
     * @example SEND_SUCCESS
     *
     * @var string
     */
    public $status;

    // 消息的消费轨迹列表
    /**
     * @example
     *
     * @var SubMapDTO[]
     */
    public $subList;

    // 消息的 Tag，即 Message Tag
    /**
     * @example TagA
     *
     * @var string
     */
    public $tag;

    // 消息的 Topic
    /**
     * @example test
     *
     * @var string
     */
    public $topic;
    protected $_name = [
        'bornHost'     => 'born_host',
        'cell'         => 'cell',
        'costTime'     => 'cost_time',
        'msgId'        => 'msg_id',
        'msgKey'       => 'msg_key',
        'pubGroupName' => 'pub_group_name',
        'pubTime'      => 'pub_time',
        'status'       => 'status',
        'subList'      => 'sub_list',
        'tag'          => 'tag',
        'topic'        => 'topic',
    ];

    public function validate()
    {
        Model::validateRequired('bornHost', $this->bornHost, true);
        Model::validateRequired('costTime', $this->costTime, true);
        Model::validateRequired('msgId', $this->msgId, true);
        Model::validateRequired('msgKey', $this->msgKey, true);
        Model::validateRequired('pubGroupName', $this->pubGroupName, true);
        Model::validateRequired('pubTime', $this->pubTime, true);
        Model::validateRequired('status', $this->status, true);
        Model::validateRequired('subList', $this->subList, true);
        Model::validateRequired('tag', $this->tag, true);
        Model::validateRequired('topic', $this->topic, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->bornHost) {
            $res['born_host'] = $this->bornHost;
        }
        if (null !== $this->cell) {
            $res['cell'] = $this->cell;
        }
        if (null !== $this->costTime) {
            $res['cost_time'] = $this->costTime;
        }
        if (null !== $this->msgId) {
            $res['msg_id'] = $this->msgId;
        }
        if (null !== $this->msgKey) {
            $res['msg_key'] = $this->msgKey;
        }
        if (null !== $this->pubGroupName) {
            $res['pub_group_name'] = $this->pubGroupName;
        }
        if (null !== $this->pubTime) {
            $res['pub_time'] = $this->pubTime;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->subList) {
            $res['sub_list'] = [];
            if (null !== $this->subList && \is_array($this->subList)) {
                $n = 0;
                foreach ($this->subList as $item) {
                    $res['sub_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->tag) {
            $res['tag'] = $this->tag;
        }
        if (null !== $this->topic) {
            $res['topic'] = $this->topic;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return TraceMapDTO
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['born_host'])) {
            $model->bornHost = $map['born_host'];
        }
        if (isset($map['cell'])) {
            $model->cell = $map['cell'];
        }
        if (isset($map['cost_time'])) {
            $model->costTime = $map['cost_time'];
        }
        if (isset($map['msg_id'])) {
            $model->msgId = $map['msg_id'];
        }
        if (isset($map['msg_key'])) {
            $model->msgKey = $map['msg_key'];
        }
        if (isset($map['pub_group_name'])) {
            $model->pubGroupName = $map['pub_group_name'];
        }
        if (isset($map['pub_time'])) {
            $model->pubTime = $map['pub_time'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }
        if (isset($map['sub_list'])) {
            if (!empty($map['sub_list'])) {
                $model->subList = [];
                $n              = 0;
                foreach ($map['sub_list'] as $item) {
                    $model->subList[$n++] = null !== $item ? SubMapDTO::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['tag'])) {
            $model->tag = $map['tag'];
        }
        if (isset($map['topic'])) {
            $model->topic = $map['topic'];
        }

        return $model;
    }
}
