<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BAASDT\Models;

use AlibabaCloud\Tea\Model;

class UpdateConsumecardRiskcontrolRequest extends Model
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

    // 是否加值(false为减)
    /**
     * @var bool
     */
    public $add;

    // 调整金额(元)
    /**
     * @var string
     */
    public $amount;

    // 请求参数
    /**
     * @var BaseRequest
     */
    public $baseRequest;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'add'               => 'add',
        'amount'            => 'amount',
        'baseRequest'       => 'base_request',
    ];

    public function validate()
    {
        Model::validateRequired('add', $this->add, true);
        Model::validateRequired('amount', $this->amount, true);
        Model::validateRequired('baseRequest', $this->baseRequest, true);
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
        if (null !== $this->add) {
            $res['add'] = $this->add;
        }
        if (null !== $this->amount) {
            $res['amount'] = $this->amount;
        }
        if (null !== $this->baseRequest) {
            $res['base_request'] = null !== $this->baseRequest ? $this->baseRequest->toMap() : null;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return UpdateConsumecardRiskcontrolRequest
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
        if (isset($map['add'])) {
            $model->add = $map['add'];
        }
        if (isset($map['amount'])) {
            $model->amount = $map['amount'];
        }
        if (isset($map['base_request'])) {
            $model->baseRequest = BaseRequest::fromMap($map['base_request']);
        }

        return $model;
    }
}
