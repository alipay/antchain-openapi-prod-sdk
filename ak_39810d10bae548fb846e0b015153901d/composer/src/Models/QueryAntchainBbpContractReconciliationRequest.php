<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_39810d10bae548fb846e0b015153901d\Models;

use AlibabaCloud\Tea\Model;

class QueryAntchainBbpContractReconciliationRequest extends Model
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

    // 供应商code
    /**
     * @var string
     */
    public $supCode;

    // 月份
    /**
     * @var string[]
     */
    public $scoreDates;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'supCode'           => 'sup_code',
        'scoreDates'        => 'score_dates',
    ];

    public function validate()
    {
        Model::validateRequired('supCode', $this->supCode, true);
        Model::validateRequired('scoreDates', $this->scoreDates, true);
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
        if (null !== $this->supCode) {
            $res['sup_code'] = $this->supCode;
        }
        if (null !== $this->scoreDates) {
            $res['score_dates'] = $this->scoreDates;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryAntchainBbpContractReconciliationRequest
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
        if (isset($map['sup_code'])) {
            $model->supCode = $map['sup_code'];
        }
        if (isset($map['score_dates'])) {
            if (!empty($map['score_dates'])) {
                $model->scoreDates = $map['score_dates'];
            }
        }

        return $model;
    }
}
