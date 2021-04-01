<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BAASDT\Models;

use AlibabaCloud\Tea\Model;

class CancelIpAuthtradebillRequest extends Model
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

    // 请求参数
    /**
     * @var BaseRequestInfo
     */
    public $baseRequest;

    // 授权模式销售数据的账单ID
    /**
     * @var string
     */
    public $ipBillId;

    // 买家的链上账户Id
    /**
     * @var string
     */
    public $accountId;

    // 备注信息
    /**
     * @var string
     */
    public $memo;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'baseRequest'       => 'base_request',
        'ipBillId'          => 'ip_bill_id',
        'accountId'         => 'account_id',
        'memo'              => 'memo',
    ];

    public function validate()
    {
        Model::validateRequired('baseRequest', $this->baseRequest, true);
        Model::validateRequired('ipBillId', $this->ipBillId, true);
        Model::validateRequired('accountId', $this->accountId, true);
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
        if (null !== $this->baseRequest) {
            $res['base_request'] = null !== $this->baseRequest ? $this->baseRequest->toMap() : null;
        }
        if (null !== $this->ipBillId) {
            $res['ip_bill_id'] = $this->ipBillId;
        }
        if (null !== $this->accountId) {
            $res['account_id'] = $this->accountId;
        }
        if (null !== $this->memo) {
            $res['memo'] = $this->memo;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CancelIpAuthtradebillRequest
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
        if (isset($map['base_request'])) {
            $model->baseRequest = BaseRequestInfo::fromMap($map['base_request']);
        }
        if (isset($map['ip_bill_id'])) {
            $model->ipBillId = $map['ip_bill_id'];
        }
        if (isset($map['account_id'])) {
            $model->accountId = $map['account_id'];
        }
        if (isset($map['memo'])) {
            $model->memo = $map['memo'];
        }

        return $model;
    }
}
