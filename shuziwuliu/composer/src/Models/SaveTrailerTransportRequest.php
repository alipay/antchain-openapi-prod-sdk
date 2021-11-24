<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\SHUZIWULIU\Models;

use AlibabaCloud\Tea\Model;

class SaveTrailerTransportRequest extends Model
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

    // 企业名称
    /**
     * @var string
     */
    public $companyName;

    // 企业统一社会信用代码
    /**
     * @var string
     */
    public $socialCreditCode;

    // 运营数据.月份
    /**
     * @var string
     */
    public $transportMonth;

    // 运营数据.运输箱量
    /**
     * @var int
     */
    public $transportContainerQuantity;

    // 运营数据.运费总额
    /**
     * @var string
     */
    public $freightTotalAmount;

    // 运营数据.运输司机量
    /**
     * @var int
     */
    public $transportDriverQuantity;
    protected $_name = [
        'authToken'                  => 'auth_token',
        'productInstanceId'          => 'product_instance_id',
        'companyName'                => 'company_name',
        'socialCreditCode'           => 'social_credit_code',
        'transportMonth'             => 'transport_month',
        'transportContainerQuantity' => 'transport_container_quantity',
        'freightTotalAmount'         => 'freight_total_amount',
        'transportDriverQuantity'    => 'transport_driver_quantity',
    ];

    public function validate()
    {
        Model::validateRequired('companyName', $this->companyName, true);
        Model::validateRequired('socialCreditCode', $this->socialCreditCode, true);
        Model::validateRequired('transportMonth', $this->transportMonth, true);
        Model::validateRequired('freightTotalAmount', $this->freightTotalAmount, true);
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
        if (null !== $this->companyName) {
            $res['company_name'] = $this->companyName;
        }
        if (null !== $this->socialCreditCode) {
            $res['social_credit_code'] = $this->socialCreditCode;
        }
        if (null !== $this->transportMonth) {
            $res['transport_month'] = $this->transportMonth;
        }
        if (null !== $this->transportContainerQuantity) {
            $res['transport_container_quantity'] = $this->transportContainerQuantity;
        }
        if (null !== $this->freightTotalAmount) {
            $res['freight_total_amount'] = $this->freightTotalAmount;
        }
        if (null !== $this->transportDriverQuantity) {
            $res['transport_driver_quantity'] = $this->transportDriverQuantity;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SaveTrailerTransportRequest
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
        if (isset($map['company_name'])) {
            $model->companyName = $map['company_name'];
        }
        if (isset($map['social_credit_code'])) {
            $model->socialCreditCode = $map['social_credit_code'];
        }
        if (isset($map['transport_month'])) {
            $model->transportMonth = $map['transport_month'];
        }
        if (isset($map['transport_container_quantity'])) {
            $model->transportContainerQuantity = $map['transport_container_quantity'];
        }
        if (isset($map['freight_total_amount'])) {
            $model->freightTotalAmount = $map['freight_total_amount'];
        }
        if (isset($map['transport_driver_quantity'])) {
            $model->transportDriverQuantity = $map['transport_driver_quantity'];
        }

        return $model;
    }
}
