<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

use AntChain\BOT\Models\DeviceLocator;
use AntChain\BOT\Models\IotxOtaTaskPermanentCancelItem;

class ExecElectrocarOtataskpermanentcancelRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'deviceLocator' => 'device_locator',
        'cancelSource' => 'cancel_source',
        'cancelReason' => 'cancel_reason',
        'items' => 'items',
    ];
    public function validate() {
        Model::validateRequired('deviceLocator', $this->deviceLocator, true);
        Model::validateRequired('cancelSource', $this->cancelSource, true);
        Model::validateRequired('items', $this->items, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->deviceLocator) {
            $res['device_locator'] = null !== $this->deviceLocator ? $this->deviceLocator->toMap() : null;
        }
        if (null !== $this->cancelSource) {
            $res['cancel_source'] = $this->cancelSource;
        }
        if (null !== $this->cancelReason) {
            $res['cancel_reason'] = $this->cancelReason;
        }
        if (null !== $this->items) {
            $res['items'] = [];
            if(null !== $this->items && is_array($this->items)){
                $n = 0;
                foreach($this->items as $item){
                    $res['items'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        return $res;
    }
    /**
     * @param array $map
     * @return ExecElectrocarOtataskpermanentcancelRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['product_instance_id'])){
            $model->productInstanceId = $map['product_instance_id'];
        }
        if(isset($map['device_locator'])){
            $model->deviceLocator = DeviceLocator::fromMap($map['device_locator']);
        }
        if(isset($map['cancel_source'])){
            $model->cancelSource = $map['cancel_source'];
        }
        if(isset($map['cancel_reason'])){
            $model->cancelReason = $map['cancel_reason'];
        }
        if(isset($map['items'])){
            if(!empty($map['items'])){
                $model->items = [];
                $n = 0;
                foreach($map['items'] as $item) {
                    $model->items[$n++] = null !== $item ? IotxOtaTaskPermanentCancelItem::fromMap($item) : $item;
                }
            }
        }
        return $model;
    }
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    /**
     * @var string
     */
    public $productInstanceId;

    // 设备定位信息
    /**
     * @var DeviceLocator
     */
    public $deviceLocator;

    // 取消来源：APP_USER - 用户选择不再提示该版本 / VENDOR - 厂家后台取消 / ADMIN - 管理员取消
    /**
     * @var string
     */
    public $cancelSource;

    // 取消原因
    /**
     * @var string
     */
    public $cancelReason;

    // 待永久取消的固件任务列表
    /**
     * @var IotxOtaTaskPermanentCancelItem[]
     */
    public $items;

}
