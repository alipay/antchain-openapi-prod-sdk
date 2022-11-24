<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_39810d10bae548fb846e0b015153901d\Models;

use AlibabaCloud\Tea\Model;

class ExecAntchainBbpContractReconciliationRequest extends Model
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

    // 供应商
    /**
     * @var string
     */
    public $supCode;

    // 结算时间
    /**
     * @var string
     */
    public $scoreDate;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'supCode'           => 'sup_code',
        'scoreDate'         => 'score_date',
    ];

    public function validate()
    {
        Model::validateRequired('supCode', $this->supCode, true);
        Model::validateRequired('scoreDate', $this->scoreDate, true);
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
        if (null !== $this->scoreDate) {
            $res['score_date'] = $this->scoreDate;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ExecAntchainBbpContractReconciliationRequest
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
        if (isset($map['score_date'])) {
            $model->scoreDate = $map['score_date'];
        }

        return $model;
    }
}
