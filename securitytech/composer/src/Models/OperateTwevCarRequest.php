<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\SECURITYTECH\Models;

use AlibabaCloud\Tea\Model;

class OperateTwevCarRequest extends Model
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

    // 订单id（tuid+brandId与orderid条件必填。orderid为空时，tuid+brandId必填。orderId不为空时优先使用orderId）
    /**
     * @var string
     */
    public $orderId;

    // 车辆中控号 （tuid+brandId与orderid条件必填。orderid为空时，tuid+brandId必填。orderId不为空时优先使用orderId）
    /**
     * @var string
     */
    public $tuid;

    // 品牌id（tuid+brandId与orderid条件必填。orderid为空时，tuid+brandId必填。orderId不为空时优先使用orderId）
    /**
     * @var string
     */
    public $brandId;

    // 操作类型  设防：SET_DEFENSE/撤防：REMOVE_DEFENSE/远程启动：REMOTE_ON/远程熄火：REMOTE_OFF/超级锁车：SUPER_LOCK/超级解锁：SUPER_UNLOCK/寻车鸣笛：SEARCH_HORN/开坐桶锁：OPEN_SITTING_BUCKET
    /**
     * @var string
     */
    public $operateType;

    // 预留扩展字段 json
    /**
     * @var string
     */
    public $extraInfo;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'orderId'           => 'order_id',
        'tuid'              => 'tuid',
        'brandId'           => 'brand_id',
        'operateType'       => 'operate_type',
        'extraInfo'         => 'extra_info',
    ];

    public function validate()
    {
        Model::validateRequired('operateType', $this->operateType, true);
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
        if (null !== $this->tuid) {
            $res['tuid'] = $this->tuid;
        }
        if (null !== $this->brandId) {
            $res['brand_id'] = $this->brandId;
        }
        if (null !== $this->operateType) {
            $res['operate_type'] = $this->operateType;
        }
        if (null !== $this->extraInfo) {
            $res['extra_info'] = $this->extraInfo;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return OperateTwevCarRequest
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
        if (isset($map['tuid'])) {
            $model->tuid = $map['tuid'];
        }
        if (isset($map['brand_id'])) {
            $model->brandId = $map['brand_id'];
        }
        if (isset($map['operate_type'])) {
            $model->operateType = $map['operate_type'];
        }
        if (isset($map['extra_info'])) {
            $model->extraInfo = $map['extra_info'];
        }

        return $model;
    }
}
