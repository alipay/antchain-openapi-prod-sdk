<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\GESAAS_SPI\Models;

use AlibabaCloud\Tea\Model;

class PushRightsprodGrantrightsResponse extends Model
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

    // 发放状态：
    // GRANTING：发放处理中 GRANT_SUCCESS：发放成功 GRANT_FAIL：发放失败
    /**
     * @var string
     */
    public $grantStatus;

    // 过期时间
    /**
     * @var string
     */
    public $expireTime;

    // 生效时间
    /**
     * @var string
     */
    public $effectTime;

    // 发放订单明细数据
    /**
     * @var GrantOrderDetail[]
     */
    public $orderDetails;
    protected $_name = [
        'reqMsgId'     => 'req_msg_id',
        'resultCode'   => 'result_code',
        'resultMsg'    => 'result_msg',
        'grantStatus'  => 'grant_status',
        'expireTime'   => 'expire_time',
        'effectTime'   => 'effect_time',
        'orderDetails' => 'order_details',
    ];

    public function validate()
    {
        Model::validatePattern('expireTime', $this->expireTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
        Model::validatePattern('effectTime', $this->effectTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
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
        if (null !== $this->grantStatus) {
            $res['grant_status'] = $this->grantStatus;
        }
        if (null !== $this->expireTime) {
            $res['expire_time'] = $this->expireTime;
        }
        if (null !== $this->effectTime) {
            $res['effect_time'] = $this->effectTime;
        }
        if (null !== $this->orderDetails) {
            $res['order_details'] = [];
            if (null !== $this->orderDetails && \is_array($this->orderDetails)) {
                $n = 0;
                foreach ($this->orderDetails as $item) {
                    $res['order_details'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return PushRightsprodGrantrightsResponse
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
        if (isset($map['grant_status'])) {
            $model->grantStatus = $map['grant_status'];
        }
        if (isset($map['expire_time'])) {
            $model->expireTime = $map['expire_time'];
        }
        if (isset($map['effect_time'])) {
            $model->effectTime = $map['effect_time'];
        }
        if (isset($map['order_details'])) {
            if (!empty($map['order_details'])) {
                $model->orderDetails = [];
                $n                   = 0;
                foreach ($map['order_details'] as $item) {
                    $model->orderDetails[$n++] = null !== $item ? GrantOrderDetail::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
