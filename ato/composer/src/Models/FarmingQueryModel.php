<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ATO\Models;

use AlibabaCloud\Tea\Model;

class FarmingQueryModel extends Model
{
    // 支付宝外部交易号
    /**
     * @example 6983312****
     *
     * @var string
     */
    public $outOrderNo;

    // 支付宝内部交易号
    /**
     * @example 20230436xxxxxxxxx
     *
     * @var string
     */
    public $orderNo;

    // 金额，用户购买或使用服务时产生的具体金额，单位：分
    /**
     * @example 36500
     *
     * @var int
     */
    public $salesAmount;

    // 银行卡号
    /**
     * @example 6228xxxxxxxxxxxxx13
     *
     * @var string
     */
    public $bankCardNo;

    // 服务商 pid
    /**
     * @example 2088xxxxxxxxxxxx
     *
     * @var string
     */
    public $isvPid;

    // 门店行业类目，枚举值：CATERING - 餐饮；LEISURE - 休闲；MEDICAL - 医疗
    /**
     * @example CATERING
     *
     * @var string
     */
    public $storeMccDesc;

    // 门店地址；不需要传城市和行政区
    /**
     * @example 万塘路18号
     *
     * @var string
     */
    public $outletAddress;

    // 公司名称
    /**
     * @example 杭州贸易有限公司
     *
     * @var string
     */
    public $companyName;

    // 店铺名称
    /**
     * @example 小店1号
     *
     * @var string
     */
    public $storeName;
    protected $_name = [
        'outOrderNo'    => 'out_order_no',
        'orderNo'       => 'order_no',
        'salesAmount'   => 'sales_amount',
        'bankCardNo'    => 'bank_card_no',
        'isvPid'        => 'isv_pid',
        'storeMccDesc'  => 'store_mcc_desc',
        'outletAddress' => 'outlet_address',
        'companyName'   => 'company_name',
        'storeName'     => 'store_name',
    ];

    public function validate()
    {
        Model::validateMaxLength('outOrderNo', $this->outOrderNo, 128);
        Model::validateMaxLength('orderNo', $this->orderNo, 128);
        Model::validateMaxLength('bankCardNo', $this->bankCardNo, 128);
        Model::validateMaxLength('isvPid', $this->isvPid, 128);
        Model::validateMaxLength('storeMccDesc', $this->storeMccDesc, 30);
        Model::validateMaxLength('outletAddress', $this->outletAddress, 128);
        Model::validateMaxLength('companyName', $this->companyName, 128);
        Model::validateMaxLength('storeName', $this->storeName, 128);
        Model::validateMinLength('outOrderNo', $this->outOrderNo, 1);
        Model::validateMinLength('orderNo', $this->orderNo, 1);
        Model::validateMinLength('bankCardNo', $this->bankCardNo, 1);
        Model::validateMinLength('isvPid', $this->isvPid, 1);
        Model::validateMinLength('storeMccDesc', $this->storeMccDesc, 1);
        Model::validateMinLength('outletAddress', $this->outletAddress, 1);
        Model::validateMinLength('companyName', $this->companyName, 1);
        Model::validateMinLength('storeName', $this->storeName, 1);
        Model::validateMaximum('salesAmount', $this->salesAmount, 10000000);
        Model::validateMinimum('salesAmount', $this->salesAmount, 1);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->outOrderNo) {
            $res['out_order_no'] = $this->outOrderNo;
        }
        if (null !== $this->orderNo) {
            $res['order_no'] = $this->orderNo;
        }
        if (null !== $this->salesAmount) {
            $res['sales_amount'] = $this->salesAmount;
        }
        if (null !== $this->bankCardNo) {
            $res['bank_card_no'] = $this->bankCardNo;
        }
        if (null !== $this->isvPid) {
            $res['isv_pid'] = $this->isvPid;
        }
        if (null !== $this->storeMccDesc) {
            $res['store_mcc_desc'] = $this->storeMccDesc;
        }
        if (null !== $this->outletAddress) {
            $res['outlet_address'] = $this->outletAddress;
        }
        if (null !== $this->companyName) {
            $res['company_name'] = $this->companyName;
        }
        if (null !== $this->storeName) {
            $res['store_name'] = $this->storeName;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return FarmingQueryModel
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['out_order_no'])) {
            $model->outOrderNo = $map['out_order_no'];
        }
        if (isset($map['order_no'])) {
            $model->orderNo = $map['order_no'];
        }
        if (isset($map['sales_amount'])) {
            $model->salesAmount = $map['sales_amount'];
        }
        if (isset($map['bank_card_no'])) {
            $model->bankCardNo = $map['bank_card_no'];
        }
        if (isset($map['isv_pid'])) {
            $model->isvPid = $map['isv_pid'];
        }
        if (isset($map['store_mcc_desc'])) {
            $model->storeMccDesc = $map['store_mcc_desc'];
        }
        if (isset($map['outlet_address'])) {
            $model->outletAddress = $map['outlet_address'];
        }
        if (isset($map['company_name'])) {
            $model->companyName = $map['company_name'];
        }
        if (isset($map['store_name'])) {
            $model->storeName = $map['store_name'];
        }

        return $model;
    }
}
