<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_320bc483f2434f39a3af9ec9f04d3cc0\Models;

use AlibabaCloud\Tea\Model;

class InsureProductInfo extends Model
{
    // 产品名称
    /**
     * @example 雇主责任险-通用24小时十万版
     *
     * @var string
     */
    public $name;

    // 产品id
    /**
     * @example PP2023010500106845
     *
     * @var string
     */
    public $productId;

    // 险种编码:
    // ACCIDENT: 意外险
    // EMPLOYER: 雇主险
    /**
     * @example ACCIDENT
     *
     * @var string
     */
    public $insuranceTypeCode;

    // 推荐编码
    /**
     * @example AF2023051705052635767237
     *
     * @var string
     */
    public $recomFlowNo;

    // 最低价格（分）
    /**
     * @example 100
     *
     * @var int
     */
    public $premium;

    // 保额（分）
    /**
     * @example 30000000
     *
     * @var int
     */
    public $sumInsured;
    protected $_name = [
        'name'              => 'name',
        'productId'         => 'product_id',
        'insuranceTypeCode' => 'insurance_type_code',
        'recomFlowNo'       => 'recom_flow_no',
        'premium'           => 'premium',
        'sumInsured'        => 'sum_insured',
    ];

    public function validate()
    {
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('productId', $this->productId, true);
        Model::validateRequired('insuranceTypeCode', $this->insuranceTypeCode, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->productId) {
            $res['product_id'] = $this->productId;
        }
        if (null !== $this->insuranceTypeCode) {
            $res['insurance_type_code'] = $this->insuranceTypeCode;
        }
        if (null !== $this->recomFlowNo) {
            $res['recom_flow_no'] = $this->recomFlowNo;
        }
        if (null !== $this->premium) {
            $res['premium'] = $this->premium;
        }
        if (null !== $this->sumInsured) {
            $res['sum_insured'] = $this->sumInsured;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return InsureProductInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['product_id'])) {
            $model->productId = $map['product_id'];
        }
        if (isset($map['insurance_type_code'])) {
            $model->insuranceTypeCode = $map['insurance_type_code'];
        }
        if (isset($map['recom_flow_no'])) {
            $model->recomFlowNo = $map['recom_flow_no'];
        }
        if (isset($map['premium'])) {
            $model->premium = $map['premium'];
        }
        if (isset($map['sum_insured'])) {
            $model->sumInsured = $map['sum_insured'];
        }

        return $model;
    }
}
