<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BAASDT\Models;

use AlibabaCloud\Tea\Model;

class AddConsumecardCommissionpartyRequest extends Model
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

    // 基础请求对象
    /**
     * @var BaseRequest
     */
    public $baseRequest;

    // 收费规则归属方
    /**
     * @var string
     */
    public $accountId;

    // 手续费规则
    /**
     * @var CommissionRule
     */
    public $commissionRule;

    // 手续费类型（0:全局，1:商户）
    /**
     * @var int
     */
    public $type;

    // 分类id（ffaaaaabbbbbb）
    /**
     * @var string
     */
    public $categoryId;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'baseRequest'       => 'base_request',
        'accountId'         => 'account_id',
        'commissionRule'    => 'commission_rule',
        'type'              => 'type',
        'categoryId'        => 'category_id',
    ];

    public function validate()
    {
        Model::validateRequired('baseRequest', $this->baseRequest, true);
        Model::validateRequired('accountId', $this->accountId, true);
        Model::validateRequired('commissionRule', $this->commissionRule, true);
        Model::validateRequired('type', $this->type, true);
        Model::validateRequired('categoryId', $this->categoryId, true);
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
        if (null !== $this->accountId) {
            $res['account_id'] = $this->accountId;
        }
        if (null !== $this->commissionRule) {
            $res['commission_rule'] = null !== $this->commissionRule ? $this->commissionRule->toMap() : null;
        }
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }
        if (null !== $this->categoryId) {
            $res['category_id'] = $this->categoryId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return AddConsumecardCommissionpartyRequest
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
        if (isset($map['account_id'])) {
            $model->accountId = $map['account_id'];
        }
        if (isset($map['commission_rule'])) {
            $model->commissionRule = CommissionRule::fromMap($map['commission_rule']);
        }
        if (isset($map['type'])) {
            $model->type = $map['type'];
        }
        if (isset($map['category_id'])) {
            $model->categoryId = $map['category_id'];
        }

        return $model;
    }
}
