<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\DEMO\Models;

use AlibabaCloud\Tea\Model;

class QueryAdAsdAsdRequest extends Model
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

    // 1111
    /**
     * @var string
     */
    public $bnumber;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'bnumber'           => 'bnumber',
    ];

    public function validate()
    {
        Model::validateRequired('bnumber', $this->bnumber, true);
        Model::validateMaxLength('bnumber', $this->bnumber, 2);
        Model::validateMinLength('bnumber', $this->bnumber, 1);
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
        if (null !== $this->bnumber) {
            $res['bnumber'] = $this->bnumber;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryAdAsdAsdRequest
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
        if (isset($map['bnumber'])) {
            $model->bnumber = $map['bnumber'];
        }

        return $model;
    }
}
