<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\CREATIVERENDER\Models;

use AlibabaCloud\Tea\Model;

class CreativeVideoAssetRef extends Model {
    protected $_name = [
        'entityId' => 'entity_id',
        'materialType' => 'material_type',
        'sourceType' => 'source_type',
        'path' => 'path',
        'name' => 'name',
        'sizeBytes' => 'size_bytes',
        'durationSeconds' => 'duration_seconds',
        'thumbnailFileId' => 'thumbnail_file_id',
    ];
    public function validate() {
        Model::validateRequired('entityId', $this->entityId, true);
        Model::validateRequired('materialType', $this->materialType, true);
        Model::validateRequired('sourceType', $this->sourceType, true);
        Model::validateRequired('path', $this->path, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->entityId) {
            $res['entity_id'] = $this->entityId;
        }
        if (null !== $this->materialType) {
            $res['material_type'] = $this->materialType;
        }
        if (null !== $this->sourceType) {
            $res['source_type'] = $this->sourceType;
        }
        if (null !== $this->path) {
            $res['path'] = $this->path;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->sizeBytes) {
            $res['size_bytes'] = $this->sizeBytes;
        }
        if (null !== $this->durationSeconds) {
            $res['duration_seconds'] = $this->durationSeconds;
        }
        if (null !== $this->thumbnailFileId) {
            $res['thumbnail_file_id'] = $this->thumbnailFileId;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return CreativeVideoAssetRef
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['entity_id'])){
            $model->entityId = $map['entity_id'];
        }
        if(isset($map['material_type'])){
            $model->materialType = $map['material_type'];
        }
        if(isset($map['source_type'])){
            $model->sourceType = $map['source_type'];
        }
        if(isset($map['path'])){
            $model->path = $map['path'];
        }
        if(isset($map['name'])){
            $model->name = $map['name'];
        }
        if(isset($map['size_bytes'])){
            $model->sizeBytes = $map['size_bytes'];
        }
        if(isset($map['duration_seconds'])){
            $model->durationSeconds = $map['duration_seconds'];
        }
        if(isset($map['thumbnail_file_id'])){
            $model->thumbnailFileId = $map['thumbnail_file_id'];
        }
        return $model;
    }
    // prompt 中 @{名称,entityId} 对应的实体 ID；同一实体可跨图片、音频、视频复用。
    /**
     * @example e-44b6e1086a08
     * @var string
     */
    public $entityId;

    // 素材类型：IMAGE、AUDIO、VIDEO。
    /**
     * @example VIDEO
     * @var string
     */
    public $materialType;

    // 素材来源：MATERIAL（素材库）、AFTS（本地上传）、URL（外部可访问地址）。OpenAPI 支持 URL，与 input_elements 一致；后端需解析/转存后再交算法。
    /**
     * @example URL
     * @var string
     */
    public $sourceType;

    // 由 source_type 决定：MATERIAL 传 materialId；AFTS 传 /creative/file/upload 返回的 fileId；URL 传外部可访问的绝对 http/https URL。
    /**
     * @example https://example.com/ref.mp4
     * @var string
     */
    public $path;

    // 前端展示名称，不作为生成校验依据。
    /**
     * @example 小王
     * @var string
     */
    public $name;

    // 文件大小快照，单位字节；AFTS 来源必填，由前端传入。
    /**
     * @example 1048576
     * @var int
     */
    public $sizeBytes;

    // 音视频时长快照，单位秒；AFTS 音频、视频必填。
    /**
     * @example 5.06
     * @var int
     */
    public $durationSeconds;

    // 视频缩略图 AFTS 文件 ID，可由 /creative/file/upload 返回的 fileId 提供。
    /**
     * @example thumb-file-id
     * @var string
     */
    public $thumbnailFileId;

}
