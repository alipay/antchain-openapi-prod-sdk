<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\PCC\Models;

use AlibabaCloud\Tea\Model;

class AdditionDetail extends Model
{
    // 友商名称
    /**
     * @example test
     *
     * @var string
     */
    public $name;

    // 友商价格
    /**
     * @example test
     *
     * @var string
     */
    public $profit;

    // 技术分调整
    /**
     * @example test
     *
     * @var string
     */
    public $technicalScore;

    // 品牌分调整
    /**
     * @example test
     *
     * @var string
     */
    public $brandScore;

    // BD权限价预估
    /**
     * @example test
     *
     * @var string
     */
    public $bdPricePredict;
    protected $_name = [
        'name'           => 'name',
        'profit'         => 'profit',
        'technicalScore' => 'technical_score',
        'brandScore'     => 'brand_score',
        'bdPricePredict' => 'bd_price_predict',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->profit) {
            $res['profit'] = $this->profit;
        }
        if (null !== $this->technicalScore) {
            $res['technical_score'] = $this->technicalScore;
        }
        if (null !== $this->brandScore) {
            $res['brand_score'] = $this->brandScore;
        }
        if (null !== $this->bdPricePredict) {
            $res['bd_price_predict'] = $this->bdPricePredict;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return AdditionDetail
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['profit'])) {
            $model->profit = $map['profit'];
        }
        if (isset($map['technical_score'])) {
            $model->technicalScore = $map['technical_score'];
        }
        if (isset($map['brand_score'])) {
            $model->brandScore = $map['brand_score'];
        }
        if (isset($map['bd_price_predict'])) {
            $model->bdPricePredict = $map['bd_price_predict'];
        }

        return $model;
    }
}
