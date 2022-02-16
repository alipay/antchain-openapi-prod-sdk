<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\SAAS\Models;

use AlibabaCloud\Tea\Model;

class QueryMarketSolutionRequest extends Model
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

    // 解决方案code
    /**
     * @var string
     */
    public $solutionCode;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'solutionCode'      => 'solution_code',
    ];

    public function validate()
    {
        Model::validateRequired('solutionCode', $this->solutionCode, true);
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
        if (null !== $this->solutionCode) {
            $res['solution_code'] = $this->solutionCode;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryMarketSolutionRequest
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
        if (isset($map['solution_code'])) {
            $model->solutionCode = $map['solution_code'];
        }

        return $model;
    }
}
