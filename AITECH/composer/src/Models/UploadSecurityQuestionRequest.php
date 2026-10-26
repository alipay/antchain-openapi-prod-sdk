<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\AITECH\Models;

use AlibabaCloud\Tea\Model;

class UploadSecurityQuestionRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'fileUrl' => 'file_url',
        'sceneCode' => 'scene_code',
        'businessId' => 'business_id',
        'enterprise' => 'enterprise',
        'accountId' => 'account_id',
        'messageId' => 'message_id',
        'sessionId' => 'session_id',
        'multiSessionDetect' => 'multi_session_detect',
        'promptReword' => 'prompt_reword',
        'securityAnswer' => 'security_answer',
        'fieldIdentify' => 'field_identify',
    ];
    public function validate() {
        Model::validateRequired('fileUrl', $this->fileUrl, true);
        Model::validateRequired('sceneCode', $this->sceneCode, true);
        Model::validateRequired('businessId', $this->businessId, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->fileUrl) {
            $res['file_url'] = $this->fileUrl;
        }
        if (null !== $this->sceneCode) {
            $res['scene_code'] = $this->sceneCode;
        }
        if (null !== $this->businessId) {
            $res['business_id'] = $this->businessId;
        }
        if (null !== $this->enterprise) {
            $res['enterprise'] = $this->enterprise;
        }
        if (null !== $this->accountId) {
            $res['account_id'] = $this->accountId;
        }
        if (null !== $this->messageId) {
            $res['message_id'] = $this->messageId;
        }
        if (null !== $this->sessionId) {
            $res['session_id'] = $this->sessionId;
        }
        if (null !== $this->multiSessionDetect) {
            $res['multi_session_detect'] = $this->multiSessionDetect;
        }
        if (null !== $this->promptReword) {
            $res['prompt_reword'] = $this->promptReword;
        }
        if (null !== $this->securityAnswer) {
            $res['security_answer'] = $this->securityAnswer;
        }
        if (null !== $this->fieldIdentify) {
            $res['field_identify'] = $this->fieldIdentify;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return UploadSecurityQuestionRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['product_instance_id'])){
            $model->productInstanceId = $map['product_instance_id'];
        }
        if(isset($map['file_url'])){
            $model->fileUrl = $map['file_url'];
        }
        if(isset($map['scene_code'])){
            $model->sceneCode = $map['scene_code'];
        }
        if(isset($map['business_id'])){
            $model->businessId = $map['business_id'];
        }
        if(isset($map['enterprise'])){
            $model->enterprise = $map['enterprise'];
        }
        if(isset($map['account_id'])){
            $model->accountId = $map['account_id'];
        }
        if(isset($map['message_id'])){
            $model->messageId = $map['message_id'];
        }
        if(isset($map['session_id'])){
            $model->sessionId = $map['session_id'];
        }
        if(isset($map['multi_session_detect'])){
            $model->multiSessionDetect = $map['multi_session_detect'];
        }
        if(isset($map['prompt_reword'])){
            $model->promptReword = $map['prompt_reword'];
        }
        if(isset($map['security_answer'])){
            $model->securityAnswer = $map['security_answer'];
        }
        if(isset($map['field_identify'])){
            $model->fieldIdentify = $map['field_identify'];
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

    // txt和pdf 文件
    /**
     * @var string
     */
    public $fileUrl;

    // 归一化后须 question 前缀，否则兜底 LLM_INPUT_DETECTION
    /**
     * @var string
     */
    public $sceneCode;

    // 租户标识（老值兼容替换）
    /**
     * @var string
     */
    public $businessId;

    // 企业标识
    /**
     * @var string
     */
    public $enterprise;

    // 访问控制维度
    /**
     * @var string
     */
    public $accountId;

    // 消息 ID
    /**
     * @var string
     */
    public $messageId;

    // 多轮会话 ID
    /**
     * @var string
     */
    public $sessionId;

    // 多轮检测开关
    /**
     * @var string
     */
    public $multiSessionDetect;

    // 安全改写开关
    /**
     * @var string
     */
    public $promptReword;

    // 安全代答开关
    /**
     * @var string
     */
    public $securityAnswer;

    // 领域识别开关
    /**
     * @var string
     */
    public $fieldIdentify;

}
