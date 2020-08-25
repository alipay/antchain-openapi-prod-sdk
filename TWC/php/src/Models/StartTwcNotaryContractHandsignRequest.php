<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

use AntChain\TWC\Models\ContractSignFlowConfig;
use AntChain\TWC\Models\RepaymentOrderRequest;

class StartTwcNotaryContractHandsignRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'regionName' => 'region_name',
        'agentAccountId' => 'agent_account_id',
        'autoArchive' => 'auto_archive',
        'businessScene' => 'business_scene',
        'contractRemind' => 'contract_remind',
        'contractSignFlowConfig' => 'contract_sign_flow_config',
        'contractValidity' => 'contract_validity',
        'initiatorAccountId' => 'initiator_account_id',
        'initiatorAuthorizedAccountId' => 'initiator_authorized_account_id',
        'repaymentOrderInfo' => 'repayment_order_info',
        'signPlatform' => 'sign_platform',
        'signValidity' => 'sign_validity',
        'simpleFormFields' => 'simple_form_fields',
        'template' => 'template',
        'userAccount' => 'user_account',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->regionName) {
            $res['region_name'] = $this->regionName;
        }
        if (null !== $this->agentAccountId) {
            $res['agent_account_id'] = $this->agentAccountId;
        }
        if (null !== $this->autoArchive) {
            $res['auto_archive'] = $this->autoArchive;
        }
        if (null !== $this->businessScene) {
            $res['business_scene'] = $this->businessScene;
        }
        if (null !== $this->contractRemind) {
            $res['contract_remind'] = $this->contractRemind;
        }
        if (null !== $this->contractSignFlowConfig) {
            $res['contract_sign_flow_config'] = null !== $this->contractSignFlowConfig ? $this->contractSignFlowConfig->toMap() : null;
        }
        if (null !== $this->contractValidity) {
            $res['contract_validity'] = $this->contractValidity;
        }
        if (null !== $this->initiatorAccountId) {
            $res['initiator_account_id'] = $this->initiatorAccountId;
        }
        if (null !== $this->initiatorAuthorizedAccountId) {
            $res['initiator_authorized_account_id'] = $this->initiatorAuthorizedAccountId;
        }
        if (null !== $this->repaymentOrderInfo) {
            $res['repayment_order_info'] = [];
            if(null !== $this->repaymentOrderInfo && is_array($this->repaymentOrderInfo)){
                $n = 0;
                foreach($this->repaymentOrderInfo as $item){
                    $res['repayment_order_info'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->signPlatform) {
            $res['sign_platform'] = $this->signPlatform;
        }
        if (null !== $this->signValidity) {
            $res['sign_validity'] = $this->signValidity;
        }
        if (null !== $this->simpleFormFields) {
            $res['simple_form_fields'] = $this->simpleFormFields;
        }
        if (null !== $this->template) {
            $res['template'] = $this->template;
        }
        if (null !== $this->userAccount) {
            $res['user_account'] = $this->userAccount;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return StartTwcNotaryContractHandsignRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['product_instance_id'])){
            $model->productInstanceId = $map['product_instance_id'];
        }
        if(isset($map['region_name'])){
            $model->regionName = $map['region_name'];
        }
        if(isset($map['agent_account_id'])){
            $model->agentAccountId = $map['agent_account_id'];
        }
        if(isset($map['auto_archive'])){
            $model->autoArchive = $map['auto_archive'];
        }
        if(isset($map['business_scene'])){
            $model->businessScene = $map['business_scene'];
        }
        if(isset($map['contract_remind'])){
            $model->contractRemind = $map['contract_remind'];
        }
        if(isset($map['contract_sign_flow_config'])){
            $model->contractSignFlowConfig = ContractSignFlowConfig::fromMap($map['contract_sign_flow_config']);
        }
        if(isset($map['contract_validity'])){
            $model->contractValidity = $map['contract_validity'];
        }
        if(isset($map['initiator_account_id'])){
            $model->initiatorAccountId = $map['initiator_account_id'];
        }
        if(isset($map['initiator_authorized_account_id'])){
            $model->initiatorAuthorizedAccountId = $map['initiator_authorized_account_id'];
        }
        if(isset($map['repayment_order_info'])){
            if(!empty($map['repayment_order_info'])){
                $model->repaymentOrderInfo = [];
                $n = 0;
                foreach($map['repayment_order_info'] as $item) {
                    $model->repaymentOrderInfo[$n++] = null !== $item ? RepaymentOrderRequest::fromMap($item) : $item;
                }
            }
        }
        if(isset($map['sign_platform'])){
            $model->signPlatform = $map['sign_platform'];
        }
        if(isset($map['sign_validity'])){
            $model->signValidity = $map['sign_validity'];
        }
        if(isset($map['simple_form_fields'])){
            $model->simpleFormFields = $map['simple_form_fields'];
        }
        if(isset($map['template'])){
            $model->template = $map['template'];
        }
        if(isset($map['user_account'])){
            $model->userAccount = $map['user_account'];
        }
        return $model;
    }
    /**
     * @var string
     */
    public $authToken;

    /**
     * @var string
     */
    public $productInstanceId;

    /**
     * @var string
     */
    public $regionName;

    // 代理商户账户
    /**
     * @var string
     */
    public $agentAccountId;

    // 是否自动归档，默认为true
    /**
     * @var bool
     */
    public $autoArchive;

    // 合同文件主题
    /**
     * @var string
     */
    public $businessScene;

    // 文件到期前，提前多少小时回调提醒续签，小时（时间区间：1小时——15天），默认不提醒
    /**
     * @var int
     */
    public $contractRemind;

    // 签署流程任务配置信息
    /**
     * @var ContractSignFlowConfig
     */
    public $contractSignFlowConfig;

    // 文件有效截止日期,毫秒，默认不失效
    /**
     * @var int
     */
    public $contractValidity;

    // 发起人账户id，即发起本次签署的操作人个人账号id；如不传，默认由对接平台发起
    /**
     * @var string
     */
    public $initiatorAccountId;

    // 发起方主体id，如存在个人代机构发起签约，则需传入机构id；如不传，则默认是对接平台
    // 
    // 
    /**
     * @var string
     */
    public $initiatorAuthorizedAccountId;

    // 代扣规则详情，不可为空
    /**
     * @var array
     */
    public $repaymentOrderInfo;

    // 签署平台，ALIPAY（支付宝小程序）或H5，默认H5
    /**
     * @var string
     */
    public $signPlatform;

    // 签署有效截止日期,毫秒，默认不失效
    /**
     * @var string
     */
    public $signValidity;

    // 输入项填充内容，以key:value传入
    /**
     * @var string
     */
    public $simpleFormFields;

    // 待签署的智能合同模板ID
    /**
     * @var string
     */
    public $template;

    // 待签署客户的账户ID
    /**
     * @var string
     */
    public $userAccount;

}
