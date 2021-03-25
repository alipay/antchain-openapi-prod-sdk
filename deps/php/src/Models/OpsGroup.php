<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\Deps\Models;

use AlibabaCloud\Tea\Model;

use AntChain\Deps\Models\OpsUnit;

class OpsGroup extends Model {
    protected $_name = [
        'status' => 'status',
        'units' => 'units',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->units) {
            $res['units'] = [];
            if(null !== $this->units && is_array($this->units)){
                $n = 0;
                foreach($this->units as $item){
                    $res['units'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        return $res;
    }
    /**
     * @param array $map
     * @return OpsGroup
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['status'])){
            $model->status = $map['status'];
        }
        if(isset($map['units'])){
            if(!empty($map['units'])){
                $model->units = [];
                $n = 0;
                foreach($map['units'] as $item) {
                    $model->units[$n++] = null !== $item ? OpsUnit::fromMap($item) : $item;
                }
            }
        }
        return $model;
    }
    // 运维操作组当前状态。取值列表：
    // INITED：初始化完成；
    // EXECUTING：执行中；
    // SUCCESS：执行成功；
    // FAILED：执行失败；
    // CANCELED：已取消；
    // CONFIRM_WAITING：待确认
    // 
    /**
     * @example 
     * @var string
     */
    public $status;

    // 包含在此运维操作组中的运维单元列表
    /**
     * @example 
     * @var OpsUnit[]
     */
    public $units;

}
