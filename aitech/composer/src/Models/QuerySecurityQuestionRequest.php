<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\AITECH\Models;

use AlibabaCloud\Tea\Model;

class QuerySecurityQuestionRequest extends Model
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

    // 调用方唯一标示
    /**
     * @var string
     */
    public $enterprise;

    // 提问内容
    /**
     * @var string
     */
    public $question;

    // 调用方标示
    /**
     * @var string
     */
    public $businessId;

    // 场景code
    /**
     * @var string
     */
    public $sceneCode;

    // 标示是否是同一个Q&A
    /**
     * @var string
     */
    public $messageId;

    // 会话ID
    /**
     * @var string
     */
    public $sessionId;

    // 是否开启流式检测功能。默认值：N：不开启，Y：开启
    /**
     * @var string
     */
    public $multiSessionDetect;

    // 是否开启针对大模型输入文本的的安全改写和增强功能。默认值：N：不开启，Y：开启
    /**
     * @var string
     */
    public $promptReword;

    // 是否需要针对提问内容的进行金融合规检测。默认值：N：不开启，Y：开启
    /**
     * @var string
     */
    public $financeComplianceDetection;

    // 是否需要针对提问内容的进行领域识别
    /**
     * @var string
     */
    public $fieldIdentify;

    // 是否开启提示词攻击防御功能
    /**
     * @var string
     */
    public $promptAttackDefense;

    // 是否开启隐私数据泄露的专项检测
    /**
     * @var string
     */
    public $privacyDataDetection;
    protected $_name = [
        'authToken'                  => 'auth_token',
        'productInstanceId'          => 'product_instance_id',
        'enterprise'                 => 'enterprise',
        'question'                   => 'question',
        'businessId'                 => 'business_id',
        'sceneCode'                  => 'scene_code',
        'messageId'                  => 'message_id',
        'sessionId'                  => 'session_id',
        'multiSessionDetect'         => 'multi_session_detect',
        'promptReword'               => 'prompt_reword',
        'financeComplianceDetection' => 'finance_compliance_detection',
        'fieldIdentify'              => 'field_identify',
        'promptAttackDefense'        => 'prompt_attack_defense',
        'privacyDataDetection'       => 'privacy_data_detection',
    ];

    public function validate()
    {
        Model::validateRequired('question', $this->question, true);
        Model::validateRequired('businessId', $this->businessId, true);
        Model::validateRequired('sceneCode', $this->sceneCode, true);
        Model::validateMaxLength('question', $this->question, 10000);
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
        if (null !== $this->enterprise) {
            $res['enterprise'] = $this->enterprise;
        }
        if (null !== $this->question) {
            $res['question'] = $this->question;
        }
        if (null !== $this->businessId) {
            $res['business_id'] = $this->businessId;
        }
        if (null !== $this->sceneCode) {
            $res['scene_code'] = $this->sceneCode;
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
        if (null !== $this->financeComplianceDetection) {
            $res['finance_compliance_detection'] = $this->financeComplianceDetection;
        }
        if (null !== $this->fieldIdentify) {
            $res['field_identify'] = $this->fieldIdentify;
        }
        if (null !== $this->promptAttackDefense) {
            $res['prompt_attack_defense'] = $this->promptAttackDefense;
        }
        if (null !== $this->privacyDataDetection) {
            $res['privacy_data_detection'] = $this->privacyDataDetection;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QuerySecurityQuestionRequest
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
        if (isset($map['enterprise'])) {
            $model->enterprise = $map['enterprise'];
        }
        if (isset($map['question'])) {
            $model->question = $map['question'];
        }
        if (isset($map['business_id'])) {
            $model->businessId = $map['business_id'];
        }
        if (isset($map['scene_code'])) {
            $model->sceneCode = $map['scene_code'];
        }
        if (isset($map['message_id'])) {
            $model->messageId = $map['message_id'];
        }
        if (isset($map['session_id'])) {
            $model->sessionId = $map['session_id'];
        }
        if (isset($map['multi_session_detect'])) {
            $model->multiSessionDetect = $map['multi_session_detect'];
        }
        if (isset($map['prompt_reword'])) {
            $model->promptReword = $map['prompt_reword'];
        }
        if (isset($map['finance_compliance_detection'])) {
            $model->financeComplianceDetection = $map['finance_compliance_detection'];
        }
        if (isset($map['field_identify'])) {
            $model->fieldIdentify = $map['field_identify'];
        }
        if (isset($map['prompt_attack_defense'])) {
            $model->promptAttackDefense = $map['prompt_attack_defense'];
        }
        if (isset($map['privacy_data_detection'])) {
            $model->privacyDataDetection = $map['privacy_data_detection'];
        }

        return $model;
    }
}
