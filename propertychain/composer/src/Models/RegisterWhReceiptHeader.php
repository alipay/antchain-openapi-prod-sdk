<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\PROPERTYCHAIN\Models;

use AlibabaCloud\Tea\Model;

class RegisterWhReceiptHeader extends Model
{
    // 注册申请单ID
    /**
     * @example registerWhReceiptId
     *
     * @var string
     */
    public $registerWhReceiptId;

    // 注册仓单状态【 NONE：无效状态，WAITING：待审核，AGREED：审核同意，REJECTED：审核拒绝，CANCELED：已取消，WAITING_PRE_ALLOC_POSITION：待预分配仓位，WAITING_TRANSACTION_IN：待入库，TRANSACTION_IN：入库中，FINISHED_TRANSACTION_IN：已入库/待确认，CONFIRMED_TRANSACTION_IN：完成入库，INTERRUPTION：已中断，ALL：所有状态】
    /**
     * @example NONE
     *
     * @var string
     */
    public $status;

    // 入库中时的子状态，只有入库中才有值【ALLOCATED_LOCATION：已调用分配仓位信息接口，TRANSACTION_IN_INFO：已调用添加入库信息接口，LOCATION_INFO：已调用补充仓位占用信息接口】
    /**
     * @example ALLOCATED_LOCATION
     *
     * @var string
     */
    public $inStoringStatus;

    // 更新时间
    /**
     * @example 124134132411
     *
     * @var int
     */
    public $updateTime;
    protected $_name = [
        'registerWhReceiptId' => 'register_wh_receipt_id',
        'status'              => 'status',
        'inStoringStatus'     => 'in_storing_status',
        'updateTime'          => 'update_time',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->registerWhReceiptId) {
            $res['register_wh_receipt_id'] = $this->registerWhReceiptId;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->inStoringStatus) {
            $res['in_storing_status'] = $this->inStoringStatus;
        }
        if (null !== $this->updateTime) {
            $res['update_time'] = $this->updateTime;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return RegisterWhReceiptHeader
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['register_wh_receipt_id'])) {
            $model->registerWhReceiptId = $map['register_wh_receipt_id'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }
        if (isset($map['in_storing_status'])) {
            $model->inStoringStatus = $map['in_storing_status'];
        }
        if (isset($map['update_time'])) {
            $model->updateTime = $map['update_time'];
        }

        return $model;
    }
}
