<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BAASDT\Models;

use AlibabaCloud\Tea\Model;

class QueryConsumecardCommissionResponse extends Model
{
    // 请求唯一ID，用于链路跟踪和问题排查
    /**
     * @var string
     */
    public $reqMsgId;

    // 异常信息的文本描述
    /**
     * @var string
     */
    public $resultCode;

    /**
     * @var string
     */
    public $resultMsg;

    // 手续费规则结果
    /**
     * @var CommissionRuleResponse[]
     */
    public $commissionRules;

    // 分类id（ffaaaaabbbbbb，如果存在则直接更新）
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
    protected $_name = [
        'reqMsgId'          => 'req_msg_id',
        'resultCode'        => 'result_code',
        'resultMsg'         => 'result_msg',
        'commissionRules'   => 'commission_rules',
        'categoryId'        => 'category_id',
        'type'              => 'type',
        'accountId'         => 'account_id',
        'payCommissionType' => 'pay_commission_type',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->reqMsgId) {
            $res['req_msg_id'] = $this->reqMsgId;
        }
        if (null !== $this->resultCode) {
            $res['result_code'] = $this->resultCode;
        }
        if (null !== $this->resultMsg) {
            $res['result_msg'] = $this->resultMsg;
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

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryConsumecardCommissionResponse
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['req_msg_id'])) {
            $model->reqMsgId = $map['req_msg_id'];
        }
        if (isset($map['result_code'])) {
            $model->resultCode = $map['result_code'];
        }
        if (isset($map['result_msg'])) {
            $model->resultMsg = $map['result_msg'];
        }
        if (isset($map['commission_rules'])) {
            if (!empty($map['commission_rules'])) {
                $model->commissionRules = [];
                $n                      = 0;
                foreach ($map['commission_rules'] as $item) {
                    $model->commissionRules[$n++] = null !== $item ? CommissionRuleResponse::fromMap($item) : $item;
                }
            }
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

        return $model;
    }
}
