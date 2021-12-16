<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\COMMERCIAL\Models;

use AlibabaCloud\Tea\Model;

class QueryBillingcoreSpbillRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 账单id
    /**
     * @var string
     */
    public $billId;
    protected $_name = [
        'authToken' => 'auth_token',
        'billId'    => 'bill_id',
    ];

    public function validate()
    {
        Model::validateRequired('billId', $this->billId, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->billId) {
            $res['bill_id'] = $this->billId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryBillingcoreSpbillRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['bill_id'])) {
            $model->billId = $map['bill_id'];
        }

        return $model;
    }
}
