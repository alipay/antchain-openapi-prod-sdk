<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\EBC\Models;

use AlibabaCloud\Tea\Model;

class PrivacyDesc extends Model {
    protected $_name = [
        'attributeName' => 'attribute_name',
        'privacyLevel' => 'privacy_level',
    ];
    public function validate() {
        Model::validateMaxLength('attributeName', $this->attributeName, 64);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->attributeName) {
            $res['attribute_name'] = $this->attributeName;
        }
        if (null !== $this->privacyLevel) {
            $res['privacy_level'] = $this->privacyLevel;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return PrivacyDesc
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['attribute_name'])){
            $model->attributeName = $map['attribute_name'];
        }
        if(isset($map['privacy_level'])){
            $model->privacyLevel = $map['privacy_level'];
        }
        return $model;
    }
    // 属性名称
    // 
    /**
     * @example primary_id_no
     * @var string
     */
    public $attributeName;

    // 隐私等级：
    // 1：数据可以全量明文查询
    // 2：数据仅可以通过数据比较查询
    /**
     * @example 1
     * @var int
     */
    public $privacyLevel;

}
