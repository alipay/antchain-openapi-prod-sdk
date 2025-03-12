<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ATO\Models;

use AlibabaCloud\Tea\Model;

class QueryFundCreditauthRequest extends Model
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

    // 资方社会引用代码
    /**
     * @var string
     */
    public $fundId;

    // 授权id
    /**
     * @var string
     */
    public $authId;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'fundId'            => 'fund_id',
        'authId'            => 'auth_id',
    ];

    public function validate()
    {
        Model::validateRequired('fundId', $this->fundId, true);
        Model::validateRequired('authId', $this->authId, true);
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
        if (null !== $this->fundId) {
            $res['fund_id'] = $this->fundId;
        }
        if (null !== $this->authId) {
            $res['auth_id'] = $this->authId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryFundCreditauthRequest
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
        if (isset($map['fund_id'])) {
            $model->fundId = $map['fund_id'];
        }
        if (isset($map['auth_id'])) {
            $model->authId = $map['auth_id'];
        }

        return $model;
    }
}
