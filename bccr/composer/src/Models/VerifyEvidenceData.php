<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BCCR\Models;

use AlibabaCloud\Tea\Model;

class VerifyEvidenceData extends Model
{
    // 操作日志交易HASH
    /**
     * @example 0003fa8261d1cd6cb419264d516f9b586687e39a0dc31b2c74ff4948e8b951e61afd
     *
     * @var string
     */
    public $processLogTxHash;

    // 自清洁日志交易HASH
    /**
     * @example 0003fa8261d1cd6cb419264d516f9b586687e39a0dc31b2c74ff4948e8b951e61afd
     *
     * @var string
     */
    public $checkLogTxHash;
    protected $_name = [
        'processLogTxHash' => 'process_log_tx_hash',
        'checkLogTxHash'   => 'check_log_tx_hash',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->processLogTxHash) {
            $res['process_log_tx_hash'] = $this->processLogTxHash;
        }
        if (null !== $this->checkLogTxHash) {
            $res['check_log_tx_hash'] = $this->checkLogTxHash;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return VerifyEvidenceData
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['process_log_tx_hash'])) {
            $model->processLogTxHash = $map['process_log_tx_hash'];
        }
        if (isset($map['check_log_tx_hash'])) {
            $model->checkLogTxHash = $map['check_log_tx_hash'];
        }

        return $model;
    }
}
