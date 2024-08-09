<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\SECURITYTECH\Models;

use AlibabaCloud\Tea\Model;

class QueryGuardAskRequest extends Model
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

    // serviceCode
    /**
     * @var string
     */
    public $serviceCode;

    // 当前提问内容，最大长度10000个字符。
    /**
     * @var string
     */
    public $question;

    // 提问内容类型，纯文本: PLAINTEXT，图片url: PICTURE_URL
    /**
     * @var string
     */
    public $questionFormat;

    // scene_code
    /**
     * @var string
     */
    public $sceneCode;

    // app_code
    /**
     * @var string
     */
    public $appCode;

    // raas_products
    /**
     * @var string
     */
    public $raasProducts;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'sessionId'         => 'session_id',
        'requestId'         => 'request_id',
        'serviceCode'       => 'service_code',
        'question'          => 'question',
        'questionFormat'    => 'question_format',
        'sceneCode'         => 'scene_code',
        'appCode'           => 'app_code',
        'raasProducts'      => 'raas_products',
    ];

    public function validate()
    {
        Model::validateRequired('sessionId', $this->sessionId, true);
        Model::validateRequired('requestId', $this->requestId, true);
        Model::validateRequired('serviceCode', $this->serviceCode, true);
        Model::validateRequired('question', $this->question, true);
        Model::validateMaxLength('sessionId', $this->sessionId, 128);
        Model::validateMaxLength('requestId', $this->requestId, 64);
        Model::validateMaxLength('question', $this->question, 10000);
        Model::validateMaxLength('questionFormat', $this->questionFormat, 32);
        Model::validateMinLength('sessionId', $this->sessionId, 0);
        Model::validateMinLength('requestId', $this->requestId, 0);
        Model::validateMinLength('question', $this->question, 0);
        Model::validateMinLength('questionFormat', $this->questionFormat, 0);
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
        if (null !== $this->sessionId) {
            $res['session_id'] = $this->sessionId;
        }
        if (null !== $this->requestId) {
            $res['request_id'] = $this->requestId;
        }
        if (null !== $this->serviceCode) {
            $res['service_code'] = $this->serviceCode;
        }
        if (null !== $this->question) {
            $res['question'] = $this->question;
        }
        if (null !== $this->questionFormat) {
            $res['question_format'] = $this->questionFormat;
        }
        if (null !== $this->sceneCode) {
            $res['scene_code'] = $this->sceneCode;
        }
        if (null !== $this->appCode) {
            $res['app_code'] = $this->appCode;
        }
        if (null !== $this->raasProducts) {
            $res['raas_products'] = $this->raasProducts;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryGuardAskRequest
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
        if (isset($map['session_id'])) {
            $model->sessionId = $map['session_id'];
        }
        if (isset($map['request_id'])) {
            $model->requestId = $map['request_id'];
        }
        if (isset($map['service_code'])) {
            $model->serviceCode = $map['service_code'];
        }
        if (isset($map['question'])) {
            $model->question = $map['question'];
        }
        if (isset($map['question_format'])) {
            $model->questionFormat = $map['question_format'];
        }
        if (isset($map['scene_code'])) {
            $model->sceneCode = $map['scene_code'];
        }
        if (isset($map['app_code'])) {
            $model->appCode = $map['app_code'];
        }
        if (isset($map['raas_products'])) {
            $model->raasProducts = $map['raas_products'];
        }

        return $model;
    }
}
