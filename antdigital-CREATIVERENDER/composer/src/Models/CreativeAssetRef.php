<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\CREATIVERENDER\Models;

use AlibabaCloud\Tea\Model;

class CreativeAssetRef extends Model {
    protected $_name = [
        'sourceType' => 'source_type',
        'materialId' => 'material_id',
        'url' => 'url',
        'usageHint' => 'usage_hint',
    ];
    public function validate() {
        Model::validateRequired('sourceType', $this->sourceType, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->sourceType) {
            $res['source_type'] = $this->sourceType;
        }
        if (null !== $this->materialId) {
            $res['material_id'] = $this->materialId;
        }
        if (null !== $this->url) {
            $res['url'] = $this->url;
        }
        if (null !== $this->usageHint) {
            $res['usage_hint'] = $this->usageHint;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return CreativeAssetRef
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['source_type'])){
            $model->sourceType = $map['source_type'];
        }
        if(isset($map['material_id'])){
            $model->materialId = $map['material_id'];
        }
        if(isset($map['url'])){
            $model->url = $map['url'];
        }
        if(isset($map['usage_hint'])){
            $model->usageHint = $map['usage_hint'];
        }
        return $model;
    }
    // 素材来源
    /**
     * @example URL
     * @var string
     */
    public $sourceType;

    // 素材ID，只有素材来源于creative的素材库中才需要填入
    /**
     * @example 5bf62f7dd73b4efa8dea7a2665cd2173
     * @var string
     */
    public $materialId;

    // 可公网访问的素材url地址
    /**
     * @example https://mdn.alipayobjects.com/wofi_creative/afts/file/80mwSruGUE4AAAAAAAAAAAAA-FZ4AQJr
     * @var string
     */
    public $url;

    // 使用提示
    /**
     * @example 二维码保持清晰
     * @var string
     */
    public $usageHint;

}
