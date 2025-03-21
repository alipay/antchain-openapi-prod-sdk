<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\COLLABINV\Models;

use AlibabaCloud\Tea\Model;

class IndexData extends Model
{
    // 月份
    //
    /**
     * @example 月份
     *
     * @var string
     */
    public $month;

    // 高低线
    /**
     * @example 高
     *
     * @var string
     */
    public $cityTier;

    // 省份编码
    /**
     * @example 1001
     *
     * @var string
     */
    public $provinceCode;

    // 总交易笔数指数
    /**
     * @example 1.1
     *
     * @var string
     */
    public $totalCnt;

    // 总交易金额指数
    /**
     * @example 1.2
     *
     * @var string
     */
    public $totalAmt;

    // 总店铺数指数
    /**
     * @example 1.2
     *
     * @var string
     */
    public $totalShop;

    // 去重用户数指数
    /**
     * @example 1.2
     *
     * @var string
     */
    public $totalCsm;

    // 其中老店店铺总交易笔数指数
    /**
     * @example 1.1
     *
     * @var string
     */
    public $existingCnt;

    // 其中老店店铺总交易金额
    /**
     * @example 1.2
     *
     * @var string
     */
    public $existingAmt;

    // 其中老店店铺数量指数
    /**
     * @example 1.2
     *
     * @var string
     */
    public $existingShop;

    // 当月新增店铺数指数
    /**
     * @example 1.2
     *
     * @var string
     */
    public $newShop;

    // 分金额段指数
    /**
     * @example 1.2
     *
     * @var string
     */
    public $amtRange;

    // 店铺标签指数
    /**
     * @example 线下
     *
     * @var string
     */
    public $shopTag;
    protected $_name = [
        'month'        => 'month',
        'cityTier'     => 'city_tier',
        'provinceCode' => 'province_code',
        'totalCnt'     => 'total_cnt',
        'totalAmt'     => 'total_amt',
        'totalShop'    => 'total_shop',
        'totalCsm'     => 'total_csm',
        'existingCnt'  => 'existing_cnt',
        'existingAmt'  => 'existing_amt',
        'existingShop' => 'existing_shop',
        'newShop'      => 'new_shop',
        'amtRange'     => 'amt_range',
        'shopTag'      => 'shop_tag',
    ];

    public function validate()
    {
        Model::validateRequired('month', $this->month, true);
        Model::validateRequired('cityTier', $this->cityTier, true);
        Model::validateRequired('provinceCode', $this->provinceCode, true);
        Model::validateRequired('totalCnt', $this->totalCnt, true);
        Model::validateRequired('totalAmt', $this->totalAmt, true);
        Model::validateRequired('totalShop', $this->totalShop, true);
        Model::validateRequired('totalCsm', $this->totalCsm, true);
        Model::validateRequired('existingCnt', $this->existingCnt, true);
        Model::validateRequired('existingAmt', $this->existingAmt, true);
        Model::validateRequired('existingShop', $this->existingShop, true);
        Model::validateRequired('newShop', $this->newShop, true);
        Model::validateRequired('amtRange', $this->amtRange, true);
        Model::validateRequired('shopTag', $this->shopTag, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->month) {
            $res['month'] = $this->month;
        }
        if (null !== $this->cityTier) {
            $res['city_tier'] = $this->cityTier;
        }
        if (null !== $this->provinceCode) {
            $res['province_code'] = $this->provinceCode;
        }
        if (null !== $this->totalCnt) {
            $res['total_cnt'] = $this->totalCnt;
        }
        if (null !== $this->totalAmt) {
            $res['total_amt'] = $this->totalAmt;
        }
        if (null !== $this->totalShop) {
            $res['total_shop'] = $this->totalShop;
        }
        if (null !== $this->totalCsm) {
            $res['total_csm'] = $this->totalCsm;
        }
        if (null !== $this->existingCnt) {
            $res['existing_cnt'] = $this->existingCnt;
        }
        if (null !== $this->existingAmt) {
            $res['existing_amt'] = $this->existingAmt;
        }
        if (null !== $this->existingShop) {
            $res['existing_shop'] = $this->existingShop;
        }
        if (null !== $this->newShop) {
            $res['new_shop'] = $this->newShop;
        }
        if (null !== $this->amtRange) {
            $res['amt_range'] = $this->amtRange;
        }
        if (null !== $this->shopTag) {
            $res['shop_tag'] = $this->shopTag;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return IndexData
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['month'])) {
            $model->month = $map['month'];
        }
        if (isset($map['city_tier'])) {
            $model->cityTier = $map['city_tier'];
        }
        if (isset($map['province_code'])) {
            $model->provinceCode = $map['province_code'];
        }
        if (isset($map['total_cnt'])) {
            $model->totalCnt = $map['total_cnt'];
        }
        if (isset($map['total_amt'])) {
            $model->totalAmt = $map['total_amt'];
        }
        if (isset($map['total_shop'])) {
            $model->totalShop = $map['total_shop'];
        }
        if (isset($map['total_csm'])) {
            $model->totalCsm = $map['total_csm'];
        }
        if (isset($map['existing_cnt'])) {
            $model->existingCnt = $map['existing_cnt'];
        }
        if (isset($map['existing_amt'])) {
            $model->existingAmt = $map['existing_amt'];
        }
        if (isset($map['existing_shop'])) {
            $model->existingShop = $map['existing_shop'];
        }
        if (isset($map['new_shop'])) {
            $model->newShop = $map['new_shop'];
        }
        if (isset($map['amt_range'])) {
            $model->amtRange = $map['amt_range'];
        }
        if (isset($map['shop_tag'])) {
            $model->shopTag = $map['shop_tag'];
        }

        return $model;
    }
}
