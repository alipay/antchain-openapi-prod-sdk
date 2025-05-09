<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_63625f64df2048aca9ff5bea9e227854\Models;

use AlibabaCloud\Tea\Model;

class CheckAntcloudAitechguardAicoguardrailsAskRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 数据唯一标识，能够根据该值定位到该条数据
    /**
     * @var string
     */
    public $requestId;

    // 会话ID，用于匹配多轮对话上下文
    /**
     * @var string
     */
    public $sessionId;

    // 应用名，蚂蚁侧提供
    /**
     * @var string
     */
    public $appCode;

    // 场景code，走SOP流程申请
    /**
     * @var string
     */
    public $sceneCode;

    // 当前提问内容
    /**
     * @var string
     */
    public $question;

    // 当前提问格式，默认PLAINTEXT，详见3.2 questionFormat&answerFormat说明
    /**
     * @var string
     */
    public $questionFormat;

    // 加密的uid，仅用于唯一标示调用方
    /**
     * @var string
     */
    public $userId;

    // 多轮对话最后一次回答
    /**
     * @var string
     */
    public $lastAnswer;

    // 需要个性化处理的标签
    /**
     * @var PersonalLabelCustomization
     */
    public $personalLabelCustomization;

    // 是否需要开启针对大模型提问prompt攻击手法的防御功能，包括越狱攻击（劫持、诱导、其他）、注入攻击、内容泛化攻击（文本变形变种）等常见攻击手法。默认值：N：不开启
    // Y：开启
    // N：不开启
    /**
     * @var string
     */
    public $attackDefense;
    protected $_name = [
        'authToken'                  => 'auth_token',
        'requestId'                  => 'request_id',
        'sessionId'                  => 'session_id',
        'appCode'                    => 'app_code',
        'sceneCode'                  => 'scene_code',
        'question'                   => 'question',
        'questionFormat'             => 'question_format',
        'userId'                     => 'user_id',
        'lastAnswer'                 => 'last_answer',
        'personalLabelCustomization' => 'personal_label_customization',
        'attackDefense'              => 'attack_defense',
    ];

    public function validate()
    {
        Model::validateRequired('requestId', $this->requestId, true);
        Model::validateRequired('sessionId', $this->sessionId, true);
        Model::validateRequired('appCode', $this->appCode, true);
        Model::validateRequired('sceneCode', $this->sceneCode, true);
        Model::validateRequired('question', $this->question, true);
        Model::validateRequired('questionFormat', $this->questionFormat, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->requestId) {
            $res['request_id'] = $this->requestId;
        }
        if (null !== $this->sessionId) {
            $res['session_id'] = $this->sessionId;
        }
        if (null !== $this->appCode) {
            $res['app_code'] = $this->appCode;
        }
        if (null !== $this->sceneCode) {
            $res['scene_code'] = $this->sceneCode;
        }
        if (null !== $this->question) {
            $res['question'] = $this->question;
        }
        if (null !== $this->questionFormat) {
            $res['question_format'] = $this->questionFormat;
        }
        if (null !== $this->userId) {
            $res['user_id'] = $this->userId;
        }
        if (null !== $this->lastAnswer) {
            $res['last_answer'] = $this->lastAnswer;
        }
        if (null !== $this->personalLabelCustomization) {
            $res['personal_label_customization'] = null !== $this->personalLabelCustomization ? $this->personalLabelCustomization->toMap() : null;
        }
        if (null !== $this->attackDefense) {
            $res['attack_defense'] = $this->attackDefense;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CheckAntcloudAitechguardAicoguardrailsAskRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['request_id'])) {
            $model->requestId = $map['request_id'];
        }
        if (isset($map['session_id'])) {
            $model->sessionId = $map['session_id'];
        }
        if (isset($map['app_code'])) {
            $model->appCode = $map['app_code'];
        }
        if (isset($map['scene_code'])) {
            $model->sceneCode = $map['scene_code'];
        }
        if (isset($map['question'])) {
            $model->question = $map['question'];
        }
        if (isset($map['question_format'])) {
            $model->questionFormat = $map['question_format'];
        }
        if (isset($map['user_id'])) {
            $model->userId = $map['user_id'];
        }
        if (isset($map['last_answer'])) {
            $model->lastAnswer = $map['last_answer'];
        }
        if (isset($map['personal_label_customization'])) {
            $model->personalLabelCustomization = PersonalLabelCustomization::fromMap($map['personal_label_customization']);
        }
        if (isset($map['attack_defense'])) {
            $model->attackDefense = $map['attack_defense'];
        }

        return $model;
    }
}
