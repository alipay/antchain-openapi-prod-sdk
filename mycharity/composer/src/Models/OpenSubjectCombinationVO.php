<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MYCHARITY\Models;

use AlibabaCloud\Tea\Model;

class OpenSubjectCombinationVO extends Model
{
    // 实施内容id
    /**
     * @example 1
     *
     * @var string
     */
    public $id;

    // 实施内容名称
    /**
     * @example 名称
     *
     * @var string
     */
    public $name;

    // 实施内容类型
    /**
     * @example
     *
     * @var int
     */
    public $type;

    // 单位
    /**
     * @example 个
     *
     * @var string
     */
    public $unit;

    // 说明
    /**
     * @example 说明
     *
     * @var string
     */
    public $note;

    // 单价是否固定，0:不固定，1:固定
    /**
     * @example
     *
     * @var int
     */
    public $priceDeterminedFlag;

    // 单价
    /**
     * @example
     *
     * @var int
     */
    public $price;

    // 预估发放个数
    /**
     * @example
     *
     * @var int
     */
    public $totalNum;
    protected $_name = [
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
    }

    public function toMap()
    {
        $res = [];
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
     * @return OpenSubjectCombinationVO
     */
    public static function fromMap($map = [])
    {
        $model = new self();
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
