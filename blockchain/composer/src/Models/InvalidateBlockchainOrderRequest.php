<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class InvalidateBlockchainOrderRequest extends Model
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

    // 参数
    /**
     * @var string
     */
    public $data;

    // 区域信息
    /**
     * @var string
     */
    public $regionId;

    // 用户请求信息
    /**
     * @var string
     */
    public $userRequestId;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'data'              => 'data',
        'regionId'          => 'region_id',
        'userRequestId'     => 'user_request_id',
    ];

    public function validate()
    {
        Model::validateRequired('data', $this->data, true);
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
        if (null !== $this->data) {
            $res['data'] = $this->data;
        }
        if (null !== $this->regionId) {
            $res['region_id'] = $this->regionId;
        }
        if (null !== $this->userRequestId) {
            $res['user_request_id'] = $this->userRequestId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return InvalidateBlockchainOrderRequest
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
        if (isset($map['data'])) {
            $model->data = $map['data'];
        }
        if (isset($map['region_id'])) {
            $model->regionId = $map['region_id'];
        }
        if (isset($map['user_request_id'])) {
            $model->userRequestId = $map['user_request_id'];
        }

        return $model;
    }
}
