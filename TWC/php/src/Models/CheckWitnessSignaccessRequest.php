<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

use AntChain\TWC\Models\WitnessDocs;

class CheckWitnessSignaccessRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'approvalFlowId' => 'approval_flow_id',
        'approvalNotifyUrl' => 'approval_notify_url',
        'docs' => 'docs',
        'endpoint' => 'endpoint',
        'launchApproval' => 'launch_approval',
        'mobileShieldTaskId' => 'mobile_shield_task_id',
        'realnameAuthCode' => 'realname_auth_code',
        'sealIds' => 'seal_ids',
        'signerAccountId' => 'signer_account_id',
        'signerIp' => 'signer_ip',
        'signerType' => 'signer_type',
        'signPreviewUrl' => 'sign_preview_url',
        'willAuthCode' => 'will_auth_code',
        'witnessFlowId' => 'witness_flow_id',
        'appId' => 'app_id',
        'token' => 'token',
    ];
    public function validate() {
        Model::validateRequired('docs', $this->docs, true);
        Model::validateRequired('endpoint', $this->endpoint, true);
        Model::validateRequired('signerAccountId', $this->signerAccountId, true);
        Model::validateRequired('signerIp', $this->signerIp, true);
        Model::validateRequired('signerType', $this->signerType, true);
        Model::validateRequired('witnessFlowId', $this->witnessFlowId, true);
        Model::validateRequired('appId', $this->appId, true);
        Model::validateRequired('token', $this->token, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->approvalFlowId) {
            $res['approval_flow_id'] = $this->approvalFlowId;
        }
        if (null !== $this->approvalNotifyUrl) {
            $res['approval_notify_url'] = $this->approvalNotifyUrl;
        }
        if (null !== $this->docs) {
            $res['docs'] = [];
            if(null !== $this->docs && is_array($this->docs)){
                $n = 0;
                foreach($this->docs as $item){
                    $res['docs'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->endpoint) {
            $res['endpoint'] = $this->endpoint;
        }
        if (null !== $this->launchApproval) {
            $res['launch_approval'] = $this->launchApproval;
        }
        if (null !== $this->mobileShieldTaskId) {
            $res['mobile_shield_task_id'] = $this->mobileShieldTaskId;
        }
        if (null !== $this->realnameAuthCode) {
            $res['realname_auth_code'] = $this->realnameAuthCode;
        }
        if (null !== $this->sealIds) {
            $res['seal_ids'] = $this->sealIds;
        }
        if (null !== $this->signerAccountId) {
            $res['signer_account_id'] = $this->signerAccountId;
        }
        if (null !== $this->signerIp) {
            $res['signer_ip'] = $this->signerIp;
        }
        if (null !== $this->signerType) {
            $res['signer_type'] = $this->signerType;
        }
        if (null !== $this->signPreviewUrl) {
            $res['sign_preview_url'] = $this->signPreviewUrl;
        }
        if (null !== $this->willAuthCode) {
            $res['will_auth_code'] = $this->willAuthCode;
        }
        if (null !== $this->witnessFlowId) {
            $res['witness_flow_id'] = $this->witnessFlowId;
        }
        if (null !== $this->appId) {
            $res['app_id'] = $this->appId;
        }
        if (null !== $this->token) {
            $res['token'] = $this->token;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return CheckWitnessSignaccessRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['product_instance_id'])){
            $model->productInstanceId = $map['product_instance_id'];
        }
        if(isset($map['approval_flow_id'])){
            $model->approvalFlowId = $map['approval_flow_id'];
        }
        if(isset($map['approval_notify_url'])){
            $model->approvalNotifyUrl = $map['approval_notify_url'];
        }
        if(isset($map['docs'])){
            if(!empty($map['docs'])){
                $model->docs = [];
                $n = 0;
                foreach($map['docs'] as $item) {
                    $model->docs[$n++] = null !== $item ? WitnessDocs::fromMap($item) : $item;
                }
            }
        }
        if(isset($map['endpoint'])){
            $model->endpoint = $map['endpoint'];
        }
        if(isset($map['launch_approval'])){
            $model->launchApproval = $map['launch_approval'];
        }
        if(isset($map['mobile_shield_task_id'])){
            $model->mobileShieldTaskId = $map['mobile_shield_task_id'];
        }
        if(isset($map['realname_auth_code'])){
            $model->realnameAuthCode = $map['realname_auth_code'];
        }
        if(isset($map['seal_ids'])){
            if(!empty($map['seal_ids'])){
                $model->sealIds = $map['seal_ids'];
            }
        }
        if(isset($map['signer_account_id'])){
            $model->signerAccountId = $map['signer_account_id'];
        }
        if(isset($map['signer_ip'])){
            $model->signerIp = $map['signer_ip'];
        }
        if(isset($map['signer_type'])){
            $model->signerType = $map['signer_type'];
        }
        if(isset($map['sign_preview_url'])){
            $model->signPreviewUrl = $map['sign_preview_url'];
        }
        if(isset($map['will_auth_code'])){
            $model->willAuthCode = $map['will_auth_code'];
        }
        if(isset($map['witness_flow_id'])){
            $model->witnessFlowId = $map['witness_flow_id'];
        }
        if(isset($map['app_id'])){
            $model->appId = $map['app_id'];
        }
        if(isset($map['token'])){
            $model->token = $map['token'];
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

    // 审批流程id
    /**
     * @var string
     */
    public $approvalFlowId;

    // 审批结果通知
    /**
     * @var string
     */
    public $approvalNotifyUrl;

    // 签署文档信息
    /**
     * @var WitnessDocs[]
     */
    public $docs;

    // 签署端，TIANYIN_H5 - H5端，TIANYIN_WEB - WEB端，TIANYIN_API - API
    /**
     * @var string
     */
    public $endpoint;

    // 是否发起审批，默认TRUE
    /**
     * @var bool
     */
    public $launchApproval;

    // 手机盾任务id，用于手机盾审批场景
    /**
     * @var string
     */
    public $mobileShieldTaskId;

    // 实名认证凭证
    /**
     * @var string
     */
    public $realnameAuthCode;

    // 印章id列表
    /**
     * @var string[]
     */
    public $sealIds;

    // 签署人账号id
    /**
     * @var string
     */
    public $signerAccountId;

    // 签署人ip
    /**
     * @var string
     */
    public $signerIp;

    // 签署人类型，1-私有云用户，2-公有云用户，3-手机盾用户
    /**
     * @var int
     */
    public $signerType;

    // 签署预览地址
    /**
     * @var string
     */
    public $signPreviewUrl;

    // 意愿认证凭证
    /**
     * @var string
     */
    public $willAuthCode;

    // 见证流程id
    /**
     * @var string
     */
    public $witnessFlowId;

    // 发起请求的实例应用ID
    /**
     * @var string
     */
    public $appId;

    // 发起请求的鉴权token
    /**
     * @var string
     */
    public $token;

}
