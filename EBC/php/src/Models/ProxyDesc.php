<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\EBC\Models;

use AlibabaCloud\Tea\Model;

class ProxyDesc extends Model {
    protected $_name = [
        'attributeName' => 'attribute_name',
        'isProxy' => 'is_proxy',
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
        return $res;
    }
    /**
     * @param array $map
     * @return ProxyDesc
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['attribute_name'])){
            $model->attributeName = $map['attribute_name'];
        }
        if(isset($map['is_proxy'])){
            $model->isProxy = $map['is_proxy'];
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
    /**
     * @example true, false
     * @var bool
     */
    public $isProxy;

}
