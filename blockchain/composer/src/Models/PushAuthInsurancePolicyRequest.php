<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class PushAuthInsurancePolicyRequest extends Model
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

    // 投保人证件号码
    /**
     * @var string
     */
    public $certNo;

    // 投保人证件类型
    /**
     * @var string
     */
    public $certType;

    // 投保人的did
    /**
     * @var string
     */
    public $did;

    // 保单失效时间
    /**
     * @var string
     */
    public $effectEndTime;

    // 保单生效时间
    /**
     * @var string
     */
    public $effectStartTime;

    // 投保时间
    /**
     * @var string
     */
    public $insuredTime;

    // 出单时间
    /**
     * @var string
     */
    public $issueTime;

    // 投保人姓名
    /**
     * @var string
     */
    public $name;

    // 保单编号
    /**
     * @var string
     */
    public $policyNo;

    // 保单类型
    /**
     * @var string
     */
    public $policyType;

    // 产品名称
    /**
     * @var string
     */
    public $prodName;

    // 产品编号
    /**
     * @var string
     */
    public $prodNo;

    // 行为回溯的整体编号
    /**
     * @var string
     */
    public $userTraceCode;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'certNo'            => 'cert_no',
        'certType'          => 'cert_type',
        'did'               => 'did',
        'effectEndTime'     => 'effect_end_time',
        'effectStartTime'   => 'effect_start_time',
        'insuredTime'       => 'insured_time',
        'issueTime'         => 'issue_time',
        'name'              => 'name',
        'policyNo'          => 'policy_no',
        'policyType'        => 'policy_type',
        'prodName'          => 'prod_name',
        'prodNo'            => 'prod_no',
        'userTraceCode'     => 'user_trace_code',
    ];

    public function validate()
    {
        Model::validateRequired('certNo', $this->certNo, true);
        Model::validateRequired('did', $this->did, true);
        Model::validateRequired('effectEndTime', $this->effectEndTime, true);
        Model::validateRequired('effectStartTime', $this->effectStartTime, true);
        Model::validateRequired('insuredTime', $this->insuredTime, true);
        Model::validateRequired('issueTime', $this->issueTime, true);
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('policyNo', $this->policyNo, true);
        Model::validateRequired('prodName', $this->prodName, true);
        Model::validateRequired('prodNo', $this->prodNo, true);
        Model::validateRequired('userTraceCode', $this->userTraceCode, true);
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
        if (null !== $this->certNo) {
            $res['cert_no'] = $this->certNo;
        }
        if (null !== $this->certType) {
            $res['cert_type'] = $this->certType;
        }
        if (null !== $this->did) {
            $res['did'] = $this->did;
        }
        if (null !== $this->effectEndTime) {
            $res['effect_end_time'] = $this->effectEndTime;
        }
        if (null !== $this->effectStartTime) {
            $res['effect_start_time'] = $this->effectStartTime;
        }
        if (null !== $this->insuredTime) {
            $res['insured_time'] = $this->insuredTime;
        }
        if (null !== $this->issueTime) {
            $res['issue_time'] = $this->issueTime;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->policyNo) {
            $res['policy_no'] = $this->policyNo;
        }
        if (null !== $this->policyType) {
            $res['policy_type'] = $this->policyType;
        }
        if (null !== $this->prodName) {
            $res['prod_name'] = $this->prodName;
        }
        if (null !== $this->prodNo) {
            $res['prod_no'] = $this->prodNo;
        }
        if (null !== $this->userTraceCode) {
            $res['user_trace_code'] = $this->userTraceCode;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return PushAuthInsurancePolicyRequest
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
        if (isset($map['cert_no'])) {
            $model->certNo = $map['cert_no'];
        }
        if (isset($map['cert_type'])) {
            $model->certType = $map['cert_type'];
        }
        if (isset($map['did'])) {
            $model->did = $map['did'];
        }
        if (isset($map['effect_end_time'])) {
            $model->effectEndTime = $map['effect_end_time'];
        }
        if (isset($map['effect_start_time'])) {
            $model->effectStartTime = $map['effect_start_time'];
        }
        if (isset($map['insured_time'])) {
            $model->insuredTime = $map['insured_time'];
        }
        if (isset($map['issue_time'])) {
            $model->issueTime = $map['issue_time'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['policy_no'])) {
            $model->policyNo = $map['policy_no'];
        }
        if (isset($map['policy_type'])) {
            $model->policyType = $map['policy_type'];
        }
        if (isset($map['prod_name'])) {
            $model->prodName = $map['prod_name'];
        }
        if (isset($map['prod_no'])) {
            $model->prodNo = $map['prod_no'];
        }
        if (isset($map['user_trace_code'])) {
            $model->userTraceCode = $map['user_trace_code'];
        }

        return $model;
    }
}
