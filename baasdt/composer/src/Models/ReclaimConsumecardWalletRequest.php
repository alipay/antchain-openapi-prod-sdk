<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BAASDT\Models;

use AlibabaCloud\Tea\Model;

class ReclaimConsumecardWalletRequest extends Model
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

    // 回退金额(元)
    /**
     * @var string
     */
    public $amount;

    // 请求参数
    /**
     * @var BaseRequest
     */
    public $baseRequest;

    // 角色(1 机构, 2 个人)
    /**
     * @var int
     */
    public $roleType;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'amount'            => 'amount',
        'baseRequest'       => 'base_request',
        'roleType'          => 'role_type',
    ];

    public function validate()
    {
        Model::validateRequired('amount', $this->amount, true);
        Model::validateRequired('baseRequest', $this->baseRequest, true);
        Model::validateRequired('roleType', $this->roleType, true);
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
        if (null !== $this->amount) {
            $res['amount'] = $this->amount;
        }
        if (null !== $this->baseRequest) {
            $res['base_request'] = null !== $this->baseRequest ? $this->baseRequest->toMap() : null;
        }
        if (null !== $this->roleType) {
            $res['role_type'] = $this->roleType;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ReclaimConsumecardWalletRequest
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
        if (isset($map['amount'])) {
            $model->amount = $map['amount'];
        }
        if (isset($map['base_request'])) {
            $model->baseRequest = BaseRequest::fromMap($map['base_request']);
        }
        if (isset($map['role_type'])) {
            $model->roleType = $map['role_type'];
        }

        return $model;
    }
}
