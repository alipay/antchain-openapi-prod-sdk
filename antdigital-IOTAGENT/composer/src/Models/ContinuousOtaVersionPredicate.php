<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\IOTAGENT\Models;

use AlibabaCloud\Tea\Model;

use AntChain\IOTAGENT\Models\Bound;

class ContinuousOtaVersionPredicate extends Model {
    protected $_name = [
        'type' => 'type',
        'exactVersionNo' => 'exact_version_no',
        'lower' => 'lower',
        'upper' => 'upper',
    ];
    public function validate() {
        Model::validateRequired('type', $this->type, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }
        if (null !== $this->exactVersionNo) {
            $res['exact_version_no'] = $this->exactVersionNo;
        }
        if (null !== $this->lower) {
            $res['lower'] = null !== $this->lower ? $this->lower->toMap() : null;
        }
        if (null !== $this->upper) {
            $res['upper'] = null !== $this->upper ? $this->upper->toMap() : null;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return ContinuousOtaVersionPredicate
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['type'])){
            $model->type = $map['type'];
        }
        if(isset($map['exact_version_no'])){
            $model->exactVersionNo = $map['exact_version_no'];
        }
        if(isset($map['lower'])){
            $model->lower = Bound::fromMap($map['lower']);
        }
        if(isset($map['upper'])){
            $model->upper = Bound::fromMap($map['upper']);
        }
        return $model;
    }
    // 匹配类型：ANY、EXACT 或 RANGE；非 eKYT 模块仅支持 ANY 和 EXACT。
    /**
     * @example ANY
     * @var string
     */
    public $type;

    // 精确匹配的版本号，仅在 type 为 EXACT 时使用。
    /**
     * @example 1.0.0
     * @var string
     */
    public $exactVersionNo;

    // 版本范围下界，仅在 type 为 RANGE 时使用。
    /**
     * @example undefined
     * @var Bound
     */
    public $lower;

    // 版本范围上界，仅在 type 为 RANGE 时使用。
    /**
     * @example undefined
     * @var Bound
     */
    public $upper;

}
