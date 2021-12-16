<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\COMMERCIAL\Models;

use AlibabaCloud\Tea\Model;

class PolicyDTO extends Model
{
    // 政策信息
    /**
     * @example
     *
     * @var Policy
     */
    public $policy;

    // 政策关联商品
    /**
     * @example
     *
     * @var PolicyCommodity
     */
    public $policyCommodity;

    // 合同id
    /**
     * @example 2021032410730500140A00330000088993
     *
     * @var string
     */
    public $agreementId;

    // 签约状态
    /**
     * @example SIGNED
     *
     * @var string
     */
    public $signStatus;
    protected $_name = [
        'policy'          => 'policy',
        'policyCommodity' => 'policy_commodity',
        'agreementId'     => 'agreement_id',
        'signStatus'      => 'sign_status',
    ];

    public function validate()
    {
        Model::validateRequired('policy', $this->policy, true);
        Model::validateRequired('policyCommodity', $this->policyCommodity, true);
        Model::validateRequired('signStatus', $this->signStatus, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->policy) {
            $res['policy'] = null !== $this->policy ? $this->policy->toMap() : null;
        }
        if (null !== $this->policyCommodity) {
            $res['policy_commodity'] = null !== $this->policyCommodity ? $this->policyCommodity->toMap() : null;
        }
        if (null !== $this->agreementId) {
            $res['agreement_id'] = $this->agreementId;
        }
        if (null !== $this->signStatus) {
            $res['sign_status'] = $this->signStatus;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return PolicyDTO
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['policy'])) {
            $model->policy = Policy::fromMap($map['policy']);
        }
        if (isset($map['policy_commodity'])) {
            $model->policyCommodity = PolicyCommodity::fromMap($map['policy_commodity']);
        }
        if (isset($map['agreement_id'])) {
            $model->agreementId = $map['agreement_id'];
        }
        if (isset($map['sign_status'])) {
            $model->signStatus = $map['sign_status'];
        }

        return $model;
    }
}
