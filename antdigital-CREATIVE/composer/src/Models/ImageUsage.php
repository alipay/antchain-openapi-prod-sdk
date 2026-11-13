<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\CREATIVE\Models;

use AlibabaCloud\Tea\Model;

class ImageUsage extends Model {
    protected $_name = [
        'usageType' => 'usage_type',
        'unit' => 'unit',
        'imageCount' => 'image_count',
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
        if (null !== $this->imageCount) {
            $res['image_count'] = $this->imageCount;
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
     * @return ImageUsage
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['usage_type'])){
            $model->usageType = $map['usage_type'];
        }
        if(isset($map['unit'])){
            $model->unit = $map['unit'];
        }
        if(isset($map['image_count'])){
            $model->imageCount = $map['image_count'];
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
     * @example IMAGE_GENERATION
     * @var string
     */
    public $usageType;

    // 计量单位
    /**
     * @example IMAGE_COUNT
     * @var string
     */
    public $unit;

    // 图片张数
    /**
     * @example 1
     * @var int
     */
    public $imageCount;

    // 本次图片生成的实际消耗金额
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
