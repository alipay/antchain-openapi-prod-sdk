<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\EBC\Models;

use AlibabaCloud\Tea\Model;

class PublicDesc extends Model {
    protected $_name = [
        'attributeName' => 'attribute_name',
        'isPublic' => 'is_public',
    ];
    public function validate() {
        Model::validateMaxLength('attributeName', $this->attributeName, 64);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->attributeName) {
            $res['attribute_name'] = $this->attributeName;
        }
        if (null !== $this->isPublic) {
            $res['is_public'] = $this->isPublic;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return PublicDesc
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['attribute_name'])){
            $model->attributeName = $map['attribute_name'];
        }
        if(isset($map['is_public'])){
            $model->isPublic = $map['is_public'];
        }
        return $model;
    }
    // 属性名称
    /**
     * @example primary_id_no
     * @var string
     */
    public $attributeName;

    // 数据是否所有消费方可查询
    /**
     * @example true, false
     * @var bool
     */
    public $isPublic;

}
