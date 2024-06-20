<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class PushRbbCustomerInformationRequest extends Model
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

    // 社会信用代码
    /**
     * @var string
     */
    public $creditCode;

    // 公司名称
    /**
     * @var string
     */
    public $companyName;

    // 法人姓名
    /**
     * @var string
     */
    public $name;

    // 身份证号
    /**
     * @var string
     */
    public $idCard;

    // 手机号
    /**
     * @var string
     */
    public $phoneNumber;

    // 合作伙伴
    /**
     * @var string
     */
    public $businessPartner;

    // 指定产品方
    /**
     * @var string
     */
    public $productSide;

    // 账号
    /**
     * @var string
     */
    public $account;

    // 密码
    /**
     * @var string
     */
    public $password;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'creditCode'        => 'credit_code',
        'companyName'       => 'company_name',
        'name'              => 'name',
        'idCard'            => 'id_card',
        'phoneNumber'       => 'phone_number',
        'businessPartner'   => 'business_partner',
        'productSide'       => 'product_side',
        'account'           => 'account',
        'password'          => 'password',
    ];

    public function validate()
    {
        Model::validateRequired('creditCode', $this->creditCode, true);
        Model::validateRequired('companyName', $this->companyName, true);
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('idCard', $this->idCard, true);
        Model::validateRequired('phoneNumber', $this->phoneNumber, true);
        Model::validateRequired('businessPartner', $this->businessPartner, true);
        Model::validateRequired('productSide', $this->productSide, true);
        Model::validateRequired('account', $this->account, true);
        Model::validateRequired('password', $this->password, true);
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
        if (null !== $this->creditCode) {
            $res['credit_code'] = $this->creditCode;
        }
        if (null !== $this->companyName) {
            $res['company_name'] = $this->companyName;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->idCard) {
            $res['id_card'] = $this->idCard;
        }
        if (null !== $this->phoneNumber) {
            $res['phone_number'] = $this->phoneNumber;
        }
        if (null !== $this->businessPartner) {
            $res['business_partner'] = $this->businessPartner;
        }
        if (null !== $this->productSide) {
            $res['product_side'] = $this->productSide;
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
     * @return PushRbbCustomerInformationRequest
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
        if (isset($map['credit_code'])) {
            $model->creditCode = $map['credit_code'];
        }
        if (isset($map['company_name'])) {
            $model->companyName = $map['company_name'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['id_card'])) {
            $model->idCard = $map['id_card'];
        }
        if (isset($map['phone_number'])) {
            $model->phoneNumber = $map['phone_number'];
        }
        if (isset($map['business_partner'])) {
            $model->businessPartner = $map['business_partner'];
        }
        if (isset($map['product_side'])) {
            $model->productSide = $map['product_side'];
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
