<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BAASDT\Models;

use AlibabaCloud\Tea\Model;

class StartIpAuthtradeRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 集群ID
    /**
     * @var string
     */
    public $productInstanceId;

    // 请求参数
    /**
     * @var BaseRequestInfo
     */
    public $baseRequest;

    // 采购者的链上账户Id
    /**
     * @var string
     */
    public $accountId;

    // IP ID
    /**
     * @var string
     */
    public $ipId;

    // 授权计费比例
    /**
     * @var string
     */
    public $authRate;

    // 授权合作开始期限（毫秒时间戳）
    /**
     * @var int
     */
    public $authBeginTime;

    // 授权合作结束期限（毫秒时间戳）
    /**
     * @var int
     */
    public $authEndTime;

    // 合同（文件URL）
    /**
     * @var string
     */
    public $contract;

    // 设计稿（文件URL）
    /**
     * @var string
     */
    public $designDraft;

    // 备注消息(不超过256个字符)
    /**
     * @var string
     */
    public $memo;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'baseRequest'       => 'base_request',
        'accountId'         => 'account_id',
        'ipId'              => 'ip_id',
        'authRate'          => 'auth_rate',
        'authBeginTime'     => 'auth_begin_time',
        'authEndTime'       => 'auth_end_time',
        'contract'          => 'contract',
        'designDraft'       => 'design_draft',
        'memo'              => 'memo',
    ];

    public function validate()
    {
        Model::validateRequired('baseRequest', $this->baseRequest, true);
        Model::validateRequired('accountId', $this->accountId, true);
        Model::validateRequired('ipId', $this->ipId, true);
        Model::validateRequired('authRate', $this->authRate, true);
        Model::validateRequired('authBeginTime', $this->authBeginTime, true);
        Model::validateRequired('authEndTime', $this->authEndTime, true);
        Model::validateRequired('contract', $this->contract, true);
        Model::validateRequired('designDraft', $this->designDraft, true);
        Model::validateRequired('memo', $this->memo, true);
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
        if (null !== $this->accountId) {
            $res['account_id'] = $this->accountId;
        }
        if (null !== $this->ipId) {
            $res['ip_id'] = $this->ipId;
        }
        if (null !== $this->authRate) {
            $res['auth_rate'] = $this->authRate;
        }
        if (null !== $this->authBeginTime) {
            $res['auth_begin_time'] = $this->authBeginTime;
        }
        if (null !== $this->authEndTime) {
            $res['auth_end_time'] = $this->authEndTime;
        }
        if (null !== $this->contract) {
            $res['contract'] = $this->contract;
        }
        if (null !== $this->designDraft) {
            $res['design_draft'] = $this->designDraft;
        }
        if (null !== $this->memo) {
            $res['memo'] = $this->memo;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return StartIpAuthtradeRequest
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
        if (isset($map['account_id'])) {
            $model->accountId = $map['account_id'];
        }
        if (isset($map['ip_id'])) {
            $model->ipId = $map['ip_id'];
        }
        if (isset($map['auth_rate'])) {
            $model->authRate = $map['auth_rate'];
        }
        if (isset($map['auth_begin_time'])) {
            $model->authBeginTime = $map['auth_begin_time'];
        }
        if (isset($map['auth_end_time'])) {
            $model->authEndTime = $map['auth_end_time'];
        }
        if (isset($map['contract'])) {
            $model->contract = $map['contract'];
        }
        if (isset($map['design_draft'])) {
            $model->designDraft = $map['design_draft'];
        }
        if (isset($map['memo'])) {
            $model->memo = $map['memo'];
        }

        return $model;
    }
}
