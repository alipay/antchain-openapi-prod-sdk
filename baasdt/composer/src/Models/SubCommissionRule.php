<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BAASDT\Models;

use AlibabaCloud\Tea\Model;

class SubCommissionRule extends Model
{
    // deduct_token
    /**
     * @example deduct_token
     *
     * @var string
     */
    public $deductToken;

    // deduct_ratio
    /**
     * @example deduct_ratio
     *
     * @var string
     */
    public $deductRatio;

    // account_id
    /**
     * @example account_id
     *
     * @var string
     */
    public $accountId;
    protected $_name = [
        'deductToken' => 'deduct_token',
        'deductRatio' => 'deduct_ratio',
        'accountId'   => 'account_id',
    ];

    public function validate()
    {
        Model::validateRequired('deductToken', $this->deductToken, true);
        Model::validateRequired('deductRatio', $this->deductRatio, true);
        Model::validateRequired('accountId', $this->accountId, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->deductToken) {
            $res['deduct_token'] = $this->deductToken;
        }
        if (null !== $this->deductRatio) {
            $res['deduct_ratio'] = $this->deductRatio;
        }
        if (null !== $this->accountId) {
            $res['account_id'] = $this->accountId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SubCommissionRule
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['deduct_token'])) {
            $model->deductToken = $map['deduct_token'];
        }
        if (isset($map['deduct_ratio'])) {
            $model->deductRatio = $map['deduct_ratio'];
        }
        if (isset($map['account_id'])) {
            $model->accountId = $map['account_id'];
        }

        return $model;
    }
}
