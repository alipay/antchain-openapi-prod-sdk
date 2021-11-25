<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ACC\Models;

use AlibabaCloud\Tea\Model;

class QueryContractSignfieldsRequest extends Model
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

    // 账号id，默认所有签署人
    /**
     * @var string
     */
    public $accountId;

    // 流程id
    /**
     * @var string
     */
    public $flowId;

    // 指定签署区id列表，逗号分割，默认所有签署区
    /**
     * @var string
     */
    public $signfieldIds;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'accountId'         => 'account_id',
        'flowId'            => 'flow_id',
        'signfieldIds'      => 'signfield_ids',
    ];

    public function validate()
    {
        Model::validateRequired('flowId', $this->flowId, true);
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
        if (null !== $this->accountId) {
            $res['account_id'] = $this->accountId;
        }
        if (null !== $this->flowId) {
            $res['flow_id'] = $this->flowId;
        }
        if (null !== $this->signfieldIds) {
            $res['signfield_ids'] = $this->signfieldIds;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryContractSignfieldsRequest
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
        if (isset($map['account_id'])) {
            $model->accountId = $map['account_id'];
        }
        if (isset($map['flow_id'])) {
            $model->flowId = $map['flow_id'];
        }
        if (isset($map['signfield_ids'])) {
            $model->signfieldIds = $map['signfield_ids'];
        }

        return $model;
    }
}
