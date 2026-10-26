<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\AITECH\Models;

use AlibabaCloud\Tea\Model;

class UploadSecurityImageRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'fileUrl' => 'file_url',
        'sceneCode' => 'scene_code',
        'businessId' => 'business_id',
        'enterprise' => 'enterprise',
        'accountId' => 'account_id',
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
        return $res;
    }
    /**
     * @param array $map
     * @return UploadSecurityImageRequest
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

    // 直传或 PDF 逐页转图片
    /**
     * @var string
     */
    public $fileUrl;

    // 归一化后须 image 前缀，否则拒绝
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

}
