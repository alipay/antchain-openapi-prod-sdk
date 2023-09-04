<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_320bc483f2434f39a3af9ec9f04d3cc0\Models;

use AlibabaCloud\Tea\Model;

class SendAntsaasStaffingcInsureRequest extends Model
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

    // 外部业务号（幂等、异步通知回传）
    /**
     * @var string
     */
    public $outBizNo;

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
    // INITIATIVE_EMPLOYMENT- 长期（次日0点生效）
    /**
     * @var string
     */
    public $bizCode;

    // 投保的险种编码:
    // ACCIDENT: 意外险,
    // EMPLOYER_LIABILITY: 雇主险
    /**
     * @var string
     */
    public $insuranceTypeCode;

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
    // default-5-五类职业（雇主险60万和80万保额暂不支持）
    /**
     * @var string
     */
    public $jobCode;

    // 保障周期：30D、360D（bizCode为长期时必传）
    /**
     * @var string
     */
    public $period;

    // 推荐编码
    /**
     * @var string
     */
    public $recomFlowNo;

    // 地址（bizCode为日单必传）
    /**
     * @var string
     */
    public $address;

    // 投保人列表，extra_msg需传递out_sub_biz_no，外部明细业务号（投保结果通知会回传，自行定义）
    /**
     * @var InsureEmployeeInfo[]
     */
    public $employeeList;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'outBizNo'          => 'out_biz_no',
        'enterpriseName'    => 'enterprise_name',
        'socialCreditCode'  => 'social_credit_code',
        'bizCode'           => 'biz_code',
        'insuranceTypeCode' => 'insurance_type_code',
        'productId'         => 'product_id',
        'jobCode'           => 'job_code',
        'period'            => 'period',
        'recomFlowNo'       => 'recom_flow_no',
        'address'           => 'address',
        'employeeList'      => 'employee_list',
    ];

    public function validate()
    {
        Model::validateRequired('outBizNo', $this->outBizNo, true);
        Model::validateRequired('enterpriseName', $this->enterpriseName, true);
        Model::validateRequired('socialCreditCode', $this->socialCreditCode, true);
        Model::validateRequired('bizCode', $this->bizCode, true);
        Model::validateRequired('insuranceTypeCode', $this->insuranceTypeCode, true);
        Model::validateRequired('productId', $this->productId, true);
        Model::validateRequired('jobCode', $this->jobCode, true);
        Model::validateRequired('employeeList', $this->employeeList, true);
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
        if (null !== $this->outBizNo) {
            $res['out_biz_no'] = $this->outBizNo;
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
        if (null !== $this->productId) {
            $res['product_id'] = $this->productId;
        }
        if (null !== $this->jobCode) {
            $res['job_code'] = $this->jobCode;
        }
        if (null !== $this->period) {
            $res['period'] = $this->period;
        }
        if (null !== $this->recomFlowNo) {
            $res['recom_flow_no'] = $this->recomFlowNo;
        }
        if (null !== $this->address) {
            $res['address'] = $this->address;
        }
        if (null !== $this->employeeList) {
            $res['employee_list'] = [];
            if (null !== $this->employeeList && \is_array($this->employeeList)) {
                $n = 0;
                foreach ($this->employeeList as $item) {
                    $res['employee_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SendAntsaasStaffingcInsureRequest
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
        if (isset($map['out_biz_no'])) {
            $model->outBizNo = $map['out_biz_no'];
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
        if (isset($map['product_id'])) {
            $model->productId = $map['product_id'];
        }
        if (isset($map['job_code'])) {
            $model->jobCode = $map['job_code'];
        }
        if (isset($map['period'])) {
            $model->period = $map['period'];
        }
        if (isset($map['recom_flow_no'])) {
            $model->recomFlowNo = $map['recom_flow_no'];
        }
        if (isset($map['address'])) {
            $model->address = $map['address'];
        }
        if (isset($map['employee_list'])) {
            if (!empty($map['employee_list'])) {
                $model->employeeList = [];
                $n                   = 0;
                foreach ($map['employee_list'] as $item) {
                    $model->employeeList[$n++] = null !== $item ? InsureEmployeeInfo::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
