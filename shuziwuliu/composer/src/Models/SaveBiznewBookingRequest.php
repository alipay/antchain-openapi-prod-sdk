<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\SHUZIWULIU\Models;

use AlibabaCloud\Tea\Model;

class SaveBiznewBookingRequest extends Model
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
    //
    //
    /**
     * @var string
     */
    public $orderNo;

    // 订舱单唯一标识
    /**
     * @var string
     */
    public $bookingNo;

    // 订舱号 [业务必填]
    /**
     * @var string
     */
    public $bkgNo;

    // 货代did
    /**
     * @var string
     */
    public $forwarderDid;

    // 收货人
    /**
     * @var string
     */
    public $consignee;

    // 船公司 [业务必填]
    /**
     * @var string
     */
    public $carrier;

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

    // 起运港 [业务必填]
    /**
     * @var string
     */
    public $loadingPort;

    // 卸货港 [业务必填]
    /**
     * @var string
     */
    public $dischargePort;

    // 箱型箱量 [业务必填]
    /**
     * @var ContainerTypeInfo[]
     */
    public $containerTypeInfoList;

    // 截关时间（秒时间戳）
    /**
     * @var int
     */
    public $customsClearance;

    // 截港时间（秒时间戳）
    /**
     * @var int
     */
    public $cyClosing;

    // 截单时间 (秒时间戳)
    /**
     * @var int
     */
    public $siClosing;

    // 预计船期（秒时间戳）
    /**
     * @var int
     */
    public $etd;

    // 订舱费总金额 [业务必填]
    /**
     * @var string
     */
    public $bkgTotalAmount;

    // 订舱费金额 [业务必填]
    /**
     * @var string
     */
    public $bkgAmount;

    // 港杂费金额 [业务必填]
    /**
     * @var string
     */
    public $portCharges;

    // 币种 CNY/USD [业务必填]
    //
    //
    /**
     * @var string
     */
    public $currency;

    // 订单确认 CREATE/FINISH (创建/确认) [业务必填]
    /**
     * @var string
     */
    public $status;
    protected $_name = [
        'authToken'             => 'auth_token',
        'productInstanceId'     => 'product_instance_id',
        'orderNo'               => 'order_no',
        'bookingNo'             => 'booking_no',
        'bkgNo'                 => 'bkg_no',
        'forwarderDid'          => 'forwarder_did',
        'consignee'             => 'consignee',
        'carrier'               => 'carrier',
        'vessel'                => 'vessel',
        'voyage'                => 'voyage',
        'loadingPort'           => 'loading_port',
        'dischargePort'         => 'discharge_port',
        'containerTypeInfoList' => 'container_type_info_list',
        'customsClearance'      => 'customs_clearance',
        'cyClosing'             => 'cy_closing',
        'siClosing'             => 'si_closing',
        'etd'                   => 'etd',
        'bkgTotalAmount'        => 'bkg_total_amount',
        'bkgAmount'             => 'bkg_amount',
        'portCharges'           => 'port_charges',
        'currency'              => 'currency',
        'status'                => 'status',
    ];

    public function validate()
    {
        Model::validateRequired('orderNo', $this->orderNo, true);
        Model::validateRequired('bookingNo', $this->bookingNo, true);
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
        if (null !== $this->bookingNo) {
            $res['booking_no'] = $this->bookingNo;
        }
        if (null !== $this->bkgNo) {
            $res['bkg_no'] = $this->bkgNo;
        }
        if (null !== $this->forwarderDid) {
            $res['forwarder_did'] = $this->forwarderDid;
        }
        if (null !== $this->consignee) {
            $res['consignee'] = $this->consignee;
        }
        if (null !== $this->carrier) {
            $res['carrier'] = $this->carrier;
        }
        if (null !== $this->vessel) {
            $res['vessel'] = $this->vessel;
        }
        if (null !== $this->voyage) {
            $res['voyage'] = $this->voyage;
        }
        if (null !== $this->loadingPort) {
            $res['loading_port'] = $this->loadingPort;
        }
        if (null !== $this->dischargePort) {
            $res['discharge_port'] = $this->dischargePort;
        }
        if (null !== $this->containerTypeInfoList) {
            $res['container_type_info_list'] = [];
            if (null !== $this->containerTypeInfoList && \is_array($this->containerTypeInfoList)) {
                $n = 0;
                foreach ($this->containerTypeInfoList as $item) {
                    $res['container_type_info_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->customsClearance) {
            $res['customs_clearance'] = $this->customsClearance;
        }
        if (null !== $this->cyClosing) {
            $res['cy_closing'] = $this->cyClosing;
        }
        if (null !== $this->siClosing) {
            $res['si_closing'] = $this->siClosing;
        }
        if (null !== $this->etd) {
            $res['etd'] = $this->etd;
        }
        if (null !== $this->bkgTotalAmount) {
            $res['bkg_total_amount'] = $this->bkgTotalAmount;
        }
        if (null !== $this->bkgAmount) {
            $res['bkg_amount'] = $this->bkgAmount;
        }
        if (null !== $this->portCharges) {
            $res['port_charges'] = $this->portCharges;
        }
        if (null !== $this->currency) {
            $res['currency'] = $this->currency;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SaveBiznewBookingRequest
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
        if (isset($map['booking_no'])) {
            $model->bookingNo = $map['booking_no'];
        }
        if (isset($map['bkg_no'])) {
            $model->bkgNo = $map['bkg_no'];
        }
        if (isset($map['forwarder_did'])) {
            $model->forwarderDid = $map['forwarder_did'];
        }
        if (isset($map['consignee'])) {
            $model->consignee = $map['consignee'];
        }
        if (isset($map['carrier'])) {
            $model->carrier = $map['carrier'];
        }
        if (isset($map['vessel'])) {
            $model->vessel = $map['vessel'];
        }
        if (isset($map['voyage'])) {
            $model->voyage = $map['voyage'];
        }
        if (isset($map['loading_port'])) {
            $model->loadingPort = $map['loading_port'];
        }
        if (isset($map['discharge_port'])) {
            $model->dischargePort = $map['discharge_port'];
        }
        if (isset($map['container_type_info_list'])) {
            if (!empty($map['container_type_info_list'])) {
                $model->containerTypeInfoList = [];
                $n                            = 0;
                foreach ($map['container_type_info_list'] as $item) {
                    $model->containerTypeInfoList[$n++] = null !== $item ? ContainerTypeInfo::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['customs_clearance'])) {
            $model->customsClearance = $map['customs_clearance'];
        }
        if (isset($map['cy_closing'])) {
            $model->cyClosing = $map['cy_closing'];
        }
        if (isset($map['si_closing'])) {
            $model->siClosing = $map['si_closing'];
        }
        if (isset($map['etd'])) {
            $model->etd = $map['etd'];
        }
        if (isset($map['bkg_total_amount'])) {
            $model->bkgTotalAmount = $map['bkg_total_amount'];
        }
        if (isset($map['bkg_amount'])) {
            $model->bkgAmount = $map['bkg_amount'];
        }
        if (isset($map['port_charges'])) {
            $model->portCharges = $map['port_charges'];
        }
        if (isset($map['currency'])) {
            $model->currency = $map['currency'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }

        return $model;
    }
}
