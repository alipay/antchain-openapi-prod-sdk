<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_39810d10bae548fb846e0b015153901d\Models;

use AlibabaCloud\Tea\Model;

class ApplyAntchainBbpContractRuleRequest extends Model
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

    // 服务提供商
    /**
     * @var SpProvider
     */
    public $spProvider;

    // 明细
    /**
     * @var RuleDetail[]
     */
    public $ruleDetails;

    // confirmer
    /**
     * @var string
     */
    public $confirmer;

    // 确认时间
    /**
     * @var string
     */
    public $confirmDate;

    // confirm_status
    /**
     * @var string
     */
    public $confirmStatus;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'spProvider'        => 'sp_provider',
        'ruleDetails'       => 'rule_details',
        'confirmer'         => 'confirmer',
        'confirmDate'       => 'confirm_date',
        'confirmStatus'     => 'confirm_status',
    ];

    public function validate()
    {
        Model::validateRequired('spProvider', $this->spProvider, true);
        Model::validateRequired('ruleDetails', $this->ruleDetails, true);
        Model::validateRequired('confirmer', $this->confirmer, true);
        Model::validateRequired('confirmDate', $this->confirmDate, true);
        Model::validateRequired('confirmStatus', $this->confirmStatus, true);
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
        if (null !== $this->spProvider) {
            $res['sp_provider'] = null !== $this->spProvider ? $this->spProvider->toMap() : null;
        }
        if (null !== $this->ruleDetails) {
            $res['rule_details'] = [];
            if (null !== $this->ruleDetails && \is_array($this->ruleDetails)) {
                $n = 0;
                foreach ($this->ruleDetails as $item) {
                    $res['rule_details'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->confirmer) {
            $res['confirmer'] = $this->confirmer;
        }
        if (null !== $this->confirmDate) {
            $res['confirm_date'] = $this->confirmDate;
        }
        if (null !== $this->confirmStatus) {
            $res['confirm_status'] = $this->confirmStatus;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ApplyAntchainBbpContractRuleRequest
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
        if (isset($map['sp_provider'])) {
            $model->spProvider = SpProvider::fromMap($map['sp_provider']);
        }
        if (isset($map['rule_details'])) {
            if (!empty($map['rule_details'])) {
                $model->ruleDetails = [];
                $n                  = 0;
                foreach ($map['rule_details'] as $item) {
                    $model->ruleDetails[$n++] = null !== $item ? RuleDetail::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['confirmer'])) {
            $model->confirmer = $map['confirmer'];
        }
        if (isset($map['confirm_date'])) {
            $model->confirmDate = $map['confirm_date'];
        }
        if (isset($map['confirm_status'])) {
            $model->confirmStatus = $map['confirm_status'];
        }

        return $model;
    }
}
