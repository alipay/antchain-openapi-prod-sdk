<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\AITECH\Models;

use AlibabaCloud\Tea\Model;

class UploadSecurityAnswerRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'fileUrl' => 'file_url',
        'sceneCode' => 'scene_code',
        'businessId' => 'business_id',
        'enterprise' => 'enterprise',
        'accountId' => 'account_id',
        'messageId' => 'message_id',
        'flowMsgId' => 'flow_msg_id',
        'flowDetect' => 'flow_detect',
        'flowEnd' => 'flow_end',
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
        if (null !== $this->flowMsgId) {
            $res['flow_msg_id'] = $this->flowMsgId;
        }
        if (null !== $this->flowDetect) {
            $res['flow_detect'] = $this->flowDetect;
        }
        if (null !== $this->flowEnd) {
            $res['flow_end'] = $this->flowEnd;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return UploadSecurityAnswerRequest
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
        if(isset($map['flow_msg_id'])){
            $model->flowMsgId = $map['flow_msg_id'];
        }
        if(isset($map['flow_detect'])){
            $model->flowDetect = $map['flow_detect'];
        }
        if(isset($map['flow_end'])){
            $model->flowEnd = $map['flow_end'];
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

    // txt/pdf 文件
    /**
     * @var string
     */
    public $fileUrl;

    // 须 answer 前缀，否则兜底 LLM_OUTPUT_DETECTION_LITE
    /**
     * @var string
     */
    public $sceneCode;

    // 租户标识
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

    // 流式消息 ID
    /**
     * @var string
     */
    public $flowMsgId;

    // 流式检测开关
    /**
     * @var string
     */
    public $flowDetect;

    // 流结束标记
    /**
     * @var string
     */
    public $flowEnd;

}
