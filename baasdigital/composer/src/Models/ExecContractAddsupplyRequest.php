<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BAASDIGITAL\Models;

use AlibabaCloud\Tea\Model;

class ExecContractAddsupplyRequest extends Model
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

    // 增发数值，非零
    /**
     * @var int
     */
    public $increase;

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
        'increase'          => 'increase',
        'accountInfo'       => 'account_info',
    ];

    public function validate()
    {
        Model::validateRequired('bizid', $this->bizid, true);
        Model::validateRequired('projectId', $this->projectId, true);
        Model::validateRequired('traceId', $this->traceId, true);
        Model::validateRequired('increase', $this->increase, true);
        Model::validateRequired('accountInfo', $this->accountInfo, true);
        Model::validateMinimum('increase', $this->increase, 1);
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
        if (null !== $this->increase) {
            $res['increase'] = $this->increase;
        }
        if (null !== $this->accountInfo) {
            $res['account_info'] = null !== $this->accountInfo ? $this->accountInfo->toMap() : null;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ExecContractAddsupplyRequest
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
        if (isset($map['increase'])) {
            $model->increase = $map['increase'];
        }
        if (isset($map['account_info'])) {
            $model->accountInfo = AccountInfo::fromMap($map['account_info']);
        }

        return $model;
    }
}
