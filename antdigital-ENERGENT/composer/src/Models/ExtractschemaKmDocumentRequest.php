<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\ENERGENT\Models;

use AlibabaCloud\Tea\Model;

class ExtractschemaKmDocumentRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'kbId' => 'kb_id',
        'fileKey' => 'file_key',
        'fileType' => 'file_type',
        'ossProvider' => 'oss_provider',
        'description' => 'description',
    ];
    public function validate() {
        Model::validateRequired('kbId', $this->kbId, true);
        Model::validateRequired('fileKey', $this->fileKey, true);
        Model::validateRequired('fileType', $this->fileType, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->kbId) {
            $res['kb_id'] = $this->kbId;
        }
        if (null !== $this->fileKey) {
            $res['file_key'] = $this->fileKey;
        }
        if (null !== $this->fileType) {
            $res['file_type'] = $this->fileType;
        }
        if (null !== $this->ossProvider) {
            $res['oss_provider'] = $this->ossProvider;
        }
        if (null !== $this->description) {
            $res['description'] = $this->description;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return ExtractschemaKmDocumentRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['product_instance_id'])){
            $model->productInstanceId = $map['product_instance_id'];
        }
        if(isset($map['kb_id'])){
            $model->kbId = $map['kb_id'];
        }
        if(isset($map['file_key'])){
            $model->fileKey = $map['file_key'];
        }
        if(isset($map['file_type'])){
            $model->fileType = $map['file_type'];
        }
        if(isset($map['oss_provider'])){
            $model->ossProvider = $map['oss_provider'];
        }
        if(isset($map['description'])){
            $model->description = $map['description'];
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

    // 知识库ID
    /**
     * @var string
     */
    public $kbId;

    // OSS文件Key
    /**
     * @var string
     */
    public $fileKey;

    // 文件类型
    /**
     * @var string
     */
    public $fileType;

    // OSS提供方
    /**
     * @var string
     */
    public $ossProvider;

    // 抽取目标描述
    /**
     * @var string
     */
    public $description;

}
