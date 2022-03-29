<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RMS\Models;

use AlibabaCloud\Tea\Model;

class Cal extends Model
{
    // 统计功能
    /**
     * @example count
     *
     * @var string
     */
    public $fun;

    // 值对象
    /**
     * @example
     *
     * @var UniqueDim
     */
    public $val;

    // 值对象备份
    /**
     * @example
     *
     * @var UniqueDim
     */
    public $valBak;

    // topn
    /**
     * @example 0
     *
     * @var int
     */
    public $topn;

    // 所包含的值
    /**
     * @example
     *
     * @var ContainVals
     */
    public $containVals;
    protected $_name = [
        'fun'         => 'fun',
        'val'         => 'val',
        'valBak'      => 'val_bak',
        'topn'        => 'topn',
        'containVals' => 'contain_vals',
    ];

    public function validate()
    {
        Model::validateRequired('fun', $this->fun, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->fun) {
            $res['fun'] = $this->fun;
        }
        if (null !== $this->val) {
            $res['val'] = null !== $this->val ? $this->val->toMap() : null;
        }
        if (null !== $this->valBak) {
            $res['val_bak'] = null !== $this->valBak ? $this->valBak->toMap() : null;
        }
        if (null !== $this->topn) {
            $res['topn'] = $this->topn;
        }
        if (null !== $this->containVals) {
            $res['contain_vals'] = null !== $this->containVals ? $this->containVals->toMap() : null;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return Cal
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['fun'])) {
            $model->fun = $map['fun'];
        }
        if (isset($map['val'])) {
            $model->val = UniqueDim::fromMap($map['val']);
        }
        if (isset($map['val_bak'])) {
            $model->valBak = UniqueDim::fromMap($map['val_bak']);
        }
        if (isset($map['topn'])) {
            $model->topn = $map['topn'];
        }
        if (isset($map['contain_vals'])) {
            $model->containVals = ContainVals::fromMap($map['contain_vals']);
        }

        return $model;
    }
}
