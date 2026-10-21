<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\ENERGENT\Models;

use AlibabaCloud\Tea\Model;

class FileItem extends Model {
    protected $_name = [
        'documentId' => 'document_id',
        'fileName' => 'file_name',
        'fileType' => 'file_type',
        'ossUrl' => 'oss_url',
        'ossProvider' => 'oss_provider',
        'source' => 'source',
        'sourceExt' => 'source_ext',
    ];
    public function validate() {
        Model::validateRequired('documentId', $this->documentId, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->documentId) {
            $res['document_id'] = $this->documentId;
        }
        if (null !== $this->fileName) {
            $res['file_name'] = $this->fileName;
        }
        if (null !== $this->fileType) {
            $res['file_type'] = $this->fileType;
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
     * @return FileItem
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['document_id'])){
            $model->documentId = $map['document_id'];
        }
        if(isset($map['file_name'])){
            $model->fileName = $map['file_name'];
        }
        if(isset($map['file_type'])){
            $model->fileType = $map['file_type'];
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
    // 文件 id
    /**
     * @example 文件 id
     * @var string
     */
    public $documentId;

    // 文件名
    /**
     * @example 文件名
     * @var string
     */
    public $fileName;

    // 文件类型
    /**
     * @example pdf
     * @var string
     */
    public $fileType;

    // OSS文件地址
    /**
     * @example oss地址
     * @var string
     */
    public $ossUrl;

    // OSS提供方
    /**
     * @example OSS提供方
     * @var string
     */
    public $ossProvider;

    // 文档来源
    /**
     * @example 文档来源
     * @var string
     */
    public $source;

    // 文档来源方对文档的额外描述信息
    /**
     * @example 文档来源方对文档的额外描述信息
     * @var string
     */
    public $sourceExt;

}
