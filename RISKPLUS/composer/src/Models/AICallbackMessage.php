<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class AICallbackMessage extends Model
{
    // 批次号
    /**
     * @example 5de2ccbf87914544afb57a77e39ec023
     *
     * @var string
     */
    public $batchId;

    // 用户标签
    /**
     * @example 阿松大
     *
     * @var string
     */
    public $tag;

    // 外呼id
    /**
     * @example CALLID
     *
     * @var string
     */
    public $callId;

    // 外呼的话术模板Id
    /**
     * @example 7
     *
     * @var int
     */
    public $templateId;

    // 外呼状态编码
    /**
     * @example 1
     *
     * @var int
     */
    public $statusCode;

    // 外呼状态描述
    /**
     * @example 已接听
     *
     * @var string
     */
    public $statusDescription;

    // 导入时间
    /**
     * @example 2019-11-23 14:47:06
     *
     * @var string
     */
    public $importTime;

    // 开始通话时间
    /**
     * @example 2019-11-23 14:47:06
     *
     * @var string
     */
    public $callBeginTime;

    // 振铃时长, 单位毫秒
    /**
     * @example 2000
     *
     * @var int
     */
    public $ringTime;

    // 接通时间
    /**
     * @example 2019-01-09 14:14:19
     *
     * @var string
     */
    public $answerTime;

    // AI通话时长,单位s
    /**
     * @example 20
     *
     * @var int
     */
    public $speakingDuration;

    // 挂断时间
    /**
     * @example 2019-01-09 14:14:19
     *
     * @var string
     */
    public $hangupTime;

    // 对话轮次
    /**
     * @example 5
     *
     * @var int
     */
    public $speakingTurns;

    // 意向标签
    /**
     * @example C
     *
     * @var string
     */
    public $intentTag;

    // 意向说明
    /**
     * @example 确认本人,未承诺还款
     *
     * @var string
     */
    public $intentDescription;

    // 个性标签
    /**
     * @example a
     *
     * @var string
     */
    public $individualTag;

    // 回复关键词
    /**
     * @example 利息
     *
     * @var string
     */
    public $keywords;

    // 对话录音
    /**
     * @example 录音url
     *
     * @var string
     */
    public $chatRecord;

    // 参数值
    /**
     * @example {"电话号码":"13100000000"}
     *
     * @var string
     */
    public $properties;
    protected $_name = [
        'batchId'           => 'batch_id',
        'tag'               => 'tag',
        'callId'            => 'call_id',
        'templateId'        => 'template_id',
        'statusCode'        => 'status_code',
        'statusDescription' => 'status_description',
        'importTime'        => 'import_time',
        'callBeginTime'     => 'call_begin_time',
        'ringTime'          => 'ring_time',
        'answerTime'        => 'answer_time',
        'speakingDuration'  => 'speaking_duration',
        'hangupTime'        => 'hangup_time',
        'speakingTurns'     => 'speaking_turns',
        'intentTag'         => 'intent_tag',
        'intentDescription' => 'intent_description',
        'individualTag'     => 'individual_tag',
        'keywords'          => 'keywords',
        'chatRecord'        => 'chat_record',
        'properties'        => 'properties',
    ];

    public function validate()
    {
        Model::validateRequired('tag', $this->tag, true);
        Model::validateRequired('callId', $this->callId, true);
        Model::validateRequired('statusCode', $this->statusCode, true);
        Model::validateRequired('statusDescription', $this->statusDescription, true);
        Model::validateRequired('importTime', $this->importTime, true);
        Model::validateRequired('callBeginTime', $this->callBeginTime, true);
        Model::validateRequired('ringTime', $this->ringTime, true);
        Model::validateRequired('answerTime', $this->answerTime, true);
        Model::validateRequired('speakingDuration', $this->speakingDuration, true);
        Model::validateRequired('hangupTime', $this->hangupTime, true);
        Model::validateRequired('speakingTurns', $this->speakingTurns, true);
        Model::validateRequired('intentTag', $this->intentTag, true);
        Model::validateRequired('intentDescription', $this->intentDescription, true);
        Model::validateRequired('individualTag', $this->individualTag, true);
        Model::validateRequired('keywords', $this->keywords, true);
        Model::validateRequired('properties', $this->properties, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->batchId) {
            $res['batch_id'] = $this->batchId;
        }
        if (null !== $this->tag) {
            $res['tag'] = $this->tag;
        }
        if (null !== $this->callId) {
            $res['call_id'] = $this->callId;
        }
        if (null !== $this->templateId) {
            $res['template_id'] = $this->templateId;
        }
        if (null !== $this->statusCode) {
            $res['status_code'] = $this->statusCode;
        }
        if (null !== $this->statusDescription) {
            $res['status_description'] = $this->statusDescription;
        }
        if (null !== $this->importTime) {
            $res['import_time'] = $this->importTime;
        }
        if (null !== $this->callBeginTime) {
            $res['call_begin_time'] = $this->callBeginTime;
        }
        if (null !== $this->ringTime) {
            $res['ring_time'] = $this->ringTime;
        }
        if (null !== $this->answerTime) {
            $res['answer_time'] = $this->answerTime;
        }
        if (null !== $this->speakingDuration) {
            $res['speaking_duration'] = $this->speakingDuration;
        }
        if (null !== $this->hangupTime) {
            $res['hangup_time'] = $this->hangupTime;
        }
        if (null !== $this->speakingTurns) {
            $res['speaking_turns'] = $this->speakingTurns;
        }
        if (null !== $this->intentTag) {
            $res['intent_tag'] = $this->intentTag;
        }
        if (null !== $this->intentDescription) {
            $res['intent_description'] = $this->intentDescription;
        }
        if (null !== $this->individualTag) {
            $res['individual_tag'] = $this->individualTag;
        }
        if (null !== $this->keywords) {
            $res['keywords'] = $this->keywords;
        }
        if (null !== $this->chatRecord) {
            $res['chat_record'] = $this->chatRecord;
        }
        if (null !== $this->properties) {
            $res['properties'] = $this->properties;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return AICallbackMessage
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['batch_id'])) {
            $model->batchId = $map['batch_id'];
        }
        if (isset($map['tag'])) {
            $model->tag = $map['tag'];
        }
        if (isset($map['call_id'])) {
            $model->callId = $map['call_id'];
        }
        if (isset($map['template_id'])) {
            $model->templateId = $map['template_id'];
        }
        if (isset($map['status_code'])) {
            $model->statusCode = $map['status_code'];
        }
        if (isset($map['status_description'])) {
            $model->statusDescription = $map['status_description'];
        }
        if (isset($map['import_time'])) {
            $model->importTime = $map['import_time'];
        }
        if (isset($map['call_begin_time'])) {
            $model->callBeginTime = $map['call_begin_time'];
        }
        if (isset($map['ring_time'])) {
            $model->ringTime = $map['ring_time'];
        }
        if (isset($map['answer_time'])) {
            $model->answerTime = $map['answer_time'];
        }
        if (isset($map['speaking_duration'])) {
            $model->speakingDuration = $map['speaking_duration'];
        }
        if (isset($map['hangup_time'])) {
            $model->hangupTime = $map['hangup_time'];
        }
        if (isset($map['speaking_turns'])) {
            $model->speakingTurns = $map['speaking_turns'];
        }
        if (isset($map['intent_tag'])) {
            $model->intentTag = $map['intent_tag'];
        }
        if (isset($map['intent_description'])) {
            $model->intentDescription = $map['intent_description'];
        }
        if (isset($map['individual_tag'])) {
            $model->individualTag = $map['individual_tag'];
        }
        if (isset($map['keywords'])) {
            $model->keywords = $map['keywords'];
        }
        if (isset($map['chat_record'])) {
            $model->chatRecord = $map['chat_record'];
        }
        if (isset($map['properties'])) {
            $model->properties = $map['properties'];
        }

        return $model;
    }
}
