<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ATO\Models;

use AlibabaCloud\Tea\Model;

class RelationPage extends Model
{
    // 分账关系id
    /**
     * @example 1231234343423423
     *
     * @var string
     */
    public $relationId;

    // 分账公司名称
    /**
     * @example xx公司
     *
     * @var string
     */
    public $companyName;

    // 分账公司名称统一社会信用代码
    /**
     * @example 912123asdq2131
     *
     * @var string
     */
    public $merchantId;

    // 审核状态
    /**
     * @example AUDIT_PASSED
     *
     * @var string
     */
    public $status;

    // 商户公司统一社会信用代码
    /**
     * @example 123123122134wexx
     *
     * @var string
     */
    public $subjectMerchantId;

    // 商户公司名称
    /**
     * @example xx公司
     *
     * @var string
     */
    public $subjectCompanyName;

    // 支付渠道
    // ALIPAY
    // JDPAY
    /**
     * @example ALIPAY
     *
     * @var string
     */
    public $payChannel;
    protected $_name = [
        'relationId'         => 'relation_id',
        'companyName'        => 'company_name',
        'merchantId'         => 'merchant_id',
        'status'             => 'status',
        'subjectMerchantId'  => 'subject_merchant_id',
        'subjectCompanyName' => 'subject_company_name',
        'payChannel'         => 'pay_channel',
    ];

    public function validate()
    {
        Model::validateRequired('relationId', $this->relationId, true);
        Model::validateRequired('companyName', $this->companyName, true);
        Model::validateRequired('merchantId', $this->merchantId, true);
        Model::validateRequired('status', $this->status, true);
        Model::validateRequired('subjectMerchantId', $this->subjectMerchantId, true);
        Model::validateRequired('subjectCompanyName', $this->subjectCompanyName, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->relationId) {
            $res['relation_id'] = $this->relationId;
        }
        if (null !== $this->companyName) {
            $res['company_name'] = $this->companyName;
        }
        if (null !== $this->merchantId) {
            $res['merchant_id'] = $this->merchantId;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->subjectMerchantId) {
            $res['subject_merchant_id'] = $this->subjectMerchantId;
        }
        if (null !== $this->subjectCompanyName) {
            $res['subject_company_name'] = $this->subjectCompanyName;
        }
        if (null !== $this->payChannel) {
            $res['pay_channel'] = $this->payChannel;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return RelationPage
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['relation_id'])) {
            $model->relationId = $map['relation_id'];
        }
        if (isset($map['company_name'])) {
            $model->companyName = $map['company_name'];
        }
        if (isset($map['merchant_id'])) {
            $model->merchantId = $map['merchant_id'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }
        if (isset($map['subject_merchant_id'])) {
            $model->subjectMerchantId = $map['subject_merchant_id'];
        }
        if (isset($map['subject_company_name'])) {
            $model->subjectCompanyName = $map['subject_company_name'];
        }
        if (isset($map['pay_channel'])) {
            $model->payChannel = $map['pay_channel'];
        }

        return $model;
    }
}
