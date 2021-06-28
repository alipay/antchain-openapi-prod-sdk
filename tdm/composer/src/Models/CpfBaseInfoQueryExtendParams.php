<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TDM\Models;

use AlibabaCloud\Tea\Model;

class CpfBaseInfoQueryExtendParams extends Model
{
    // 住建部中心编码
    /**
     * @example C11011
     *
     * @var string
     */
    public $zjbzxbm;

    // 业务流水号
    /**
     * @example 20201125010000RD831500012865
     *
     * @var string
     */
    public $yhlsh;

    // 姓名
    /**
     * @example 小明
     *
     * @var string
     */
    public $xingming;

    // 证件号码
    /**
     * @example 370101199601022014
     *
     * @var string
     */
    public $zjhm;

    // 银行程序标志
    /**
     * @example 伊春工行：HLYC_XFD_833534607_ZS    保定：空字符串
     *
     * @var string
     */
    public $appid;
    protected $_name = [
        'zjbzxbm'  => 'zjbzxbm',
        'yhlsh'    => 'yhlsh',
        'xingming' => 'xingming',
        'zjhm'     => 'zjhm',
        'appid'    => 'appid',
    ];

    public function validate()
    {
        Model::validateRequired('zjbzxbm', $this->zjbzxbm, true);
        Model::validateRequired('yhlsh', $this->yhlsh, true);
        Model::validateRequired('xingming', $this->xingming, true);
        Model::validateRequired('zjhm', $this->zjhm, true);
        Model::validateRequired('appid', $this->appid, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->zjbzxbm) {
            $res['zjbzxbm'] = $this->zjbzxbm;
        }
        if (null !== $this->yhlsh) {
            $res['yhlsh'] = $this->yhlsh;
        }
        if (null !== $this->xingming) {
            $res['xingming'] = $this->xingming;
        }
        if (null !== $this->zjhm) {
            $res['zjhm'] = $this->zjhm;
        }
        if (null !== $this->appid) {
            $res['appid'] = $this->appid;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CpfBaseInfoQueryExtendParams
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['zjbzxbm'])) {
            $model->zjbzxbm = $map['zjbzxbm'];
        }
        if (isset($map['yhlsh'])) {
            $model->yhlsh = $map['yhlsh'];
        }
        if (isset($map['xingming'])) {
            $model->xingming = $map['xingming'];
        }
        if (isset($map['zjhm'])) {
            $model->zjhm = $map['zjhm'];
        }
        if (isset($map['appid'])) {
            $model->appid = $map['appid'];
        }

        return $model;
    }
}
