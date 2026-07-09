<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class ImportPurchaseorderThirdpartyResponse extends Model
{
    // 请求唯一ID，用于链路跟踪和问题排查
    /**
     * @var string
     */
    public $reqMsgId;

    // 结果码，一般OK表示调用成功
    /**
     * @var string
     */
    public $resultCode;

    // 异常信息的文本描述
    /**
     * @var string
     */
    public $resultMsg;

    // 采购平台-采购详情id
    /**
     * @var string
     */
    public $purchaseOrderId;

    // 当前状态
    // READY_DELIVER(0, "待发货"),
    // DELIVERED(1, "已发货"),
    // REFUSED(2, "已拒发"),
    // CANCELED(4, "已取消"),
    // REFUNDED(5, "已退货");
    //
    /**
     * @var string
     */
    public $status;

    // InsertPurchaseOrderFailInfo
    /**
     * @var InsertPurchaseOrderFailInfo
     */
    public $failMap;

    // 真实订单信息，成功不返回
    //
    /**
     * @var PurchaseOrderInfoDetail
     */
    public $purchaseOrderInfoDetail;

    // 幂等号
    /**
     * @var string
     */
    public $idempotId;
    protected $_name = [
        'reqMsgId'                => 'req_msg_id',
        'resultCode'              => 'result_code',
        'resultMsg'               => 'result_msg',
        'purchaseOrderId'         => 'purchase_order_id',
        'status'                  => 'status',
        'failMap'                 => 'fail_map',
        'purchaseOrderInfoDetail' => 'purchase_order_info_detail',
        'idempotId'               => 'idempot_id',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->reqMsgId) {
            $res['req_msg_id'] = $this->reqMsgId;
        }
        if (null !== $this->resultCode) {
            $res['result_code'] = $this->resultCode;
        }
        if (null !== $this->resultMsg) {
            $res['result_msg'] = $this->resultMsg;
        }
        if (null !== $this->purchaseOrderId) {
            $res['purchase_order_id'] = $this->purchaseOrderId;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->failMap) {
            $res['fail_map'] = null !== $this->failMap ? $this->failMap->toMap() : null;
        }
        if (null !== $this->purchaseOrderInfoDetail) {
            $res['purchase_order_info_detail'] = null !== $this->purchaseOrderInfoDetail ? $this->purchaseOrderInfoDetail->toMap() : null;
        }
        if (null !== $this->idempotId) {
            $res['idempot_id'] = $this->idempotId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ImportPurchaseorderThirdpartyResponse
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['req_msg_id'])) {
            $model->reqMsgId = $map['req_msg_id'];
        }
        if (isset($map['result_code'])) {
            $model->resultCode = $map['result_code'];
        }
        if (isset($map['result_msg'])) {
            $model->resultMsg = $map['result_msg'];
        }
        if (isset($map['purchase_order_id'])) {
            $model->purchaseOrderId = $map['purchase_order_id'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }
        if (isset($map['fail_map'])) {
            $model->failMap = InsertPurchaseOrderFailInfo::fromMap($map['fail_map']);
        }
        if (isset($map['purchase_order_info_detail'])) {
            $model->purchaseOrderInfoDetail = PurchaseOrderInfoDetail::fromMap($map['purchase_order_info_detail']);
        }
        if (isset($map['idempot_id'])) {
            $model->idempotId = $map['idempot_id'];
        }

        return $model;
    }
}
