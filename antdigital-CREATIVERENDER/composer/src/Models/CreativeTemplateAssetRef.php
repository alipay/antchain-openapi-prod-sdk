<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\CREATIVERENDER\Models;

use AlibabaCloud\Tea\Model;

class CreativeTemplateAssetRef extends Model {
    protected $_name = [
        'entityId' => 'entity_id',
        'materialType' => 'material_type',
        'sourceType' => 'source_type',
        'path' => 'path',
        'usageHint' => 'usage_hint',
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
        if (null !== $this->usageHint) {
            $res['usage_hint'] = $this->usageHint;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return CreativeTemplateAssetRef
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
        if(isset($map['usage_hint'])){
            $model->usageHint = $map['usage_hint'];
        }
        return $model;
    }
    // 与 prompt 里的 @{商品图,ref-01} 对应
    /**
     * @example ref-01
     * @var string
     */
    public $entityId;

    // 对应列表类型：`IMAGE`、`AUDIO` 或 VIDEO
    /**
     * @example IMAGE
     * @var string
     */
    public $materialType;

    // 来源类型：`MATERIAL`、`AFTS`、`OSS` 或 URL
    /**
     * @example MATERIAL
     * @var string
     */
    public $sourceType;

    // 来源定位值；`sourceType=MATERIAL` 时填平台素材 ID
    /**
     * @example material-image-demo-001
     * @var string
     */
    public $path;

    // 用途提示，可省略
    /**
     * @example 参考商品外观
     * @var string
     */
    public $usageHint;

}
