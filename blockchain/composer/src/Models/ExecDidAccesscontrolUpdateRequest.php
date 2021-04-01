<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class ExecDidAccesscontrolUpdateRequest extends Model
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

    // 发起请求的did
    /**
     * @var string
     */
    public $fromdid;

    // 发起者私钥对其他字段的签名
    /**
     * @var string
     */
    public $requestSignature;

    // 被更新权限的did
    /**
     * @var string
     */
    public $todid;

    // 更新后的权限
    /**
     * @var string[]
     */
    public $type;

    // 场景码，找dis工作人员进行分配
    /**
     * @var string
     */
    public $bizCode;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'fromdid'           => 'fromdid',
        'requestSignature'  => 'request_signature',
        'todid'             => 'todid',
        'type'              => 'type',
        'bizCode'           => 'biz_code',
    ];

    public function validate()
    {
        Model::validateRequired('fromdid', $this->fromdid, true);
        Model::validateRequired('requestSignature', $this->requestSignature, true);
        Model::validateRequired('todid', $this->todid, true);
        Model::validateRequired('type', $this->type, true);
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
        if (null !== $this->fromdid) {
            $res['fromdid'] = $this->fromdid;
        }
        if (null !== $this->requestSignature) {
            $res['request_signature'] = $this->requestSignature;
        }
        if (null !== $this->todid) {
            $res['todid'] = $this->todid;
        }
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }
        if (null !== $this->bizCode) {
            $res['biz_code'] = $this->bizCode;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ExecDidAccesscontrolUpdateRequest
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
        if (isset($map['fromdid'])) {
            $model->fromdid = $map['fromdid'];
        }
        if (isset($map['request_signature'])) {
            $model->requestSignature = $map['request_signature'];
        }
        if (isset($map['todid'])) {
            $model->todid = $map['todid'];
        }
        if (isset($map['type'])) {
            if (!empty($map['type'])) {
                $model->type = $map['type'];
            }
        }
        if (isset($map['biz_code'])) {
            $model->bizCode = $map['biz_code'];
        }

        return $model;
    }
}
