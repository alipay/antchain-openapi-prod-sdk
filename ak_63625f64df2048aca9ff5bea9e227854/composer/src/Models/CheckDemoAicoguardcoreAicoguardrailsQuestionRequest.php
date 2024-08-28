<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_63625f64df2048aca9ff5bea9e227854\Models;

use AlibabaCloud\Tea\Model;

class CheckDemoAicoguardcoreAicoguardrailsQuestionRequest extends Model
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

    // 当前提问内容
    /**
     * @var string
     */
    public $question;

    // 当前提问格式
    /**
     * @var string
     */
    public $questionFormat;

    // 应用名
    /**
     * @var string
     */
    public $appCode;

    // 会话ID
    /**
     * @var string
     */
    public $sessionId;

    // 唯一定位一个问答对
    /**
     * @var string
     */
    public $requestId;

    // 场景code，走SOP流程申请
    /**
     * @var string
     */
    public $sceneCode;

    // 当前固定填入：TJ_QUESTION_BASIC
    /**
     * @var string
     */
    public $serviceCode;

    // Agent标识
    /**
     * @var string
     */
    public $agentCode;

    // 大模型Code，区分大模型类型和版本，比如bailing_10b_0229、bailing_65b_0315
    /**
     * @var string
     */
    public $modelCode;

    // 用户ID，用于主体风险判断
    /**
     * @var string
     */
    public $userId;

    // 扩展信息，会透传到业务属性中
    /**
     * @var Map
     */
    public $businessProperties;
    protected $_name = [
        'authToken'          => 'auth_token',
        'productInstanceId'  => 'product_instance_id',
        'question'           => 'question',
        'questionFormat'     => 'question_format',
        'appCode'            => 'app_code',
        'sessionId'          => 'session_id',
        'requestId'          => 'request_id',
        'sceneCode'          => 'scene_code',
        'serviceCode'        => 'service_code',
        'agentCode'          => 'agent_code',
        'modelCode'          => 'model_code',
        'userId'             => 'user_id',
        'businessProperties' => 'business_properties',
    ];

    public function validate()
    {
        Model::validateRequired('question', $this->question, true);
        Model::validateRequired('appCode', $this->appCode, true);
        Model::validateRequired('sessionId', $this->sessionId, true);
        Model::validateRequired('requestId', $this->requestId, true);
        Model::validateRequired('sceneCode', $this->sceneCode, true);
        Model::validateRequired('serviceCode', $this->serviceCode, true);
        Model::validateRequired('agentCode', $this->agentCode, true);
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
        if (null !== $this->question) {
            $res['question'] = $this->question;
        }
        if (null !== $this->questionFormat) {
            $res['question_format'] = $this->questionFormat;
        }
        if (null !== $this->appCode) {
            $res['app_code'] = $this->appCode;
        }
        if (null !== $this->sessionId) {
            $res['session_id'] = $this->sessionId;
        }
        if (null !== $this->requestId) {
            $res['request_id'] = $this->requestId;
        }
        if (null !== $this->sceneCode) {
            $res['scene_code'] = $this->sceneCode;
        }
        if (null !== $this->serviceCode) {
            $res['service_code'] = $this->serviceCode;
        }
        if (null !== $this->agentCode) {
            $res['agent_code'] = $this->agentCode;
        }
        if (null !== $this->modelCode) {
            $res['model_code'] = $this->modelCode;
        }
        if (null !== $this->userId) {
            $res['user_id'] = $this->userId;
        }
        if (null !== $this->businessProperties) {
            $res['business_properties'] = null !== $this->businessProperties ? $this->businessProperties->toMap() : null;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CheckDemoAicoguardcoreAicoguardrailsQuestionRequest
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
        if (isset($map['question'])) {
            $model->question = $map['question'];
        }
        if (isset($map['question_format'])) {
            $model->questionFormat = $map['question_format'];
        }
        if (isset($map['app_code'])) {
            $model->appCode = $map['app_code'];
        }
        if (isset($map['session_id'])) {
            $model->sessionId = $map['session_id'];
        }
        if (isset($map['request_id'])) {
            $model->requestId = $map['request_id'];
        }
        if (isset($map['scene_code'])) {
            $model->sceneCode = $map['scene_code'];
        }
        if (isset($map['service_code'])) {
            $model->serviceCode = $map['service_code'];
        }
        if (isset($map['agent_code'])) {
            $model->agentCode = $map['agent_code'];
        }
        if (isset($map['model_code'])) {
            $model->modelCode = $map['model_code'];
        }
        if (isset($map['user_id'])) {
            $model->userId = $map['user_id'];
        }
        if (isset($map['business_properties'])) {
            $model->businessProperties = Map::fromMap($map['business_properties']);
        }

        return $model;
    }
}
