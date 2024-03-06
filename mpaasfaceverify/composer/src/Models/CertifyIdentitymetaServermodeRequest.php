<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MPAASFACEVERIFY\Models;

use AlibabaCloud\Tea\Model;

class CertifyIdentitymetaServermodeRequest extends Model
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

    // 租户请求的唯一标志，该标识作为对账的关键信息，商户要保...
    /**
     * @var string
     */
    public $bizId;

    // 用户身份信息
    //
    /**
     * @var string
     */
    public $identityParam;

    // 计费规则码
    //
    /**
     * @var string
     */
    public $chargeCode;

    // operation_type
    /**
     * @var string
     */
    public $operationType;

    // 预留扩展业务参数
    //
    /**
     * @var string
     */
    public $externParam;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'bizId'             => 'biz_id',
        'identityParam'     => 'identity_param',
        'chargeCode'        => 'charge_code',
        'operationType'     => 'operation_type',
        'externParam'       => 'extern_param',
    ];

    public function validate()
    {
        Model::validateRequired('bizId', $this->bizId, true);
        Model::validateRequired('identityParam', $this->identityParam, true);
        Model::validateRequired('chargeCode', $this->chargeCode, true);
        Model::validateRequired('externParam', $this->externParam, true);
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
        if (null !== $this->identityParam) {
            $res['identity_param'] = $this->identityParam;
        }
        if (null !== $this->chargeCode) {
            $res['charge_code'] = $this->chargeCode;
        }
        if (null !== $this->operationType) {
            $res['operation_type'] = $this->operationType;
        }
        if (null !== $this->externParam) {
            $res['extern_param'] = $this->externParam;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CertifyIdentitymetaServermodeRequest
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
        if (isset($map['identity_param'])) {
            $model->identityParam = $map['identity_param'];
        }
        if (isset($map['charge_code'])) {
            $model->chargeCode = $map['charge_code'];
        }
        if (isset($map['operation_type'])) {
            $model->operationType = $map['operation_type'];
        }
        if (isset($map['extern_param'])) {
            $model->externParam = $map['extern_param'];
        }

        return $model;
    }
}
