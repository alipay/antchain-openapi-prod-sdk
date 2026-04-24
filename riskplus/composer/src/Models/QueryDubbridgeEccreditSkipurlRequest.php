<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class QueryDubbridgeEccreditSkipurlRequest extends Model
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

    // 业务场景码
    /**
     * @var string
     */
    public $businessScene;

    // 交易流水号
    /**
     * @var string
     */
    public $transactionNo;

    // 客户申请提交后，该笔申请对应的银行内部流水号，一直到客户签约完成都是这个流水号。
    /**
     * @var string
     */
    public $applyNo;

    // 企业信息
    /**
     * @var EcEnterpriseInfo
     */
    public $enterpriseInfo;

    // 申请人信息
    /**
     * @var EcApplicantPersonInfo
     */
    public $applicantPersonInfo;

    // 操作类型
    /**
     * @var string
     */
    public $operateType;
    protected $_name = [
        'authToken'           => 'auth_token',
        'productInstanceId'   => 'product_instance_id',
        'businessScene'       => 'business_scene',
        'transactionNo'       => 'transaction_no',
        'applyNo'             => 'apply_no',
        'enterpriseInfo'      => 'enterprise_info',
        'applicantPersonInfo' => 'applicant_person_info',
        'operateType'         => 'operate_type',
    ];

    public function validate()
    {
        Model::validateRequired('businessScene', $this->businessScene, true);
        Model::validateRequired('transactionNo', $this->transactionNo, true);
        Model::validateRequired('operateType', $this->operateType, true);
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
        if (null !== $this->businessScene) {
            $res['business_scene'] = $this->businessScene;
        }
        if (null !== $this->transactionNo) {
            $res['transaction_no'] = $this->transactionNo;
        }
        if (null !== $this->applyNo) {
            $res['apply_no'] = $this->applyNo;
        }
        if (null !== $this->enterpriseInfo) {
            $res['enterprise_info'] = null !== $this->enterpriseInfo ? $this->enterpriseInfo->toMap() : null;
        }
        if (null !== $this->applicantPersonInfo) {
            $res['applicant_person_info'] = null !== $this->applicantPersonInfo ? $this->applicantPersonInfo->toMap() : null;
        }
        if (null !== $this->operateType) {
            $res['operate_type'] = $this->operateType;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryDubbridgeEccreditSkipurlRequest
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
        if (isset($map['business_scene'])) {
            $model->businessScene = $map['business_scene'];
        }
        if (isset($map['transaction_no'])) {
            $model->transactionNo = $map['transaction_no'];
        }
        if (isset($map['apply_no'])) {
            $model->applyNo = $map['apply_no'];
        }
        if (isset($map['enterprise_info'])) {
            $model->enterpriseInfo = EcEnterpriseInfo::fromMap($map['enterprise_info']);
        }
        if (isset($map['applicant_person_info'])) {
            $model->applicantPersonInfo = EcApplicantPersonInfo::fromMap($map['applicant_person_info']);
        }
        if (isset($map['operate_type'])) {
            $model->operateType = $map['operate_type'];
        }

        return $model;
    }
}
