<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\DEMO\Models;

use AlibabaCloud\Tea\Model;

class QueryDevelopTestUseRequest extends Model
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

    // 入参1
    /**
     * @var string
     */
    public $stringparameter;

    // 数字入参
    /**
     * @var int
     */
    public $numberparameter;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'stringparameter'   => 'stringparameter',
        'numberparameter'   => 'numberparameter',
    ];

    public function validate()
    {
        Model::validateRequired('stringparameter', $this->stringparameter, true);
        Model::validateRequired('numberparameter', $this->numberparameter, true);
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
        if (null !== $this->stringparameter) {
            $res['stringparameter'] = $this->stringparameter;
        }
        if (null !== $this->numberparameter) {
            $res['numberparameter'] = $this->numberparameter;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryDevelopTestUseRequest
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
        if (isset($map['stringparameter'])) {
            $model->stringparameter = $map['stringparameter'];
        }
        if (isset($map['numberparameter'])) {
            $model->numberparameter = $map['numberparameter'];
        }

        return $model;
    }
}
