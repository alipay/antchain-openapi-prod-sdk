<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\Deps\Models;

use AlibabaCloud\Tea\Model;

class UploadApplicationPackageResponse extends Model {
    protected $_name = [
        'reqMsgId' => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg' => 'result_msg',
        'bucketName' => 'bucket_name',
        'signedUploadUrl' => 'signed_upload_url',
    ];
    public function validate() {
        Model::validateRequired('signedUploadUrl', $this->signedUploadUrl, true);
    }
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
        if (null !== $this->bucketName) {
            $res['bucket_name'] = $this->bucketName;
        }
        if (null !== $this->signedUploadUrl) {
            $res['signed_upload_url'] = $this->signedUploadUrl;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return UploadApplicationPackageResponse
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
        if(isset($map['bucket_name'])){
            $model->bucketName = $map['bucket_name'];
        }
        if(isset($map['signed_upload_url'])){
            $model->signedUploadUrl = $map['signed_upload_url'];
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

    // 上传oss的bucket名称
    /**
     * @var string
     */
    public $bucketName;

    // 上传应用发布包的授权签名上传地址
    /**
     * @var string
     */
    public $signedUploadUrl;

}
