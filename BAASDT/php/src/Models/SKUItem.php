<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\BAASDT\Models;

use AlibabaCloud\Tea\Model;

class SKUItem extends Model {
    protected $_name = [
        'rate' => 'rate',
        'skuAmount' => 'sku_amount',
        'skuId' => 'sku_id',
        'skuName' => 'sku_name',
        'skuPrice' => 'sku_price',
        'status' => 'status',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->rate) {
            $res['rate'] = $this->rate;
        }
        if (null !== $this->skuAmount) {
            $res['sku_amount'] = $this->skuAmount;
        }
        if (null !== $this->skuId) {
            $res['sku_id'] = $this->skuId;
        }
        if (null !== $this->skuName) {
            $res['sku_name'] = $this->skuName;
        }
        if (null !== $this->skuPrice) {
            $res['sku_price'] = $this->skuPrice;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return SKUItem
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['rate'])){
            $model->rate = $map['rate'];
        }
        if(isset($map['sku_amount'])){
            $model->skuAmount = $map['sku_amount'];
        }
        if(isset($map['sku_id'])){
            $model->skuId = $map['sku_id'];
        }
        if(isset($map['sku_name'])){
            $model->skuName = $map['sku_name'];
        }
        if(isset($map['sku_price'])){
            $model->skuPrice = $map['sku_price'];
        }
        if(isset($map['status'])){
            $model->status = $map['status'];
        }
        return $model;
    }
    /**
     * @example 0.006
     * @description 集分宝销售费率
     * @var string
     */
    public $rate;

    /**
     * @example 100
     * @description 包含集分宝个数
     * @var integer
     */
    public $skuAmount;

    /**
     * @example da0af02dea0918
     * @description 商品ID
     * @var string
     */
    public $skuId;

    /**
     * @example 区块链集分宝200
     * @description 商品名称
     * @var string
     */
    public $skuName;

    /**
     * @example 2.00
     * @description 商品面值（单位：元）
     * @var string
     */
    public $skuPrice;

    /**
     * @example 0
     * @description 商品状态：0可用，1冻结，2下线
     * @var integer
     */
    public $status;

}
