<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BAASDIGITAL\Models;

use AlibabaCloud\Tea\Model;

class ExecMultiIssueRequest extends Model
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

    // 链id
    /**
     * @var string
     */
    public $bizid;

    // 数字权证项目ID
    /**
     * @var string
     */
    public $projectId;

    // 业务方请求唯一标识，可用于异步查询交易情况
    /**
     * @var string
     */
    public $traceId;

    // 发行批次ID，线下生成，保证唯一，asset_id长度限制为64，只支持英文字符和数字
    /**
     * @var string
     */
    public $assetId;

    // 数字权证标准URI协议文件，权证信息。
    // 首次发行时必填，后续发行(增发)时可不用输入
    /**
     * @var string
     */
    public $assetUri;

    // 该批次权证发行的目标账户
    /**
     * @var string
     */
    public $toAccount;

    // 该批次中包含的资产个数
    /**
     * @var int
     */
    public $amount;

    // 预留
    /**
     * @var string
     */
    public $data;

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
        'assetId'           => 'asset_id',
        'assetUri'          => 'asset_uri',
        'toAccount'         => 'to_account',
        'amount'            => 'amount',
        'data'              => 'data',
        'accountInfo'       => 'account_info',
    ];

    public function validate()
    {
        Model::validateRequired('bizid', $this->bizid, true);
        Model::validateRequired('projectId', $this->projectId, true);
        Model::validateRequired('traceId', $this->traceId, true);
        Model::validateRequired('assetId', $this->assetId, true);
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
        if (null !== $this->assetId) {
            $res['asset_id'] = $this->assetId;
        }
        if (null !== $this->assetUri) {
            $res['asset_uri'] = $this->assetUri;
        }
        if (null !== $this->toAccount) {
            $res['to_account'] = $this->toAccount;
        }
        if (null !== $this->amount) {
            $res['amount'] = $this->amount;
        }
        if (null !== $this->data) {
            $res['data'] = $this->data;
        }
        if (null !== $this->accountInfo) {
            $res['account_info'] = null !== $this->accountInfo ? $this->accountInfo->toMap() : null;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ExecMultiIssueRequest
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
        if (isset($map['asset_id'])) {
            $model->assetId = $map['asset_id'];
        }
        if (isset($map['asset_uri'])) {
            $model->assetUri = $map['asset_uri'];
        }
        if (isset($map['to_account'])) {
            $model->toAccount = $map['to_account'];
        }
        if (isset($map['amount'])) {
            $model->amount = $map['amount'];
        }
        if (isset($map['data'])) {
            $model->data = $map['data'];
        }
        if (isset($map['account_info'])) {
            $model->accountInfo = AccountInfo::fromMap($map['account_info']);
        }

        return $model;
    }
}
