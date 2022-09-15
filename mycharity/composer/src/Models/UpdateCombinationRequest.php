<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MYCHARITY\Models;

use AlibabaCloud\Tea\Model;

class UpdateCombinationRequest extends Model
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

    // 实施内容id
    /**
     * @var string
     */
    public $id;

    // 名称
    /**
     * @var string
     */
    public $name;

    // 实施内容类型：0善款类，1实物类、2服务类
    /**
     * @var int
     */
    public $type;

    // 单位
    /**
     * @var string
     */
    public $unit;

    // 说明
    /**
     * @var string
     */
    public $note;

    // 单价是否固定，0:不固定，1:固定
    /**
     * @var int
     */
    public $priceDeterminedFlag;

    // 单位分，预估单价
    /**
     * @var int
     */
    public $price;

    // 预估发放数量
    /**
     * @var int
     */
    public $totalNum;
    protected $_name = [
        'authToken'           => 'auth_token',
        'productInstanceId'   => 'product_instance_id',
        'id'                  => 'id',
        'name'                => 'name',
        'type'                => 'type',
        'unit'                => 'unit',
        'note'                => 'note',
        'priceDeterminedFlag' => 'price_determined_flag',
        'price'               => 'price',
        'totalNum'            => 'total_num',
    ];

    public function validate()
    {
        Model::validateRequired('id', $this->id, true);
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('type', $this->type, true);
        Model::validateRequired('unit', $this->unit, true);
        Model::validateRequired('priceDeterminedFlag', $this->priceDeterminedFlag, true);
        Model::validateRequired('price', $this->price, true);
        Model::validateRequired('totalNum', $this->totalNum, true);
        Model::validateMaxLength('name', $this->name, 20);
        Model::validateMaxLength('unit', $this->unit, 10);
        Model::validateMaxLength('note', $this->note, 1000);
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
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }
        if (null !== $this->unit) {
            $res['unit'] = $this->unit;
        }
        if (null !== $this->note) {
            $res['note'] = $this->note;
        }
        if (null !== $this->priceDeterminedFlag) {
            $res['price_determined_flag'] = $this->priceDeterminedFlag;
        }
        if (null !== $this->price) {
            $res['price'] = $this->price;
        }
        if (null !== $this->totalNum) {
            $res['total_num'] = $this->totalNum;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return UpdateCombinationRequest
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
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['type'])) {
            $model->type = $map['type'];
        }
        if (isset($map['unit'])) {
            $model->unit = $map['unit'];
        }
        if (isset($map['note'])) {
            $model->note = $map['note'];
        }
        if (isset($map['price_determined_flag'])) {
            $model->priceDeterminedFlag = $map['price_determined_flag'];
        }
        if (isset($map['price'])) {
            $model->price = $map['price'];
        }
        if (isset($map['total_num'])) {
            $model->totalNum = $map['total_num'];
        }

        return $model;
    }
}
