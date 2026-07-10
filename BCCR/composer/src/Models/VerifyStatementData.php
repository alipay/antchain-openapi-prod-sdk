<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BCCR\Models;

use AlibabaCloud\Tea\Model;

class VerifyStatementData extends Model
{
    // 权利声明书存证交易HASH
    /**
     * @example 0003fa8261d1cd6cb419264d516f9b586687e39a0dc31b2c74ff4948e8b951e61afd
     *
     * @var string
     */
    public $statementTxHash;

    // 权利声明书文件ID（和statementFileId 二选一,如果都传使用statementFileHash）
    /**
     * @example 111111
     *
     * @var string
     */
    public $statementFileId;

    // 权利声明书文件HASH（和statementFileId 二选一,如果都传使用statementFileHash）
    /**
     * @example c687c371eb1126d06ef688c97e4a85a38b92c232483600f45597daa233b16948
     *
     * @var string
     */
    public $statementFileHash;
    protected $_name = [
        'statementTxHash'   => 'statement_tx_hash',
        'statementFileId'   => 'statement_file_id',
        'statementFileHash' => 'statement_file_hash',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->statementTxHash) {
            $res['statement_tx_hash'] = $this->statementTxHash;
        }
        if (null !== $this->statementFileId) {
            $res['statement_file_id'] = $this->statementFileId;
        }
        if (null !== $this->statementFileHash) {
            $res['statement_file_hash'] = $this->statementFileHash;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return VerifyStatementData
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['statement_tx_hash'])) {
            $model->statementTxHash = $map['statement_tx_hash'];
        }
        if (isset($map['statement_file_id'])) {
            $model->statementFileId = $map['statement_file_id'];
        }
        if (isset($map['statement_file_hash'])) {
            $model->statementFileHash = $map['statement_file_hash'];
        }

        return $model;
    }
}
