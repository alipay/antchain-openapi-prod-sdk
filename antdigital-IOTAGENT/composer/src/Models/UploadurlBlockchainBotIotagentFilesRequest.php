<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\IOTAGENT\Models;

use AlibabaCloud\Tea\Model;

class UploadurlBlockchainBotIotagentFilesRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'fileName' => 'file_name',
        'mediaType' => 'media_type',
        'sizeBytes' => 'size_bytes',
        'sha256' => 'sha256',
        'clientId' => 'client_id',
        'sessionId' => 'session_id',
        'scene' => 'scene',
    ];
    public function validate() {
        Model::validateRequired('fileName', $this->fileName, true);
        Model::validateRequired('mediaType', $this->mediaType, true);
        Model::validateRequired('sizeBytes', $this->sizeBytes, true);
        Model::validateRequired('sha256', $this->sha256, true);
        Model::validateRequired('clientId', $this->clientId, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->fileName) {
            $res['file_name'] = $this->fileName;
        }
        if (null !== $this->mediaType) {
            $res['media_type'] = $this->mediaType;
        }
        if (null !== $this->sizeBytes) {
            $res['size_bytes'] = $this->sizeBytes;
        }
        if (null !== $this->sha256) {
            $res['sha256'] = $this->sha256;
        }
        if (null !== $this->clientId) {
            $res['client_id'] = $this->clientId;
        }
        if (null !== $this->sessionId) {
            $res['session_id'] = $this->sessionId;
        }
        if (null !== $this->scene) {
            $res['scene'] = $this->scene;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return UploadurlBlockchainBotIotagentFilesRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['product_instance_id'])){
            $model->productInstanceId = $map['product_instance_id'];
        }
        if(isset($map['file_name'])){
            $model->fileName = $map['file_name'];
        }
        if(isset($map['media_type'])){
            $model->mediaType = $map['media_type'];
        }
        if(isset($map['size_bytes'])){
            $model->sizeBytes = $map['size_bytes'];
        }
        if(isset($map['sha256'])){
            $model->sha256 = $map['sha256'];
        }
        if(isset($map['client_id'])){
            $model->clientId = $map['client_id'];
        }
        if(isset($map['session_id'])){
            $model->sessionId = $map['session_id'];
        }
        if(isset($map['scene'])){
            $model->scene = $map['scene'];
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

    // 文件名
    /**
     * @var string
     */
    public $fileName;

    // 媒体类型
    /**
     * @var string
     */
    public $mediaType;

    // 文件字节数
    /**
     * @var string
     */
    public $sizeBytes;

    // 内容 SHA-256（十六进制小写）
    /**
     * @var string
     */
    public $sha256;

    // 客户端绑定 ID（租户绑定鉴权锚点）
    /**
     * @var string
     */
    public $clientId;

    // 会话ID（scene=SESSION_FILE 时必填）
    /**
     * @var string
     */
    public $sessionId;

    // 上传场景：SESSION_FILE（默认，会话附件）/SKILL_PACKAGE（SKILL 上传暂存）
    /**
     * @var string
     */
    public $scene;

}
