<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\Deps\Models;

use AlibabaCloud\Tea\Model;

use AntChain\Deps\Models\OpsComputer;

class OpsUnit extends Model {
    protected $_name = [
        'cell' => 'cell',
        'computers' => 'computers',
        'region' => 'region',
        'zone' => 'zone',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->cell) {
            $res['cell'] = $this->cell;
        }
        if (null !== $this->computers) {
            $res['computers'] = [];
            if(null !== $this->computers && is_array($this->computers)){
                $n = 0;
                foreach($this->computers as $item){
                    $res['computers'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->region) {
            $res['region'] = $this->region;
        }
        if (null !== $this->zone) {
            $res['zone'] = $this->zone;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return OpsUnit
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['cell'])){
            $model->cell = $map['cell'];
        }
        if(isset($map['computers'])){
            if(!empty($map['computers'])){
                $model->computers = [];
                $n = 0;
                foreach($map['computers'] as $item) {
                    $model->computers[$n++] = null !== $item ? OpsComputer::fromMap($item) : $item;
                }
            }
        }
        if(isset($map['region'])){
            $model->region = $map['region'];
        }
        if(isset($map['zone'])){
            $model->zone = $map['zone'];
        }
        return $model;
    }
    // 单元所属部署区
    /**
     * @example 
     * @var string
     */
    public $cell;

    // 包含在此单元中进行运维操作的计算容器列表
    /**
     * @example 
     * @var OpsComputer[]
     */
    public $computers;

    // 单元所属地域
    /**
     * @example 
     * @var string
     */
    public $region;

    // 单元所属可用区
    /**
     * @example 
     * @var string
     */
    public $zone;

}
