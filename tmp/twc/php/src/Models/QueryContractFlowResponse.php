<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

use AntChain\TWC\Models\ContractSignFlowConfig;

class QueryContractFlowResponse extends Model {
    protected $_name = [
        'reqMsgId' => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg' => 'result_msg',
        'autoArchive' => 'auto_archive',
        'businessScene' => 'business_scene',
        'code' => 'code',
        'configInfo' => 'config_info',
        'contractRemind' => 'contract_remind',
        'contractValidity' => 'contract_validity',
        'flowDesc' => 'flow_desc',
        'flowEndTime' => 'flow_end_time',
        'flowId' => 'flow_id',
        'flowStartTime' => 'flow_start_time',
        'flowStatus' => 'flow_status',
        'initiatorAccountId' => 'initiator_account_id',
        'initiatorAuthorizedAccountId' => 'initiator_authorized_account_id',
        'message' => 'message',
        'signValidity' => 'sign_validity',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->reqMsgId) {
            $res['req_msg_id'] = $this->reqMsgId;
        }
        if (null !== $this->resultCode) {
            $res['result_code'] = $this->resultCode;
        }
        if (null !== $this->resultMsg) {
            $res['result_msg'] = $this->resultMsg;
        }
        if (null !== $this->autoArchive) {
            $res['auto_archive'] = $this->autoArchive;
        }
        if (null !== $this->businessScene) {
            $res['business_scene'] = $this->businessScene;
        }
        if (null !== $this->code) {
            $res['code'] = $this->code;
        }
        if (null !== $this->configInfo) {
            $res['config_info'] = null !== $this->configInfo ? $this->configInfo->toMap() : null;
        }
        if (null !== $this->contractRemind) {
            $res['contract_remind'] = $this->contractRemind;
        }
        if (null !== $this->contractValidity) {
            $res['contract_validity'] = $this->contractValidity;
        }
        if (null !== $this->flowDesc) {
            $res['flow_desc'] = $this->flowDesc;
        }
        if (null !== $this->flowEndTime) {
            $res['flow_end_time'] = $this->flowEndTime;
        }
        if (null !== $this->flowId) {
            $res['flow_id'] = $this->flowId;
        }
        if (null !== $this->flowStartTime) {
            $res['flow_start_time'] = $this->flowStartTime;
        }
        if (null !== $this->flowStatus) {
            $res['flow_status'] = $this->flowStatus;
        }
        if (null !== $this->initiatorAccountId) {
            $res['initiator_account_id'] = $this->initiatorAccountId;
        }
        if (null !== $this->initiatorAuthorizedAccountId) {
            $res['initiator_authorized_account_id'] = $this->initiatorAuthorizedAccountId;
        }
        if (null !== $this->message) {
            $res['message'] = $this->message;
        }
        if (null !== $this->signValidity) {
            $res['sign_validity'] = $this->signValidity;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return QueryContractFlowResponse
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['req_msg_id'])){
            $model->reqMsgId = $map['req_msg_id'];
        }
        if(isset($map['result_code'])){
            $model->resultCode = $map['result_code'];
        }
        if(isset($map['result_msg'])){
            $model->resultMsg = $map['result_msg'];
        }
        if(isset($map['auto_archive'])){
            $model->autoArchive = $map['auto_archive'];
        }
        if(isset($map['business_scene'])){
            $model->businessScene = $map['business_scene'];
        }
        if(isset($map['code'])){
            $model->code = $map['code'];
        }
        if(isset($map['config_info'])){
            $model->configInfo = ContractSignFlowConfig::fromMap($map['config_info']);
        }
        if(isset($map['contract_remind'])){
            $model->contractRemind = $map['contract_remind'];
        }
        if(isset($map['contract_validity'])){
            $model->contractValidity = $map['contract_validity'];
        }
        if(isset($map['flow_desc'])){
            $model->flowDesc = $map['flow_desc'];
        }
        if(isset($map['flow_end_time'])){
            $model->flowEndTime = $map['flow_end_time'];
        }
        if(isset($map['flow_id'])){
            $model->flowId = $map['flow_id'];
        }
        if(isset($map['flow_start_time'])){
            $model->flowStartTime = $map['flow_start_time'];
        }
        if(isset($map['flow_status'])){
            $model->flowStatus = $map['flow_status'];
        }
        if(isset($map['initiator_account_id'])){
            $model->initiatorAccountId = $map['initiator_account_id'];
        }
        if(isset($map['initiator_authorized_account_id'])){
            $model->initiatorAuthorizedAccountId = $map['initiator_authorized_account_id'];
        }
        if(isset($map['message'])){
            $model->message = $map['message'];
        }
        if(isset($map['sign_validity'])){
            $model->signValidity = $map['sign_validity'];
        }
        return $model;
    }
    /**
     * @var string
     */
    public $reqMsgId;

    /**
     * @var string
     */
    public $resultCode;

    /**
     * @var string
     */
    public $resultMsg;

    // 是否自动归档
    /**
     * @var bool
     */
    public $autoArchive;

    // 文件主题
    /**
     * @var string
     */
    public $businessScene;

    // 业务码，0表示成功
    /**
     * @var int
     */
    public $code;

    // 流程配置信息
    /**
     * @var ContractSignFlowConfig
     */
    public $configInfo;

    // 文件到期前，提前多少小时提醒续签
    /**
     * @var int
     */
    public $contractRemind;

    // 文件有效截止日期
    /**
     * @var int
     */
    public $contractValidity;

    // 流程描述, 如果流程已拒签或已撤回, 并且存在拒签或撤回原因, 流程描述显示为原因, 否则默认为流程状态描述
    /**
     * @var string
     */
    public $flowDesc;

    // 流程结束时间
    /**
     * @var string
     */
    public $flowEndTime;

    // 流程ID
    /**
     * @var string
     */
    public $flowId;

    // 流程开始时间
    /**
     * @var string
     */
    public $flowStartTime;

    // 流程状态,0-草稿 1-签署中 2-完成 3-撤销 4-终止 5-过期 6-删除 7-拒签
    /**
     * @var int
     */
    public $flowStatus;

    // 发起人账户id
    /**
     * @var string
     */
    public $initiatorAccountId;

    // 发起方主体id
    /**
     * @var string
     */
    public $initiatorAuthorizedAccountId;

    // 业务码信息
    /**
     * @var string
     */
    public $message;

    // 签署有效截止日期
    /**
     * @var string
     */
    public $signValidity;

}
