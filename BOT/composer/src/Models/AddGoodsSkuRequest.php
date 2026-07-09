<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class AddGoodsSkuRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    /**
     * @var string
     */
    public $productInstanceId;

    // GoodsTypeEnum,商品一级类目
    /**
     * @var string
     */
    public $type;

    // 商品二级类目
    /**
     * @var string
     */
    public $secondType;

    // 商品品牌
    /**
     * @var string
     */
    public $brand;

    // 商品名称，型号
    /**
     * @var string
     */
    public $model;

    // 市场价
    /**
     * @var int
     */
    public $marketPrice;

    // 手机型号信息
    /**
     * @var PhoneInfo
     */
    public $phoneInfo;

    // 电脑型号信息
    /**
     * @var ComputerInfo
     */
    public $computerInfo;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'type'              => 'type',
        'secondType'        => 'second_type',
        'brand'             => 'brand',
        'model'             => 'model',
        'marketPrice'       => 'market_price',
        'phoneInfo'         => 'phone_info',
        'computerInfo'      => 'computer_info',
    ];

    public function validate()
    {
        Model::validateRequired('type', $this->type, true);
        Model::validateRequired('secondType', $this->secondType, true);
        Model::validateRequired('brand', $this->brand, true);
        Model::validateRequired('model', $this->model, true);
        Model::validateRequired('marketPrice', $this->marketPrice, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }
        if (null !== $this->secondType) {
            $res['second_type'] = $this->secondType;
        }
        if (null !== $this->brand) {
            $res['brand'] = $this->brand;
        }
        if (null !== $this->model) {
            $res['model'] = $this->model;
        }
        if (null !== $this->marketPrice) {
            $res['market_price'] = $this->marketPrice;
        }
        if (null !== $this->phoneInfo) {
            $res['phone_info'] = null !== $this->phoneInfo ? $this->phoneInfo->toMap() : null;
        }
        if (null !== $this->computerInfo) {
            $res['computer_info'] = null !== $this->computerInfo ? $this->computerInfo->toMap() : null;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return AddGoodsSkuRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['product_instance_id'])) {
            $model->productInstanceId = $map['product_instance_id'];
        }
        if (isset($map['type'])) {
            $model->type = $map['type'];
        }
        if (isset($map['second_type'])) {
            $model->secondType = $map['second_type'];
        }
        if (isset($map['brand'])) {
            $model->brand = $map['brand'];
        }
        if (isset($map['model'])) {
            $model->model = $map['model'];
        }
        if (isset($map['market_price'])) {
            $model->marketPrice = $map['market_price'];
        }
        if (isset($map['phone_info'])) {
            $model->phoneInfo = PhoneInfo::fromMap($map['phone_info']);
        }
        if (isset($map['computer_info'])) {
            $model->computerInfo = ComputerInfo::fromMap($map['computer_info']);
        }

        return $model;
    }
}
