<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\AITECH\Models;

use AlibabaCloud\Tea\Model;

class QuerySecurityAudioRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'audioUrl' => 'audio_url',
        'audioFormat' => 'audio_format',
        'denoise' => 'denoise',
        'sceneCode' => 'scene_code',
        'businessId' => 'business_id',
        'appCode' => 'app_code',
        'messageId' => 'message_id',
        'enterprise' => 'enterprise',
        'accountId' => 'account_id',
    ];
    public function validate() {
        Model::validateRequired('audioUrl', $this->audioUrl, true);
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
        if (null !== $this->audioUrl) {
            $res['audio_url'] = $this->audioUrl;
        }
        if (null !== $this->audioFormat) {
            $res['audio_format'] = $this->audioFormat;
        }
        if (null !== $this->denoise) {
            $res['denoise'] = $this->denoise;
        }
        if (null !== $this->sceneCode) {
            $res['scene_code'] = $this->sceneCode;
        }
        if (null !== $this->businessId) {
            $res['business_id'] = $this->businessId;
        }
        if (null !== $this->appCode) {
            $res['app_code'] = $this->appCode;
        }
        if (null !== $this->messageId) {
            $res['message_id'] = $this->messageId;
        }
        if (null !== $this->enterprise) {
            $res['enterprise'] = $this->enterprise;
        }
        if (null !== $this->accountId) {
            $res['account_id'] = $this->accountId;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return QuerySecurityAudioRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['product_instance_id'])){
            $model->productInstanceId = $map['product_instance_id'];
        }
        if(isset($map['audio_url'])){
            $model->audioUrl = $map['audio_url'];
        }
        if(isset($map['audio_format'])){
            $model->audioFormat = $map['audio_format'];
        }
        if(isset($map['denoise'])){
            $model->denoise = $map['denoise'];
        }
        if(isset($map['scene_code'])){
            $model->sceneCode = $map['scene_code'];
        }
        if(isset($map['business_id'])){
            $model->businessId = $map['business_id'];
        }
        if(isset($map['app_code'])){
            $model->appCode = $map['app_code'];
        }
        if(isset($map['message_id'])){
            $model->messageId = $map['message_id'];
        }
        if(isset($map['enterprise'])){
            $model->enterprise = $map['enterprise'];
        }
        if(isset($map['account_id'])){
            $model->accountId = $map['account_id'];
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

    // 音频公网 URL
    /**
     * @var string
     */
    public $audioUrl;

    // 缺省从 URL 后缀或 magic number 推断
    /**
     * @var string
     */
    public $audioFormat;

    // Boolean 降噪（null 时服务端默认 true）
    /**
     * @var string
     */
    public $denoise;

    // 须 audio 前缀，
    /**
     * @var string
     */
    public $sceneCode;

    // 租户标识（老值兼容替换）
    /**
     * @var string
     */
    public $businessId;

    // 应用码
    /**
     * @var string
     */
    public $appCode;

    // 消息 ID
    /**
     * @var string
     */
    public $messageId;

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

}
