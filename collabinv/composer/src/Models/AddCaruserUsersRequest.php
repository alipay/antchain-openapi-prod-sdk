<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\COLLABINV\Models;

use AlibabaCloud\Tea\Model;

class AddCaruserUsersRequest extends Model
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

    // 业务的id
    /**
     * @var string[]
     */
    public $businessId;

    // 数据的唯一code
    /**
     * @var string
     */
    public $dataUniqloCode;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'businessId'        => 'business_id',
        'dataUniqloCode'    => 'data_uniqlo_code',
    ];

    public function validate()
    {
        Model::validateRequired('businessId', $this->businessId, true);
        Model::validateRequired('dataUniqloCode', $this->dataUniqloCode, true);
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
        if (null !== $this->businessId) {
            $res['business_id'] = $this->businessId;
        }
        if (null !== $this->dataUniqloCode) {
            $res['data_uniqlo_code'] = $this->dataUniqloCode;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return AddCaruserUsersRequest
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
        if (isset($map['business_id'])) {
            if (!empty($map['business_id'])) {
                $model->businessId = $map['business_id'];
            }
        }
        if (isset($map['data_uniqlo_code'])) {
            $model->dataUniqloCode = $map['data_uniqlo_code'];
        }

        return $model;
    }
}
