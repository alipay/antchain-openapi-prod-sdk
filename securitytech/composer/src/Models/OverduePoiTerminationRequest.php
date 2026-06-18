<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\SECURITYTECH\Models;

use AlibabaCloud\Tea\Model;

class OverduePoiTerminationRequest extends Model
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

    // 分期主订单号
    /**
     * @var string
     */
    public $bizOrderNo;

    // 逾期事件类型
    /**
     * @var string
     */
    public $event;

    // 渠道Code
    /**
     * @var string
     */
    public $channelCode;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'openId'            => 'open_id',
        'storeId'           => 'store_id',
        'bizOrderNo'        => 'biz_order_no',
        'event'             => 'event',
        'channelCode'       => 'channel_code',
    ];

    public function validate()
    {
        Model::validateRequired('openId', $this->openId, true);
        Model::validateRequired('storeId', $this->storeId, true);
        Model::validateRequired('bizOrderNo', $this->bizOrderNo, true);
        Model::validateRequired('event', $this->event, true);
        Model::validateRequired('channelCode', $this->channelCode, true);
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
        if (null !== $this->channelCode) {
            $res['channel_code'] = $this->channelCode;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return OverduePoiTerminationRequest
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
        if (isset($map['channel_code'])) {
            $model->channelCode = $map['channel_code'];
        }

        return $model;
    }
}
