<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\INSURANCE_SAAS\Models;

use AlibabaCloud\Tea\Model;

class NotifyInterestScenesubjectRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 请求流水号，每次请求不一样
    /**
     * @var string
     */
    public $requestNo;

    // 权益流水号
    /**
     * @var string
     */
    public $interestNo;

    // 产品编码
    /**
     * @var string
     */
    public $productCode;

    // 申请审批额度，单位元
    /**
     * @var string
     */
    public $applyLimitAmount;

    // 申请额度审批状态
    /**
     * @var string
     */
    public $applyLimitStatus;

    // 权益标的信息,JSON字符串
    /**
     * @var string
     */
    public $interestSubjectInfo;

    // 权益版本
    /**
     * @var string
     */
    public $interestVersion;
    protected $_name = [
        'authToken'           => 'auth_token',
        'requestNo'           => 'request_no',
        'interestNo'          => 'interest_no',
        'productCode'         => 'product_code',
        'applyLimitAmount'    => 'apply_limit_amount',
        'applyLimitStatus'    => 'apply_limit_status',
        'interestSubjectInfo' => 'interest_subject_info',
        'interestVersion'     => 'interest_version',
    ];

    public function validate()
    {
        Model::validateRequired('requestNo', $this->requestNo, true);
        Model::validateRequired('interestNo', $this->interestNo, true);
        Model::validateRequired('productCode', $this->productCode, true);
        Model::validateRequired('applyLimitStatus', $this->applyLimitStatus, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->requestNo) {
            $res['request_no'] = $this->requestNo;
        }
        if (null !== $this->interestNo) {
            $res['interest_no'] = $this->interestNo;
        }
        if (null !== $this->productCode) {
            $res['product_code'] = $this->productCode;
        }
        if (null !== $this->applyLimitAmount) {
            $res['apply_limit_amount'] = $this->applyLimitAmount;
        }
        if (null !== $this->applyLimitStatus) {
            $res['apply_limit_status'] = $this->applyLimitStatus;
        }
        if (null !== $this->interestSubjectInfo) {
            $res['interest_subject_info'] = $this->interestSubjectInfo;
        }
        if (null !== $this->interestVersion) {
            $res['interest_version'] = $this->interestVersion;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return NotifyInterestScenesubjectRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['request_no'])) {
            $model->requestNo = $map['request_no'];
        }
        if (isset($map['interest_no'])) {
            $model->interestNo = $map['interest_no'];
        }
        if (isset($map['product_code'])) {
            $model->productCode = $map['product_code'];
        }
        if (isset($map['apply_limit_amount'])) {
            $model->applyLimitAmount = $map['apply_limit_amount'];
        }
        if (isset($map['apply_limit_status'])) {
            $model->applyLimitStatus = $map['apply_limit_status'];
        }
        if (isset($map['interest_subject_info'])) {
            $model->interestSubjectInfo = $map['interest_subject_info'];
        }
        if (isset($map['interest_version'])) {
            $model->interestVersion = $map['interest_version'];
        }

        return $model;
    }
}
