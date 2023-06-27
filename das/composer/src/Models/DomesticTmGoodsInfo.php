<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\DAS\Models;

use AlibabaCloud\Tea\Model;

class DomesticTmGoodsInfo extends Model
{
    // 商品中文名称
    /**
     * @example 汽车
     *
     * @var string
     */
    public $goodsCnName;

    // 类似群编码
    /**
     * @example 1210
     *
     * @var string
     */
    public $similarCode;
    protected $_name = [
        'goodsCnName' => 'goods_cn_name',
        'similarCode' => 'similar_code',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->goodsCnName) {
            $res['goods_cn_name'] = $this->goodsCnName;
        }
        if (null !== $this->similarCode) {
            $res['similar_code'] = $this->similarCode;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return DomesticTmGoodsInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['goods_cn_name'])) {
            $model->goodsCnName = $map['goods_cn_name'];
        }
        if (isset($map['similar_code'])) {
            $model->similarCode = $map['similar_code'];
        }

        return $model;
    }
}
