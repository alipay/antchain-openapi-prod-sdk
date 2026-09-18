<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\SECURITYTECH\Models;

use AlibabaCloud\Tea\Model;
use GuzzleHttp\Psr7\Stream;

class ReceiveFileidCallbackRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'fileId' => 'file_id',
        'uploadScene' => 'upload_scene',
        'channelTenant' => 'channel_tenant',
        'uploadId' => 'upload_id',
    ];
    public function validate() {
        Model::validateRequired('fileId', $this->fileId, true);
        Model::validateRequired('uploadScene', $this->uploadScene, true);
        Model::validateRequired('channelTenant', $this->channelTenant, true);
        Model::validateRequired('uploadId', $this->uploadId, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->fileObject) {
            $res['fileObject'] = $this->fileObject;
        }
        if (null !== $this->fileObjectName) {
            $res['fileObjectName'] = $this->fileObjectName;
        }
        if (null !== $this->fileId) {
            $res['file_id'] = $this->fileId;
        }
        if (null !== $this->uploadScene) {
            $res['upload_scene'] = $this->uploadScene;
        }
        if (null !== $this->channelTenant) {
            $res['channel_tenant'] = $this->channelTenant;
        }
        if (null !== $this->uploadId) {
            $res['upload_id'] = $this->uploadId;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return ReceiveFileidCallbackRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['product_instance_id'])){
            $model->productInstanceId = $map['product_instance_id'];
        }
        if(isset($map['fileObject'])){
            $model->fileObject = $map['fileObject'];
        }
        if(isset($map['fileObjectName'])){
            $model->fileObjectName = $map['fileObjectName'];
        }
        if(isset($map['file_id'])){
            $model->fileId = $map['file_id'];
        }
        if(isset($map['upload_scene'])){
            $model->uploadScene = $map['upload_scene'];
        }
        if(isset($map['channel_tenant'])){
            $model->channelTenant = $map['channel_tenant'];
        }
        if(isset($map['upload_id'])){
            $model->uploadId = $map['upload_id'];
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

    // string
    /**
     * @description 待上传文件
     * @var Stream
     */
    public $fileObject;

    /**
     * @description 待上传文件名
     * @var string
     */
    public $fileObjectName;

    /**
     * @var string
     */
    public $fileId;

    // 上传场景
    /**
     * @var string
     */
    public $uploadScene;

    // 渠道方租户
    /**
     * @var string
     */
    public $channelTenant;

    // 上传唯一标识
    /**
     * @var string
     */
    public $uploadId;

}
