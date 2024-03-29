<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class AddBclLogisticinfoRequest extends Model
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

    // 租赁订单ID
    // 最大长度：32
    /**
     * @var string
     */
    public $orderId;

    // 物流状态
    // 1.已发货：SHIPPED
    // 2.已签收：SIGNED
    /**
     * @var string
     */
    public $logisticStatus;

    // 物流照片网关文件ID
    // 先调用文件上传的接口,这里填上传后返回的fileid
    /**
     * @var string
     */
    public $logisticsFileId;

    // 签收记录,网关文件ID
    // 先调用文件上传的接口,这里填上传后返回的fileid
    /**
     * @var string
     */
    public $arriveConfirmFileId;

    // 用户签收时间
    // 示例：2023-06-27T10:50:23+08:00
    /**
     * @var string
     */
    public $arriveConfirmTime;

    // 物流公司简称
    /**
     * @var string
     */
    public $logisticCompanyName;

    // 物流公司code：
    // 1.圆通速递：YTO
    // 2.韵达快递：YUNDA
    // 3.顺丰速运：SF
    // 4.EMS：EMS
    // 5.申通快递：STO
    // 6.中通快递：ZTO
    // 7.天天快递：TTKDEX
    // 8.全峰快递：QFKD
    // 9.中铁物流：ZTKY
    // 10.其他：OTHER
    /**
     * @var string
     */
    public $logisticCompanyCode;

    // 物流订单ID
    // 最大长度64
    /**
     * @var string
     */
    public $logisticsOrderId;

    // 物流发货时间
    // 示例：2023-06-27T10:50:23+08:00
    /**
     * @var string
     */
    public $deliverTime;

    // 租赁状态
    // LEASE,租赁
    // RETURN_LEASE,退租
    /**
     * @var string
     */
    public $leaseType;

    // 发货地址
    /**
     * @var string
     */
    public $deliverAddress;

    // 收货地址
    /**
     * @var string
     */
    public $arriveAddress;

    // 收货人姓名
    /**
     * @var string
     */
    public $arriveName;

    // 收货人联系电话
    /**
     * @var string
     */
    public $arriveMobile;
    protected $_name = [
        'authToken'           => 'auth_token',
        'productInstanceId'   => 'product_instance_id',
        'orderId'             => 'order_id',
        'logisticStatus'      => 'logistic_status',
        'logisticsFileId'     => 'logistics_file_id',
        'arriveConfirmFileId' => 'arrive_confirm_file_id',
        'arriveConfirmTime'   => 'arrive_confirm_time',
        'logisticCompanyName' => 'logistic_company_name',
        'logisticCompanyCode' => 'logistic_company_code',
        'logisticsOrderId'    => 'logistics_order_id',
        'deliverTime'         => 'deliver_time',
        'leaseType'           => 'lease_type',
        'deliverAddress'      => 'deliver_address',
        'arriveAddress'       => 'arrive_address',
        'arriveName'          => 'arrive_name',
        'arriveMobile'        => 'arrive_mobile',
    ];

    public function validate()
    {
        Model::validateRequired('orderId', $this->orderId, true);
        Model::validateRequired('logisticStatus', $this->logisticStatus, true);
        Model::validateRequired('logisticCompanyName', $this->logisticCompanyName, true);
        Model::validateRequired('logisticCompanyCode', $this->logisticCompanyCode, true);
        Model::validateRequired('logisticsOrderId', $this->logisticsOrderId, true);
        Model::validateRequired('deliverTime', $this->deliverTime, true);
        Model::validateRequired('leaseType', $this->leaseType, true);
        Model::validateRequired('deliverAddress', $this->deliverAddress, true);
        Model::validateRequired('arriveAddress', $this->arriveAddress, true);
        Model::validateRequired('arriveName', $this->arriveName, true);
        Model::validateRequired('arriveMobile', $this->arriveMobile, true);
        Model::validateMaxLength('orderId', $this->orderId, 32);
        Model::validateMaxLength('logisticStatus', $this->logisticStatus, 16);
        Model::validateMaxLength('logisticsFileId', $this->logisticsFileId, 64);
        Model::validateMaxLength('arriveConfirmFileId', $this->arriveConfirmFileId, 64);
        Model::validateMaxLength('logisticCompanyName', $this->logisticCompanyName, 32);
        Model::validateMaxLength('logisticCompanyCode', $this->logisticCompanyCode, 32);
        Model::validateMaxLength('logisticsOrderId', $this->logisticsOrderId, 64);
        Model::validateMaxLength('leaseType', $this->leaseType, 16);
        Model::validateMaxLength('deliverAddress', $this->deliverAddress, 512);
        Model::validateMaxLength('arriveAddress', $this->arriveAddress, 512);
        Model::validateMaxLength('arriveName', $this->arriveName, 128);
        Model::validateMaxLength('arriveMobile', $this->arriveMobile, 32);
        Model::validatePattern('arriveConfirmTime', $this->arriveConfirmTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
        Model::validatePattern('deliverTime', $this->deliverTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
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
        if (null !== $this->orderId) {
            $res['order_id'] = $this->orderId;
        }
        if (null !== $this->logisticStatus) {
            $res['logistic_status'] = $this->logisticStatus;
        }
        if (null !== $this->logisticsFileId) {
            $res['logistics_file_id'] = $this->logisticsFileId;
        }
        if (null !== $this->arriveConfirmFileId) {
            $res['arrive_confirm_file_id'] = $this->arriveConfirmFileId;
        }
        if (null !== $this->arriveConfirmTime) {
            $res['arrive_confirm_time'] = $this->arriveConfirmTime;
        }
        if (null !== $this->logisticCompanyName) {
            $res['logistic_company_name'] = $this->logisticCompanyName;
        }
        if (null !== $this->logisticCompanyCode) {
            $res['logistic_company_code'] = $this->logisticCompanyCode;
        }
        if (null !== $this->logisticsOrderId) {
            $res['logistics_order_id'] = $this->logisticsOrderId;
        }
        if (null !== $this->deliverTime) {
            $res['deliver_time'] = $this->deliverTime;
        }
        if (null !== $this->leaseType) {
            $res['lease_type'] = $this->leaseType;
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

        return $res;
    }

    /**
     * @param array $map
     *
     * @return AddBclLogisticinfoRequest
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
        if (isset($map['order_id'])) {
            $model->orderId = $map['order_id'];
        }
        if (isset($map['logistic_status'])) {
            $model->logisticStatus = $map['logistic_status'];
        }
        if (isset($map['logistics_file_id'])) {
            $model->logisticsFileId = $map['logistics_file_id'];
        }
        if (isset($map['arrive_confirm_file_id'])) {
            $model->arriveConfirmFileId = $map['arrive_confirm_file_id'];
        }
        if (isset($map['arrive_confirm_time'])) {
            $model->arriveConfirmTime = $map['arrive_confirm_time'];
        }
        if (isset($map['logistic_company_name'])) {
            $model->logisticCompanyName = $map['logistic_company_name'];
        }
        if (isset($map['logistic_company_code'])) {
            $model->logisticCompanyCode = $map['logistic_company_code'];
        }
        if (isset($map['logistics_order_id'])) {
            $model->logisticsOrderId = $map['logistics_order_id'];
        }
        if (isset($map['deliver_time'])) {
            $model->deliverTime = $map['deliver_time'];
        }
        if (isset($map['lease_type'])) {
            $model->leaseType = $map['lease_type'];
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

        return $model;
    }
}
