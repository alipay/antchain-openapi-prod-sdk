<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\AITECH\Models;

use AlibabaCloud\Tea\Model;

class UploadSecurityAudioRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'fileUrl' => 'file_url',
        'sceneCode' => 'scene_code',
        'businessId' => 'business_id',
        'denoise' => 'denoise',
        'audioFormat' => 'audio_format',
        'messageId' => 'message_id',
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
        if (null !== $this->denoise) {
            $res['denoise'] = $this->denoise;
        }
        if (null !== $this->audioFormat) {
            $res['audio_format'] = $this->audioFormat;
        }
        if (null !== $this->messageId) {
            $res['message_id'] = $this->messageId;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return UploadSecurityAudioRequest
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
        if(isset($map['denoise'])){
            $model->denoise = $map['denoise'];
        }
        if(isset($map['audio_format'])){
            $model->audioFormat = $map['audio_format'];
        }
        if(isset($map['message_id'])){
            $model->messageId = $map['message_id'];
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

    // 音频文件 URL
    /**
     * @var string
     */
    public $fileUrl;

    // 须 audio 前缀
    /**
     * @var string
     */
    public $sceneCode;

    // 租户标识
    /**
     * @var string
     */
    public $businessId;

    // 降噪开关
    /**
     * @var string
     */
    public $denoise;

    // 音频格式
    /**
     * @var string
     */
    public $audioFormat;

    // 消息 ID
    /**
     * @var string
     */
    public $messageId;

}
