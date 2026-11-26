<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\IOTAGENT\Models;

use AlibabaCloud\Tea\Model;

class UploadBlockchainBotIotsuccessProductKnowledgebaseContentRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'kbId' => 'kb_id',
        'fileName' => 'file_name',
        'contentBase64' => 'content_base64',
        'fileType' => 'file_type',
    ];
    public function validate() {
        Model::validateRequired('kbId', $this->kbId, true);
        Model::validateRequired('fileName', $this->fileName, true);
        Model::validateRequired('contentBase64', $this->contentBase64, true);
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
        if (null !== $this->fileName) {
            $res['file_name'] = $this->fileName;
        }
        if (null !== $this->contentBase64) {
            $res['content_base64'] = $this->contentBase64;
        }
        if (null !== $this->fileType) {
            $res['file_type'] = $this->fileType;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return UploadBlockchainBotIotsuccessProductKnowledgebaseContentRequest
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
        if(isset($map['file_name'])){
            $model->fileName = $map['file_name'];
        }
        if(isset($map['content_base64'])){
            $model->contentBase64 = $map['content_base64'];
        }
        if(isset($map['file_type'])){
            $model->fileType = $map['file_type'];
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
    public $kbId;

    /**
     * @var string
     */
    public $fileName;

    // 解码不超过10MiB（评审初值），不得包含目录穿越
    /**
     * @var string
     */
    public $contentBase64;

    // 枚举:TXT,MD,JSON,CSV,XLSX,XLS,DOCX,DOC,PDF
    /**
     * @var string
     */
    public $fileType;

}
