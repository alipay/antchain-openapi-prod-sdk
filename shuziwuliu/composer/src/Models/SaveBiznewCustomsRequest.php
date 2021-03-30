<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\SHUZIWULIU\Models;

use AlibabaCloud\Tea\Model;

class SaveBiznewCustomsRequest extends Model
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

    // 托运订单号
    /**
     * @var string
     */
    public $orderNo;

    // 报关单号
    //
    //
    /**
     * @var string
     */
    public $customsCode;

    // 货代did
    /**
     * @var string
     */
    public $forwarderDid;

    // 报关代理
    //
    //
    /**
     * @var string
     */
    public $broker;

    // 出口人
    /**
     * @var string
     */
    public $exporter;

    // 船名 [业务必填]
    /**
     * @var string
     */
    public $vessel;

    // 航次 [业务必填]
    /**
     * @var string
     */
    public $voyage;

    // 报关状态
    // APPROVED--通关，UNAPPROVED-未通关
    /**
     * @var string
     */
    public $status;

    // 集装箱唯一标识
    /**
     * @var string
     */
    public $containerId;

    // 箱号
    /**
     * @var string
     */
    public $containerNo;

    // 货物名称
    /**
     * @var string
     */
    public $goods;

    // 毛重
    /**
     * @var string
     */
    public $grossWeight;

    // 件数
    /**
     * @var string
     */
    public $packagesNo;

    // 报关总金额 [业务必填]
    /**
     * @var string
     */
    public $customsTotalAmount;

    // 报关运费金额 [业务必填]
    /**
     * @var string
     */
    public $customsAmount;

    // 报关杂费金额 [业务必填]
    /**
     * @var string
     */
    public $customsCharges;

    // 币种 [业务必填]
    /**
     * @var string
     */
    public $currency;

    // 订舱单号列表 [业务必填]
    /**
     * @var BookingNoInfo[]
     */
    public $bookingInfoList;
    protected $_name = [
        'authToken'          => 'auth_token',
        'productInstanceId'  => 'product_instance_id',
        'orderNo'            => 'order_no',
        'customsCode'        => 'customs_code',
        'forwarderDid'       => 'forwarder_did',
        'broker'             => 'broker',
        'exporter'           => 'exporter',
        'vessel'             => 'vessel',
        'voyage'             => 'voyage',
        'status'             => 'status',
        'containerId'        => 'container_id',
        'containerNo'        => 'container_no',
        'goods'              => 'goods',
        'grossWeight'        => 'gross_weight',
        'packagesNo'         => 'packages_no',
        'customsTotalAmount' => 'customs_total_amount',
        'customsAmount'      => 'customs_amount',
        'customsCharges'     => 'customs_charges',
        'currency'           => 'currency',
        'bookingInfoList'    => 'booking_info_list',
    ];

    public function validate()
    {
        Model::validateRequired('orderNo', $this->orderNo, true);
        Model::validateRequired('customsCode', $this->customsCode, true);
        Model::validateRequired('forwarderDid', $this->forwarderDid, true);
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
        if (null !== $this->orderNo) {
            $res['order_no'] = $this->orderNo;
        }
        if (null !== $this->customsCode) {
            $res['customs_code'] = $this->customsCode;
        }
        if (null !== $this->forwarderDid) {
            $res['forwarder_did'] = $this->forwarderDid;
        }
        if (null !== $this->broker) {
            $res['broker'] = $this->broker;
        }
        if (null !== $this->exporter) {
            $res['exporter'] = $this->exporter;
        }
        if (null !== $this->vessel) {
            $res['vessel'] = $this->vessel;
        }
        if (null !== $this->voyage) {
            $res['voyage'] = $this->voyage;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->containerId) {
            $res['container_id'] = $this->containerId;
        }
        if (null !== $this->containerNo) {
            $res['container_no'] = $this->containerNo;
        }
        if (null !== $this->goods) {
            $res['goods'] = $this->goods;
        }
        if (null !== $this->grossWeight) {
            $res['gross_weight'] = $this->grossWeight;
        }
        if (null !== $this->packagesNo) {
            $res['packages_no'] = $this->packagesNo;
        }
        if (null !== $this->customsTotalAmount) {
            $res['customs_total_amount'] = $this->customsTotalAmount;
        }
        if (null !== $this->customsAmount) {
            $res['customs_amount'] = $this->customsAmount;
        }
        if (null !== $this->customsCharges) {
            $res['customs_charges'] = $this->customsCharges;
        }
        if (null !== $this->currency) {
            $res['currency'] = $this->currency;
        }
        if (null !== $this->bookingInfoList) {
            $res['booking_info_list'] = [];
            if (null !== $this->bookingInfoList && \is_array($this->bookingInfoList)) {
                $n = 0;
                foreach ($this->bookingInfoList as $item) {
                    $res['booking_info_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SaveBiznewCustomsRequest
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
        if (isset($map['order_no'])) {
            $model->orderNo = $map['order_no'];
        }
        if (isset($map['customs_code'])) {
            $model->customsCode = $map['customs_code'];
        }
        if (isset($map['forwarder_did'])) {
            $model->forwarderDid = $map['forwarder_did'];
        }
        if (isset($map['broker'])) {
            $model->broker = $map['broker'];
        }
        if (isset($map['exporter'])) {
            $model->exporter = $map['exporter'];
        }
        if (isset($map['vessel'])) {
            $model->vessel = $map['vessel'];
        }
        if (isset($map['voyage'])) {
            $model->voyage = $map['voyage'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }
        if (isset($map['container_id'])) {
            $model->containerId = $map['container_id'];
        }
        if (isset($map['container_no'])) {
            $model->containerNo = $map['container_no'];
        }
        if (isset($map['goods'])) {
            $model->goods = $map['goods'];
        }
        if (isset($map['gross_weight'])) {
            $model->grossWeight = $map['gross_weight'];
        }
        if (isset($map['packages_no'])) {
            $model->packagesNo = $map['packages_no'];
        }
        if (isset($map['customs_total_amount'])) {
            $model->customsTotalAmount = $map['customs_total_amount'];
        }
        if (isset($map['customs_amount'])) {
            $model->customsAmount = $map['customs_amount'];
        }
        if (isset($map['customs_charges'])) {
            $model->customsCharges = $map['customs_charges'];
        }
        if (isset($map['currency'])) {
            $model->currency = $map['currency'];
        }
        if (isset($map['booking_info_list'])) {
            if (!empty($map['booking_info_list'])) {
                $model->bookingInfoList = [];
                $n                      = 0;
                foreach ($map['booking_info_list'] as $item) {
                    $model->bookingInfoList[$n++] = null !== $item ? BookingNoInfo::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
