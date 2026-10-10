<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\IOTAGENT\Models;

use AlibabaCloud\Tea\Model;

class PushBlockchainBotIotagentWorkspaceRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'fileName' => 'file_name',
        'mediaType' => 'media_type',
        'sizeBytes' => 'size_bytes',
        'sha256' => 'sha256',
        'clientId' => 'client_id',
        'sessionId' => 'session_id',
    ];
    public function validate() {
        Model::validateRequired('fileName', $this->fileName, true);
        Model::validateRequired('mediaType', $this->mediaType, true);
        Model::validateRequired('sizeBytes', $this->sizeBytes, true);
        Model::validateRequired('sessionId', $this->sessionId, true);
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
        return $res;
    }
    /**
     * @param array $map
     * @return PushBlockchainBotIotagentWorkspaceRequest
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

    /**
     * @var string
     */
    public $fileName;

    /**
     * @var string
     */
    public $mediaType;

    /**
     * @var int
     */
    public $sizeBytes;

    /**
     * @var string
     */
    public $sha256;

    /**
     * @var string
     */
    public $clientId;

    /**
     * @var string
     */
    public $sessionId;

}
