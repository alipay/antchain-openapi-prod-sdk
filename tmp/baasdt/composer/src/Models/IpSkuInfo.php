<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BAASDT\Models;

use AlibabaCloud\Tea\Model;

class IpSkuInfo extends Model
{
    // ip的链上id
    /**
     * @example xxxx
     *
     * @var string
     */
    public $ipId;

    // ip的渠道名字
    /**
     * @example tianmao
     *
     * @var string
     */
    public $channelName;

    // 售卖的商品价格范围
    /**
     * @example 100-200
     *
     * @var string
     */
    public $priceRange;

    // ip售卖单价
    /**
     * @example 1.1
     *
     * @var string
     */
    public $purchasePrice;

    // 套餐中ip的数量
    /**
     * @example 10000
     *
     * @var string
     */
    public $saleNum;
    protected $_name = [
        'ipId'          => 'ip_id',
        'channelName'   => 'channel_name',
        'priceRange'    => 'price_range',
        'purchasePrice' => 'purchase_price',
        'saleNum'       => 'sale_num',
    ];

    public function validate()
    {
        Model::validateRequired('ipId', $this->ipId, true);
        Model::validateRequired('channelName', $this->channelName, true);
        Model::validateRequired('priceRange', $this->priceRange, true);
        Model::validateRequired('purchasePrice', $this->purchasePrice, true);
        Model::validateRequired('saleNum', $this->saleNum, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->ipId) {
            $res['ip_id'] = $this->ipId;
        }
        if (null !== $this->channelName) {
            $res['channel_name'] = $this->channelName;
        }
        if (null !== $this->priceRange) {
            $res['price_range'] = $this->priceRange;
        }
        if (null !== $this->purchasePrice) {
            $res['purchase_price'] = $this->purchasePrice;
        }
        if (null !== $this->saleNum) {
            $res['sale_num'] = $this->saleNum;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return IpSkuInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['ip_id'])) {
            $model->ipId = $map['ip_id'];
        }
        if (isset($map['channel_name'])) {
            $model->channelName = $map['channel_name'];
        }
        if (isset($map['price_range'])) {
            $model->priceRange = $map['price_range'];
        }
        if (isset($map['purchase_price'])) {
            $model->purchasePrice = $map['purchase_price'];
        }
        if (isset($map['sale_num'])) {
            $model->saleNum = $map['sale_num'];
        }

        return $model;
    }
}
