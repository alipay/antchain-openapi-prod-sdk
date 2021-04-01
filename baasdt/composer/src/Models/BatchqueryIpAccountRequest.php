<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BAASDT\Models;

use AlibabaCloud\Tea\Model;

class BatchqueryIpAccountRequest extends Model
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

    // 基础参数
    //
    /**
     * @var BaseRequestInfo
     */
    public $baseRequest;

    // 账户Id列表(单次不能超过50个)
    /**
     * @var string[]
     */
    public $accountIds;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'baseRequest'       => 'base_request',
        'accountIds'        => 'account_ids',
    ];

    public function validate()
    {
        Model::validateRequired('baseRequest', $this->baseRequest, true);
        Model::validateRequired('accountIds', $this->accountIds, true);
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
        if (null !== $this->accountIds) {
            $res['account_ids'] = $this->accountIds;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return BatchqueryIpAccountRequest
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
        if (isset($map['account_ids'])) {
            if (!empty($map['account_ids'])) {
                $model->accountIds = $map['account_ids'];
            }
        }

        return $model;
    }
}
