<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\COLLABINV\Models;

use AlibabaCloud\Tea\Model;

class QueryCarloanYztRequest extends Model
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

    // 车牌号
    /**
     * @var string
     */
    public $plateNo;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'plateNo'           => 'plate_no',
    ];

    public function validate()
    {
        Model::validateRequired('plateNo', $this->plateNo, true);
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
        if (null !== $this->plateNo) {
            $res['plate_no'] = $this->plateNo;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryCarloanYztRequest
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
        if (isset($map['plate_no'])) {
            $model->plateNo = $map['plate_no'];
        }

        return $model;
    }
}
