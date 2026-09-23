<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\RESOLVESERVICE\Models;

use AlibabaCloud\Tea\Model;

class CallbackProviderRobotcallRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'id' => 'id',
        'number' => 'number',
        'numberMd5' => 'number_md5',
        'batchId' => 'batch_id',
        'callType' => 'call_type',
        'tag' => 'tag',
        'callId' => 'call_id',
        'taskId' => 'task_id',
        'taskName' => 'task_name',
        'templateId' => 'template_id',
        'templateName' => 'template_name',
        'statusCode' => 'status_code',
        'statusDescription' => 'status_description',
        'transferStatusCode' => 'transfer_status_code',
        'transferStatus' => 'transfer_status',
        'agentId' => 'agent_id',
        'agentTag' => 'agent_tag',
        'agentExtension' => 'agent_extension',
        'importTime' => 'import_time',
        'callBeginTime' => 'call_begin_time',
        'ringTime' => 'ring_time',
        'answerTime' => 'answer_time',
        'speakingTime' => 'speaking_time',
        'speakingDuration' => 'speaking_duration',
        'hangupTime' => 'hangup_time',
        'speakingTurns' => 'speaking_turns',
        'agentSpeakingTime' => 'agent_speaking_time',
        'agentSpeakingDuration' => 'agent_speaking_duration',
        'intentTag' => 'intent_tag',
        'intentDescription' => 'intent_description',
        'individualTag' => 'individual_tag',
        'keywords' => 'keywords',
        'hangupType' => 'hangup_type',
        'sms' => 'sms',
        'wa' => 'wa',
        'chatRecord' => 'chat_record',
        'chats' => 'chats',
        'addWx' => 'add_wx',
        'addWxStatus' => 'add_wx_status',
        'answerRecall' => 'answer_recall',
        'properties' => 'properties',
        'interceptReason' => 'intercept_reason',
        'companyId' => 'company_id',
        'sipCode' => 'sip_code',
        'transferTime' => 'transfer_time',
        'seatsGroupId' => 'seats_group_id',
        'seatsGroupName' => 'seats_group_name',
        'bill' => 'bill',
        'channelTag' => 'channel_tag',
    ];
    public function validate() {
        Model::validateRequired('id', $this->id, true);
        Model::validateRequired('callType', $this->callType, true);
        Model::validateRequired('callId', $this->callId, true);
        Model::validateRequired('taskId', $this->taskId, true);
        Model::validateRequired('taskName', $this->taskName, true);
        Model::validateRequired('statusCode', $this->statusCode, true);
        Model::validateRequired('statusDescription', $this->statusDescription, true);
        Model::validateRequired('transferStatusCode', $this->transferStatusCode, true);
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
        Model::validateRequired('hangupType', $this->hangupType, true);
        Model::validateRequired('sms', $this->sms, true);
        Model::validateRequired('wa', $this->wa, true);
        Model::validateRequired('answerRecall', $this->answerRecall, true);
        Model::validateRequired('companyId', $this->companyId, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->number) {
            $res['number'] = $this->number;
        }
        if (null !== $this->numberMd5) {
            $res['number_md5'] = $this->numberMd5;
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
        if (null !== $this->templateName) {
            $res['template_name'] = $this->templateName;
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
        if (null !== $this->hangupType) {
            $res['hangup_type'] = $this->hangupType;
        }
        if (null !== $this->sms) {
            $res['sms'] = $this->sms;
        }
        if (null !== $this->wa) {
            $res['wa'] = $this->wa;
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
        if (null !== $this->interceptReason) {
            $res['intercept_reason'] = $this->interceptReason;
        }
        if (null !== $this->companyId) {
            $res['company_id'] = $this->companyId;
        }
        if (null !== $this->sipCode) {
            $res['sip_code'] = $this->sipCode;
        }
        if (null !== $this->transferTime) {
            $res['transfer_time'] = $this->transferTime;
        }
        if (null !== $this->seatsGroupId) {
            $res['seats_group_id'] = $this->seatsGroupId;
        }
        if (null !== $this->seatsGroupName) {
            $res['seats_group_name'] = $this->seatsGroupName;
        }
        if (null !== $this->bill) {
            $res['bill'] = $this->bill;
        }
        if (null !== $this->channelTag) {
            $res['channel_tag'] = $this->channelTag;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return CallbackProviderRobotcallRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['product_instance_id'])){
            $model->productInstanceId = $map['product_instance_id'];
        }
        if(isset($map['id'])){
            $model->id = $map['id'];
        }
        if(isset($map['number'])){
            $model->number = $map['number'];
        }
        if(isset($map['number_md5'])){
            $model->numberMd5 = $map['number_md5'];
        }
        if(isset($map['batch_id'])){
            $model->batchId = $map['batch_id'];
        }
        if(isset($map['call_type'])){
            $model->callType = $map['call_type'];
        }
        if(isset($map['tag'])){
            $model->tag = $map['tag'];
        }
        if(isset($map['call_id'])){
            $model->callId = $map['call_id'];
        }
        if(isset($map['task_id'])){
            $model->taskId = $map['task_id'];
        }
        if(isset($map['task_name'])){
            $model->taskName = $map['task_name'];
        }
        if(isset($map['template_id'])){
            $model->templateId = $map['template_id'];
        }
        if(isset($map['template_name'])){
            $model->templateName = $map['template_name'];
        }
        if(isset($map['status_code'])){
            $model->statusCode = $map['status_code'];
        }
        if(isset($map['status_description'])){
            $model->statusDescription = $map['status_description'];
        }
        if(isset($map['transfer_status_code'])){
            $model->transferStatusCode = $map['transfer_status_code'];
        }
        if(isset($map['transfer_status'])){
            $model->transferStatus = $map['transfer_status'];
        }
        if(isset($map['agent_id'])){
            $model->agentId = $map['agent_id'];
        }
        if(isset($map['agent_tag'])){
            $model->agentTag = $map['agent_tag'];
        }
        if(isset($map['agent_extension'])){
            $model->agentExtension = $map['agent_extension'];
        }
        if(isset($map['import_time'])){
            $model->importTime = $map['import_time'];
        }
        if(isset($map['call_begin_time'])){
            $model->callBeginTime = $map['call_begin_time'];
        }
        if(isset($map['ring_time'])){
            $model->ringTime = $map['ring_time'];
        }
        if(isset($map['answer_time'])){
            $model->answerTime = $map['answer_time'];
        }
        if(isset($map['speaking_time'])){
            $model->speakingTime = $map['speaking_time'];
        }
        if(isset($map['speaking_duration'])){
            $model->speakingDuration = $map['speaking_duration'];
        }
        if(isset($map['hangup_time'])){
            $model->hangupTime = $map['hangup_time'];
        }
        if(isset($map['speaking_turns'])){
            $model->speakingTurns = $map['speaking_turns'];
        }
        if(isset($map['agent_speaking_time'])){
            $model->agentSpeakingTime = $map['agent_speaking_time'];
        }
        if(isset($map['agent_speaking_duration'])){
            $model->agentSpeakingDuration = $map['agent_speaking_duration'];
        }
        if(isset($map['intent_tag'])){
            $model->intentTag = $map['intent_tag'];
        }
        if(isset($map['intent_description'])){
            $model->intentDescription = $map['intent_description'];
        }
        if(isset($map['individual_tag'])){
            $model->individualTag = $map['individual_tag'];
        }
        if(isset($map['keywords'])){
            $model->keywords = $map['keywords'];
        }
        if(isset($map['hangup_type'])){
            $model->hangupType = $map['hangup_type'];
        }
        if(isset($map['sms'])){
            $model->sms = $map['sms'];
        }
        if(isset($map['wa'])){
            $model->wa = $map['wa'];
        }
        if(isset($map['chat_record'])){
            $model->chatRecord = $map['chat_record'];
        }
        if(isset($map['chats'])){
            $model->chats = $map['chats'];
        }
        if(isset($map['add_wx'])){
            $model->addWx = $map['add_wx'];
        }
        if(isset($map['add_wx_status'])){
            $model->addWxStatus = $map['add_wx_status'];
        }
        if(isset($map['answer_recall'])){
            $model->answerRecall = $map['answer_recall'];
        }
        if(isset($map['properties'])){
            $model->properties = $map['properties'];
        }
        if(isset($map['intercept_reason'])){
            $model->interceptReason = $map['intercept_reason'];
        }
        if(isset($map['company_id'])){
            $model->companyId = $map['company_id'];
        }
        if(isset($map['sip_code'])){
            $model->sipCode = $map['sip_code'];
        }
        if(isset($map['transfer_time'])){
            $model->transferTime = $map['transfer_time'];
        }
        if(isset($map['seats_group_id'])){
            $model->seatsGroupId = $map['seats_group_id'];
        }
        if(isset($map['seats_group_name'])){
            $model->seatsGroupName = $map['seats_group_name'];
        }
        if(isset($map['bill'])){
            $model->bill = $map['bill'];
        }
        if(isset($map['channel_tag'])){
            $model->channelTag = $map['channel_tag'];
        }
        return $model;
    }
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    /**
     * @var string
     */
    public $productInstanceId;

    // AI任务中的外呼编号
    /**
     * @var int
     */
    public $id;

    // 外呼号码
    /**
     * @var string
     */
    public $number;

    // 外呼号码MD5
    /**
     * @var string
     */
    public $numberMd5;

    // 导入号码返回的批次号
    /**
     * @var string
     */
    public $batchId;

    // 1001：坐席-人工外呼，
    // 1002：坐席-AI外呼-不转人工，
    // 1003：坐席-AI外呼-接通转人工，
    // 1004：坐席-AI外呼-智能转人工；
    // 2001:批量-预测外呼，
    // 2002:批量-AI外呼-不转人工，
    // 2003:批量-AI外呼-接通转人工，
    // 2004: 批量-AI外呼-智能转人工,
    // 2005:批量-语音通知,
    // 3001:视频外呼
    /**
     * @var int
     */
    public $callType;

    // 用户自定义标签
    /**
     * @var string
     */
    public $tag;

    // 外呼id
    /**
     * @var string
     */
    public $callId;

    // 系统中的任务编号，若外呼类型为坐席主动外呼，则此处返回坐席ID
    /**
     * @var int
     */
    public $taskId;

    // 任务的名称
    /**
     * @var string
     */
    public $taskName;

    // 外呼的话术模版ID
    /**
     * @var int
     */
    public $templateId;

    // 话术模版名称
    /**
     * @var string
     */
    public $templateName;

    // 外呼状态编码
    /**
     * @var int
     */
    public $statusCode;

    // 外呼状态，如"已接听"
    /**
     * @var string
     */
    public $statusDescription;

    // 转人工状态编码
    /**
     * @var int
     */
    public $transferStatusCode;

    // 转人工状态，可以为空
    /**
     * @var string
     */
    public $transferStatus;

    // 分配坐席id
    /**
     * @var int
     */
    public $agentId;

    // 建议填写坐席在贵司业务系统唯一标识，用于查询对应agentId；可以为空。
    /**
     * @var string
     */
    public $agentTag;

    // 坐席分机号
    /**
     * @var string
     */
    public $agentExtension;

    // 导入时间，格式:2019-01-09 14:14:19
    /**
     * @var string
     */
    public $importTime;

    // 开始拨号时间，格式：2019-01-09 14:14:19
    /**
     * @var string
     */
    public $callBeginTime;

    // 振铃时长，单位毫秒
    /**
     * @var int
     */
    public $ringTime;

    // 通话接通时间，格式：2019-01-09 14:14:19
    /**
     * @var string
     */
    public $answerTime;

    // AI通话时长，单位：大于1分钟，显示分钟秒，小于1分钟，显示秒
    /**
     * @var string
     */
    public $speakingTime;

    // AI通话时长，单位：秒
    /**
     * @var int
     */
    public $speakingDuration;

    // 通话挂断时间，格式：2019-01-09 14:14:19
    /**
     * @var string
     */
    public $hangupTime;

    // 对话轮次
    /**
     * @var string
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

    // 回复关键字
    /**
     * @var string
     */
    public $keywords;

    // AI挂机1，坐席挂机2，客户挂机3
    /**
     * @var int
     */
    public $hangupType;

    // 挂机短信,1:发送 2:不发送
    /**
     * @var string
     */
    public $sms;

    // 挂机WhatsApp
    /**
     * @var string
     */
    public $wa;

    // 对话录音，URL，可以为空。录音异步上传，业务高峰可能会出现请求404的情况，可以稍后再重试获取。
    /**
     * @var string
     */
    public $chatRecord;

    // 对话记录,[{"fromNumber":"0","content": "你好，请问您是王小帅吗？","createTime": "2019-01-09 14:14:19"},{"fromNumber":"7945bd83237335e5376ff44d62e4f0ae","content":"嗯","createTime": "2019-01-09 14:14:20"}]
    /**
     * @var string
     */
    public $chats;

    // 加微信，0:不添加，1:添加
    /**
     * @var int
     */
    public $addWx;

    // 可选值：已申请、加微成功
    /**
     * @var string
     */
    public $addWxStatus;

    // 是否接通重呼,0正常外呼，1接通重呼
    /**
     * @var int
     */
    public $answerRecall;

    // 导入号码时的参数值
    /**
     * @var string
     */
    public $properties;

    // 当状态为已拦截时，可选值：
    // 黑名单拦截
    // 灰名单拦截
    // 异常号码拦截
    /**
     * @var string
     */
    public $interceptReason;

    // 企业id
    /**
     * @var int
     */
    public $companyId;

    // 线路返回的sip编码code
    /**
     * @var int
     */
    public $sipCode;

    // 指的是触发转人工的时间点，格式如：2019-01-09 14:14:19
    /**
     * @var string
     */
    public $transferTime;

    // 触发转人工时，坐席组的ID
    /**
     * @var int
     */
    public $seatsGroupId;

    // 触发转人工时，坐席组的名称
    /**
     * @var string
     */
    public $seatsGroupName;

    // 线路通话时长,单位为毫秒，实际计费需向上取整转换为秒
    /**
     * @var int
     */
    public $bill;

    // 外呼回调时可透传的信息内容，可以为空
    /**
     * @var string
     */
    public $channelTag;

}
