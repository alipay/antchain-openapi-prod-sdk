<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class Bound extends Model {
    protected $_name = [
        'versionNo' => 'version_no',
        'inclusive' => 'inclusive',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->versionNo) {
            $res['version_no'] = $this->versionNo;
        }
        if (null !== $this->inclusive) {
            $res['inclusive'] = $this->inclusive;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return Bound
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['version_no'])){
            $model->versionNo = $map['version_no'];
        }
        if(isset($map['inclusive'])){
            $model->inclusive = $map['inclusive'];
        }
        return $model;
    }
    // 边界版本号；eKYT 范围匹配要求使用 x.y.z 数字版本格式。
    /**
     * @example 1.0.0
     * @var string
     */
    public $versionNo;

    // 是否包含该边界；true 表示闭区间，false 表示开区间。
    /**
     * @example true
     * @var bool
     */
    public $inclusive;

}
