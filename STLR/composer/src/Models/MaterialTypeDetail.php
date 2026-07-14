<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\STLR\Models;

use AlibabaCloud\Tea\Model;

use AntChain\STLR\Models\MaterialDetail;

class MaterialTypeDetail extends Model {
    protected $_name = [
        'materialType' => 'material_type',
        'materialList' => 'material_list',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->materialType) {
            $res['material_type'] = $this->materialType;
        }
        if (null !== $this->materialList) {
            $res['material_list'] = [];
            if(null !== $this->materialList && is_array($this->materialList)){
                $n = 0;
                foreach($this->materialList as $item){
                    $res['material_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        return $res;
    }
    /**
     * @param array $map
     * @return MaterialTypeDetail
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['material_type'])){
            $model->materialType = $map['material_type'];
        }
        if(isset($map['material_list'])){
            if(!empty($map['material_list'])){
                $model->materialList = [];
                $n = 0;
                foreach($map['material_list'] as $item) {
                    $model->materialList[$n++] = null !== $item ? MaterialDetail::fromMap($item) : $item;
                }
            }
        }
        return $model;
    }
    // 物料类型名称
    /**
     * @example xxxx
     * @var string
     */
    public $materialType;

    // 物料产品详情表
    /**
     * @example undefined
     * @var MaterialDetail[]
     */
    public $materialList;

}
