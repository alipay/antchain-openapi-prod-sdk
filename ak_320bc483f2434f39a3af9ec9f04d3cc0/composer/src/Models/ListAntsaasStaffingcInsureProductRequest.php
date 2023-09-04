<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_320bc483f2434f39a3af9ec9f04d3cc0\Models;

use AlibabaCloud\Tea\Model;

class ListAntsaasStaffingcInsureProductRequest extends Model
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

    // 企业名称
    /**
     * @var string
     */
    public $enterpriseName;

    // 统一社会信用代码
    /**
     * @var string
     */
    public $socialCreditCode;

    // 保险场景码:
    // FLEXIBLE_EMPLOYMENT-日单（实时生效）
    // INITIATIVE_EMPLOYMENT-长期（次日0点生效）
    /**
     * @var string
     */
    public $bizCode;

    // 险种编码:
    // ACCIDENT: 意外险
    // EMPLOYER_LIABILITY: 雇主险
    /**
     * @var string
     */
    public $insuranceTypeCode;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'enterpriseName'    => 'enterprise_name',
        'socialCreditCode'  => 'social_credit_code',
        'bizCode'           => 'biz_code',
        'insuranceTypeCode' => 'insurance_type_code',
    ];

    public function validate()
    {
        Model::validateRequired('enterpriseName', $this->enterpriseName, true);
        Model::validateRequired('socialCreditCode', $this->socialCreditCode, true);
        Model::validateRequired('bizCode', $this->bizCode, true);
        Model::validateRequired('insuranceTypeCode', $this->insuranceTypeCode, true);
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
        if (null !== $this->enterpriseName) {
            $res['enterprise_name'] = $this->enterpriseName;
        }
        if (null !== $this->socialCreditCode) {
            $res['social_credit_code'] = $this->socialCreditCode;
        }
        if (null !== $this->bizCode) {
            $res['biz_code'] = $this->bizCode;
        }
        if (null !== $this->insuranceTypeCode) {
            $res['insurance_type_code'] = $this->insuranceTypeCode;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ListAntsaasStaffingcInsureProductRequest
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
        if (isset($map['enterprise_name'])) {
            $model->enterpriseName = $map['enterprise_name'];
        }
        if (isset($map['social_credit_code'])) {
            $model->socialCreditCode = $map['social_credit_code'];
        }
        if (isset($map['biz_code'])) {
            $model->bizCode = $map['biz_code'];
        }
        if (isset($map['insurance_type_code'])) {
            $model->insuranceTypeCode = $map['insurance_type_code'];
        }

        return $model;
    }
}
