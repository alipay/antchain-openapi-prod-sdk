<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class CancelIotlinkAppreleasedeviceRequest extends Model
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

    // 设备升级任务唯一id列表
    /**
     * @var string[]
     */
    public $orderDetailIdList;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'orderDetailIdList' => 'order_detail_id_list',
    ];

    public function validate()
    {
        Model::validateRequired('orderDetailIdList', $this->orderDetailIdList, true);
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
        if (null !== $this->orderDetailIdList) {
            $res['order_detail_id_list'] = $this->orderDetailIdList;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CancelIotlinkAppreleasedeviceRequest
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
        if (isset($map['order_detail_id_list'])) {
            if (!empty($map['order_detail_id_list'])) {
                $model->orderDetailIdList = $map['order_detail_id_list'];
            }
        }

        return $model;
    }
}
