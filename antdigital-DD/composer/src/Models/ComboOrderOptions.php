<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\DD\Models;

use AlibabaCloud\Tea\Model;

class ComboOrderOptions extends Model {
    protected $_name = [
        'confirmOrdered' => 'confirm_ordered',
        'autoCancelComboOrder' => 'auto_cancel_combo_order',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->confirmOrdered) {
            $res['confirm_ordered'] = $this->confirmOrdered;
        }
        if (null !== $this->autoCancelComboOrder) {
            $res['auto_cancel_combo_order'] = $this->autoCancelComboOrder;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return ComboOrderOptions
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['confirm_ordered'])){
            $model->confirmOrdered = $map['confirm_ordered'];
        }
        if(isset($map['auto_cancel_combo_order'])){
            $model->autoCancelComboOrder = $map['auto_cancel_combo_order'];
        }
        return $model;
    }
    // 是否确认下单，默认false。true：订单状态会从待确认扭转已下单，可直接发起支付。false：不可直接发起支付，需确认后才可发起支付
    /**
     * @example false
     * @var bool
     */
    public $confirmOrdered;

    // 创建订单后未发起支付前是否自动取消订单。false：不会自动取消订单。true：兜底60分钟后自动取消订单
    /**
     * @example true
     * @var bool
     */
    public $autoCancelComboOrder;

}
