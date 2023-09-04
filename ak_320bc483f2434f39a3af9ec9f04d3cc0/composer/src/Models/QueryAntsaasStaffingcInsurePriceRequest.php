<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_320bc483f2434f39a3af9ec9f04d3cc0\Models;

use AlibabaCloud\Tea\Model;

class QueryAntsaasStaffingcInsurePriceRequest extends Model
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

    // 产品ID
    /**
     * @var string
     */
    public $productId;

    // 职业编码:
    // default-1-一类职业;
    // default-2-二类职业;
    // default-3-三类职业;
    // default-4-四类职业;
    /**
     * @var string
     */
    public $jobCode;

    // 周期：
    // 1D、
    // 30D、
    // 360D
    /**
     * @var string
     */
    public $period;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'enterpriseName'    => 'enterprise_name',
        'socialCreditCode'  => 'social_credit_code',
        'productId'         => 'product_id',
        'jobCode'           => 'job_code',
        'period'            => 'period',
    ];

    public function validate()
    {
        Model::validateRequired('enterpriseName', $this->enterpriseName, true);
        Model::validateRequired('socialCreditCode', $this->socialCreditCode, true);
        Model::validateRequired('productId', $this->productId, true);
        Model::validateRequired('jobCode', $this->jobCode, true);
        Model::validateRequired('period', $this->period, true);
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
        if (null !== $this->productId) {
            $res['product_id'] = $this->productId;
        }
        if (null !== $this->jobCode) {
            $res['job_code'] = $this->jobCode;
        }
        if (null !== $this->period) {
            $res['period'] = $this->period;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryAntsaasStaffingcInsurePriceRequest
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
        if (isset($map['product_id'])) {
            $model->productId = $map['product_id'];
        }
        if (isset($map['job_code'])) {
            $model->jobCode = $map['job_code'];
        }
        if (isset($map['period'])) {
            $model->period = $map['period'];
        }

        return $model;
    }
}
