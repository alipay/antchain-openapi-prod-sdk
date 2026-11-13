<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\CREATIVE\Models;

use AlibabaCloud\Tea\Model;

class VideoUsage extends Model {
    protected $_name = [
        'usageType' => 'usage_type',
        'unit' => 'unit',
        'durationSeconds' => 'duration_seconds',
        'originalPrice' => 'original_price',
        'currency' => 'currency',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->usageType) {
            $res['usage_type'] = $this->usageType;
        }
        if (null !== $this->unit) {
            $res['unit'] = $this->unit;
        }
        if (null !== $this->durationSeconds) {
            $res['duration_seconds'] = $this->durationSeconds;
        }
        if (null !== $this->originalPrice) {
            $res['original_price'] = $this->originalPrice;
        }
        if (null !== $this->currency) {
            $res['currency'] = $this->currency;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return VideoUsage
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['usage_type'])){
            $model->usageType = $map['usage_type'];
        }
        if(isset($map['unit'])){
            $model->unit = $map['unit'];
        }
        if(isset($map['duration_seconds'])){
            $model->durationSeconds = $map['duration_seconds'];
        }
        if(isset($map['original_price'])){
            $model->originalPrice = $map['original_price'];
        }
        if(isset($map['currency'])){
            $model->currency = $map['currency'];
        }
        return $model;
    }
    // 用量类型
    /**
     * @example VIDEO_GENERATION
     * @var string
     */
    public $usageType;

    // 计量单位
    /**
     * @example SECOND
     * @var string
     */
    public $unit;

    // 视频时长（秒）
    /**
     * @example 10
     * @var string
     */
    public $durationSeconds;

    // 本次视频生成的实际消耗金额
    /**
     * @example 0.11
     * @var string
     */
    public $originalPrice;

    // 币种
    /**
     * @example CNY
     * @var string
     */
    public $currency;

}
