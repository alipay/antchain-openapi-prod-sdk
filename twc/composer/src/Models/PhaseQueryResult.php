<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class PhaseQueryResult extends Model
{
    // 阶段ID
    /**
     * @example 4a605f04-ae9f-48d3-88ba-05c073ad5484
     *
     * @var string
     */
    public $phaseId;

    // 阶段存证的链上交易Hash，只有status为FINISH才会返回
    /**
     * @example 04181b49ee5d7eb0099a289ac8a45df6afb5aa2679c5284444698a97900xx269
     *
     * @var string
     */
    public $txHash;

    // 阶段存证状态
    /**
     * @example FINISH
     *
     * @var string
     */
    public $status;
    protected $_name = [
        'phaseId' => 'phase_id',
        'txHash'  => 'tx_hash',
        'status'  => 'status',
    ];

    public function validate()
    {
        Model::validateRequired('phaseId', $this->phaseId, true);
        Model::validateRequired('txHash', $this->txHash, true);
        Model::validateRequired('status', $this->status, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->phaseId) {
            $res['phase_id'] = $this->phaseId;
        }
        if (null !== $this->txHash) {
            $res['tx_hash'] = $this->txHash;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return PhaseQueryResult
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['phase_id'])) {
            $model->phaseId = $map['phase_id'];
        }
        if (isset($map['tx_hash'])) {
            $model->txHash = $map['tx_hash'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }

        return $model;
    }
}
