<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TAX\Models;

use AlibabaCloud\Tea\Model;

class AuthIcmEnterpriseRequest extends Model
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

    // 身份id，统一社会信用编码or其他
    /**
     * @var string
     */
    public $identityId;

    // 企业名称
    /**
     * @var string
     */
    public $identityName;

    // 授权类型，不动产100，电力200
    /**
     * @var string
     */
    public $authType;

    // 授权订单号
    /**
     * @var string
     */
    public $orderNo;

    // 扩展信息
    /**
     * @var StandardAuthExtendInfoRequest
     */
    public $extendInfo;

    // 法人姓名
    /**
     * @var string
     */
    public $cognizantName;

    // 法人手机号
    /**
     * @var string
     */
    public $cognizantMobile;

    // 法人身份证号
    /**
     * @var string
     */
    public $cognizantId;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'identityId'        => 'identity_id',
        'identityName'      => 'identity_name',
        'authType'          => 'auth_type',
        'orderNo'           => 'order_no',
        'extendInfo'        => 'extend_info',
        'cognizantName'     => 'cognizant_name',
        'cognizantMobile'   => 'cognizant_mobile',
        'cognizantId'       => 'cognizant_id',
    ];

    public function validate()
    {
        Model::validateRequired('identityId', $this->identityId, true);
        Model::validateRequired('authType', $this->authType, true);
        Model::validateRequired('orderNo', $this->orderNo, true);
        Model::validateRequired('extendInfo', $this->extendInfo, true);
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
        if (null !== $this->authType) {
            $res['auth_type'] = $this->authType;
        }
        if (null !== $this->orderNo) {
            $res['order_no'] = $this->orderNo;
        }
        if (null !== $this->extendInfo) {
            $res['extend_info'] = null !== $this->extendInfo ? $this->extendInfo->toMap() : null;
        }
        if (null !== $this->cognizantName) {
            $res['cognizant_name'] = $this->cognizantName;
        }
        if (null !== $this->cognizantMobile) {
            $res['cognizant_mobile'] = $this->cognizantMobile;
        }
        if (null !== $this->cognizantId) {
            $res['cognizant_id'] = $this->cognizantId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return AuthIcmEnterpriseRequest
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
        if (isset($map['auth_type'])) {
            $model->authType = $map['auth_type'];
        }
        if (isset($map['order_no'])) {
            $model->orderNo = $map['order_no'];
        }
        if (isset($map['extend_info'])) {
            $model->extendInfo = StandardAuthExtendInfoRequest::fromMap($map['extend_info']);
        }
        if (isset($map['cognizant_name'])) {
            $model->cognizantName = $map['cognizant_name'];
        }
        if (isset($map['cognizant_mobile'])) {
            $model->cognizantMobile = $map['cognizant_mobile'];
        }
        if (isset($map['cognizant_id'])) {
            $model->cognizantId = $map['cognizant_id'];
        }

        return $model;
    }
}
