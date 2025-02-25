<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_63625f64df2048aca9ff5bea9e227854\Models;

use AlibabaCloud\Tea\Model;

class CheckAntcloudAitechguardAicoguardrailsAnswerRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 会话ID，用于匹配多轮对话上下文
    /**
     * @var string
     */
    public $sessionId;

    // 数据唯一标识，能够根据该值定位到该条数据
    /**
     * @var string
     */
    public $requestId;

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

    // 当前提问内容，最大长度800个字符。
    /**
     * @var string
     */
    public $question;

    // 当前回答内容，最大长度10000个字符。
    /**
     * @var string
     */
    public $content;

    // 用户ID，用于主体风险判断
    /**
     * @var string
     */
    public $userId;
    protected $_name = [
        'authToken' => 'auth_token',
        'sessionId' => 'session_id',
        'requestId' => 'request_id',
        'appCode'   => 'app_code',
        'sceneCode' => 'scene_code',
        'question'  => 'question',
        'content'   => 'content',
        'userId'    => 'user_id',
    ];

    public function validate()
    {
        Model::validateRequired('sessionId', $this->sessionId, true);
        Model::validateRequired('requestId', $this->requestId, true);
        Model::validateRequired('appCode', $this->appCode, true);
        Model::validateRequired('sceneCode', $this->sceneCode, true);
        Model::validateRequired('content', $this->content, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->sessionId) {
            $res['session_id'] = $this->sessionId;
        }
        if (null !== $this->requestId) {
            $res['request_id'] = $this->requestId;
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
        if (null !== $this->content) {
            $res['content'] = $this->content;
        }
        if (null !== $this->userId) {
            $res['user_id'] = $this->userId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CheckAntcloudAitechguardAicoguardrailsAnswerRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['session_id'])) {
            $model->sessionId = $map['session_id'];
        }
        if (isset($map['request_id'])) {
            $model->requestId = $map['request_id'];
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
        if (isset($map['content'])) {
            $model->content = $map['content'];
        }
        if (isset($map['user_id'])) {
            $model->userId = $map['user_id'];
        }

        return $model;
    }
}
