<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_ba5301f7d07245d1bd01dc432d3de4b1\Models;

use AlibabaCloud\Tea\Model;

class OperateDemoSaasTestTesteRequest extends Model
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

    // test
    /**
     * @var string
     */
    public $age;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'age'               => 'age',
    ];

    public function validate()
    {
        Model::validateRequired('age', $this->age, true);
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
        if (null !== $this->age) {
            $res['age'] = $this->age;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return OperateDemoSaasTestTesteRequest
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
        if (isset($map['age'])) {
            $model->age = $map['age'];
        }

        return $model;
    }
}
