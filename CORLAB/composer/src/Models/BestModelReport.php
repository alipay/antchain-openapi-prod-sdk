<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\CORLAB\Models;

use AlibabaCloud\Tea\Model;

class BestModelReport extends Model {
    protected $_name = [
        'ks' => 'ks',
        'auc' => 'auc',
        'lift' => 'lift',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->ks) {
            $res['ks'] = $this->ks;
        }
        if (null !== $this->auc) {
            $res['auc'] = $this->auc;
        }
        if (null !== $this->lift) {
            $res['lift'] = $this->lift;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return BestModelReport
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['ks'])){
            $model->ks = $map['ks'];
        }
        if(isset($map['auc'])){
            $model->auc = $map['auc'];
        }
        if(isset($map['lift'])){
            $model->lift = $map['lift'];
        }
        return $model;
    }
    // ks信息
    /**
     * @example 0.52
     * @var string
     */
    public $ks;

    // auc指标
    /**
     * @example 0.8
     * @var string
     */
    public $auc;

    // lift指标
    /**
     * @example 3.2
     * @var string
     */
    public $lift;

}
