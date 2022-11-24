<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_39810d10bae548fb846e0b015153901d\Models;

use AlibabaCloud\Tea\Model;

class RuleDetail extends Model
{
    // 项目类别
    /**
     * @example 类型
     *
     * @var string
     */
    public $type;

    // 领域
    /**
     * @example 领域
     *
     * @var string
     */
    public $fieId;

    // 级别
    /**
     * @example 级别
     *
     * @var string
     */
    public $level;

    // 资质
    /**
     * @example 资质
     *
     * @var string
     */
    public $qualifications;

    // 保定报价
    /**
     * @example 保定报价
     *
     * @var int
     */
    public $priceBd;

    // 离岸价格
    /**
     * @example 离岸价格
     *
     * @var int
     */
    public $fobPrice;

    // 离岸价格
    /**
     * @example 离岸价格
     *
     * @var int
     */
    public $priceTj;

    // 北京报价
    /**
     * @example 北京报价
     *
     * @var int
     */
    public $priceBj;

    // 最少提供人数
    /**
     * @example
     *
     * @var int
     */
    public $numpeople;
    protected $_name = [
        'type'           => 'type',
        'fieId'          => 'fie_id',
        'level'          => 'level',
        'qualifications' => 'qualifications',
        'priceBd'        => 'price_bd',
        'fobPrice'       => 'fob_price',
        'priceTj'        => 'price_tj',
        'priceBj'        => 'price_bj',
        'numpeople'      => 'numpeople',
    ];

    public function validate()
    {
        Model::validateRequired('type', $this->type, true);
        Model::validateRequired('fieId', $this->fieId, true);
        Model::validateRequired('level', $this->level, true);
        Model::validateRequired('qualifications', $this->qualifications, true);
        Model::validateRequired('priceBd', $this->priceBd, true);
        Model::validateRequired('fobPrice', $this->fobPrice, true);
        Model::validateRequired('priceTj', $this->priceTj, true);
        Model::validateRequired('priceBj', $this->priceBj, true);
        Model::validateRequired('numpeople', $this->numpeople, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }
        if (null !== $this->fieId) {
            $res['fie_id'] = $this->fieId;
        }
        if (null !== $this->level) {
            $res['level'] = $this->level;
        }
        if (null !== $this->qualifications) {
            $res['qualifications'] = $this->qualifications;
        }
        if (null !== $this->priceBd) {
            $res['price_bd'] = $this->priceBd;
        }
        if (null !== $this->fobPrice) {
            $res['fob_price'] = $this->fobPrice;
        }
        if (null !== $this->priceTj) {
            $res['price_tj'] = $this->priceTj;
        }
        if (null !== $this->priceBj) {
            $res['price_bj'] = $this->priceBj;
        }
        if (null !== $this->numpeople) {
            $res['numpeople'] = $this->numpeople;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return RuleDetail
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['type'])) {
            $model->type = $map['type'];
        }
        if (isset($map['fie_id'])) {
            $model->fieId = $map['fie_id'];
        }
        if (isset($map['level'])) {
            $model->level = $map['level'];
        }
        if (isset($map['qualifications'])) {
            $model->qualifications = $map['qualifications'];
        }
        if (isset($map['price_bd'])) {
            $model->priceBd = $map['price_bd'];
        }
        if (isset($map['fob_price'])) {
            $model->fobPrice = $map['fob_price'];
        }
        if (isset($map['price_tj'])) {
            $model->priceTj = $map['price_tj'];
        }
        if (isset($map['price_bj'])) {
            $model->priceBj = $map['price_bj'];
        }
        if (isset($map['numpeople'])) {
            $model->numpeople = $map['numpeople'];
        }

        return $model;
    }
}
