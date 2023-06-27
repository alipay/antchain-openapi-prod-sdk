<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\DAS\Models;

use AlibabaCloud\Tea\Model;

class DomesticTmExtensionInfo extends Model
{
    // 商标logo URL地址
    /**
     * @example http://logo.png
     *
     * @var string
     */
    public $tmLogoUrl;

    // 商品与服务信息列表
    /**
     * @example
     *
     * @var DomesticTmGoodsInfo[]
     */
    public $goodsInfo;
    protected $_name = [
        'tmLogoUrl' => 'tm_logo_url',
        'goodsInfo' => 'goods_info',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->tmLogoUrl) {
            $res['tm_logo_url'] = $this->tmLogoUrl;
        }
        if (null !== $this->goodsInfo) {
            $res['goods_info'] = [];
            if (null !== $this->goodsInfo && \is_array($this->goodsInfo)) {
                $n = 0;
                foreach ($this->goodsInfo as $item) {
                    $res['goods_info'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return DomesticTmExtensionInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['tm_logo_url'])) {
            $model->tmLogoUrl = $map['tm_logo_url'];
        }
        if (isset($map['goods_info'])) {
            if (!empty($map['goods_info'])) {
                $model->goodsInfo = [];
                $n                = 0;
                foreach ($map['goods_info'] as $item) {
                    $model->goodsInfo[$n++] = null !== $item ? DomesticTmGoodsInfo::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
