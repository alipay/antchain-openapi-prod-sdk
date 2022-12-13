<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_84c42ea3533d458aa799ea9a39aba49f\Models;

use AlibabaCloud\Tea\Model;

class AccountVO extends Model
{
    // 账号
    /**
     * @example 755936042810703
     *
     * @var string
     */
    public $accountNo;

    // 户名
    /**
     * @example 测试账户
     *
     * @var string
     */
    public $accountName;

    // 开户网点
    /**
     * @example 中国工商银行股份有限公司北京德外支行
     *
     * @var string
     */
    public $officalName;

    // 联行号
    /**
     * @example 102100000136
     *
     * @var string
     */
    public $officalNumber;

    // 账号状态
    //
    /**
     * @example INIT
     *
     * @var string
     */
    public $status;

    // 分类 BUYER付款账户； SELLER收款账户
    /**
     * @example [“SELLER”,"BUYER"]
     *
     * @var string[]
     */
    public $category;

    // 上次支付是否失败
    /**
     * @example true, false
     *
     * @var bool
     */
    public $lastPayFail;

    // 支付方式 BALANCE余额账户；BILL票据账户
    /**
     * @example [“BALANCE”,"BILL"]
     *
     * @var string[]
     */
    public $payMethod;

    // 账户类型 MAIN 对公账户；ECOLLECTION e收宝
    /**
     * @example MAIN
     *
     * @var string
     */
    public $type;
    protected $_name = [
        'accountNo'     => 'account_no',
        'accountName'   => 'account_name',
        'officalName'   => 'offical_name',
        'officalNumber' => 'offical_number',
        'status'        => 'status',
        'category'      => 'category',
        'lastPayFail'   => 'last_pay_fail',
        'payMethod'     => 'pay_method',
        'type'          => 'type',
    ];

    public function validate()
    {
        Model::validateRequired('accountNo', $this->accountNo, true);
        Model::validateRequired('accountName', $this->accountName, true);
        Model::validateRequired('officalName', $this->officalName, true);
        Model::validateRequired('officalNumber', $this->officalNumber, true);
        Model::validateRequired('status', $this->status, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->accountNo) {
            $res['account_no'] = $this->accountNo;
        }
        if (null !== $this->accountName) {
            $res['account_name'] = $this->accountName;
        }
        if (null !== $this->officalName) {
            $res['offical_name'] = $this->officalName;
        }
        if (null !== $this->officalNumber) {
            $res['offical_number'] = $this->officalNumber;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->category) {
            $res['category'] = $this->category;
        }
        if (null !== $this->lastPayFail) {
            $res['last_pay_fail'] = $this->lastPayFail;
        }
        if (null !== $this->payMethod) {
            $res['pay_method'] = $this->payMethod;
        }
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return AccountVO
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['account_no'])) {
            $model->accountNo = $map['account_no'];
        }
        if (isset($map['account_name'])) {
            $model->accountName = $map['account_name'];
        }
        if (isset($map['offical_name'])) {
            $model->officalName = $map['offical_name'];
        }
        if (isset($map['offical_number'])) {
            $model->officalNumber = $map['offical_number'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }
        if (isset($map['category'])) {
            if (!empty($map['category'])) {
                $model->category = $map['category'];
            }
        }
        if (isset($map['last_pay_fail'])) {
            $model->lastPayFail = $map['last_pay_fail'];
        }
        if (isset($map['pay_method'])) {
            if (!empty($map['pay_method'])) {
                $model->payMethod = $map['pay_method'];
            }
        }
        if (isset($map['type'])) {
            $model->type = $map['type'];
        }

        return $model;
    }
}
