<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\EBC\Models;

use AlibabaCloud\Tea\Model;

class AttributeDesc extends Model {
    protected $_name = [
        'attributeName' => 'attribute_name',
        'isProxy' => 'is_proxy',
        'isPublic' => 'is_public',
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
        if (null !== $this->isProxy) {
            $res['is_proxy'] = $this->isProxy;
        }
        if (null !== $this->isPublic) {
            $res['is_public'] = $this->isPublic;
        }
        if (null !== $this->privacyLevel) {
            $res['privacy_level'] = $this->privacyLevel;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return AttributeDesc
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['attribute_name'])){
            $model->attributeName = $map['attribute_name'];
        }
        if(isset($map['is_proxy'])){
            $model->isProxy = $map['is_proxy'];
        }
        if(isset($map['is_public'])){
            $model->isPublic = $map['is_public'];
        }
        if(isset($map['privacy_level'])){
            $model->privacyLevel = $map['privacy_level'];
        }
        return $model;
    }
    // 属性名称
    /**
     * @example primary_id_no
     * @var string
     */
    public $attributeName;

    // 是否托管
    // 注：非托管的数据不支持被动消费，只支持主动消费，目前系统尚不支持主动消费
    /**
     * @example true, false
     * @var bool
     */
    public $isProxy;

    // 是否公开
    /**
     * @example true, false
     * @var bool
     */
    public $isPublic;

    // 隐私等级
    // 1级数据可以全量明文查询
    // 2级数据仅可以通过数据比较查询
    // 注：目前系统尚不支持隐私等级2的对比查询
    /**
     * @example 1
     * @var integer
     */
    public $privacyLevel;

}
