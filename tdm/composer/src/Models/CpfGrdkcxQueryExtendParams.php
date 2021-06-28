<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TDM\Models;

use AlibabaCloud\Tea\Model;

class CpfGrdkcxQueryExtendParams extends Model
{
    // 住建部中心编码
    /**
     * @example C11011
     *
     * @var string
     */
    public $zjbzxbm;

    // 姓名
    /**
     * @example 小明
     *
     * @var string
     */
    public $xingming;

    // 证件类型
    /**
     * @example 01 身份证
     *
     * @var string
     */
    public $zjlx;

    // 证件号码
    /**
     * @example 370101199601022014
     *
     * @var string
     */
    public $zjhm;

    // 贷款合同编号
    /**
     * @example 20201125010000RD831500012865
     *
     * @var string
     */
    public $dkhtbh;
    protected $_name = [
        'zjbzxbm'  => 'zjbzxbm',
        'xingming' => 'xingming',
        'zjlx'     => 'zjlx',
        'zjhm'     => 'zjhm',
        'dkhtbh'   => 'dkhtbh',
    ];

    public function validate()
    {
        Model::validateRequired('zjbzxbm', $this->zjbzxbm, true);
        Model::validateRequired('xingming', $this->xingming, true);
        Model::validateRequired('zjlx', $this->zjlx, true);
        Model::validateRequired('zjhm', $this->zjhm, true);
        Model::validateRequired('dkhtbh', $this->dkhtbh, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->zjbzxbm) {
            $res['zjbzxbm'] = $this->zjbzxbm;
        }
        if (null !== $this->xingming) {
            $res['xingming'] = $this->xingming;
        }
        if (null !== $this->zjlx) {
            $res['zjlx'] = $this->zjlx;
        }
        if (null !== $this->zjhm) {
            $res['zjhm'] = $this->zjhm;
        }
        if (null !== $this->dkhtbh) {
            $res['dkhtbh'] = $this->dkhtbh;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CpfGrdkcxQueryExtendParams
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['zjbzxbm'])) {
            $model->zjbzxbm = $map['zjbzxbm'];
        }
        if (isset($map['xingming'])) {
            $model->xingming = $map['xingming'];
        }
        if (isset($map['zjlx'])) {
            $model->zjlx = $map['zjlx'];
        }
        if (isset($map['zjhm'])) {
            $model->zjhm = $map['zjhm'];
        }
        if (isset($map['dkhtbh'])) {
            $model->dkhtbh = $map['dkhtbh'];
        }

        return $model;
    }
}
