<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BAASDIGITAL\Models;

use AlibabaCloud\Tea\Model;

class ExecContractBatchissueRequest extends Model
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

    // 链ID
    /**
     * @var string
     */
    public $bizid;

    // 数字权证项目ID
    /**
     * @var string
     */
    public $projectId;

    // 业务方请求唯一标识，用于异步查询交易情况
    /**
     * @var string
     */
    public $traceId;

    // 权证发行的目标账户
    /**
     * @var string
     */
    public $toAccount;

    // 批量发行个数，单次最多发行20个，建议多次分批执行
    /**
     * @var int
     */
    public $amount;

    // 托管账户信息(推荐)，托管和非拖管必选一种
    /**
     * @var AccountInfo
     */
    public $accountInfo;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'bizid'             => 'bizid',
        'projectId'         => 'project_id',
        'traceId'           => 'trace_id',
        'toAccount'         => 'to_account',
        'amount'            => 'amount',
        'accountInfo'       => 'account_info',
    ];

    public function validate()
    {
        Model::validateRequired('bizid', $this->bizid, true);
        Model::validateRequired('projectId', $this->projectId, true);
        Model::validateRequired('traceId', $this->traceId, true);
        Model::validateRequired('toAccount', $this->toAccount, true);
        Model::validateRequired('amount', $this->amount, true);
        Model::validateRequired('accountInfo', $this->accountInfo, true);
        Model::validateMinimum('amount', $this->amount, 1);
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
        if (null !== $this->bizid) {
            $res['bizid'] = $this->bizid;
        }
        if (null !== $this->projectId) {
            $res['project_id'] = $this->projectId;
        }
        if (null !== $this->traceId) {
            $res['trace_id'] = $this->traceId;
        }
        if (null !== $this->toAccount) {
            $res['to_account'] = $this->toAccount;
        }
        if (null !== $this->amount) {
            $res['amount'] = $this->amount;
        }
        if (null !== $this->accountInfo) {
            $res['account_info'] = null !== $this->accountInfo ? $this->accountInfo->toMap() : null;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ExecContractBatchissueRequest
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
        if (isset($map['bizid'])) {
            $model->bizid = $map['bizid'];
        }
        if (isset($map['project_id'])) {
            $model->projectId = $map['project_id'];
        }
        if (isset($map['trace_id'])) {
            $model->traceId = $map['trace_id'];
        }
        if (isset($map['to_account'])) {
            $model->toAccount = $map['to_account'];
        }
        if (isset($map['amount'])) {
            $model->amount = $map['amount'];
        }
        if (isset($map['account_info'])) {
            $model->accountInfo = AccountInfo::fromMap($map['account_info']);
        }

        return $model;
    }
}
