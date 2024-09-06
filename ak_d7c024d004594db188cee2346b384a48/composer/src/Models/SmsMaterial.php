<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_d7c024d004594db188cee2346b384a48\Models;

use AlibabaCloud\Tea\Model;

class SmsMaterial extends Model
{
    // 素材名称
    /**
     * @example 图片1
     *
     * @var string
     */
    public $materialName;

    // 素材类型
    /**
     * @example 1
     *
     * @var string
     */
    public $materialType;

    // 素材内容
    /**
     * @example
     *
     * @var string
     */
    public $materialContent;
    protected $_name = [
        'materialName'    => 'material_name',
        'materialType'    => 'material_type',
        'materialContent' => 'material_content',
    ];

    public function validate()
    {
        Model::validateRequired('materialType', $this->materialType, true);
        Model::validateRequired('materialContent', $this->materialContent, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->materialName) {
            $res['material_name'] = $this->materialName;
        }
        if (null !== $this->materialType) {
            $res['material_type'] = $this->materialType;
        }
        if (null !== $this->materialContent) {
            $res['material_content'] = $this->materialContent;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SmsMaterial
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['material_name'])) {
            $model->materialName = $map['material_name'];
        }
        if (isset($map['material_type'])) {
            $model->materialType = $map['material_type'];
        }
        if (isset($map['material_content'])) {
            $model->materialContent = $map['material_content'];
        }

        return $model;
    }
}
