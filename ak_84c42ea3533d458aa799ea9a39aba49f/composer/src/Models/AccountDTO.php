<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_84c42ea3533d458aa799ea9a39aba49f\Models;

use AlibabaCloud\Tea\Model;

class AccountDTO extends Model
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
    protected $_name = [
        'accountNo'     => 'account_no',
        'accountName'   => 'account_name',
        'officalName'   => 'offical_name',
        'officalNumber' => 'offical_number',
    ];

    public function validate()
    {
        Model::validateRequired('accountNo', $this->accountNo, true);
        Model::validateRequired('accountName', $this->accountName, true);
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

        return $res;
    }

    /**
     * @param array $map
     *
     * @return AccountDTO
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

        return $model;
    }
}
