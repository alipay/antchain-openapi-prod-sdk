<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\AITECH\Models;

use AlibabaCloud\Tea\Model;

class CheckGuardAnswerRequest extends Model
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

    // 调用方标识
    /**
     * @var string
     */
    public $appCode;

    // 细分调用方标识，可与 appCode 传相同值
    /**
     * @var string
     */
    public $businessId;

    // 文本内容，最大5000字符长度
    /**
     * @var string
     */
    public $content;

    // 场景code：
    // ● llm_output_detection：大模型输出通用场景
    /**
     * @var string
     */
    public $sceneCode;

    // 是否开启流式检测功能。默认值：N：不开启
    // Y：开启
    // N：不开启
    /**
     * @var string
     */
    public $flowDetect;

    // 会话ID，标记本次请求内容属于同一段流式内容，文本审核引擎会自动拼接后进行审核，拼接文字片段后不超过10000字的部分
    /**
     * @var string
     */
    public $sessionId;

    // 是否要针对大模型输出的CoT、回答进行代答/改写。默认值：N：不开启
    // Y：开启
    // N：不开启
    /**
     * @var string
     */
    public $replyProxy;

    // 是否要针对大模型输出的内容中的隐私数据进行脱敏。默认值：N：不开启
    // Y：开启
    // N：不开启
    /**
     * @var string
     */
    public $privacyDataObfuscation;
    protected $_name = [
        'authToken'              => 'auth_token',
        'productInstanceId'      => 'product_instance_id',
        'appCode'                => 'app_code',
        'businessId'             => 'business_id',
        'content'                => 'content',
        'sceneCode'              => 'scene_code',
        'flowDetect'             => 'flow_detect',
        'sessionId'              => 'session_id',
        'replyProxy'             => 'reply_proxy',
        'privacyDataObfuscation' => 'privacy_data_obfuscation',
    ];

    public function validate()
    {
        Model::validateRequired('appCode', $this->appCode, true);
        Model::validateRequired('content', $this->content, true);
        Model::validateRequired('sceneCode', $this->sceneCode, true);
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
        if (null !== $this->appCode) {
            $res['app_code'] = $this->appCode;
        }
        if (null !== $this->businessId) {
            $res['business_id'] = $this->businessId;
        }
        if (null !== $this->content) {
            $res['content'] = $this->content;
        }
        if (null !== $this->sceneCode) {
            $res['scene_code'] = $this->sceneCode;
        }
        if (null !== $this->flowDetect) {
            $res['flow_detect'] = $this->flowDetect;
        }
        if (null !== $this->sessionId) {
            $res['session_id'] = $this->sessionId;
        }
        if (null !== $this->replyProxy) {
            $res['reply_proxy'] = $this->replyProxy;
        }
        if (null !== $this->privacyDataObfuscation) {
            $res['privacy_data_obfuscation'] = $this->privacyDataObfuscation;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CheckGuardAnswerRequest
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
        if (isset($map['app_code'])) {
            $model->appCode = $map['app_code'];
        }
        if (isset($map['business_id'])) {
            $model->businessId = $map['business_id'];
        }
        if (isset($map['content'])) {
            $model->content = $map['content'];
        }
        if (isset($map['scene_code'])) {
            $model->sceneCode = $map['scene_code'];
        }
        if (isset($map['flow_detect'])) {
            $model->flowDetect = $map['flow_detect'];
        }
        if (isset($map['session_id'])) {
            $model->sessionId = $map['session_id'];
        }
        if (isset($map['reply_proxy'])) {
            $model->replyProxy = $map['reply_proxy'];
        }
        if (isset($map['privacy_data_obfuscation'])) {
            $model->privacyDataObfuscation = $map['privacy_data_obfuscation'];
        }

        return $model;
    }
}
