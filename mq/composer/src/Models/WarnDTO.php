<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MQ\Models;

use AlibabaCloud\Tea\Model;

class WarnDTO extends Model
{
    // 报警时间段
    /**
     * @example 00:00-23:59
     *
     * @var string
     */
    public $alertTime;

    // 属性字符串
    /**
     * @example ""
     *
     * @var string
     */
    public $attribute;

    // 消息阻塞时间
    /**
     * @example 10
     *
     * @var int
     */
    public $blockTime;

    // 联系人列表
    /**
     * @example [["DingTalk", "机器人令牌", "组名"], ["DingTalk", "机器人令牌2", "组名2"]]
     *
     * @var string
     */
    public $contacts;

    // 延迟时间
    /**
     * @example 5
     *
     * @var int
     */
    public $delayTime;

    // 报警频率，单位分钟
    /**
     * @example 10
     *
     * @var int
     */
    public $frequency;

    // 创建时间
    /**
     * @example 1570701259403
     *
     * @var int
     */
    public $gmtCreate;

    // 修改时间
    /**
     * @example 1570701259403
     *
     * @var int
     */
    public $gmtModified;

    // 消费组 ID
    /**
     * @example GID_TEST
     *
     * @var string
     */
    public $groupId;

    // 报警 ID
    /**
     * @example 1
     *
     * @var int
     */
    public $id;

    // 实例 ID
    /**
     * @example SOFAMQ_INSTANCE_000001
     *
     * @var string
     */
    public $instanceId;

    // 操作者
    /**
     * @example alipay
     *
     * @var string
     */
    public $operator;

    // 阈值
    /**
     * @example 3000
     *
     * @var int
     */
    public $threshold;

    // 报警的 Topic
    /**
     * @example TP_TEST
     *
     * @var string
     */
    public $topic;

    // 报警级别
    /**
     * @example 5
     *
     * @var int
     */
    public $warnLevel;

    // 报警状态
    /**
     * @example 1
     *
     * @var int
     */
    public $warnStatus;

    // 报警类型
    /**
     * @example 5
     *
     * @var int
     */
    public $warnType;
    protected $_name = [
        'alertTime'   => 'alert_time',
        'attribute'   => 'attribute',
        'blockTime'   => 'block_time',
        'contacts'    => 'contacts',
        'delayTime'   => 'delay_time',
        'frequency'   => 'frequency',
        'gmtCreate'   => 'gmt_create',
        'gmtModified' => 'gmt_modified',
        'groupId'     => 'group_id',
        'id'          => 'id',
        'instanceId'  => 'instance_id',
        'operator'    => 'operator',
        'threshold'   => 'threshold',
        'topic'       => 'topic',
        'warnLevel'   => 'warn_level',
        'warnStatus'  => 'warn_status',
        'warnType'    => 'warn_type',
    ];

    public function validate()
    {
        Model::validateRequired('alertTime', $this->alertTime, true);
        Model::validateRequired('attribute', $this->attribute, true);
        Model::validateRequired('blockTime', $this->blockTime, true);
        Model::validateRequired('contacts', $this->contacts, true);
        Model::validateRequired('delayTime', $this->delayTime, true);
        Model::validateRequired('frequency', $this->frequency, true);
        Model::validateRequired('gmtCreate', $this->gmtCreate, true);
        Model::validateRequired('gmtModified', $this->gmtModified, true);
        Model::validateRequired('groupId', $this->groupId, true);
        Model::validateRequired('id', $this->id, true);
        Model::validateRequired('instanceId', $this->instanceId, true);
        Model::validateRequired('operator', $this->operator, true);
        Model::validateRequired('threshold', $this->threshold, true);
        Model::validateRequired('topic', $this->topic, true);
        Model::validateRequired('warnLevel', $this->warnLevel, true);
        Model::validateRequired('warnStatus', $this->warnStatus, true);
        Model::validateRequired('warnType', $this->warnType, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->alertTime) {
            $res['alert_time'] = $this->alertTime;
        }
        if (null !== $this->attribute) {
            $res['attribute'] = $this->attribute;
        }
        if (null !== $this->blockTime) {
            $res['block_time'] = $this->blockTime;
        }
        if (null !== $this->contacts) {
            $res['contacts'] = $this->contacts;
        }
        if (null !== $this->delayTime) {
            $res['delay_time'] = $this->delayTime;
        }
        if (null !== $this->frequency) {
            $res['frequency'] = $this->frequency;
        }
        if (null !== $this->gmtCreate) {
            $res['gmt_create'] = $this->gmtCreate;
        }
        if (null !== $this->gmtModified) {
            $res['gmt_modified'] = $this->gmtModified;
        }
        if (null !== $this->groupId) {
            $res['group_id'] = $this->groupId;
        }
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->instanceId) {
            $res['instance_id'] = $this->instanceId;
        }
        if (null !== $this->operator) {
            $res['operator'] = $this->operator;
        }
        if (null !== $this->threshold) {
            $res['threshold'] = $this->threshold;
        }
        if (null !== $this->topic) {
            $res['topic'] = $this->topic;
        }
        if (null !== $this->warnLevel) {
            $res['warn_level'] = $this->warnLevel;
        }
        if (null !== $this->warnStatus) {
            $res['warn_status'] = $this->warnStatus;
        }
        if (null !== $this->warnType) {
            $res['warn_type'] = $this->warnType;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return WarnDTO
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['alert_time'])) {
            $model->alertTime = $map['alert_time'];
        }
        if (isset($map['attribute'])) {
            $model->attribute = $map['attribute'];
        }
        if (isset($map['block_time'])) {
            $model->blockTime = $map['block_time'];
        }
        if (isset($map['contacts'])) {
            $model->contacts = $map['contacts'];
        }
        if (isset($map['delay_time'])) {
            $model->delayTime = $map['delay_time'];
        }
        if (isset($map['frequency'])) {
            $model->frequency = $map['frequency'];
        }
        if (isset($map['gmt_create'])) {
            $model->gmtCreate = $map['gmt_create'];
        }
        if (isset($map['gmt_modified'])) {
            $model->gmtModified = $map['gmt_modified'];
        }
        if (isset($map['group_id'])) {
            $model->groupId = $map['group_id'];
        }
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }
        if (isset($map['instance_id'])) {
            $model->instanceId = $map['instance_id'];
        }
        if (isset($map['operator'])) {
            $model->operator = $map['operator'];
        }
        if (isset($map['threshold'])) {
            $model->threshold = $map['threshold'];
        }
        if (isset($map['topic'])) {
            $model->topic = $map['topic'];
        }
        if (isset($map['warn_level'])) {
            $model->warnLevel = $map['warn_level'];
        }
        if (isset($map['warn_status'])) {
            $model->warnStatus = $map['warn_status'];
        }
        if (isset($map['warn_type'])) {
            $model->warnType = $map['warn_type'];
        }

        return $model;
    }
}
