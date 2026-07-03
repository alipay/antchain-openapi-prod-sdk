<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class CommonRobotCallDetail extends Model
{
    // 客户请求时的透传字段
    /**
     * @example 请求透传字段
     *
     * @var string
     */
    public $extInfo;

    // 成功触达：OK；未触达：AI_ROBOT_CALL_REQUEST_NOT_EXIST
    /**
     * @example OK
     *
     * @var string
     */
    public $resultCode;

    // 外呼号码
    /**
     * @example 130XXXXXX
     *
     * @var string
     */
    public $customerKey;

    // 呼叫次数
    /**
     * @example 1
     *
     * @var int
     */
    public $currentCallTimes;

    // 号码模版
    /**
     * @example MOBILE/MOBILE/CUSTOMER_ENCRY
     *
     * @var string
     */
    public $keyTemplate;

    // 导入号码时返回的批次号
    /**
     * @example 1
     *
     * @var string
     */
    public $batchId;

    // 2001:批量-预测外呼，2002:批量-AI外呼-不转人工，2003:批量-AI外呼-接通转人工，2004: 批量-AI外呼-智能转人工,2005:批量-语音通知
    /**
     * @example 2001
     *
     * @var int
     */
    public $callType;

    // 用户自定义标签
    /**
     * @example tag
     *
     * @var string
     */
    public $tag;

    // 外呼id
    /**
     * @example 9b2eb6b8
     *
     * @var string
     */
    public $callId;

    // 外呼任务编号
    /**
     * @example 1
     *
     * @var int
     */
    public $taskId;

    // AI话术ID
    /**
     * @example 1
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
     * @example 1
     *
     * @var string
     */
    public $statusDescription;

    // 转人工状态编码
    /**
     * @example 1
     *
     * @var int
     */
    public $transferStatusCode;

    // 转人工状态
    /**
     * @example 0
     *
     * @var string
     */
    public $transferStatus;

    // 分配坐席ID
    /**
     * @example
     *
     * @var int
     */
    public $agentId;

    // 坐席在贵司业务系统唯一标识，用于查询对应agentId；可以为空。
    /**
     * @example a
     *
     * @var string
     */
    public $agentTag;

    // 坐席分机号
    /**
     * @example a
     *
     * @var string
     */
    public $agentExtension;

    // 导入时间
    /**
     * @example 2019-01-09 14:14:19
     *
     * @var string
     */
    public $importTime;

    // 开始通话时间
    /**
     * @example 2019-01-09 14:14:19
     *
     * @var string
     */
    public $callBeginTime;

    // 振铃时长，单位ms
    /**
     * @example 10
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

    // 通话时长，单位：大于1分钟，显示分钟秒，小于1分钟，显示秒
    /**
     * @example 1
     *
     * @var string
     */
    public $speakingTime;

    // 通话时长，单位：秒
    /**
     * @example 1
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
     * @example 1
     *
     * @var int
     */
    public $speakingTurns;

    // 人工通话时长，单位：大于1分钟，显示分钟秒，小于1分钟，显示秒
    /**
     * @example 1
     *
     * @var string
     */
    public $agentSpeakingTime;

    // 人工通话时长，单位：秒
    /**
     * @example 1
     *
     * @var int
     */
    public $agentSpeakingDuration;

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
     * @example 投诉,非本人
     *
     * @var string
     */
    public $individualTag;

    // 回复关键词
    /**
     * @example 链接,利息
     *
     * @var string
     */
    public $keywords;

    // 挂机方式，AI挂机1，坐席挂机2，客户挂机3
    /**
     * @example 1
     *
     * @var int
     */
    public $hungupType;

    // 挂机短信，可选值：1、2
    // 1:发送，2:不发送
    /**
     * @example 1
     *
     * @var string
     */
    public $sms;

    // 对话录音，URL，可以为空
    /**
     * @example 1
     *
     * @var string
     */
    public $chatRecord;

    // 聊天记录，可以为空
    /**
     * @example {}
     *
     * @var string
     */
    public $chats;

    // 可选值：0、1
    // 0:不添加，1:添加
    /**
     * @example 1
     *
     * @var int
     */
    public $addWx;

    // 加微进度，可选值：已申请、加微成功
    /**
     * @example 已申请
     *
     * @var string
     */
    public $addWxStatus;

    // 是否接通重呼，可选值：0、1
    // 0正常外呼，1接通重呼
    /**
     * @example 1
     *
     * @var int
     */
    public $answerRecall;

    // 导入号码时的参数值
    /**
     * @example {"电话号码":"13100000000"}
     *
     * @var string
     */
    public $properties;

    // 导入号码时的业务参数值，原样返回
    /**
     * @example a
     *
     * @var string
     */
    public $bizProperties;

    // 拦截原因：当状态为已拦截时，可选值：黑名单拦截，灰名单拦截，异常号码拦截
    /**
     * @example 黑名单拦截
     *
     * @var string
     */
    public $interceptReason;
    protected $_name = [
        'extInfo'               => 'ext_info',
        'resultCode'            => 'result_code',
        'customerKey'           => 'customer_key',
        'currentCallTimes'      => 'current_call_times',
        'keyTemplate'           => 'key_template',
        'batchId'               => 'batch_id',
        'callType'              => 'call_type',
        'tag'                   => 'tag',
        'callId'                => 'call_id',
        'taskId'                => 'task_id',
        'templateId'            => 'template_id',
        'statusCode'            => 'status_code',
        'statusDescription'     => 'status_description',
        'transferStatusCode'    => 'transfer_status_code',
        'transferStatus'        => 'transfer_status',
        'agentId'               => 'agent_id',
        'agentTag'              => 'agent_tag',
        'agentExtension'        => 'agent_extension',
        'importTime'            => 'import_time',
        'callBeginTime'         => 'call_begin_time',
        'ringTime'              => 'ring_time',
        'answerTime'            => 'answer_time',
        'speakingTime'          => 'speaking_time',
        'speakingDuration'      => 'speaking_duration',
        'hangupTime'            => 'hangup_time',
        'speakingTurns'         => 'speaking_turns',
        'agentSpeakingTime'     => 'agent_speaking_time',
        'agentSpeakingDuration' => 'agent_speaking_duration',
        'intentTag'             => 'intent_tag',
        'intentDescription'     => 'intent_description',
        'individualTag'         => 'individual_tag',
        'keywords'              => 'keywords',
        'hungupType'            => 'hungup_type',
        'sms'                   => 'sms',
        'chatRecord'            => 'chat_record',
        'chats'                 => 'chats',
        'addWx'                 => 'add_wx',
        'addWxStatus'           => 'add_wx_status',
        'answerRecall'          => 'answer_recall',
        'properties'            => 'properties',
        'bizProperties'         => 'biz_properties',
        'interceptReason'       => 'intercept_reason',
    ];

    public function validate()
    {
        Model::validateRequired('extInfo', $this->extInfo, true);
        Model::validateRequired('resultCode', $this->resultCode, true);
        Model::validateRequired('customerKey', $this->customerKey, true);
        Model::validateRequired('currentCallTimes', $this->currentCallTimes, true);
        Model::validateRequired('keyTemplate', $this->keyTemplate, true);
        Model::validateRequired('batchId', $this->batchId, true);
        Model::validateRequired('callType', $this->callType, true);
        Model::validateRequired('callId', $this->callId, true);
        Model::validateRequired('taskId', $this->taskId, true);
        Model::validateRequired('statusCode', $this->statusCode, true);
        Model::validateRequired('statusDescription', $this->statusDescription, true);
        Model::validateRequired('transferStatusCode', $this->transferStatusCode, true);
        Model::validateRequired('transferStatus', $this->transferStatus, true);
        Model::validateRequired('importTime', $this->importTime, true);
        Model::validateRequired('callBeginTime', $this->callBeginTime, true);
        Model::validateRequired('ringTime', $this->ringTime, true);
        Model::validateRequired('speakingTime', $this->speakingTime, true);
        Model::validateRequired('speakingDuration', $this->speakingDuration, true);
        Model::validateRequired('hangupTime', $this->hangupTime, true);
        Model::validateRequired('speakingTurns', $this->speakingTurns, true);
        Model::validateRequired('agentSpeakingTime', $this->agentSpeakingTime, true);
        Model::validateRequired('agentSpeakingDuration', $this->agentSpeakingDuration, true);
        Model::validateRequired('intentTag', $this->intentTag, true);
        Model::validateRequired('intentDescription', $this->intentDescription, true);
        Model::validateRequired('hungupType', $this->hungupType, true);
        Model::validateRequired('sms', $this->sms, true);
        Model::validateRequired('answerRecall', $this->answerRecall, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->extInfo) {
            $res['ext_info'] = $this->extInfo;
        }
        if (null !== $this->resultCode) {
            $res['result_code'] = $this->resultCode;
        }
        if (null !== $this->customerKey) {
            $res['customer_key'] = $this->customerKey;
        }
        if (null !== $this->currentCallTimes) {
            $res['current_call_times'] = $this->currentCallTimes;
        }
        if (null !== $this->keyTemplate) {
            $res['key_template'] = $this->keyTemplate;
        }
        if (null !== $this->batchId) {
            $res['batch_id'] = $this->batchId;
        }
        if (null !== $this->callType) {
            $res['call_type'] = $this->callType;
        }
        if (null !== $this->tag) {
            $res['tag'] = $this->tag;
        }
        if (null !== $this->callId) {
            $res['call_id'] = $this->callId;
        }
        if (null !== $this->taskId) {
            $res['task_id'] = $this->taskId;
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
        if (null !== $this->transferStatusCode) {
            $res['transfer_status_code'] = $this->transferStatusCode;
        }
        if (null !== $this->transferStatus) {
            $res['transfer_status'] = $this->transferStatus;
        }
        if (null !== $this->agentId) {
            $res['agent_id'] = $this->agentId;
        }
        if (null !== $this->agentTag) {
            $res['agent_tag'] = $this->agentTag;
        }
        if (null !== $this->agentExtension) {
            $res['agent_extension'] = $this->agentExtension;
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
        if (null !== $this->speakingTime) {
            $res['speaking_time'] = $this->speakingTime;
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
        if (null !== $this->agentSpeakingTime) {
            $res['agent_speaking_time'] = $this->agentSpeakingTime;
        }
        if (null !== $this->agentSpeakingDuration) {
            $res['agent_speaking_duration'] = $this->agentSpeakingDuration;
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
        if (null !== $this->hungupType) {
            $res['hungup_type'] = $this->hungupType;
        }
        if (null !== $this->sms) {
            $res['sms'] = $this->sms;
        }
        if (null !== $this->chatRecord) {
            $res['chat_record'] = $this->chatRecord;
        }
        if (null !== $this->chats) {
            $res['chats'] = $this->chats;
        }
        if (null !== $this->addWx) {
            $res['add_wx'] = $this->addWx;
        }
        if (null !== $this->addWxStatus) {
            $res['add_wx_status'] = $this->addWxStatus;
        }
        if (null !== $this->answerRecall) {
            $res['answer_recall'] = $this->answerRecall;
        }
        if (null !== $this->properties) {
            $res['properties'] = $this->properties;
        }
        if (null !== $this->bizProperties) {
            $res['biz_properties'] = $this->bizProperties;
        }
        if (null !== $this->interceptReason) {
            $res['intercept_reason'] = $this->interceptReason;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CommonRobotCallDetail
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['ext_info'])) {
            $model->extInfo = $map['ext_info'];
        }
        if (isset($map['result_code'])) {
            $model->resultCode = $map['result_code'];
        }
        if (isset($map['customer_key'])) {
            $model->customerKey = $map['customer_key'];
        }
        if (isset($map['current_call_times'])) {
            $model->currentCallTimes = $map['current_call_times'];
        }
        if (isset($map['key_template'])) {
            $model->keyTemplate = $map['key_template'];
        }
        if (isset($map['batch_id'])) {
            $model->batchId = $map['batch_id'];
        }
        if (isset($map['call_type'])) {
            $model->callType = $map['call_type'];
        }
        if (isset($map['tag'])) {
            $model->tag = $map['tag'];
        }
        if (isset($map['call_id'])) {
            $model->callId = $map['call_id'];
        }
        if (isset($map['task_id'])) {
            $model->taskId = $map['task_id'];
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
        if (isset($map['transfer_status_code'])) {
            $model->transferStatusCode = $map['transfer_status_code'];
        }
        if (isset($map['transfer_status'])) {
            $model->transferStatus = $map['transfer_status'];
        }
        if (isset($map['agent_id'])) {
            $model->agentId = $map['agent_id'];
        }
        if (isset($map['agent_tag'])) {
            $model->agentTag = $map['agent_tag'];
        }
        if (isset($map['agent_extension'])) {
            $model->agentExtension = $map['agent_extension'];
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
        if (isset($map['speaking_time'])) {
            $model->speakingTime = $map['speaking_time'];
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
        if (isset($map['agent_speaking_time'])) {
            $model->agentSpeakingTime = $map['agent_speaking_time'];
        }
        if (isset($map['agent_speaking_duration'])) {
            $model->agentSpeakingDuration = $map['agent_speaking_duration'];
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
        if (isset($map['hungup_type'])) {
            $model->hungupType = $map['hungup_type'];
        }
        if (isset($map['sms'])) {
            $model->sms = $map['sms'];
        }
        if (isset($map['chat_record'])) {
            $model->chatRecord = $map['chat_record'];
        }
        if (isset($map['chats'])) {
            $model->chats = $map['chats'];
        }
        if (isset($map['add_wx'])) {
            $model->addWx = $map['add_wx'];
        }
        if (isset($map['add_wx_status'])) {
            $model->addWxStatus = $map['add_wx_status'];
        }
        if (isset($map['answer_recall'])) {
            $model->answerRecall = $map['answer_recall'];
        }
        if (isset($map['properties'])) {
            $model->properties = $map['properties'];
        }
        if (isset($map['biz_properties'])) {
            $model->bizProperties = $map['biz_properties'];
        }
        if (isset($map['intercept_reason'])) {
            $model->interceptReason = $map['intercept_reason'];
        }

        return $model;
    }
}
