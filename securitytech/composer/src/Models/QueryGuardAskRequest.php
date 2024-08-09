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

    // 大模型提问护栏服务, 用于区分提供的服务类别，当前支持：TJ_QUESTION_BASIC、TJ_ANSWER_BASIC 两种
    /**
     * @var string
     */
    public $serviceName;

    // 当前提问内容，最大长度10000个字符。
    /**
     * @var string
     */
    public $question;

    // 用户ID，用于主体风险判断，如果是2088开头的阿里体系用户，请传入2088开头的用户ID
    /**
     * @var string
     */
    public $userId;

    // 提问内容类型，纯文本: PLAINTEXT，图片url: PICTURE_URL
    /**
     * @var string
     */
    public $questionFormat;

    // 大模型ID，表示大模型版本
    /**
     * @var string
     */
    public $modelCode;

    // 扩展属性Map，key限定为：aigcType、serviceScene、triggerSource、bizOwner，对应的value取值为： aigcType： ● 文生文：text_text ● 文生图：text_pic ● 图生文：pic_text ● 图生图：pic_pic serviceScene: 根据业务使用的不同情况支持自定义入参做策略个性化配置，私域或者公域，以及不同的业务应用 比如领域： serviceScene = insurance 表示保险 serviceScene = medical 表示医疗 serviceScene = government 表示政务 比如业务活动应用： serviceScene = xiacu 表示夏促 serviceScene = qixi 表示七夕 triggerSource: 不同的来源，比如移动端、web端、API
    /**
     * @var KeyValueMap
     */
    public $businessProperties;

    // scene_code
    /**
     * @var string
     */
    public $sceneCode;

    // serviceCode
    /**
     * @var string
     */
    public $serviceCode;

    // app_code
    /**
     * @var string
     */
    public $appCode;
    protected $_name = [
        'authToken'          => 'auth_token',
        'productInstanceId'  => 'product_instance_id',
        'sessionId'          => 'session_id',
        'requestId'          => 'request_id',
        'serviceName'        => 'service_name',
        'question'           => 'question',
        'userId'             => 'user_id',
        'questionFormat'     => 'question_format',
        'modelCode'          => 'model_code',
        'businessProperties' => 'business_properties',
        'sceneCode'          => 'scene_code',
        'serviceCode'        => 'service_code',
        'appCode'            => 'app_code',
    ];

    public function validate()
    {
        Model::validateRequired('sessionId', $this->sessionId, true);
        Model::validateRequired('requestId', $this->requestId, true);
        Model::validateRequired('serviceName', $this->serviceName, true);
        Model::validateRequired('question', $this->question, true);
        Model::validateRequired('userId', $this->userId, true);
        Model::validateMaxLength('sessionId', $this->sessionId, 128);
        Model::validateMaxLength('requestId', $this->requestId, 64);
        Model::validateMaxLength('serviceName', $this->serviceName, 128);
        Model::validateMaxLength('question', $this->question, 10000);
        Model::validateMaxLength('userId', $this->userId, 32);
        Model::validateMaxLength('questionFormat', $this->questionFormat, 32);
        Model::validateMaxLength('modelCode', $this->modelCode, 128);
        Model::validateMinLength('sessionId', $this->sessionId, 0);
        Model::validateMinLength('requestId', $this->requestId, 0);
        Model::validateMinLength('serviceName', $this->serviceName, 0);
        Model::validateMinLength('question', $this->question, 0);
        Model::validateMinLength('userId', $this->userId, 0);
        Model::validateMinLength('questionFormat', $this->questionFormat, 0);
        Model::validateMinLength('modelCode', $this->modelCode, 0);
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
        if (null !== $this->serviceName) {
            $res['service_name'] = $this->serviceName;
        }
        if (null !== $this->question) {
            $res['question'] = $this->question;
        }
        if (null !== $this->userId) {
            $res['user_id'] = $this->userId;
        }
        if (null !== $this->questionFormat) {
            $res['question_format'] = $this->questionFormat;
        }
        if (null !== $this->modelCode) {
            $res['model_code'] = $this->modelCode;
        }
        if (null !== $this->businessProperties) {
            $res['business_properties'] = null !== $this->businessProperties ? $this->businessProperties->toMap() : null;
        }
        if (null !== $this->sceneCode) {
            $res['scene_code'] = $this->sceneCode;
        }
        if (null !== $this->serviceCode) {
            $res['service_code'] = $this->serviceCode;
        }
        if (null !== $this->appCode) {
            $res['app_code'] = $this->appCode;
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
        if (isset($map['service_name'])) {
            $model->serviceName = $map['service_name'];
        }
        if (isset($map['question'])) {
            $model->question = $map['question'];
        }
        if (isset($map['user_id'])) {
            $model->userId = $map['user_id'];
        }
        if (isset($map['question_format'])) {
            $model->questionFormat = $map['question_format'];
        }
        if (isset($map['model_code'])) {
            $model->modelCode = $map['model_code'];
        }
        if (isset($map['business_properties'])) {
            $model->businessProperties = KeyValueMap::fromMap($map['business_properties']);
        }
        if (isset($map['scene_code'])) {
            $model->sceneCode = $map['scene_code'];
        }
        if (isset($map['service_code'])) {
            $model->serviceCode = $map['service_code'];
        }
        if (isset($map['app_code'])) {
            $model->appCode = $map['app_code'];
        }

        return $model;
    }
}
