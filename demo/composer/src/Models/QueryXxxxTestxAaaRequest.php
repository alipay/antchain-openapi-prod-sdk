<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\DEMO\Models;

use AlibabaCloud\Tea\Model;

class QueryXxxxTestxAaaRequest extends Model
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

    // 1
    /**
     * @var string
     */
    public $xvalue;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'xvalue'            => 'xvalue',
    ];

    public function validate()
    {
        Model::validateRequired('xvalue', $this->xvalue, true);
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
        if (null !== $this->xvalue) {
            $res['xvalue'] = $this->xvalue;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryXxxxTestxAaaRequest
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
        if (isset($map['xvalue'])) {
            $model->xvalue = $map['xvalue'];
        }

        return $model;
    }
}
