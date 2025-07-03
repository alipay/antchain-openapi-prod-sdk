<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\DEMO\Models;

use AlibabaCloud\Tea\Model;

class QueryAgentFinancialRiskRequest extends Model
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

    // 用户基础信息
    /**
     * @var UserProfile
     */
    public $userProfile;

    // 交易明细信息
    /**
     * @var TransactionDetails
     */
    public $transactionDetails;

    // 风险评估因子列表
    /**
     * @var RiskFactorDetail[]
     */
    public $riskFactors;

    // 业务上下文信息
    /**
     * @var NameValuePair
     */
    public $businessContext;

    // 风险等级标识（LOW/MEDIUM/HIGH/URGENT）
    /**
     * @var string
     */
    public $riskLevel;

    // 接口超时时间（毫秒）
    /**
     * @var int
     */
    public $timeout;
    protected $_name = [
        'authToken'          => 'auth_token',
        'productInstanceId'  => 'product_instance_id',
        'userProfile'        => 'user_profile',
        'transactionDetails' => 'transaction_details',
        'riskFactors'        => 'risk_factors',
        'businessContext'    => 'business_context',
        'riskLevel'          => 'risk_level',
        'timeout'            => 'timeout',
    ];

    public function validate()
    {
        Model::validateMaximum('timeout', $this->timeout, 60000);
        Model::validateMinimum('timeout', $this->timeout, 0);
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
        if (null !== $this->userProfile) {
            $res['user_profile'] = null !== $this->userProfile ? $this->userProfile->toMap() : null;
        }
        if (null !== $this->transactionDetails) {
            $res['transaction_details'] = null !== $this->transactionDetails ? $this->transactionDetails->toMap() : null;
        }
        if (null !== $this->riskFactors) {
            $res['risk_factors'] = [];
            if (null !== $this->riskFactors && \is_array($this->riskFactors)) {
                $n = 0;
                foreach ($this->riskFactors as $item) {
                    $res['risk_factors'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->businessContext) {
            $res['business_context'] = null !== $this->businessContext ? $this->businessContext->toMap() : null;
        }
        if (null !== $this->riskLevel) {
            $res['risk_level'] = $this->riskLevel;
        }
        if (null !== $this->timeout) {
            $res['timeout'] = $this->timeout;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryAgentFinancialRiskRequest
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
        if (isset($map['user_profile'])) {
            $model->userProfile = UserProfile::fromMap($map['user_profile']);
        }
        if (isset($map['transaction_details'])) {
            $model->transactionDetails = TransactionDetails::fromMap($map['transaction_details']);
        }
        if (isset($map['risk_factors'])) {
            if (!empty($map['risk_factors'])) {
                $model->riskFactors = [];
                $n                  = 0;
                foreach ($map['risk_factors'] as $item) {
                    $model->riskFactors[$n++] = null !== $item ? RiskFactorDetail::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['business_context'])) {
            $model->businessContext = NameValuePair::fromMap($map['business_context']);
        }
        if (isset($map['risk_level'])) {
            $model->riskLevel = $map['risk_level'];
        }
        if (isset($map['timeout'])) {
            $model->timeout = $map['timeout'];
        }

        return $model;
    }
}
