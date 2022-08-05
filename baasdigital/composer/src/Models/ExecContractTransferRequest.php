<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BAASDIGITAL\Models;

use AlibabaCloud\Tea\Model;

class ExecContractTransferRequest extends Model
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

    // 权证所有者账户
    /**
     * @var string
     */
    public $from;

    // 转移的目标账户
    /**
     * @var string
     */
    public $to;

    // 转移的目标权证
    /**
     * @var string
     */
    public $assetId;

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
        'from'              => 'from',
        'to'                => 'to',
        'assetId'           => 'asset_id',
        'accountInfo'       => 'account_info',
    ];

    public function validate()
    {
        Model::validateRequired('bizid', $this->bizid, true);
        Model::validateRequired('projectId', $this->projectId, true);
        Model::validateRequired('traceId', $this->traceId, true);
        Model::validateRequired('from', $this->from, true);
        Model::validateRequired('to', $this->to, true);
        Model::validateRequired('assetId', $this->assetId, true);
        Model::validateRequired('accountInfo', $this->accountInfo, true);
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
        if (null !== $this->from) {
            $res['from'] = $this->from;
        }
        if (null !== $this->to) {
            $res['to'] = $this->to;
        }
        if (null !== $this->assetId) {
            $res['asset_id'] = $this->assetId;
        }
        if (null !== $this->accountInfo) {
            $res['account_info'] = null !== $this->accountInfo ? $this->accountInfo->toMap() : null;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ExecContractTransferRequest
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
        if (isset($map['from'])) {
            $model->from = $map['from'];
        }
        if (isset($map['to'])) {
            $model->to = $map['to'];
        }
        if (isset($map['asset_id'])) {
            $model->assetId = $map['asset_id'];
        }
        if (isset($map['account_info'])) {
            $model->accountInfo = AccountInfo::fromMap($map['account_info']);
        }

        return $model;
    }
}
