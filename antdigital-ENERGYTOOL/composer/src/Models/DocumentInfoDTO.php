<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\ENERGYTOOL\Models;

use AlibabaCloud\Tea\Model;

class DocumentInfoDTO extends Model {
    protected $_name = [
        'id' => 'id',
        'name' => 'name',
        'fileSize' => 'file_size',
        'fileType' => 'file_type',
        'ossUrl' => 'oss_url',
        'md5' => 'md5',
        'source' => 'source',
        'sourceExt' => 'source_ext',
    ];
    public function validate() {
        Model::validateRequired('id', $this->id, true);
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('fileSize', $this->fileSize, true);
        Model::validateRequired('fileType', $this->fileType, true);
        Model::validateRequired('ossUrl', $this->ossUrl, true);
        Model::validateRequired('md5', $this->md5, true);
        Model::validateRequired('source', $this->source, true);
        Model::validateRequired('sourceExt', $this->sourceExt, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->fileSize) {
            $res['file_size'] = $this->fileSize;
        }
        if (null !== $this->fileType) {
            $res['file_type'] = $this->fileType;
        }
        if (null !== $this->ossUrl) {
            $res['oss_url'] = $this->ossUrl;
        }
        if (null !== $this->md5) {
            $res['md5'] = $this->md5;
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
     * @return DocumentInfoDTO
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['id'])){
            $model->id = $map['id'];
        }
        if(isset($map['name'])){
            $model->name = $map['name'];
        }
        if(isset($map['file_size'])){
            $model->fileSize = $map['file_size'];
        }
        if(isset($map['file_type'])){
            $model->fileType = $map['file_type'];
        }
        if(isset($map['oss_url'])){
            $model->ossUrl = $map['oss_url'];
        }
        if(isset($map['md5'])){
            $model->md5 = $map['md5'];
        }
        if(isset($map['source'])){
            $model->source = $map['source'];
        }
        if(isset($map['source_ext'])){
            $model->sourceExt = $map['source_ext'];
        }
        return $model;
    }
    // 文档id
    /**
     * @example id
     * @var string
     */
    public $id;

    // 文档名称
    /**
     * @example name
     * @var string
     */
    public $name;

    // 文件大小
    /**
     * @example file_size
     * @var int
     */
    public $fileSize;

    // 文件类型
    /**
     * @example file_type
     * @var string
     */
    public $fileType;

    // oss下载地址
    /**
     * @example oss_url
     * @var string
     */
    public $ossUrl;

    // 文件md5
    /**
     * @example md5
     * @var string
     */
    public $md5;

    // 文档来源
    /**
     * @example source
     * @var string
     */
    public $source;

    // 文档提供方的附加信息
    /**
     * @example source_ext
     * @var string
     */
    public $sourceExt;

}
