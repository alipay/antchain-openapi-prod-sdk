<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class GetDistributedeviceBychainidRequest extends Model
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

    // 发行设备Id
    /**
     * @var string[]
     */
    public $chainIdList;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'chainIdList'       => 'chain_id_list',
    ];

    public function validate()
    {
        Model::validateRequired('chainIdList', $this->chainIdList, true);
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
        if (null !== $this->chainIdList) {
            $res['chain_id_list'] = $this->chainIdList;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return GetDistributedeviceBychainidRequest
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
        if (isset($map['chain_id_list'])) {
            if (!empty($map['chain_id_list'])) {
                $model->chainIdList = $map['chain_id_list'];
            }
        }

        return $model;
    }
}
