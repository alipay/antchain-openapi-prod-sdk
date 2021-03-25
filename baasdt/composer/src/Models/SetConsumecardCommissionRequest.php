<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BAASDT\Models;

use AlibabaCloud\Tea\Model;

class SetConsumecardCommissionRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 集群ID
    /**
     * @var string
     */
    public $productInstanceId;

    // 请求参数
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

    // 手续费支出方（0.卖家，1.买家，2.平台）
    /**
     * @var string
     */
    public $payCommissionType;

    // 手续费一级分账。最长为6条
    /**
     * @var CommissionRule[]
     */
    public $commissionRules;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'baseRequest'       => 'base_request',
        'categoryId'        => 'category_id',
        'type'              => 'type',
        'accountId'         => 'account_id',
        'payCommissionType' => 'pay_commission_type',
        'commissionRules'   => 'commission_rules',
    ];

    public function validate()
    {
        Model::validateRequired('baseRequest', $this->baseRequest, true);
        Model::validateRequired('categoryId', $this->categoryId, true);
        Model::validateRequired('type', $this->type, true);
        Model::validateRequired('accountId', $this->accountId, true);
        Model::validateRequired('payCommissionType', $this->payCommissionType, true);
        Model::validateRequired('commissionRules', $this->commissionRules, true);
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
        if (null !== $this->payCommissionType) {
            $res['pay_commission_type'] = $this->payCommissionType;
        }
        if (null !== $this->commissionRules) {
            $res['commission_rules'] = [];
            if (null !== $this->commissionRules && \is_array($this->commissionRules)) {
                $n = 0;
                foreach ($this->commissionRules as $item) {
                    $res['commission_rules'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SetConsumecardCommissionRequest
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
        if (isset($map['pay_commission_type'])) {
            $model->payCommissionType = $map['pay_commission_type'];
        }
        if (isset($map['commission_rules'])) {
            if (!empty($map['commission_rules'])) {
                $model->commissionRules = [];
                $n                      = 0;
                foreach ($map['commission_rules'] as $item) {
                    $model->commissionRules[$n++] = null !== $item ? CommissionRule::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
