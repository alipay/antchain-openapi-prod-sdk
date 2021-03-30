<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\SHUZIWULIU\Models;

use AlibabaCloud\Tea\Model;

class SaveBiznewMasterRequest extends Model
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

    // master提单号或House提单号
    /**
     * @var string
     */
    public $masterBlNo;

    // 提单类型  master/house
    //
    //
    /**
     * @var string
     */
    public $type;

    // 提单签发单位 [业务必填]
    //
    //
    /**
     * @var string
     */
    public $signUnitName;

    // 货代did
    /**
     * @var string
     */
    public $forwarderDid;

    // 发货人 [业务必填]
    /**
     * @var string
     */
    public $shipper;

    // 出口人 [业务必填]
    //
    //
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

    // 目的地 [业务必填]
    /**
     * @var string
     */
    public $deliveryPlace;

    // 开船时间 (秒时间戳)
    /**
     * @var int
     */
    public $onBoardDate;

    // 船状态 ATA （已到港） ，ATD （已离港 ），UNATD （未离港）
    /**
     * @var string
     */
    public $onBoardStatus;

    // 订舱单号列表 [业务必填]
    /**
     * @var BookingNoInfo[]
     */
    public $bookingInfoList;

    // 集装箱信息 [业务必填]
    /**
     * @var ContainerInfo[]
     */
    public $containerInfoList;

    // 货物列表
    //
    //
    /**
     * @var GoodsInfo[]
     */
    public $goodsInfoList;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'orderNo'           => 'order_no',
        'masterBlNo'        => 'master_bl_no',
        'type'              => 'type',
        'signUnitName'      => 'sign_unit_name',
        'forwarderDid'      => 'forwarder_did',
        'shipper'           => 'shipper',
        'consignee'         => 'consignee',
        'carrier'           => 'carrier',
        'vessel'            => 'vessel',
        'voyage'            => 'voyage',
        'loadingPort'       => 'loading_port',
        'dischargePort'     => 'discharge_port',
        'deliveryPlace'     => 'delivery_place',
        'onBoardDate'       => 'on_board_date',
        'onBoardStatus'     => 'on_board_status',
        'bookingInfoList'   => 'booking_info_list',
        'containerInfoList' => 'container_info_list',
        'goodsInfoList'     => 'goods_info_list',
    ];

    public function validate()
    {
        Model::validateRequired('orderNo', $this->orderNo, true);
        Model::validateRequired('masterBlNo', $this->masterBlNo, true);
        Model::validateRequired('type', $this->type, true);
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
        if (null !== $this->masterBlNo) {
            $res['master_bl_no'] = $this->masterBlNo;
        }
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }
        if (null !== $this->signUnitName) {
            $res['sign_unit_name'] = $this->signUnitName;
        }
        if (null !== $this->forwarderDid) {
            $res['forwarder_did'] = $this->forwarderDid;
        }
        if (null !== $this->shipper) {
            $res['shipper'] = $this->shipper;
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
        if (null !== $this->deliveryPlace) {
            $res['delivery_place'] = $this->deliveryPlace;
        }
        if (null !== $this->onBoardDate) {
            $res['on_board_date'] = $this->onBoardDate;
        }
        if (null !== $this->onBoardStatus) {
            $res['on_board_status'] = $this->onBoardStatus;
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
        if (null !== $this->containerInfoList) {
            $res['container_info_list'] = [];
            if (null !== $this->containerInfoList && \is_array($this->containerInfoList)) {
                $n = 0;
                foreach ($this->containerInfoList as $item) {
                    $res['container_info_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->goodsInfoList) {
            $res['goods_info_list'] = [];
            if (null !== $this->goodsInfoList && \is_array($this->goodsInfoList)) {
                $n = 0;
                foreach ($this->goodsInfoList as $item) {
                    $res['goods_info_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SaveBiznewMasterRequest
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
        if (isset($map['master_bl_no'])) {
            $model->masterBlNo = $map['master_bl_no'];
        }
        if (isset($map['type'])) {
            $model->type = $map['type'];
        }
        if (isset($map['sign_unit_name'])) {
            $model->signUnitName = $map['sign_unit_name'];
        }
        if (isset($map['forwarder_did'])) {
            $model->forwarderDid = $map['forwarder_did'];
        }
        if (isset($map['shipper'])) {
            $model->shipper = $map['shipper'];
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
        if (isset($map['delivery_place'])) {
            $model->deliveryPlace = $map['delivery_place'];
        }
        if (isset($map['on_board_date'])) {
            $model->onBoardDate = $map['on_board_date'];
        }
        if (isset($map['on_board_status'])) {
            $model->onBoardStatus = $map['on_board_status'];
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
        if (isset($map['container_info_list'])) {
            if (!empty($map['container_info_list'])) {
                $model->containerInfoList = [];
                $n                        = 0;
                foreach ($map['container_info_list'] as $item) {
                    $model->containerInfoList[$n++] = null !== $item ? ContainerInfo::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['goods_info_list'])) {
            if (!empty($map['goods_info_list'])) {
                $model->goodsInfoList = [];
                $n                    = 0;
                foreach ($map['goods_info_list'] as $item) {
                    $model->goodsInfoList[$n++] = null !== $item ? GoodsInfo::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
