<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\HK_SECURITYTECH\Models;

use AlibabaCloud\Tea\Model;

class CreateBlueshieldSecuritypictureRequest extends Model
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

    // 应用名
    //
    /**
     * @var string
     */
    public $appName;

    // 客户名
    //
    /**
     * @var string
     */
    public $clientName;

    // 操作系统
    //
    /**
     * @var string
     */
    public $osType;

    // 包名
    //
    /**
     * @var string
     */
    public $packageName;

    // 签名信息
    //
    /**
     * @var string
     */
    public $certSign;

    // 签名秘钥内容
    //
    /**
     * @var string
     */
    public $appKeyData;

    // 加密秘钥内容
    //
    /**
     * @var string
     */
    public $securityData;

    // 自定义秘钥内容
    //
    /**
     * @var string
     */
    public $extraData;

    // 白盒秘钥内容
    //
    /**
     * @var string
     */
    public $whiteBoxData;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'appName'           => 'app_name',
        'clientName'        => 'client_name',
        'osType'            => 'os_type',
        'packageName'       => 'package_name',
        'certSign'          => 'cert_sign',
        'appKeyData'        => 'app_key_data',
        'securityData'      => 'security_data',
        'extraData'         => 'extra_data',
        'whiteBoxData'      => 'white_box_data',
    ];

    public function validate()
    {
        Model::validateRequired('clientName', $this->clientName, true);
        Model::validateRequired('osType', $this->osType, true);
        Model::validateRequired('packageName', $this->packageName, true);
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
        if (null !== $this->appName) {
            $res['app_name'] = $this->appName;
        }
        if (null !== $this->clientName) {
            $res['client_name'] = $this->clientName;
        }
        if (null !== $this->osType) {
            $res['os_type'] = $this->osType;
        }
        if (null !== $this->packageName) {
            $res['package_name'] = $this->packageName;
        }
        if (null !== $this->certSign) {
            $res['cert_sign'] = $this->certSign;
        }
        if (null !== $this->appKeyData) {
            $res['app_key_data'] = $this->appKeyData;
        }
        if (null !== $this->securityData) {
            $res['security_data'] = $this->securityData;
        }
        if (null !== $this->extraData) {
            $res['extra_data'] = $this->extraData;
        }
        if (null !== $this->whiteBoxData) {
            $res['white_box_data'] = $this->whiteBoxData;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateBlueshieldSecuritypictureRequest
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
        if (isset($map['app_name'])) {
            $model->appName = $map['app_name'];
        }
        if (isset($map['client_name'])) {
            $model->clientName = $map['client_name'];
        }
        if (isset($map['os_type'])) {
            $model->osType = $map['os_type'];
        }
        if (isset($map['package_name'])) {
            $model->packageName = $map['package_name'];
        }
        if (isset($map['cert_sign'])) {
            $model->certSign = $map['cert_sign'];
        }
        if (isset($map['app_key_data'])) {
            $model->appKeyData = $map['app_key_data'];
        }
        if (isset($map['security_data'])) {
            $model->securityData = $map['security_data'];
        }
        if (isset($map['extra_data'])) {
            $model->extraData = $map['extra_data'];
        }
        if (isset($map['white_box_data'])) {
            $model->whiteBoxData = $map['white_box_data'];
        }

        return $model;
    }
}
