<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\GESAAS\Models;

use AlibabaCloud\Tea\Model;

class RightsGrantResultVO extends Model
{
    // 过期时间
    /**
     * @example 2018-10-10T10:10:00Z
     *
     * @var string
     */
    public $expireTime;

    // 生效时间
    /**
     * @example
     *
     * @var string
     */
    public $effectTime;

    // 发放状态：
    // GRANTING：发放处理中 GRANT_SUCCESS：发放成功 GRANT_FAIL：发放失败
    /**
     * @example GRANTING
     *
     * @var string
     */
    public $grantStatus;

    // 订单详情列表
    /**
     * @example
     *
     * @var OrderDetail[]
     */
    public $orderDetails;
    protected $_name = [
        'expireTime'   => 'expire_time',
        'effectTime'   => 'effect_time',
        'grantStatus'  => 'grant_status',
        'orderDetails' => 'order_details',
    ];

    public function validate()
    {
        Model::validatePattern('expireTime', $this->expireTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
        Model::validatePattern('effectTime', $this->effectTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
        Model::validateRequired('grantStatus', $this->grantStatus, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->expireTime) {
            $res['expire_time'] = $this->expireTime;
        }
        if (null !== $this->effectTime) {
            $res['effect_time'] = $this->effectTime;
        }
        if (null !== $this->grantStatus) {
            $res['grant_status'] = $this->grantStatus;
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
     * @return RightsGrantResultVO
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['expire_time'])) {
            $model->expireTime = $map['expire_time'];
        }
        if (isset($map['effect_time'])) {
            $model->effectTime = $map['effect_time'];
        }
        if (isset($map['grant_status'])) {
            $model->grantStatus = $map['grant_status'];
        }
        if (isset($map['order_details'])) {
            if (!empty($map['order_details'])) {
                $model->orderDetails = [];
                $n                   = 0;
                foreach ($map['order_details'] as $item) {
                    $model->orderDetails[$n++] = null !== $item ? OrderDetail::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
