<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BAASDIGITAL\Models;

use AlibabaCloud\Tea\Model;

class ExecContractListissueRequest extends Model
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

    // 批量发行的资产id列表，单次最多发20个，asset_id长度限制为64，只支持英文字符和数字
    /**
     * @var string[]
     */
    public $assetList;

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
        'assetList'         => 'asset_list',
        'accountInfo'       => 'account_info',
    ];

    public function validate()
    {
        Model::validateRequired('bizid', $this->bizid, true);
        Model::validateRequired('projectId', $this->projectId, true);
        Model::validateRequired('traceId', $this->traceId, true);
        Model::validateRequired('toAccount', $this->toAccount, true);
        Model::validateRequired('assetList', $this->assetList, true);
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
        if (null !== $this->toAccount) {
            $res['to_account'] = $this->toAccount;
        }
        if (null !== $this->assetList) {
            $res['asset_list'] = $this->assetList;
        }
        if (null !== $this->accountInfo) {
            $res['account_info'] = null !== $this->accountInfo ? $this->accountInfo->toMap() : null;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ExecContractListissueRequest
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
        if (isset($map['asset_list'])) {
            if (!empty($map['asset_list'])) {
                $model->assetList = $map['asset_list'];
            }
        }
        if (isset($map['account_info'])) {
            $model->accountInfo = AccountInfo::fromMap($map['account_info']);
        }

        return $model;
    }
}
