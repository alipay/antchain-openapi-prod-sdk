<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\EBC\Models;

use AlibabaCloud\Tea\Model;

class ApplyBaasEbcCertUrlResponse extends Model {
    protected $_name = [
        'reqMsgId' => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg' => 'result_msg',
        'certUploadUrl' => 'cert_upload_url',
        'featureUploadUrl' => 'feature_upload_url',
        'holderAvatarUploadUrl' => 'holder_avatar_upload_url',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->reqMsgId) {
            $res['req_msg_id'] = $this->reqMsgId;
        }
        if (null !== $this->resultCode) {
            $res['result_code'] = $this->resultCode;
        }
        if (null !== $this->resultMsg) {
            $res['result_msg'] = $this->resultMsg;
        }
        if (null !== $this->certUploadUrl) {
            $res['cert_upload_url'] = $this->certUploadUrl;
        }
        if (null !== $this->featureUploadUrl) {
            $res['feature_upload_url'] = $this->featureUploadUrl;
        }
        if (null !== $this->holderAvatarUploadUrl) {
            $res['holder_avatar_upload_url'] = $this->holderAvatarUploadUrl;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return ApplyBaasEbcCertUrlResponse
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['req_msg_id'])){
            $model->reqMsgId = $map['req_msg_id'];
        }
        if(isset($map['result_code'])){
            $model->resultCode = $map['result_code'];
        }
        if(isset($map['result_msg'])){
            $model->resultMsg = $map['result_msg'];
        }
        if(isset($map['cert_upload_url'])){
            $model->certUploadUrl = $map['cert_upload_url'];
        }
        if(isset($map['feature_upload_url'])){
            $model->featureUploadUrl = $map['feature_upload_url'];
        }
        if(isset($map['holder_avatar_upload_url'])){
            $model->holderAvatarUploadUrl = $map['holder_avatar_upload_url'];
        }
        return $model;
    }
    /**
     * @var string
     */
    public $reqMsgId;

    /**
     * @var string
     */
    public $resultCode;

    /**
     * @var string
     */
    public $resultMsg;

    // 实体证书图片上传url，文件最大5M
    /**
     * @var string
     */
    public $certUploadUrl;

    // 其他信息文件上传url，文件最大5M
    // 
    /**
     * @var string
     */
    public $featureUploadUrl;

    // 持有人的人脸图像上传url，文件最大5M
    /**
     * @var string
     */
    public $holderAvatarUploadUrl;

}
