<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\AITECH\Models;

use AlibabaCloud\Tea\Model;

class QuerySecurityAnswerRequest extends Model
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

    // 调用标示
    /**
     * @var string
     */
    public $enterprise;

    // 细分调用方标识
    /**
     * @var string
     */
    public $businessId;

    // 当前回答内容，最大长度40000个字符
    /**
     * @var string
     */
    public $content;

    // 场景code
    /**
     * @var string
     */
    public $sceneCode;

    // 是否开启流式检测功能。默认值：N：不开启，Y：开启
    /**
     * @var string
     */
    public $flowDetect;

    // 会话id
    /**
     * @var string
     */
    public $flowMsgId;

    // 流失内容结束标示
    /**
     * @var string
     */
    public $flowEnd;

    // 表示是同一个Q&A
    /**
     * @var string
     */
    public $messageId;

    // 是否要针对大模型输出的内容中的隐私数据进行脱敏。默认值：N：不开启，Y：开启
    /**
     * @var string
     */
    public $privacyDataObfuscation;

    // 是否开启隐私数据泄露的专项检测（新字段，老privacy废弃）
    /**
     * @var string
     */
    public $privacyDataDetection;
    protected $_name = [
        'authToken'              => 'auth_token',
        'productInstanceId'      => 'product_instance_id',
        'enterprise'             => 'enterprise',
        'businessId'             => 'business_id',
        'content'                => 'content',
        'sceneCode'              => 'scene_code',
        'flowDetect'             => 'flow_detect',
        'flowMsgId'              => 'flow_msg_id',
        'flowEnd'                => 'flow_end',
        'messageId'              => 'message_id',
        'privacyDataObfuscation' => 'privacy_data_obfuscation',
        'privacyDataDetection'   => 'privacy_data_detection',
    ];

    public function validate()
    {
        Model::validateRequired('businessId', $this->businessId, true);
        Model::validateRequired('content', $this->content, true);
        Model::validateRequired('sceneCode', $this->sceneCode, true);
        Model::validateMaxLength('content', $this->content, 40000);
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
        if (null !== $this->flowMsgId) {
            $res['flow_msg_id'] = $this->flowMsgId;
        }
        if (null !== $this->flowEnd) {
            $res['flow_end'] = $this->flowEnd;
        }
        if (null !== $this->messageId) {
            $res['message_id'] = $this->messageId;
        }
        if (null !== $this->privacyDataObfuscation) {
            $res['privacy_data_obfuscation'] = $this->privacyDataObfuscation;
        }
        if (null !== $this->privacyDataDetection) {
            $res['privacy_data_detection'] = $this->privacyDataDetection;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QuerySecurityAnswerRequest
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
        if (isset($map['flow_msg_id'])) {
            $model->flowMsgId = $map['flow_msg_id'];
        }
        if (isset($map['flow_end'])) {
            $model->flowEnd = $map['flow_end'];
        }
        if (isset($map['message_id'])) {
            $model->messageId = $map['message_id'];
        }
        if (isset($map['privacy_data_obfuscation'])) {
            $model->privacyDataObfuscation = $map['privacy_data_obfuscation'];
        }
        if (isset($map['privacy_data_detection'])) {
            $model->privacyDataDetection = $map['privacy_data_detection'];
        }

        return $model;
    }
}
