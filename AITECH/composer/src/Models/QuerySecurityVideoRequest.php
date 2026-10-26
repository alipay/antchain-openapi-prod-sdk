<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\AITECH\Models;

use AlibabaCloud\Tea\Model;

class QuerySecurityVideoRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'videoUrl' => 'video_url',
        'sceneCode' => 'scene_code',
        'businessId' => 'business_id',
        'appCode' => 'app_code',
        'messageId' => 'message_id',
        'enterprise' => 'enterprise',
        'accountId' => 'account_id',
    ];
    public function validate() {
        Model::validateRequired('videoUrl', $this->videoUrl, true);
        Model::validateRequired('sceneCode', $this->sceneCode, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->videoUrl) {
            $res['video_url'] = $this->videoUrl;
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
     * @return QuerySecurityVideoRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['product_instance_id'])){
            $model->productInstanceId = $map['product_instance_id'];
        }
        if(isset($map['video_url'])){
            $model->videoUrl = $map['video_url'];
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

    // 视频公开访问 URL
    /**
     * @var string
     */
    public $videoUrl;

    // 归一化后须 video 前缀，否则拒绝
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
