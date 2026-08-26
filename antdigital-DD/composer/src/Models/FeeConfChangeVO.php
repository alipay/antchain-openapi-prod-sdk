<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\DD\Models;

use AlibabaCloud\Tea\Model;

use AntChain\DD\Models\FeeConfEntityVO;
use AntChain\DD\Models\FeeChangeFactorVO;
use AntChain\DD\Models\FailChangeFactor;

class FeeConfChangeVO extends Model {
    protected $_name = [
        'oldConfEntity' => 'old_conf_entity',
        'newConfEntity' => 'new_conf_entity',
        'changeFactorList' => 'change_factor_list',
        'failChangFactorList' => 'fail_chang_factor_list',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->oldConfEntity) {
            $res['old_conf_entity'] = null !== $this->oldConfEntity ? $this->oldConfEntity->toMap() : null;
        }
        if (null !== $this->newConfEntity) {
            $res['new_conf_entity'] = null !== $this->newConfEntity ? $this->newConfEntity->toMap() : null;
        }
        if (null !== $this->changeFactorList) {
            $res['change_factor_list'] = [];
            if(null !== $this->changeFactorList && is_array($this->changeFactorList)){
                $n = 0;
                foreach($this->changeFactorList as $item){
                    $res['change_factor_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->failChangFactorList) {
            $res['fail_chang_factor_list'] = [];
            if(null !== $this->failChangFactorList && is_array($this->failChangFactorList)){
                $n = 0;
                foreach($this->failChangFactorList as $item){
                    $res['fail_chang_factor_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        return $res;
    }
    /**
     * @param array $map
     * @return FeeConfChangeVO
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['old_conf_entity'])){
            $model->oldConfEntity = FeeConfEntityVO::fromMap($map['old_conf_entity']);
        }
        if(isset($map['new_conf_entity'])){
            $model->newConfEntity = FeeConfEntityVO::fromMap($map['new_conf_entity']);
        }
        if(isset($map['change_factor_list'])){
            if(!empty($map['change_factor_list'])){
                $model->changeFactorList = [];
                $n = 0;
                foreach($map['change_factor_list'] as $item) {
                    $model->changeFactorList[$n++] = null !== $item ? FeeChangeFactorVO::fromMap($item) : $item;
                }
            }
        }
        if(isset($map['fail_chang_factor_list'])){
            if(!empty($map['fail_chang_factor_list'])){
                $model->failChangFactorList = [];
                $n = 0;
                foreach($map['fail_chang_factor_list'] as $item) {
                    $model->failChangFactorList[$n++] = null !== $item ? FailChangeFactor::fromMap($item) : $item;
                }
            }
        }
        return $model;
    }
    // 原本的计财配置
    /**
     * @example 
     * @var FeeConfEntityVO
     */
    public $oldConfEntity;

    // 新的计财配置实体
    /**
     * @example 
     * @var FeeConfEntityVO
     */
    public $newConfEntity;

    // 变更字段列表
    /**
     * @example 
     * @var FeeChangeFactorVO[]
     */
    public $changeFactorList;

    // 失败的变更列表
    /**
     * @example 
     * @var FailChangeFactor[]
     */
    public $failChangFactorList;

}
