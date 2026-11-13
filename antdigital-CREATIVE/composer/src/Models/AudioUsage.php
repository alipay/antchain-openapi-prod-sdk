<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\CREATIVE\Models;

use AlibabaCloud\Tea\Model;

class AudioUsage extends Model {
    protected $_name = [
        'usageType' => 'usage_type',
        'unit' => 'unit',
        'durationSeconds' => 'duration_seconds',
        'count' => 'count',
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
        if (null !== $this->count) {
            $res['count'] = $this->count;
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
     * @return AudioUsage
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
        if(isset($map['count'])){
            $model->count = $map['count'];
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
     * @example AUDIO_GENERATION
     * @var string
     */
    public $usageType;

    // 计量单位
    /**
     * @example SECOND
     * @var string
     */
    public $unit;

    // 音频时长（秒）
    /**
     * @example 10.6
     * @var string
     */
    public $durationSeconds;

    // 音频数量
    /**
     * @example 1
     * @var int
     */
    public $count;

    // 本次音频生成的实际消耗金额（必返）
    /**
     * @example 10.11
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
