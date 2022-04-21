<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TAX\Models;

use AlibabaCloud\Tea\Model;

class AuthIcmInvoiceRequest extends Model
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

    // 请求号，调用方企业保证每次调用唯一，蚂蚁发票平台通过该字段和app_id两个字段做幂等判断
    /**
     * @var string
     */
    public $requestId;

    // 查询的企业纳税人识别号
    //
    /**
     * @var string
     */
    public $nsrsbh;

    // 企业名称
    /**
     * @var string
     */
    public $corpName;

    // 身份证号
    /**
     * @var string
     */
    public $identityNumber;

    // 已认证的法人手机号
    /**
     * @var string
     */
    public $cognizantMobile;

    // 已认证的法人姓名
    /**
     * @var string
     */
    public $cognizantName;

    // 透传字段
    /**
     * @var string
     */
    public $bizContext;

    // 授权业务类型
    /**
     * @var string
     */
    public $authType;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'requestId'         => 'request_id',
        'nsrsbh'            => 'nsrsbh',
        'corpName'          => 'corp_name',
        'identityNumber'    => 'identity_number',
        'cognizantMobile'   => 'cognizant_mobile',
        'cognizantName'     => 'cognizant_name',
        'bizContext'        => 'biz_context',
        'authType'          => 'auth_type',
    ];

    public function validate()
    {
        Model::validateRequired('requestId', $this->requestId, true);
        Model::validateRequired('nsrsbh', $this->nsrsbh, true);
        Model::validateRequired('corpName', $this->corpName, true);
        Model::validateRequired('identityNumber', $this->identityNumber, true);
        Model::validateRequired('cognizantMobile', $this->cognizantMobile, true);
        Model::validateRequired('cognizantName', $this->cognizantName, true);
        Model::validateRequired('authType', $this->authType, true);
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
        if (null !== $this->requestId) {
            $res['request_id'] = $this->requestId;
        }
        if (null !== $this->nsrsbh) {
            $res['nsrsbh'] = $this->nsrsbh;
        }
        if (null !== $this->corpName) {
            $res['corp_name'] = $this->corpName;
        }
        if (null !== $this->identityNumber) {
            $res['identity_number'] = $this->identityNumber;
        }
        if (null !== $this->cognizantMobile) {
            $res['cognizant_mobile'] = $this->cognizantMobile;
        }
        if (null !== $this->cognizantName) {
            $res['cognizant_name'] = $this->cognizantName;
        }
        if (null !== $this->bizContext) {
            $res['biz_context'] = $this->bizContext;
        }
        if (null !== $this->authType) {
            $res['auth_type'] = $this->authType;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return AuthIcmInvoiceRequest
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
        if (isset($map['request_id'])) {
            $model->requestId = $map['request_id'];
        }
        if (isset($map['nsrsbh'])) {
            $model->nsrsbh = $map['nsrsbh'];
        }
        if (isset($map['corp_name'])) {
            $model->corpName = $map['corp_name'];
        }
        if (isset($map['identity_number'])) {
            $model->identityNumber = $map['identity_number'];
        }
        if (isset($map['cognizant_mobile'])) {
            $model->cognizantMobile = $map['cognizant_mobile'];
        }
        if (isset($map['cognizant_name'])) {
            $model->cognizantName = $map['cognizant_name'];
        }
        if (isset($map['biz_context'])) {
            $model->bizContext = $map['biz_context'];
        }
        if (isset($map['auth_type'])) {
            $model->authType = $map['auth_type'];
        }

        return $model;
    }
}
