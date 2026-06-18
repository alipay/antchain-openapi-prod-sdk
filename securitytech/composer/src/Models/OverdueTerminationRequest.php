<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\SECURITYTECH\Models;

use AlibabaCloud\Tea\Model;

class OverdueTerminationRequest extends Model
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

    // 支付宝小程序用户唯一ID
    /**
     * @var string
     */
    public $openId;

    // 门店ID
    /**
     * @var string
     */
    public $storeId;

    // 天枢分期主订单号
    /**
     * @var string
     */
    public $bizOrderNo;

    // OVERDUE_ING	逾期中
    // OVERDUE_RECOVER	逾期恢复
    // OVERDUE_FREEZE	逾期冻结
    // OVERDUE_FREEZE_RECOVER	逾期冻结恢复
    // OVERDUE_TERMINATE_ING	逾期解约中
    // TERMINATED	解约完成
    /**
     * @var string
     */
    public $event;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'openId'            => 'open_id',
        'storeId'           => 'store_id',
        'bizOrderNo'        => 'biz_order_no',
        'event'             => 'event',
    ];

    public function validate()
    {
        Model::validateRequired('openId', $this->openId, true);
        Model::validateRequired('storeId', $this->storeId, true);
        Model::validateRequired('bizOrderNo', $this->bizOrderNo, true);
        Model::validateRequired('event', $this->event, true);
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
        if (null !== $this->openId) {
            $res['open_id'] = $this->openId;
        }
        if (null !== $this->storeId) {
            $res['store_id'] = $this->storeId;
        }
        if (null !== $this->bizOrderNo) {
            $res['biz_order_no'] = $this->bizOrderNo;
        }
        if (null !== $this->event) {
            $res['event'] = $this->event;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return OverdueTerminationRequest
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
        if (isset($map['open_id'])) {
            $model->openId = $map['open_id'];
        }
        if (isset($map['store_id'])) {
            $model->storeId = $map['store_id'];
        }
        if (isset($map['biz_order_no'])) {
            $model->bizOrderNo = $map['biz_order_no'];
        }
        if (isset($map['event'])) {
            $model->event = $map['event'];
        }

        return $model;
    }
}
