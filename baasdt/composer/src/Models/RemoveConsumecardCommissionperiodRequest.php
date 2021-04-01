<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BAASDT\Models;

use AlibabaCloud\Tea\Model;

class RemoveConsumecardCommissionperiodRequest extends Model
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

    // 商品分类id（ffaaaaabbbbbb）
    /**
     * @var string
     */
    public $categoryId;

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

    // 手续费类型（0:全局，1:商户）
    /**
     * @var int
     */
    public $type;

    // 手续费开始时间,用于查找去除的手续费（无结束时间）
    /**
     * @var int
     */
    public $startTimeMills;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'baseRequest'       => 'base_request',
        'categoryId'        => 'category_id',
        'accountId'         => 'account_id',
        'ruleAccountId'     => 'rule_account_id',
        'type'              => 'type',
        'startTimeMills'    => 'start_time_mills',
    ];

    public function validate()
    {
        Model::validateRequired('baseRequest', $this->baseRequest, true);
        Model::validateRequired('categoryId', $this->categoryId, true);
        Model::validateRequired('accountId', $this->accountId, true);
        Model::validateRequired('ruleAccountId', $this->ruleAccountId, true);
        Model::validateRequired('type', $this->type, true);
        Model::validateRequired('startTimeMills', $this->startTimeMills, true);
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
        if (null !== $this->accountId) {
            $res['account_id'] = $this->accountId;
        }
        if (null !== $this->ruleAccountId) {
            $res['rule_account_id'] = $this->ruleAccountId;
        }
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }
        if (null !== $this->startTimeMills) {
            $res['start_time_mills'] = $this->startTimeMills;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return RemoveConsumecardCommissionperiodRequest
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
        if (isset($map['account_id'])) {
            $model->accountId = $map['account_id'];
        }
        if (isset($map['rule_account_id'])) {
            $model->ruleAccountId = $map['rule_account_id'];
        }
        if (isset($map['type'])) {
            $model->type = $map['type'];
        }
        if (isset($map['start_time_mills'])) {
            $model->startTimeMills = $map['start_time_mills'];
        }

        return $model;
    }
}
