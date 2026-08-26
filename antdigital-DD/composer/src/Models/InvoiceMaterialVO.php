<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\DD\Models;

use AlibabaCloud\Tea\Model;

class InvoiceMaterialVO extends Model {
    protected $_name = [
        'material' => 'material',
        'name' => 'name',
    ];
    public function validate() {
        Model::validateRequired('material', $this->material, true);
        Model::validateRequired('name', $this->name, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->material) {
            $res['material'] = $this->material;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return InvoiceMaterialVO
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['material'])){
            $model->material = $map['material'];
        }
        if(isset($map['name'])){
            $model->name = $map['name'];
        }
        return $model;
    }
    // 发票介质，01: 电子发票; 02: 纸质发票
    /**
     * @example 01
     * @var string
     */
    public $material;

    // 名称
    /**
     * @example 电子发票
     * @var string
     */
    public $name;

}
