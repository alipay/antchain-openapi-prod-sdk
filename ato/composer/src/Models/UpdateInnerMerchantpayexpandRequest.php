<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ATO\Models;

use AlibabaCloud\Tea\Model;

class UpdateInnerMerchantpayexpandRequest extends Model
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

    // 公司信息
    /**
     * @var CompanyInfoUpdate
     */
    public $companyInfo;

    // 法人信息
    /**
     * @var LegalInfoUpdate
     */
    public $legalInfo;

    // 应用信息
    /**
     * @var ApplicationInfoUpdate
     */
    public $applicationInfo;

    // 进件流水号
    /**
     * @var string
     */
    public $payExpandId;

    // 社会统一信用代码
    /**
     * @var string
     */
    public $merchantId;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'companyInfo'       => 'company_info',
        'legalInfo'         => 'legal_info',
        'applicationInfo'   => 'application_info',
        'payExpandId'       => 'pay_expand_id',
        'merchantId'        => 'merchant_id',
    ];

    public function validate()
    {
        Model::validateRequired('companyInfo', $this->companyInfo, true);
        Model::validateRequired('legalInfo', $this->legalInfo, true);
        Model::validateRequired('applicationInfo', $this->applicationInfo, true);
        Model::validateRequired('payExpandId', $this->payExpandId, true);
        Model::validateRequired('merchantId', $this->merchantId, true);
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
        if (null !== $this->companyInfo) {
            $res['company_info'] = null !== $this->companyInfo ? $this->companyInfo->toMap() : null;
        }
        if (null !== $this->legalInfo) {
            $res['legal_info'] = null !== $this->legalInfo ? $this->legalInfo->toMap() : null;
        }
        if (null !== $this->applicationInfo) {
            $res['application_info'] = null !== $this->applicationInfo ? $this->applicationInfo->toMap() : null;
        }
        if (null !== $this->payExpandId) {
            $res['pay_expand_id'] = $this->payExpandId;
        }
        if (null !== $this->merchantId) {
            $res['merchant_id'] = $this->merchantId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return UpdateInnerMerchantpayexpandRequest
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
        if (isset($map['company_info'])) {
            $model->companyInfo = CompanyInfoUpdate::fromMap($map['company_info']);
        }
        if (isset($map['legal_info'])) {
            $model->legalInfo = LegalInfoUpdate::fromMap($map['legal_info']);
        }
        if (isset($map['application_info'])) {
            $model->applicationInfo = ApplicationInfoUpdate::fromMap($map['application_info']);
        }
        if (isset($map['pay_expand_id'])) {
            $model->payExpandId = $map['pay_expand_id'];
        }
        if (isset($map['merchant_id'])) {
            $model->merchantId = $map['merchant_id'];
        }

        return $model;
    }
}
