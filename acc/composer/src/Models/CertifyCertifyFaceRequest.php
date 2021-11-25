<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ACC\Models;

use AlibabaCloud\Tea\Model;

class CertifyCertifyFaceRequest extends Model
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

    // 自定义唯一id
    /**
     * @var string
     */
    public $bizId;

    // 租户类型
    /**
     * @var string
     */
    public $tenantId;

    // 姓名
    /**
     * @var string
     */
    public $userName;

    // 身份证号
    /**
     * @var string
     */
    public $userCertNo;

    // 前端页面回调地址
    /**
     * @var string
     */
    public $frontCallbackUrl;

    // 后端接口回调地址
    /**
     * @var string
     */
    public $backCallbackUrl;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'bizId'             => 'biz_id',
        'tenantId'          => 'tenant_id',
        'userName'          => 'user_name',
        'userCertNo'        => 'user_cert_no',
        'frontCallbackUrl'  => 'front_callback_url',
        'backCallbackUrl'   => 'back_callback_url',
    ];

    public function validate()
    {
        Model::validateRequired('bizId', $this->bizId, true);
        Model::validateRequired('tenantId', $this->tenantId, true);
        Model::validateRequired('userName', $this->userName, true);
        Model::validateRequired('userCertNo', $this->userCertNo, true);
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
        if (null !== $this->bizId) {
            $res['biz_id'] = $this->bizId;
        }
        if (null !== $this->tenantId) {
            $res['tenant_id'] = $this->tenantId;
        }
        if (null !== $this->userName) {
            $res['user_name'] = $this->userName;
        }
        if (null !== $this->userCertNo) {
            $res['user_cert_no'] = $this->userCertNo;
        }
        if (null !== $this->frontCallbackUrl) {
            $res['front_callback_url'] = $this->frontCallbackUrl;
        }
        if (null !== $this->backCallbackUrl) {
            $res['back_callback_url'] = $this->backCallbackUrl;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CertifyCertifyFaceRequest
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
        if (isset($map['biz_id'])) {
            $model->bizId = $map['biz_id'];
        }
        if (isset($map['tenant_id'])) {
            $model->tenantId = $map['tenant_id'];
        }
        if (isset($map['user_name'])) {
            $model->userName = $map['user_name'];
        }
        if (isset($map['user_cert_no'])) {
            $model->userCertNo = $map['user_cert_no'];
        }
        if (isset($map['front_callback_url'])) {
            $model->frontCallbackUrl = $map['front_callback_url'];
        }
        if (isset($map['back_callback_url'])) {
            $model->backCallbackUrl = $map['back_callback_url'];
        }

        return $model;
    }
}
