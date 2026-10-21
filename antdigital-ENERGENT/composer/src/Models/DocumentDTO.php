<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\ENERGENT\Models;

use AlibabaCloud\Tea\Model;

class DocumentDTO extends Model {
    protected $_name = [
        'id' => 'id',
        'name' => 'name',
        'fileSize' => 'file_size',
        'fileType' => 'file_type',
        'ossUrl' => 'oss_url',
        'md5' => 'md5',
        'status' => 'status',
        'gmtCreate' => 'gmt_create',
        'gmtModified' => 'gmt_modified',
        'ossProvider' => 'oss_provider',
        'vectorStoreMapId' => 'vector_store_map_id',
    ];
    public function validate() {}
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
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->gmtCreate) {
            $res['gmt_create'] = $this->gmtCreate;
        }
        if (null !== $this->gmtModified) {
            $res['gmt_modified'] = $this->gmtModified;
        }
        if (null !== $this->ossProvider) {
            $res['oss_provider'] = $this->ossProvider;
        }
        if (null !== $this->vectorStoreMapId) {
            $res['vector_store_map_id'] = $this->vectorStoreMapId;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return DocumentDTO
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
        if(isset($map['status'])){
            $model->status = $map['status'];
        }
        if(isset($map['gmt_create'])){
            $model->gmtCreate = $map['gmt_create'];
        }
        if(isset($map['gmt_modified'])){
            $model->gmtModified = $map['gmt_modified'];
        }
        if(isset($map['oss_provider'])){
            $model->ossProvider = $map['oss_provider'];
        }
        if(isset($map['vector_store_map_id'])){
            $model->vectorStoreMapId = $map['vector_store_map_id'];
        }
        return $model;
    }
    // id
    /**
     * @example 1
     * @var string
     */
    public $id;

    // 文件名
    /**
     * @example 123
     * @var string
     */
    public $name;

    // 文件大小
    /**
     * @example 1231
     * @var string
     */
    public $fileSize;

    // 文件类型
    /**
     * @example pdf
     * @var string
     */
    public $fileType;

    // 文件地址
    /**
     * @example 文件地址
     * @var string
     */
    public $ossUrl;

    // md5
    /**
     * @example 1231
     * @var string
     */
    public $md5;

    // 状态
    /**
     * @example 1
     * @var string
     */
    public $status;

    // 创建时间
    /**
     * @example 2026-01-01 00:00:00
     * @var string
     */
    public $gmtCreate;

    // 修改时间
    /**
     * @example 2026-01-01 00:00:00
     * @var string
     */
    public $gmtModified;

    // 文件提供方
    /**
     * @example oss
     * @var string
     */
    public $ossProvider;

    // 向量库映射ID
    /**
     * @example 向量库映射ID
     * @var string
     */
    public $vectorStoreMapId;

}
