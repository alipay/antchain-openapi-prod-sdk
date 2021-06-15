<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class EvidentialCheckList extends Model
{
    // 证据名称英文
    /**
     * @example LEGAL_IDENETITY_CERT
     *
     * @var string
     */
    public $evidentialNameEn;

    // 文件名称
    /**
     * @example a.txt
     *
     * @var string
     */
    public $ossFileName;

    // 文件fileKey
    /**
     * @example 201906182149291c15e6c2d400fc3323b09f44a4e79bdf2db867a3fb9400a168de3325205519.jpg
     *
     * @var string
     */
    public $ossFileKey;

    // 证据来源
    // BUSINESS_UPLOAD	业务传入
    // ADD_MANULLY	手动添加
    /**
     * @example BUSINESS_UPLOAD
     *
     * @var string
     */
    public $sourcesOfEvidence;

    // 证据类型
    // BLOCKCHAIN_DEPOSIT	区块链存证
    // USER_UPLOAD	用户上传
    /**
     * @example BLOCKCHAIN_DEPOSIT
     *
     * @var string
     */
    public $evidenceType;

    // 存证类型
    // TEXT	文本
    // FILE	文件
    /**
     * @example TEXT
     *
     * @var string
     */
    public $depositType;

    // 存证哈希
    /**
     * @example 1234545676575675673
     *
     * @var string
     */
    public $txHash;

    // 存证时间
    /**
     * @example 2021-05-07 17:13:50
     *
     * @var string
     */
    public $depositTime;
    protected $_name = [
        'evidentialNameEn'  => 'evidential_name_en',
        'ossFileName'       => 'oss_file_name',
        'ossFileKey'        => 'oss_file_key',
        'sourcesOfEvidence' => 'sources_of_evidence',
        'evidenceType'      => 'evidence_type',
        'depositType'       => 'deposit_type',
        'txHash'            => 'tx_hash',
        'depositTime'       => 'deposit_time',
    ];

    public function validate()
    {
        Model::validateRequired('evidentialNameEn', $this->evidentialNameEn, true);
        Model::validateRequired('ossFileName', $this->ossFileName, true);
        Model::validateRequired('ossFileKey', $this->ossFileKey, true);
        Model::validateRequired('sourcesOfEvidence', $this->sourcesOfEvidence, true);
        Model::validateRequired('evidenceType', $this->evidenceType, true);
        Model::validateRequired('depositType', $this->depositType, true);
        Model::validateRequired('txHash', $this->txHash, true);
        Model::validateRequired('depositTime', $this->depositTime, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->evidentialNameEn) {
            $res['evidential_name_en'] = $this->evidentialNameEn;
        }
        if (null !== $this->ossFileName) {
            $res['oss_file_name'] = $this->ossFileName;
        }
        if (null !== $this->ossFileKey) {
            $res['oss_file_key'] = $this->ossFileKey;
        }
        if (null !== $this->sourcesOfEvidence) {
            $res['sources_of_evidence'] = $this->sourcesOfEvidence;
        }
        if (null !== $this->evidenceType) {
            $res['evidence_type'] = $this->evidenceType;
        }
        if (null !== $this->depositType) {
            $res['deposit_type'] = $this->depositType;
        }
        if (null !== $this->txHash) {
            $res['tx_hash'] = $this->txHash;
        }
        if (null !== $this->depositTime) {
            $res['deposit_time'] = $this->depositTime;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return EvidentialCheckList
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['evidential_name_en'])) {
            $model->evidentialNameEn = $map['evidential_name_en'];
        }
        if (isset($map['oss_file_name'])) {
            $model->ossFileName = $map['oss_file_name'];
        }
        if (isset($map['oss_file_key'])) {
            $model->ossFileKey = $map['oss_file_key'];
        }
        if (isset($map['sources_of_evidence'])) {
            $model->sourcesOfEvidence = $map['sources_of_evidence'];
        }
        if (isset($map['evidence_type'])) {
            $model->evidenceType = $map['evidence_type'];
        }
        if (isset($map['deposit_type'])) {
            $model->depositType = $map['deposit_type'];
        }
        if (isset($map['tx_hash'])) {
            $model->txHash = $map['tx_hash'];
        }
        if (isset($map['deposit_time'])) {
            $model->depositTime = $map['deposit_time'];
        }

        return $model;
    }
}
