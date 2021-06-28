<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TDM\Models;

use AlibabaCloud\Tea\Model;

class CpfYddkjczmQueryExtendParams extends Model
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

    // 证件号码
    /**
     * @example 370101199601022014
     *
     * @var string
     */
    public $zjhm;
    protected $_name = [
        'zjbzxbm'  => 'zjbzxbm',
        'xingming' => 'xingming',
        'zjhm'     => 'zjhm',
    ];

    public function validate()
    {
        Model::validateRequired('zjbzxbm', $this->zjbzxbm, true);
        Model::validateRequired('xingming', $this->xingming, true);
        Model::validateRequired('zjhm', $this->zjhm, true);
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
        if (null !== $this->zjhm) {
            $res['zjhm'] = $this->zjhm;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CpfYddkjczmQueryExtendParams
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
        if (isset($map['zjhm'])) {
            $model->zjhm = $map['zjhm'];
        }

        return $model;
    }
}
