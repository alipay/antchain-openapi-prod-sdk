<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\SHUZIWULIU\Models;

use AlibabaCloud\Tea\Model;

class ContainerGoodsParam extends Model
{
    // 预计备货时间
    /**
     * @example 预计备货时间
     *
     * @var int
     */
    public $cargoReadyDate;

    // 危险品页号
    /**
     * @example 危险品页号
     *
     * @var string
     */
    public $dgPageNo;

    // 危险品级别
    /**
     * @example 危险品级别
     *
     * @var string
     */
    public $dgType;

    // 危险品闪点
    /**
     * @example 危险品闪点
     *
     * @var string
     */
    public $flashPoint;

    // 货物
    /**
     * @example 货物
     *
     * @var string
     */
    public $goods;

    // 货物中文名
    /**
     * @example 货物中文名
     *
     * @var string
     */
    public $goodsCn;

    // 货物类型 业务必填
    /**
     * @example 货物类型
     *
     * @var string
     */
    public $goodsType;

    // HS CODE
    /**
     * @example HS CODE
     *
     * @var string[]
     */
    public $hsCodes;

    // 唛头
    /**
     * @example 唛头
     *
     * @var string
     */
    public $marks;

    // 件数 业务必填
    /**
     * @example 1
     *
     * @var string
     */
    public $number;

    // 包装类型
    /**
     * @example 暂无
     *
     * @var string
     */
    public $packageType;

    // 实际件数
    /**
     * @example 实际件数
     *
     * @var string
     */
    public $realNumber;

    // 实际体积
    /**
     * @example 实际体积
     *
     * @var string
     */
    public $realVolume;

    // 实际重量
    /**
     * @example 实际重量
     *
     * @var string
     */
    public $realWeight;

    // 危险品联合国编号
    /**
     * @example 危险品联合国编号
     *
     * @var string
     */
    public $unNo;

    // 体积 业务必填
    /**
     * @example 1
     *
     * @var string
     */
    public $volume;

    // 毛重 业务必填
    /**
     * @example 1
     *
     * @var string
     */
    public $weight;
    protected $_name = [
        'cargoReadyDate' => 'cargo_ready_date',
        'dgPageNo'       => 'dg_page_no',
        'dgType'         => 'dg_type',
        'flashPoint'     => 'flash_point',
        'goods'          => 'goods',
        'goodsCn'        => 'goods_cn',
        'goodsType'      => 'goods_type',
        'hsCodes'        => 'hs_codes',
        'marks'          => 'marks',
        'number'         => 'number',
        'packageType'    => 'package_type',
        'realNumber'     => 'real_number',
        'realVolume'     => 'real_volume',
        'realWeight'     => 'real_weight',
        'unNo'           => 'un_no',
        'volume'         => 'volume',
        'weight'         => 'weight',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->cargoReadyDate) {
            $res['cargo_ready_date'] = $this->cargoReadyDate;
        }
        if (null !== $this->dgPageNo) {
            $res['dg_page_no'] = $this->dgPageNo;
        }
        if (null !== $this->dgType) {
            $res['dg_type'] = $this->dgType;
        }
        if (null !== $this->flashPoint) {
            $res['flash_point'] = $this->flashPoint;
        }
        if (null !== $this->goods) {
            $res['goods'] = $this->goods;
        }
        if (null !== $this->goodsCn) {
            $res['goods_cn'] = $this->goodsCn;
        }
        if (null !== $this->goodsType) {
            $res['goods_type'] = $this->goodsType;
        }
        if (null !== $this->hsCodes) {
            $res['hs_codes'] = $this->hsCodes;
        }
        if (null !== $this->marks) {
            $res['marks'] = $this->marks;
        }
        if (null !== $this->number) {
            $res['number'] = $this->number;
        }
        if (null !== $this->packageType) {
            $res['package_type'] = $this->packageType;
        }
        if (null !== $this->realNumber) {
            $res['real_number'] = $this->realNumber;
        }
        if (null !== $this->realVolume) {
            $res['real_volume'] = $this->realVolume;
        }
        if (null !== $this->realWeight) {
            $res['real_weight'] = $this->realWeight;
        }
        if (null !== $this->unNo) {
            $res['un_no'] = $this->unNo;
        }
        if (null !== $this->volume) {
            $res['volume'] = $this->volume;
        }
        if (null !== $this->weight) {
            $res['weight'] = $this->weight;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ContainerGoodsParam
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['cargo_ready_date'])) {
            $model->cargoReadyDate = $map['cargo_ready_date'];
        }
        if (isset($map['dg_page_no'])) {
            $model->dgPageNo = $map['dg_page_no'];
        }
        if (isset($map['dg_type'])) {
            $model->dgType = $map['dg_type'];
        }
        if (isset($map['flash_point'])) {
            $model->flashPoint = $map['flash_point'];
        }
        if (isset($map['goods'])) {
            $model->goods = $map['goods'];
        }
        if (isset($map['goods_cn'])) {
            $model->goodsCn = $map['goods_cn'];
        }
        if (isset($map['goods_type'])) {
            $model->goodsType = $map['goods_type'];
        }
        if (isset($map['hs_codes'])) {
            if (!empty($map['hs_codes'])) {
                $model->hsCodes = $map['hs_codes'];
            }
        }
        if (isset($map['marks'])) {
            $model->marks = $map['marks'];
        }
        if (isset($map['number'])) {
            $model->number = $map['number'];
        }
        if (isset($map['package_type'])) {
            $model->packageType = $map['package_type'];
        }
        if (isset($map['real_number'])) {
            $model->realNumber = $map['real_number'];
        }
        if (isset($map['real_volume'])) {
            $model->realVolume = $map['real_volume'];
        }
        if (isset($map['real_weight'])) {
            $model->realWeight = $map['real_weight'];
        }
        if (isset($map['un_no'])) {
            $model->unNo = $map['un_no'];
        }
        if (isset($map['volume'])) {
            $model->volume = $map['volume'];
        }
        if (isset($map['weight'])) {
            $model->weight = $map['weight'];
        }

        return $model;
    }
}
