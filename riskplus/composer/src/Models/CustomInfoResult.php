<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class CustomInfoResult extends Model
{
    // 社会信用代码
    /**
     * @example 923231293311125216
     *
     * @var string
     */
    public $creditCode;

    // 公司名称
    /**
     * @example 测试查询科技有限公司
     *
     * @var string
     */
    public $companyName;

    // 法人姓名
    /**
     * @example 王华
     *
     * @var string
     */
    public $legalName;

    // 身份证号
    /**
     * @example 320101111111111111
     *
     * @var string
     */
    public $idCard;

    // 手机号
    /**
     * @example 15899998888
     *
     * @var string
     */
    public $phoneNumber;

    // 账号
    /**
     * @example 111111111
     *
     * @var string
     */
    public $account;

    // 密码
    /**
     * @example 1111111
     *
     * @var string
     */
    public $password;
    protected $_name = [
        'creditCode'  => 'credit_code',
        'companyName' => 'company_name',
        'legalName'   => 'legal_name',
        'idCard'      => 'id_card',
        'phoneNumber' => 'phone_number',
        'account'     => 'account',
        'password'    => 'password',
    ];

    public function validate()
    {
        Model::validateRequired('creditCode', $this->creditCode, true);
        Model::validateRequired('companyName', $this->companyName, true);
        Model::validateRequired('legalName', $this->legalName, true);
        Model::validateRequired('idCard', $this->idCard, true);
        Model::validateRequired('phoneNumber', $this->phoneNumber, true);
        Model::validateRequired('account', $this->account, true);
        Model::validateRequired('password', $this->password, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->creditCode) {
            $res['credit_code'] = $this->creditCode;
        }
        if (null !== $this->companyName) {
            $res['company_name'] = $this->companyName;
        }
        if (null !== $this->legalName) {
            $res['legal_name'] = $this->legalName;
        }
        if (null !== $this->idCard) {
            $res['id_card'] = $this->idCard;
        }
        if (null !== $this->phoneNumber) {
            $res['phone_number'] = $this->phoneNumber;
        }
        if (null !== $this->account) {
            $res['account'] = $this->account;
        }
        if (null !== $this->password) {
            $res['password'] = $this->password;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CustomInfoResult
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['credit_code'])) {
            $model->creditCode = $map['credit_code'];
        }
        if (isset($map['company_name'])) {
            $model->companyName = $map['company_name'];
        }
        if (isset($map['legal_name'])) {
            $model->legalName = $map['legal_name'];
        }
        if (isset($map['id_card'])) {
            $model->idCard = $map['id_card'];
        }
        if (isset($map['phone_number'])) {
            $model->phoneNumber = $map['phone_number'];
        }
        if (isset($map['account'])) {
            $model->account = $map['account'];
        }
        if (isset($map['password'])) {
            $model->password = $map['password'];
        }

        return $model;
    }
}
