<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\ENERGYTOOL\Models;

use AlibabaCloud\Tea\Model;

class MarketPrice extends Model {
    protected $_name = [
        'marketCode' => 'market_code',
        'targetDate' => 'target_date',
        'queryType' => 'query_type',
        'priceType' => 'price_type',
        'period' => 'period',
        'priceValue' => 'price_value',
        'sourceUpdatedAt' => 'source_updated_at',
    ];
    public function validate() {
        Model::validateRequired('marketCode', $this->marketCode, true);
        Model::validateRequired('targetDate', $this->targetDate, true);
        Model::validateRequired('queryType', $this->queryType, true);
        Model::validateRequired('priceType', $this->priceType, true);
        Model::validateRequired('period', $this->period, true);
        Model::validateRequired('priceValue', $this->priceValue, true);
        Model::validateRequired('sourceUpdatedAt', $this->sourceUpdatedAt, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->marketCode) {
            $res['market_code'] = $this->marketCode;
        }
        if (null !== $this->targetDate) {
            $res['target_date'] = $this->targetDate;
        }
        if (null !== $this->queryType) {
            $res['query_type'] = $this->queryType;
        }
        if (null !== $this->priceType) {
            $res['price_type'] = $this->priceType;
        }
        if (null !== $this->period) {
            $res['period'] = $this->period;
        }
        if (null !== $this->priceValue) {
            $res['price_value'] = $this->priceValue;
        }
        if (null !== $this->sourceUpdatedAt) {
            $res['source_updated_at'] = $this->sourceUpdatedAt;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return MarketPrice
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['market_code'])){
            $model->marketCode = $map['market_code'];
        }
        if(isset($map['target_date'])){
            $model->targetDate = $map['target_date'];
        }
        if(isset($map['query_type'])){
            $model->queryType = $map['query_type'];
        }
        if(isset($map['price_type'])){
            $model->priceType = $map['price_type'];
        }
        if(isset($map['period'])){
            $model->period = $map['period'];
        }
        if(isset($map['price_value'])){
            $model->priceValue = $map['price_value'];
        }
        if(isset($map['source_updated_at'])){
            $model->sourceUpdatedAt = $map['source_updated_at'];
        }
        return $model;
    }
    // 市场码
    /**
     * @example JS
     * @var string
     */
    public $marketCode;

    // 目标日期,格式 yyyy-MM-dd
    /**
     * @example 2026-07-12
     * @var string
     */
    public $targetDate;

    // 查询类型:DAY_AHEAD/REALTIME
    /**
     * @example DAY_AHEAD
     * @var string
     */
    public $queryType;

    // 价格类型
    /**
     * @example CLEARING
     * @var string
     */
    public $priceType;

    // 时点编号,1~96 整数
    /**
     * @example 1
     * @var string
     */
    public $period;

    // 价格值,单位 元/MWh
    /**
     * @example 100.50
     * @var string
     */
    public $priceValue;

    // 数据源更新时间,ISO8601 格式
    /**
     * @example 2026-07-12T08:00:00Z
     * @var string
     */
    public $sourceUpdatedAt;

}
