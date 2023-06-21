<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class BclLogisticsInfo extends Model
{
    // 物流订单
    /**
     * @example aa32sasdwqe1w
     *
     * @var string
     */
    public $logisticsOrderId;

    // 物流公司
    /**
     * @example 韵达
     *
     * @var string
     */
    public $logisticCompany;

    // 物流状态
    // 已发货 SHIPPED
    // 运输中 TRANSPORT
    // 已签收 SIGNED
    /**
     * @example SHIPPED
     *
     * @var string
     */
    public $status;

    // 发货时间
    /**
     * @example 2023-04-05 12:12:23
     *
     * @var string
     */
    public $deliverTime;

    // 租赁类型
    // 租赁 LEASE
    // 退租 RETURN_LEASE
    /**
     * @example LEASE
     *
     * @var string
     */
    public $leaseType;

    // 签收时间
    /**
     * @example 2023-04-05 12:12:23
     *
     * @var string
     */
    public $arriveConfirmTime;

    // 签收文件下载链接
    /**
     * @example 2023-04-05 12:12:23
     *
     * @var string
     */
    public $arriveConfirmFileUrl;

    // 发货地址
    /**
     * @example xx省xx市
     *
     * @var string
     */
    public $deliverAddress;

    // 收货地址
    /**
     * @example xx省xx市
     *
     * @var string
     */
    public $arriveAddress;

    // 收货人姓名 脱敏
    /**
     * @example 张xx
     *
     * @var string
     */
    public $arriveName;

    // 收货人联系电话 脱敏
    /**
     * @example 172xxxx1232
     *
     * @var string
     */
    public $arriveMobile;

    // 物流公司标志,参考菜鸟的物流公司定义
    /**
     * @example YUNDA
     *
     * @var string
     */
    public $logisticCompanyCode;
    protected $_name = [
        'logisticsOrderId'     => 'logistics_order_id',
        'logisticCompany'      => 'logistic_company',
        'status'               => 'status',
        'deliverTime'          => 'deliver_time',
        'leaseType'            => 'lease_type',
        'arriveConfirmTime'    => 'arrive_confirm_time',
        'arriveConfirmFileUrl' => 'arrive_confirm_file_url',
        'deliverAddress'       => 'deliver_address',
        'arriveAddress'        => 'arrive_address',
        'arriveName'           => 'arrive_name',
        'arriveMobile'         => 'arrive_mobile',
        'logisticCompanyCode'  => 'logistic_company_code',
    ];

    public function validate()
    {
        Model::validateRequired('logisticsOrderId', $this->logisticsOrderId, true);
        Model::validateRequired('logisticCompany', $this->logisticCompany, true);
        Model::validateRequired('status', $this->status, true);
        Model::validateRequired('leaseType', $this->leaseType, true);
        Model::validateRequired('arriveConfirmFileUrl', $this->arriveConfirmFileUrl, true);
        Model::validateRequired('deliverAddress', $this->deliverAddress, true);
        Model::validateRequired('arriveAddress', $this->arriveAddress, true);
        Model::validateRequired('arriveName', $this->arriveName, true);
        Model::validateRequired('arriveMobile', $this->arriveMobile, true);
        Model::validatePattern('deliverTime', $this->deliverTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
        Model::validatePattern('arriveConfirmTime', $this->arriveConfirmTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->logisticsOrderId) {
            $res['logistics_order_id'] = $this->logisticsOrderId;
        }
        if (null !== $this->logisticCompany) {
            $res['logistic_company'] = $this->logisticCompany;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->deliverTime) {
            $res['deliver_time'] = $this->deliverTime;
        }
        if (null !== $this->leaseType) {
            $res['lease_type'] = $this->leaseType;
        }
        if (null !== $this->arriveConfirmTime) {
            $res['arrive_confirm_time'] = $this->arriveConfirmTime;
        }
        if (null !== $this->arriveConfirmFileUrl) {
            $res['arrive_confirm_file_url'] = $this->arriveConfirmFileUrl;
        }
        if (null !== $this->deliverAddress) {
            $res['deliver_address'] = $this->deliverAddress;
        }
        if (null !== $this->arriveAddress) {
            $res['arrive_address'] = $this->arriveAddress;
        }
        if (null !== $this->arriveName) {
            $res['arrive_name'] = $this->arriveName;
        }
        if (null !== $this->arriveMobile) {
            $res['arrive_mobile'] = $this->arriveMobile;
        }
        if (null !== $this->logisticCompanyCode) {
            $res['logistic_company_code'] = $this->logisticCompanyCode;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return BclLogisticsInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['logistics_order_id'])) {
            $model->logisticsOrderId = $map['logistics_order_id'];
        }
        if (isset($map['logistic_company'])) {
            $model->logisticCompany = $map['logistic_company'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }
        if (isset($map['deliver_time'])) {
            $model->deliverTime = $map['deliver_time'];
        }
        if (isset($map['lease_type'])) {
            $model->leaseType = $map['lease_type'];
        }
        if (isset($map['arrive_confirm_time'])) {
            $model->arriveConfirmTime = $map['arrive_confirm_time'];
        }
        if (isset($map['arrive_confirm_file_url'])) {
            $model->arriveConfirmFileUrl = $map['arrive_confirm_file_url'];
        }
        if (isset($map['deliver_address'])) {
            $model->deliverAddress = $map['deliver_address'];
        }
        if (isset($map['arrive_address'])) {
            $model->arriveAddress = $map['arrive_address'];
        }
        if (isset($map['arrive_name'])) {
            $model->arriveName = $map['arrive_name'];
        }
        if (isset($map['arrive_mobile'])) {
            $model->arriveMobile = $map['arrive_mobile'];
        }
        if (isset($map['logistic_company_code'])) {
            $model->logisticCompanyCode = $map['logistic_company_code'];
        }

        return $model;
    }
}
