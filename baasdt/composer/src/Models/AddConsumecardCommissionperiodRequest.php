<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BAASDT\Models;

use AlibabaCloud\Tea\Model;

class AddConsumecardCommissionperiodRequest extends Model
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

    // 基础结构体
    /**
     * @var BaseRequest
     */
    public $baseRequest;

    // 分类id（ffaaaaabbbbbb）
    /**
     * @var string
     */
    public $categoryId;

    // 手续费类型（0:全局，1:商户）
    /**
     * @var int
     */
    public $type;

    // 手续费归属的账户id,如果type为0 ，则该字段必须为空
    /**
     * @var string
     */
    public $accountId;

    // 一级分账方
    /**
     * @var string
     */
    public $ruleAccountId;

    // 手续费周期
    /**
     * @var CommissionPeriod
     */
    public $commissionPeriod;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'baseRequest'       => 'base_request',
        'categoryId'        => 'category_id',
        'type'              => 'type',
        'accountId'         => 'account_id',
        'ruleAccountId'     => 'rule_account_id',
        'commissionPeriod'  => 'commission_period',
    ];

    public function validate()
    {
        Model::validateRequired('baseRequest', $this->baseRequest, true);
        Model::validateRequired('categoryId', $this->categoryId, true);
        Model::validateRequired('type', $this->type, true);
        Model::validateRequired('accountId', $this->accountId, true);
        Model::validateRequired('ruleAccountId', $this->ruleAccountId, true);
        Model::validateRequired('commissionPeriod', $this->commissionPeriod, true);
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
        if (null !== $this->baseRequest) {
            $res['base_request'] = null !== $this->baseRequest ? $this->baseRequest->toMap() : null;
        }
        if (null !== $this->categoryId) {
            $res['category_id'] = $this->categoryId;
        }
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }
        if (null !== $this->accountId) {
            $res['account_id'] = $this->accountId;
        }
        if (null !== $this->ruleAccountId) {
            $res['rule_account_id'] = $this->ruleAccountId;
        }
        if (null !== $this->commissionPeriod) {
            $res['commission_period'] = null !== $this->commissionPeriod ? $this->commissionPeriod->toMap() : null;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return AddConsumecardCommissionperiodRequest
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
        if (isset($map['base_request'])) {
            $model->baseRequest = BaseRequest::fromMap($map['base_request']);
        }
        if (isset($map['category_id'])) {
            $model->categoryId = $map['category_id'];
        }
        if (isset($map['type'])) {
            $model->type = $map['type'];
        }
        if (isset($map['account_id'])) {
            $model->accountId = $map['account_id'];
        }
        if (isset($map['rule_account_id'])) {
            $model->ruleAccountId = $map['rule_account_id'];
        }
        if (isset($map['commission_period'])) {
            $model->commissionPeriod = CommissionPeriod::fromMap($map['commission_period']);
        }

        return $model;
    }
}
