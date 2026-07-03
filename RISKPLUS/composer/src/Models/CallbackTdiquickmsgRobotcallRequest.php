<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class CallbackTdiquickmsgRobotcallRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    /**
     * @var string
     */
    public $productInstanceId;

    // 外呼号码，支持密文
    /**
     * @var string
     */
    public $customerKey;

    // 当前呼叫次数 Integer
    /**
     * @var int
     */
    public $currentCallTimes;

    // 号码的模版类型
    /**
     * @var string
     */
    public $keyTemplate;

    // 导入号码时返回的批次号
    /**
     * @var string
     */
    public $batchId;

    // 外呼类型 建议按照如下约定给到 2001:批量-预测外呼 2002:批量-AI外呼-不转人工 2003:批量-AI外呼-接通转人工 2004: 批量-AI外呼-智能转人工 2005:批量-语音通知
    /**
     * @var int
     */
    public $callType;

    // 用户自定义标签
    /**
     * @var string
     */
    public $tag;

    // 外呼呼叫实例id
    /**
     * @var string
     */
    public $callId;

    // 外呼任务编号
    /**
     * @var int
     */
    public $taskId;

    // 外呼任务名称
    /**
     * @var string
     */
    public $taskName;

    // 外呼的话术模板ID，可以为空
    /**
     * @var int
     */
    public $templateId;

    // 外呼状态编码
    /**
     * @var int
     */
    public $statusCode;

    // 外呼状态编码对应描述
    /**
     * @var string
     */
    public $statusDescription;

    // 转人工状态编码
    /**
     * @var string
     */
    public $transferStatusCode;

    // 转人工状态编码对应描述
    /**
     * @var string
     */
    public $transferStatus;

    // 分配坐席ID,可以为空
    /**
     * @var int
     */
    public $agentId;

    // 建议填写坐席在贵司业务系统唯一标识，用于查询对应agentId；可以为空。
    /**
     * @var string
     */
    public $agentTag;

    // 坐席分机号，可以为空
    /**
     * @var string
     */
    public $agentExtension;

    // 导入时间，格式:2019-01-09 14:14:19
    /**
     * @var string
     */
    public $importTime;

    // 开始通话时间，格式：2019-01-09 14:14:19
    /**
     * @var string
     */
    public $callBeginTime;

    // 振铃时长,单位毫秒
    /**
     * @var int
     */
    public $ringTime;

    // 接通时间
    /**
     * @var string
     */
    public $answerTime;

    // 通话时长，单位：大于1分钟，显示分钟秒，小于1分钟，显示秒
    /**
     * @var string
     */
    public $speakingTime;

    // 通话时长，单位：秒
    /**
     * @var int
     */
    public $speakingDuration;

    // 通话挂断时间
    /**
     * @var string
     */
    public $hangupTime;

    // 对话轮次
    /**
     * @var int
     */
    public $speakingTurns;

    // 坐席通话时长，单位：大于1分钟，显示分钟秒，小于1分钟，显示秒
    /**
     * @var string
     */
    public $agentSpeakingTime;

    // 坐席通话时长，单位：秒
    /**
     * @var int
     */
    public $agentSpeakingDuration;

    // 意向标签
    /**
     * @var string
     */
    public $intentTag;

    // 意向说明
    /**
     * @var string
     */
    public $intentDescription;

    // 个性标签
    /**
     * @var string
     */
    public $individualTag;

    // 回复关键词
    /**
     * @var string
     */
    public $keywords;

    // 挂机方式
    /**
     * @var int
     */
    public $hungupType;

    // 挂机短信，1:发送，2:不发送
    /**
     * @var int
     */
    public $sms;

    // 对话录音,url
    /**
     * @var string
     */
    public $chatRecord;

    // 对话记录
    /**
     * @var string
     */
    public $chats;

    // 0:不添加，1:添加
    /**
     * @var int
     */
    public $addWx;

    // 加微进度可选值：已申请、加微成功
    /**
     * @var string
     */
    public $addWxStatus;

    // 是否接通重呼 0正常外呼，1接通重呼
    /**
     * @var int
     */
    public $answerRecall;

    // 导入号码时的参数值
    /**
     * @var string
     */
    public $properties;

    // 导入号码时的业务参数值
    /**
     * @var string
     */
    public $bizProperties;

    // 拦截原因 可选值：黑名单拦截，灰名单拦截，异常号码拦截
    /**
     * @var string
     */
    public $interceptReason;

    // 回调冗余字段
    /**
     * @var string
     */
    public $extInfo;
    protected $_name = [
        'authToken'             => 'auth_token',
        'productInstanceId'     => 'product_instance_id',
        'customerKey'           => 'customer_key',
        'currentCallTimes'      => 'current_call_times',
        'keyTemplate'           => 'key_template',
        'batchId'               => 'batch_id',
        'callType'              => 'call_type',
        'tag'                   => 'tag',
        'callId'                => 'call_id',
        'taskId'                => 'task_id',
        'taskName'              => 'task_name',
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
        'extInfo'               => 'ext_info',
    ];

    public function validate()
    {
        Model::validateRequired('customerKey', $this->customerKey, true);
        Model::validateRequired('currentCallTimes', $this->currentCallTimes, true);
        Model::validateRequired('keyTemplate', $this->keyTemplate, true);
        Model::validateRequired('batchId', $this->batchId, true);
        Model::validateRequired('callType', $this->callType, true);
        Model::validateRequired('callId', $this->callId, true);
        Model::validateRequired('taskId', $this->taskId, true);
        Model::validateRequired('taskName', $this->taskName, true);
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
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
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
        if (null !== $this->taskName) {
            $res['task_name'] = $this->taskName;
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
        if (null !== $this->extInfo) {
            $res['ext_info'] = $this->extInfo;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CallbackTdiquickmsgRobotcallRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['product_instance_id'])) {
            $model->productInstanceId = $map['product_instance_id'];
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
        if (isset($map['task_name'])) {
            $model->taskName = $map['task_name'];
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
        if (isset($map['ext_info'])) {
            $model->extInfo = $map['ext_info'];
        }

        return $model;
    }
}
