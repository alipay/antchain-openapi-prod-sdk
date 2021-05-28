<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TAX\Models;

use AlibabaCloud\Tea\Model;

class AuthCorpRequest extends Model
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

    // 企业注册地址和电话号码
    /**
     * @var string
     */
    public $corpAddressPhoneNo;

    // 企业银行账号
    /**
     * @var string
     */
    public $corpBankNo;

    // 填写公司名称
    /**
     * @var string
     */
    public $corpName;

    // 企业授权秘钥
    /**
     * @var string
     */
    public $corpPrivateKey;

    // 企业纳税人识别号
    /**
     * @var string
     */
    public $corpTaxId;
    protected $_name = [
        'authToken'          => 'auth_token',
        'productInstanceId'  => 'product_instance_id',
        'corpAddressPhoneNo' => 'corp_address_phone_no',
        'corpBankNo'         => 'corp_bank_no',
        'corpName'           => 'corp_name',
        'corpPrivateKey'     => 'corp_private_key',
        'corpTaxId'          => 'corp_tax_id',
    ];

    public function validate()
    {
        Model::validateRequired('corpAddressPhoneNo', $this->corpAddressPhoneNo, true);
        Model::validateRequired('corpBankNo', $this->corpBankNo, true);
        Model::validateRequired('corpName', $this->corpName, true);
        Model::validateRequired('corpPrivateKey', $this->corpPrivateKey, true);
        Model::validateRequired('corpTaxId', $this->corpTaxId, true);
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
        if (null !== $this->corpAddressPhoneNo) {
            $res['corp_address_phone_no'] = $this->corpAddressPhoneNo;
        }
        if (null !== $this->corpBankNo) {
            $res['corp_bank_no'] = $this->corpBankNo;
        }
        if (null !== $this->corpName) {
            $res['corp_name'] = $this->corpName;
        }
        if (null !== $this->corpPrivateKey) {
            $res['corp_private_key'] = $this->corpPrivateKey;
        }
        if (null !== $this->corpTaxId) {
            $res['corp_tax_id'] = $this->corpTaxId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return AuthCorpRequest
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
        if (isset($map['corp_address_phone_no'])) {
            $model->corpAddressPhoneNo = $map['corp_address_phone_no'];
        }
        if (isset($map['corp_bank_no'])) {
            $model->corpBankNo = $map['corp_bank_no'];
        }
        if (isset($map['corp_name'])) {
            $model->corpName = $map['corp_name'];
        }
        if (isset($map['corp_private_key'])) {
            $model->corpPrivateKey = $map['corp_private_key'];
        }
        if (isset($map['corp_tax_id'])) {
            $model->corpTaxId = $map['corp_tax_id'];
        }

        return $model;
    }
}
