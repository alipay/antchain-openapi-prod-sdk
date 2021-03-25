<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\BAASDT\Models;

use AlibabaCloud\Tea\Model;

class EquityDetail extends Model {
    protected $_name = [
        'description' => 'description',
        'descImages' => 'desc_images',
        'equityId' => 'equity_id',
        'equityName' => 'equity_name',
        'equityType' => 'equity_type',
        'equityValue' => 'equity_value',
        'images' => 'images',
        'price' => 'price',
        'skuId' => 'sku_id',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->description) {
            $res['description'] = $this->description;
        }
        if (null !== $this->descImages) {
            $res['desc_images'] = $this->descImages;
        }
        if (null !== $this->equityId) {
            $res['equity_id'] = $this->equityId;
        }
        if (null !== $this->equityName) {
            $res['equity_name'] = $this->equityName;
        }
        if (null !== $this->equityType) {
            $res['equity_type'] = $this->equityType;
        }
        if (null !== $this->equityValue) {
            $res['equity_value'] = $this->equityValue;
        }
        if (null !== $this->images) {
            $res['images'] = $this->images;
        }
        if (null !== $this->price) {
            $res['price'] = $this->price;
        }
        if (null !== $this->skuId) {
            $res['sku_id'] = $this->skuId;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return EquityDetail
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['description'])){
            $model->description = $map['description'];
        }
        if(isset($map['desc_images'])){
            $model->descImages = $map['desc_images'];
        }
        if(isset($map['equity_id'])){
            $model->equityId = $map['equity_id'];
        }
        if(isset($map['equity_name'])){
            $model->equityName = $map['equity_name'];
        }
        if(isset($map['equity_type'])){
            $model->equityType = $map['equity_type'];
        }
        if(isset($map['equity_value'])){
            $model->equityValue = $map['equity_value'];
        }
        if(isset($map['images'])){
            $model->images = $map['images'];
        }
        if(isset($map['price'])){
            $model->price = $map['price'];
        }
        if(isset($map['sku_id'])){
            $model->skuId = $map['sku_id'];
        }
        return $model;
    }
    // 权益描述
    /**
     * @example description
     * @var string
     */
    public $description;

    // 权益描述图片OSS地址（分号;分隔）
    /**
     * @example OSS1;OSS2
     * @var string
     */
    public $descImages;

    // 权益ID
    /**
     * @example 7f1be9108651f97513b5b59030f5b059e58a59d263ab426cbf26337f91642caa
     * @var string
     */
    public $equityId;

    // 权益名称
    /**
     * @example 权益1
     * @var string
     */
    public $equityName;

    // 权益类型
    /**
     * @example 0200050002
     * @var string
     */
    public $equityType;

    // 权益面值(元)
    /**
     * @example 20.00
     * @var string
     */
    public $equityValue;

    // 权益主图片OSS地址（分号;分隔）
    /**
     * @example OSS1;OSS2
     * @var string
     */
    public $images;

    // 对客价(元)
    /**
     * @example 20.00
     * @var string
     */
    public $price;

    // 权益SKU
    /**
     * @example 20200407050700000000404
     * @var string
     */
    public $skuId;

}
