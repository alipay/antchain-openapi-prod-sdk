<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BCCR\Models;

use AlibabaCloud\Tea\Model;

class VerifyBlockchainRequest extends Model
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

    // 统一证据编号（存证交易HASH）
    /**
     * @var string
     */
    public $txHash;

    // 文件HASH，使用HEX的完整表示，如 6460c949f8a347eb...
    //
    // (和fileId 二选一，必传一个，都传按fileHash为准)
    /**
     * @var string
     */
    public $fileHash;

    // 文件OSS Id（上传文件有大小限制，文本文件最大100M，图片最大1G，视频和压缩包最大2G）
    //
    // (和fileHash 二选一，必传一个，都传按fileHash为准)
    /**
     * @var string
     */
    public $fileId;

    // 核验用户信息
    /**
     * @var VerifyUserData
     */
    public $userData;

    // 核验权利声明信息
    /**
     * @var VerifyStatementData
     */
    public $statementData;

    // 核验取证信息
    /**
     * @var VerifyEvidenceData
     */
    public $evidenceData;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'txHash'            => 'tx_hash',
        'fileHash'          => 'file_hash',
        'fileId'            => 'file_id',
        'userData'          => 'user_data',
        'statementData'     => 'statement_data',
        'evidenceData'      => 'evidence_data',
    ];

    public function validate()
    {
        Model::validateRequired('txHash', $this->txHash, true);
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
        if (null !== $this->txHash) {
            $res['tx_hash'] = $this->txHash;
        }
        if (null !== $this->fileHash) {
            $res['file_hash'] = $this->fileHash;
        }
        if (null !== $this->fileId) {
            $res['file_id'] = $this->fileId;
        }
        if (null !== $this->userData) {
            $res['user_data'] = null !== $this->userData ? $this->userData->toMap() : null;
        }
        if (null !== $this->statementData) {
            $res['statement_data'] = null !== $this->statementData ? $this->statementData->toMap() : null;
        }
        if (null !== $this->evidenceData) {
            $res['evidence_data'] = null !== $this->evidenceData ? $this->evidenceData->toMap() : null;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return VerifyBlockchainRequest
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
        if (isset($map['tx_hash'])) {
            $model->txHash = $map['tx_hash'];
        }
        if (isset($map['file_hash'])) {
            $model->fileHash = $map['file_hash'];
        }
        if (isset($map['file_id'])) {
            $model->fileId = $map['file_id'];
        }
        if (isset($map['user_data'])) {
            $model->userData = VerifyUserData::fromMap($map['user_data']);
        }
        if (isset($map['statement_data'])) {
            $model->statementData = VerifyStatementData::fromMap($map['statement_data']);
        }
        if (isset($map['evidence_data'])) {
            $model->evidenceData = VerifyEvidenceData::fromMap($map['evidence_data']);
        }

        return $model;
    }
}
