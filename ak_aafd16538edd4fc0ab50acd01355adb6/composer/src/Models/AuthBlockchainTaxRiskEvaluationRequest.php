<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_aafd16538edd4fc0ab50acd01355adb6\Models;

use AlibabaCloud\Tea\Model;

class AuthBlockchainTaxRiskEvaluationRequest extends Model
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

    // 个人身份证号
    /**
     * @var string
     */
    public $identityId;

    // 个人姓名
    /**
     * @var string
     */
    public $identityName;

    // 企业的统一社会信用编码
    /**
     * @var string
     */
    public $enterpriseId;

    // 企业的名称
    /**
     * @var string
     */
    public $enterpriseName;

    // 企业或者个人企业：ENTERPRISE  个人：PERSONAL
    //
    /**
     * @var string
     */
    public $identityType;

    // 授权的业务类型
    /**
     * @var string
     */
    public $authType;

    // 授权订单号
    /**
     * @var string
     */
    public $orderNo;

    // 子渠道渠道编码，需要同步蚂蚁，由蚂蚁设置。如果是银行本身，可不填
    // 备注：如果同一信贷客户在不同银行的调用需要严格区分，分别授权
    //
    /**
     * @var string
     */
    public $subTenant;

    // 扩展信息
    /**
     * @var RiskEvaluationExtendInfoRequest
     */
    public $extendInfo;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'identityId'        => 'identity_id',
        'identityName'      => 'identity_name',
        'enterpriseId'      => 'enterprise_id',
        'enterpriseName'    => 'enterprise_name',
        'identityType'      => 'identity_type',
        'authType'          => 'auth_type',
        'orderNo'           => 'order_no',
        'subTenant'         => 'sub_tenant',
        'extendInfo'        => 'extend_info',
    ];

    public function validate()
    {
        Model::validateRequired('identityId', $this->identityId, true);
        Model::validateRequired('identityType', $this->identityType, true);
        Model::validateRequired('authType', $this->authType, true);
        Model::validateRequired('orderNo', $this->orderNo, true);
        Model::validateRequired('extendInfo', $this->extendInfo, true);
        Model::validateMaxLength('identityId', $this->identityId, 30);
        Model::validateMaxLength('identityName', $this->identityName, 128);
        Model::validateMaxLength('enterpriseId', $this->enterpriseId, 64);
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
        if (null !== $this->identityId) {
            $res['identity_id'] = $this->identityId;
        }
        if (null !== $this->identityName) {
            $res['identity_name'] = $this->identityName;
        }
        if (null !== $this->enterpriseId) {
            $res['enterprise_id'] = $this->enterpriseId;
        }
        if (null !== $this->enterpriseName) {
            $res['enterprise_name'] = $this->enterpriseName;
        }
        if (null !== $this->identityType) {
            $res['identity_type'] = $this->identityType;
        }
        if (null !== $this->authType) {
            $res['auth_type'] = $this->authType;
        }
        if (null !== $this->orderNo) {
            $res['order_no'] = $this->orderNo;
        }
        if (null !== $this->subTenant) {
            $res['sub_tenant'] = $this->subTenant;
        }
        if (null !== $this->extendInfo) {
            $res['extend_info'] = null !== $this->extendInfo ? $this->extendInfo->toMap() : null;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return AuthBlockchainTaxRiskEvaluationRequest
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
        if (isset($map['identity_id'])) {
            $model->identityId = $map['identity_id'];
        }
        if (isset($map['identity_name'])) {
            $model->identityName = $map['identity_name'];
        }
        if (isset($map['enterprise_id'])) {
            $model->enterpriseId = $map['enterprise_id'];
        }
        if (isset($map['enterprise_name'])) {
            $model->enterpriseName = $map['enterprise_name'];
        }
        if (isset($map['identity_type'])) {
            $model->identityType = $map['identity_type'];
        }
        if (isset($map['auth_type'])) {
            $model->authType = $map['auth_type'];
        }
        if (isset($map['order_no'])) {
            $model->orderNo = $map['order_no'];
        }
        if (isset($map['sub_tenant'])) {
            $model->subTenant = $map['sub_tenant'];
        }
        if (isset($map['extend_info'])) {
            $model->extendInfo = RiskEvaluationExtendInfoRequest::fromMap($map['extend_info']);
        }

        return $model;
    }
}
