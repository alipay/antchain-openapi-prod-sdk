<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\ENERGENT\Models;

use AlibabaCloud\Tea\Model;

class KbUploadFileItem extends Model {
    protected $_name = [
        'documentId' => 'document_id',
        'fileName' => 'file_name',
        'originalName' => 'original_name',
        'fileType' => 'file_type',
        'fileMd5' => 'file_md5',
        'ossUrl' => 'oss_url',
        'ossProvider' => 'oss_provider',
        'source' => 'source',
        'sourceExt' => 'source_ext',
    ];
    public function validate() {
        Model::validateRequired('documentId', $this->documentId, true);
        Model::validateRequired('fileName', $this->fileName, true);
        Model::validateRequired('originalName', $this->originalName, true);
        Model::validateRequired('fileType', $this->fileType, true);
        Model::validateRequired('fileMd5', $this->fileMd5, true);
        Model::validateRequired('ossUrl', $this->ossUrl, true);
        Model::validateRequired('ossProvider', $this->ossProvider, true);
        Model::validateRequired('source', $this->source, true);
        Model::validateRequired('sourceExt', $this->sourceExt, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->documentId) {
            $res['document_id'] = $this->documentId;
        }
        if (null !== $this->fileName) {
            $res['file_name'] = $this->fileName;
        }
        if (null !== $this->originalName) {
            $res['original_name'] = $this->originalName;
        }
        if (null !== $this->fileType) {
            $res['file_type'] = $this->fileType;
        }
        if (null !== $this->fileMd5) {
            $res['file_md5'] = $this->fileMd5;
        }
        if (null !== $this->ossUrl) {
            $res['oss_url'] = $this->ossUrl;
        }
        if (null !== $this->ossProvider) {
            $res['oss_provider'] = $this->ossProvider;
        }
        if (null !== $this->source) {
            $res['source'] = $this->source;
        }
        if (null !== $this->sourceExt) {
            $res['source_ext'] = $this->sourceExt;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return KbUploadFileItem
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['document_id'])){
            $model->documentId = $map['document_id'];
        }
        if(isset($map['file_name'])){
            $model->fileName = $map['file_name'];
        }
        if(isset($map['original_name'])){
            $model->originalName = $map['original_name'];
        }
        if(isset($map['file_type'])){
            $model->fileType = $map['file_type'];
        }
        if(isset($map['file_md5'])){
            $model->fileMd5 = $map['file_md5'];
        }
        if(isset($map['oss_url'])){
            $model->ossUrl = $map['oss_url'];
        }
        if(isset($map['oss_provider'])){
            $model->ossProvider = $map['oss_provider'];
        }
        if(isset($map['source'])){
            $model->source = $map['source'];
        }
        if(isset($map['source_ext'])){
            $model->sourceExt = $map['source_ext'];
        }
        return $model;
    }
    // document ID
    /**
     * @example D1
     * @var string
     */
    public $documentId;

    // file名称
    /**
     * @example a.pdf
     * @var string
     */
    public $fileName;

    // original名称
    /**
     * @example a.pdf
     * @var string
     */
    public $originalName;

    // file类型
    /**
     * @example pdf
     * @var string
     */
    public $fileType;

    // file md5
    /**
     * @example m1
     * @var string
     */
    public $fileMd5;

    // oss url
    /**
     * @example https://oss.example/a.pdf
     * @var string
     */
    public $ossUrl;

    // oss provider
    /**
     * @example antUpload
     * @var string
     */
    public $ossProvider;

    // source
    /**
     * @example 
     * @var string
     */
    public $source;

    // source ext
    /**
     * @example 
     * @var string
     */
    public $sourceExt;

}
