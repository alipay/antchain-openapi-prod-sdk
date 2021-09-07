<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class SyncInnerNotaryRequest extends Model
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

    // DB的存证id
    /**
     * @var int
     */
    public $id;

    // 事务id
    /**
     * @var string
     */
    public $transactionId;

    // 交易hash
    /**
     * @var string
     */
    public $txHash;

    // 阶段
    /**
     * @var string
     */
    public $phase;

    // 内容hash
    /**
     * @var string
     */
    public $contentHash;

    // 创建时间
    /**
     * @var int
     */
    public $createTime;

    // 存证类型
    /**
     * @var string
     */
    public $notaryType;

    // 大小
    /**
     * @var int
     */
    public $notarySize;

    // 用户id
    /**
     * @var string
     */
    public $accountId;

    // 业务id
    /**
     * @var int
     */
    public $bizId;

    // 子业务id
    /**
     * @var string
     */
    public $subBizId;

    // 是否需要可信时间
    /**
     * @var bool
     */
    public $tsr;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'id'                => 'id',
        'transactionId'     => 'transaction_id',
        'txHash'            => 'tx_hash',
        'phase'             => 'phase',
        'contentHash'       => 'content_hash',
        'createTime'        => 'create_time',
        'notaryType'        => 'notary_type',
        'notarySize'        => 'notary_size',
        'accountId'         => 'account_id',
        'bizId'             => 'biz_id',
        'subBizId'          => 'sub_biz_id',
        'tsr'               => 'tsr',
    ];

    public function validate()
    {
        Model::validateRequired('id', $this->id, true);
        Model::validateRequired('transactionId', $this->transactionId, true);
        Model::validateRequired('phase', $this->phase, true);
        Model::validateRequired('contentHash', $this->contentHash, true);
        Model::validateRequired('notaryType', $this->notaryType, true);
        Model::validateRequired('accountId', $this->accountId, true);
        Model::validateRequired('bizId', $this->bizId, true);
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
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->transactionId) {
            $res['transaction_id'] = $this->transactionId;
        }
        if (null !== $this->txHash) {
            $res['tx_hash'] = $this->txHash;
        }
        if (null !== $this->phase) {
            $res['phase'] = $this->phase;
        }
        if (null !== $this->contentHash) {
            $res['content_hash'] = $this->contentHash;
        }
        if (null !== $this->createTime) {
            $res['create_time'] = $this->createTime;
        }
        if (null !== $this->notaryType) {
            $res['notary_type'] = $this->notaryType;
        }
        if (null !== $this->notarySize) {
            $res['notary_size'] = $this->notarySize;
        }
        if (null !== $this->accountId) {
            $res['account_id'] = $this->accountId;
        }
        if (null !== $this->bizId) {
            $res['biz_id'] = $this->bizId;
        }
        if (null !== $this->subBizId) {
            $res['sub_biz_id'] = $this->subBizId;
        }
        if (null !== $this->tsr) {
            $res['tsr'] = $this->tsr;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SyncInnerNotaryRequest
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
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }
        if (isset($map['transaction_id'])) {
            $model->transactionId = $map['transaction_id'];
        }
        if (isset($map['tx_hash'])) {
            $model->txHash = $map['tx_hash'];
        }
        if (isset($map['phase'])) {
            $model->phase = $map['phase'];
        }
        if (isset($map['content_hash'])) {
            $model->contentHash = $map['content_hash'];
        }
        if (isset($map['create_time'])) {
            $model->createTime = $map['create_time'];
        }
        if (isset($map['notary_type'])) {
            $model->notaryType = $map['notary_type'];
        }
        if (isset($map['notary_size'])) {
            $model->notarySize = $map['notary_size'];
        }
        if (isset($map['account_id'])) {
            $model->accountId = $map['account_id'];
        }
        if (isset($map['biz_id'])) {
            $model->bizId = $map['biz_id'];
        }
        if (isset($map['sub_biz_id'])) {
            $model->subBizId = $map['sub_biz_id'];
        }
        if (isset($map['tsr'])) {
            $model->tsr = $map['tsr'];
        }

        return $model;
    }
}
