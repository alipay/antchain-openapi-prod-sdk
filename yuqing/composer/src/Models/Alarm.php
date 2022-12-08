<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\YUQING\Models;

use AlibabaCloud\Tea\Model;

class Alarm extends Model
{
    // 人工打的标签
    /**
     * @example ["tag"]
     *
     * @var string[]
     */
    public $tags;

    // 预警内容摘要
    /**
     * @example 预警内容摘要
     *
     * @var string
     */
    public $content;

    // 预警时间戳
    /**
     * @example 1670463939
     *
     * @var int
     */
    public $alarmTimestamp;

    // 舆情项目id
    /**
     * @example 1
     *
     * @var int
     */
    public $projectId;

    // 修改人
    /**
     * @example 小黄
     *
     * @var string
     */
    public $modifierName;

    // 消息标题
    /**
     * @example 消息标题
     *
     * @var string
     */
    public $title;

    // 消息id
    /**
     * @example 1
     *
     * @var int
     */
    public $id;

    // 作者名称
    /**
     * @example 作者名称
     *
     * @var string
     */
    public $authorName;

    // 预警规则id
    /**
     * @example 1
     *
     * @var int
     */
    public $alarmRuleId;

    // 预警规则类型
    /**
     * @example 预警规则类型
     *
     * @var string
     */
    public $type;

    // 修改时间戳
    /**
     * @example 1670463939
     *
     * @var int
     */
    public $gmtModifiedTimestamp;

    // 完整消息
    /**
     * @example
     *
     * @var YuqingMessage
     */
    public $message;
    protected $_name = [
        'tags'                 => 'tags',
        'content'              => 'content',
        'alarmTimestamp'       => 'alarm_timestamp',
        'projectId'            => 'project_id',
        'modifierName'         => 'modifier_name',
        'title'                => 'title',
        'id'                   => 'id',
        'authorName'           => 'author_name',
        'alarmRuleId'          => 'alarm_rule_id',
        'type'                 => 'type',
        'gmtModifiedTimestamp' => 'gmt_modified_timestamp',
        'message'              => 'message',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->tags) {
            $res['tags'] = $this->tags;
        }
        if (null !== $this->content) {
            $res['content'] = $this->content;
        }
        if (null !== $this->alarmTimestamp) {
            $res['alarm_timestamp'] = $this->alarmTimestamp;
        }
        if (null !== $this->projectId) {
            $res['project_id'] = $this->projectId;
        }
        if (null !== $this->modifierName) {
            $res['modifier_name'] = $this->modifierName;
        }
        if (null !== $this->title) {
            $res['title'] = $this->title;
        }
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->authorName) {
            $res['author_name'] = $this->authorName;
        }
        if (null !== $this->alarmRuleId) {
            $res['alarm_rule_id'] = $this->alarmRuleId;
        }
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }
        if (null !== $this->gmtModifiedTimestamp) {
            $res['gmt_modified_timestamp'] = $this->gmtModifiedTimestamp;
        }
        if (null !== $this->message) {
            $res['message'] = null !== $this->message ? $this->message->toMap() : null;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return Alarm
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['tags'])) {
            if (!empty($map['tags'])) {
                $model->tags = $map['tags'];
            }
        }
        if (isset($map['content'])) {
            $model->content = $map['content'];
        }
        if (isset($map['alarm_timestamp'])) {
            $model->alarmTimestamp = $map['alarm_timestamp'];
        }
        if (isset($map['project_id'])) {
            $model->projectId = $map['project_id'];
        }
        if (isset($map['modifier_name'])) {
            $model->modifierName = $map['modifier_name'];
        }
        if (isset($map['title'])) {
            $model->title = $map['title'];
        }
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }
        if (isset($map['author_name'])) {
            $model->authorName = $map['author_name'];
        }
        if (isset($map['alarm_rule_id'])) {
            $model->alarmRuleId = $map['alarm_rule_id'];
        }
        if (isset($map['type'])) {
            $model->type = $map['type'];
        }
        if (isset($map['gmt_modified_timestamp'])) {
            $model->gmtModifiedTimestamp = $map['gmt_modified_timestamp'];
        }
        if (isset($map['message'])) {
            $model->message = YuqingMessage::fromMap($map['message']);
        }

        return $model;
    }
}
