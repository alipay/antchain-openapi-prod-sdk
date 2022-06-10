<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BBP\Models;

use AlibabaCloud\Tea\Model;

class QueryInsuranceRequest extends Model
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

    // 保司编码
    /**
     * @var string
     */
    public $mechanismCode;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'mechanismCode'     => 'mechanism_code',
    ];

    public function validate()
    {
        Model::validateRequired('mechanismCode', $this->mechanismCode, true);
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
        if (null !== $this->mechanismCode) {
            $res['mechanism_code'] = $this->mechanismCode;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryInsuranceRequest
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
        if (isset($map['mechanism_code'])) {
            $model->mechanismCode = $map['mechanism_code'];
        }

        return $model;
    }
}
