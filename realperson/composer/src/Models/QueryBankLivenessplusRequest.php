<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\REALPERSON\Models;

use AlibabaCloud\Tea\Model;

class QueryBankLivenessplusRequest extends Model
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

    // 请求ID
    /**
     * @var string
     */
    public $outerOrderNo;

    // 加密方式
    /**
     * @var string
     */
    public $encryptType;

    // 身份证号
    /**
     * @var string
     */
    public $certNo;

    // 银行编码
    /**
     * @var string
     */
    public $bankCode;

    // 1=借记卡+贷记卡（默认）；2=借记卡
    /**
     * @var string
     */
    public $bankCardType;

    // 姓名
    /**
     * @var string
     */
    public $certName;

    // 手机号码
    /**
     * @var string
     */
    public $mobile;

    // 扩展信息，预留字段
    /**
     * @var string
     */
    public $externParam;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'outerOrderNo'      => 'outer_order_no',
        'encryptType'       => 'encrypt_type',
        'certNo'            => 'cert_no',
        'bankCode'          => 'bank_code',
        'bankCardType'      => 'bank_card_type',
        'certName'          => 'cert_name',
        'mobile'            => 'mobile',
        'externParam'       => 'extern_param',
    ];

    public function validate()
    {
        Model::validateRequired('outerOrderNo', $this->outerOrderNo, true);
        Model::validateRequired('encryptType', $this->encryptType, true);
        Model::validateRequired('certNo', $this->certNo, true);
        Model::validateRequired('bankCode', $this->bankCode, true);
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
        if (null !== $this->outerOrderNo) {
            $res['outer_order_no'] = $this->outerOrderNo;
        }
        if (null !== $this->encryptType) {
            $res['encrypt_type'] = $this->encryptType;
        }
        if (null !== $this->certNo) {
            $res['cert_no'] = $this->certNo;
        }
        if (null !== $this->bankCode) {
            $res['bank_code'] = $this->bankCode;
        }
        if (null !== $this->bankCardType) {
            $res['bank_card_type'] = $this->bankCardType;
        }
        if (null !== $this->certName) {
            $res['cert_name'] = $this->certName;
        }
        if (null !== $this->mobile) {
            $res['mobile'] = $this->mobile;
        }
        if (null !== $this->externParam) {
            $res['extern_param'] = $this->externParam;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryBankLivenessplusRequest
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
        if (isset($map['outer_order_no'])) {
            $model->outerOrderNo = $map['outer_order_no'];
        }
        if (isset($map['encrypt_type'])) {
            $model->encryptType = $map['encrypt_type'];
        }
        if (isset($map['cert_no'])) {
            $model->certNo = $map['cert_no'];
        }
        if (isset($map['bank_code'])) {
            $model->bankCode = $map['bank_code'];
        }
        if (isset($map['bank_card_type'])) {
            $model->bankCardType = $map['bank_card_type'];
        }
        if (isset($map['cert_name'])) {
            $model->certName = $map['cert_name'];
        }
        if (isset($map['mobile'])) {
            $model->mobile = $map['mobile'];
        }
        if (isset($map['extern_param'])) {
            $model->externParam = $map['extern_param'];
        }

        return $model;
    }
}
