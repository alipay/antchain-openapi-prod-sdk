<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\SHUZIWULIU\Models;

use AlibabaCloud\Tea\Model;

class StockinCargo extends Model
{
    // 入库序号，在同一次入库请求中，入库序号保持不重复，不能小于0
    /**
     * @example 1
     *
     * @var int
     */
    public $stockinIndex;

    // sku品名
    //
    /**
     * @example 80656-RLC-422-5MP
     *
     * @var string
     */
    public $sku;

    // 商品名称
    /**
     * @example 小米手机米9手机
     *
     * @var string
     */
    public $cargoName;

    // 商品单品重量(kg)
    /**
     * @example 0.8
     *
     * @var string
     */
    public $cargoWeight;

    // 商品外扩长宽高(cm)
    /**
     * @example 20.00*30.00*40.00
     *
     * @var string
     */
    public $cargoDimensions;

    // 商品单品货物价值(元),，最多支持2位小数
    /**
     * @example 120.00
     *
     * @var string
     */
    public $cargoWorth;

    // 箱号
    /**
     * @example 1
     *
     * @var string
     */
    public $containerNo;

    // 实际入库件数
    /**
     * @example 6
     *
     * @var int
     */
    public $actualStockinNum;
    protected $_name = [
        'stockinIndex'     => 'stockin_index',
        'sku'              => 'sku',
        'cargoName'        => 'cargo_name',
        'cargoWeight'      => 'cargo_weight',
        'cargoDimensions'  => 'cargo_dimensions',
        'cargoWorth'       => 'cargo_worth',
        'containerNo'      => 'container_no',
        'actualStockinNum' => 'actual_stockin_num',
    ];

    public function validate()
    {
        Model::validateRequired('stockinIndex', $this->stockinIndex, true);
        Model::validateRequired('sku', $this->sku, true);
        Model::validateRequired('actualStockinNum', $this->actualStockinNum, true);
        Model::validateMaxLength('sku', $this->sku, 200);
        Model::validateMaxLength('cargoName', $this->cargoName, 200);
        Model::validateMaxLength('cargoWeight', $this->cargoWeight, 50);
        Model::validateMaxLength('cargoDimensions', $this->cargoDimensions, 200);
        Model::validateMaxLength('cargoWorth', $this->cargoWorth, 30);
        Model::validateMaxLength('containerNo', $this->containerNo, 50);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->stockinIndex) {
            $res['stockin_index'] = $this->stockinIndex;
        }
        if (null !== $this->sku) {
            $res['sku'] = $this->sku;
        }
        if (null !== $this->cargoName) {
            $res['cargo_name'] = $this->cargoName;
        }
        if (null !== $this->cargoWeight) {
            $res['cargo_weight'] = $this->cargoWeight;
        }
        if (null !== $this->cargoDimensions) {
            $res['cargo_dimensions'] = $this->cargoDimensions;
        }
        if (null !== $this->cargoWorth) {
            $res['cargo_worth'] = $this->cargoWorth;
        }
        if (null !== $this->containerNo) {
            $res['container_no'] = $this->containerNo;
        }
        if (null !== $this->actualStockinNum) {
            $res['actual_stockin_num'] = $this->actualStockinNum;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return StockinCargo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['stockin_index'])) {
            $model->stockinIndex = $map['stockin_index'];
        }
        if (isset($map['sku'])) {
            $model->sku = $map['sku'];
        }
        if (isset($map['cargo_name'])) {
            $model->cargoName = $map['cargo_name'];
        }
        if (isset($map['cargo_weight'])) {
            $model->cargoWeight = $map['cargo_weight'];
        }
        if (isset($map['cargo_dimensions'])) {
            $model->cargoDimensions = $map['cargo_dimensions'];
        }
        if (isset($map['cargo_worth'])) {
            $model->cargoWorth = $map['cargo_worth'];
        }
        if (isset($map['container_no'])) {
            $model->containerNo = $map['container_no'];
        }
        if (isset($map['actual_stockin_num'])) {
            $model->actualStockinNum = $map['actual_stockin_num'];
        }

        return $model;
    }
}
