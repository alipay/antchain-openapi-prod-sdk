<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class GetDistributedeviceBydisidRequest extends Model
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

    // 发行设备id列表
    /**
     * @var string[]
     */
    public $distributeDeviceIdList;
    protected $_name = [
        'authToken'              => 'auth_token',
        'productInstanceId'      => 'product_instance_id',
        'distributeDeviceIdList' => 'distribute_device_id_list',
    ];

    public function validate()
    {
        Model::validateRequired('distributeDeviceIdList', $this->distributeDeviceIdList, true);
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
        if (null !== $this->distributeDeviceIdList) {
            $res['distribute_device_id_list'] = $this->distributeDeviceIdList;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return GetDistributedeviceBydisidRequest
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
        if (isset($map['distribute_device_id_list'])) {
            if (!empty($map['distribute_device_id_list'])) {
                $model->distributeDeviceIdList = $map['distribute_device_id_list'];
            }
        }

        return $model;
    }
}
