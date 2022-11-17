<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BCCR\Models;

use AlibabaCloud\Tea\Model;

class EvidInfo extends Model
{
    // 取证ID
    /**
     * @example RS123
     *
     * @var string
     */
    public $evidenceId;

    // 取证人
    /**
     * @example
     *
     * @var NotaryUser
     */
    public $witness;
    protected $_name = [
        'evidenceId' => 'evidence_id',
        'witness'    => 'witness',
    ];

    public function validate()
    {
        Model::validateRequired('evidenceId', $this->evidenceId, true);
        Model::validateRequired('witness', $this->witness, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->evidenceId) {
            $res['evidence_id'] = $this->evidenceId;
        }
        if (null !== $this->witness) {
            $res['witness'] = null !== $this->witness ? $this->witness->toMap() : null;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return EvidInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['evidence_id'])) {
            $model->evidenceId = $map['evidence_id'];
        }
        if (isset($map['witness'])) {
            $model->witness = NotaryUser::fromMap($map['witness']);
        }

        return $model;
    }
}
