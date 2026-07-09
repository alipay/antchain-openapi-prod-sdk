<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class CreateLeaseRealpersonRequest extends Model
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

    // 身份信息来源类型，当前仅支持证件（CERT_INFO）
    /**
     * @var string
     */
    public $identityType;

    // 证件类型，当前仅支持身份证（IDENTITY_CARD）
    /**
     * @var string
     */
    public $certType;

    // 真实姓名
    /**
     * @var string
     */
    public $certName;

    // 证件号码
    /**
     * @var string
     */
    public $certNo;

    // 商户请求的唯一标识。
    // 值为 32 位长度的字母数字组合。其中，前面几位字符是商户自定义的简称，中间几位可以使用一段时间，后段可以使用一个随机或递增序列。该值也可以使用 UUID
    /**
     * @var string
     */
    public $outerOrderNo;

    // 认证结束回跳地址
    /**
     * @var string
     */
    public $returnUrl;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'identityType'      => 'identity_type',
        'certType'          => 'cert_type',
        'certName'          => 'cert_name',
        'certNo'            => 'cert_no',
        'outerOrderNo'      => 'outer_order_no',
        'returnUrl'         => 'return_url',
    ];

    public function validate()
    {
        Model::validateRequired('identityType', $this->identityType, true);
        Model::validateRequired('certType', $this->certType, true);
        Model::validateRequired('certName', $this->certName, true);
        Model::validateRequired('certNo', $this->certNo, true);
        Model::validateRequired('outerOrderNo', $this->outerOrderNo, true);
        Model::validateRequired('returnUrl', $this->returnUrl, true);
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
        if (null !== $this->identityType) {
            $res['identity_type'] = $this->identityType;
        }
        if (null !== $this->certType) {
            $res['cert_type'] = $this->certType;
        }
        if (null !== $this->certName) {
            $res['cert_name'] = $this->certName;
        }
        if (null !== $this->certNo) {
            $res['cert_no'] = $this->certNo;
        }
        if (null !== $this->outerOrderNo) {
            $res['outer_order_no'] = $this->outerOrderNo;
        }
        if (null !== $this->returnUrl) {
            $res['return_url'] = $this->returnUrl;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateLeaseRealpersonRequest
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
        if (isset($map['identity_type'])) {
            $model->identityType = $map['identity_type'];
        }
        if (isset($map['cert_type'])) {
            $model->certType = $map['cert_type'];
        }
        if (isset($map['cert_name'])) {
            $model->certName = $map['cert_name'];
        }
        if (isset($map['cert_no'])) {
            $model->certNo = $map['cert_no'];
        }
        if (isset($map['outer_order_no'])) {
            $model->outerOrderNo = $map['outer_order_no'];
        }
        if (isset($map['return_url'])) {
            $model->returnUrl = $map['return_url'];
        }

        return $model;
    }
}
