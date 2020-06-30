<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\EBC\Models;

use AlibabaCloud\Tea\Model;

class ApplyCertUrlResponse extends Model {
    protected $_name = [
        'certUploadUrl' => 'cert_upload_url',
        'featureUploadUrl' => 'feature_upload_url',
        'holderAvatarUploadUrl' => 'holder_avatar_upload_url',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
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
     * @return ApplyCertUrlResponse
     */
    public static function fromMap($map = []) {
        $model = new self();
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
     * @description 实体证书图片上传url，文件最大5M
     * @example https://xxx.aliyuncs.com/xxx/xx/xx/xx.xlsx?Expires=1589536141&OSSAccessKeyId=TMP.3 
     * @var string
     */
    public $certUploadUrl;

    /**
     * @description 其他信息文件上传url，文件最大5M

     * @example https://xxx.aliyuncs.com/xxx/xx/xx/xx.xlsx?Expires=1589536141&OSSAccessKeyId=TMP.3 
     * @var string
     */
    public $featureUploadUrl;

    /**
     * @description 持有人的人脸图像上传url，文件最大5M
     * @example https://xxx.aliyuncs.com/xxx/xx/xx/xx.xlsx?Expires=1589536141&OSSAccessKeyId=TMP.3Kep 
     * @var string
     */
    public $holderAvatarUploadUrl;

}
