<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\ENERGYTOOL\Models;

use AlibabaCloud\Tea\Model;

class PricePredictionItem extends Model {
    protected $_name = [
        'period' => 'period',
        'predictedPrice' => 'predicted_price',
        'actualPrice' => 'actual_price',
    ];
    public function validate() {
        Model::validateRequired('period', $this->period, true);
        Model::validateRequired('predictedPrice', $this->predictedPrice, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->period) {
            $res['period'] = $this->period;
        }
        if (null !== $this->predictedPrice) {
            $res['predicted_price'] = $this->predictedPrice;
        }
        if (null !== $this->actualPrice) {
            $res['actual_price'] = $this->actualPrice;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return PricePredictionItem
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['period'])){
            $model->period = $map['period'];
        }
        if(isset($map['predicted_price'])){
            $model->predictedPrice = $map['predicted_price'];
        }
        if(isset($map['actual_price'])){
            $model->actualPrice = $map['actual_price'];
        }
        return $model;
    }
    // 时间点位
    /**
     * @example 01:00
     * @var string
     */
    public $period;

    // 预测电价，单位：元/mwh
    /**
     * @example 0.7
     * @var string
     */
    public $predictedPrice;

    // 实际电价，单位：元/mwh
    /**
     * @example 10.0
     * @var string
     */
    public $actualPrice;

}
