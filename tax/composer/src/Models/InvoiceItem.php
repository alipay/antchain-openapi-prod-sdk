<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TAX\Models;

use AlibabaCloud\Tea\Model;

class InvoiceItem extends Model
{
    // 税收分类编码
    /**
     * @example xxx
     *
     * @var string
     */
    public $spbm;

    // 项目名称, 如果为折扣行，商品名称须与被折扣行的商品名称相同，不能多行折扣。
    /**
     * @example xxx
     *
     * @var string
     */
    public $mc;

    // 单位
    /**
     * @example xxx
     *
     * @var string
     */
    public $jldw;

    // 数量
    /**
     * @example 10
     *
     * @var string
     */
    public $shul;

    // 含税金额,2位小数
    /**
     * @example 10.11
     *
     * @var string
     */
    public $je;

    // 税率,当fplx!=51or53时，必填,3位小数，例1%为0.010；
    /**
     * @example 0.01
     *
     * @var string
     */
    public $sl;

    // 税额,当fplx!=51or53时，必填
    /**
     * @example 10.11
     *
     * @var string
     */
    public $se;

    // 明细序号,从1开始递增
    /**
     * @example 2
     *
     * @var string
     */
    public $mxxh;

    // 单价
    /**
     * @example 10.11
     *
     * @var string
     */
    public $dj;

    // 规格型号
    /**
     * @example xxx
     *
     * @var string
     */
    public $ggxh;
    protected $_name = [
        'spbm' => 'spbm',
        'mc'   => 'mc',
        'jldw' => 'jldw',
        'shul' => 'shul',
        'je'   => 'je',
        'sl'   => 'sl',
        'se'   => 'se',
        'mxxh' => 'mxxh',
        'dj'   => 'dj',
        'ggxh' => 'ggxh',
    ];

    public function validate()
    {
        Model::validateRequired('spbm', $this->spbm, true);
        Model::validateRequired('mc', $this->mc, true);
        Model::validateRequired('je', $this->je, true);
        Model::validateRequired('mxxh', $this->mxxh, true);
        Model::validateRequired('dj', $this->dj, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->spbm) {
            $res['spbm'] = $this->spbm;
        }
        if (null !== $this->mc) {
            $res['mc'] = $this->mc;
        }
        if (null !== $this->jldw) {
            $res['jldw'] = $this->jldw;
        }
        if (null !== $this->shul) {
            $res['shul'] = $this->shul;
        }
        if (null !== $this->je) {
            $res['je'] = $this->je;
        }
        if (null !== $this->sl) {
            $res['sl'] = $this->sl;
        }
        if (null !== $this->se) {
            $res['se'] = $this->se;
        }
        if (null !== $this->mxxh) {
            $res['mxxh'] = $this->mxxh;
        }
        if (null !== $this->dj) {
            $res['dj'] = $this->dj;
        }
        if (null !== $this->ggxh) {
            $res['ggxh'] = $this->ggxh;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return InvoiceItem
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['spbm'])) {
            $model->spbm = $map['spbm'];
        }
        if (isset($map['mc'])) {
            $model->mc = $map['mc'];
        }
        if (isset($map['jldw'])) {
            $model->jldw = $map['jldw'];
        }
        if (isset($map['shul'])) {
            $model->shul = $map['shul'];
        }
        if (isset($map['je'])) {
            $model->je = $map['je'];
        }
        if (isset($map['sl'])) {
            $model->sl = $map['sl'];
        }
        if (isset($map['se'])) {
            $model->se = $map['se'];
        }
        if (isset($map['mxxh'])) {
            $model->mxxh = $map['mxxh'];
        }
        if (isset($map['dj'])) {
            $model->dj = $map['dj'];
        }
        if (isset($map['ggxh'])) {
            $model->ggxh = $map['ggxh'];
        }

        return $model;
    }
}
