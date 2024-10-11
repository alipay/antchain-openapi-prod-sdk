<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_63625f64df2048aca9ff5bea9e227854\Models;

use AlibabaCloud\Tea\Model;

class QueryAitechCommGuardcoreRedgptRequest extends Model
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

    // 唯一请求ID
    /**
     * @var string
     */
    public $requestId;

    // 多轮对话会话ID
    /**
     * @var string
     */
    public $sessionId;

    // 场景code
    /**
     * @var string
     */
    public $sceneCode;

    // 调用方AppCode
    /**
     * @var string
     */
    public $appCode;

    // 提问内容
    /**
     * @var string
     */
    public $question;

    // 提问内容格式,当前仅支持PLAINTEXT
    /**
     * @var string
     */
    public $questionFormat;

    // 加密的调用方业务UserId
    /**
     * @var string
     */
    public $userId;

    // 是否流式输出
    /**
     * @var bool
     */
    public $stream;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'requestId'         => 'request_id',
        'sessionId'         => 'session_id',
        'sceneCode'         => 'scene_code',
        'appCode'           => 'app_code',
        'question'          => 'question',
        'questionFormat'    => 'question_format',
        'userId'            => 'user_id',
        'stream'            => 'stream',
    ];

    public function validate()
    {
        Model::validateRequired('requestId', $this->requestId, true);
        Model::validateRequired('sessionId', $this->sessionId, true);
        Model::validateRequired('sceneCode', $this->sceneCode, true);
        Model::validateRequired('appCode', $this->appCode, true);
        Model::validateRequired('question', $this->question, true);
        Model::validateRequired('questionFormat', $this->questionFormat, true);
        Model::validateRequired('userId', $this->userId, true);
        Model::validateRequired('stream', $this->stream, true);
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
        if (null !== $this->requestId) {
            $res['request_id'] = $this->requestId;
        }
        if (null !== $this->sessionId) {
            $res['session_id'] = $this->sessionId;
        }
        if (null !== $this->sceneCode) {
            $res['scene_code'] = $this->sceneCode;
        }
        if (null !== $this->appCode) {
            $res['app_code'] = $this->appCode;
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
        if (null !== $this->stream) {
            $res['stream'] = $this->stream;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryAitechCommGuardcoreRedgptRequest
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
        if (isset($map['request_id'])) {
            $model->requestId = $map['request_id'];
        }
        if (isset($map['session_id'])) {
            $model->sessionId = $map['session_id'];
        }
        if (isset($map['scene_code'])) {
            $model->sceneCode = $map['scene_code'];
        }
        if (isset($map['app_code'])) {
            $model->appCode = $map['app_code'];
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
        if (isset($map['stream'])) {
            $model->stream = $map['stream'];
        }

        return $model;
    }
}
