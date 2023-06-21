<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TAX\Models;

use AlibabaCloud\Tea\Model;

class MatchIcmSimpleauthRequest extends Model
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

    // 租户号/子租户号，如果为租户号获取，则为租户号，如果为子租户号获取，则传输子租户号
    /**
     * @var string
     */
    public $instCode;

    // 纳税人识别号
    /**
     * @var string
     */
    public $identityId;

    // 用于幂等控制
    /**
     * @var string
     */
    public $bizRequestId;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'instCode'          => 'inst_code',
        'identityId'        => 'identity_id',
        'bizRequestId'      => 'biz_request_id',
    ];

    public function validate()
    {
        Model::validateRequired('instCode', $this->instCode, true);
        Model::validateRequired('identityId', $this->identityId, true);
        Model::validateRequired('bizRequestId', $this->bizRequestId, true);
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
        if (null !== $this->instCode) {
            $res['inst_code'] = $this->instCode;
        }
        if (null !== $this->identityId) {
            $res['identity_id'] = $this->identityId;
        }
        if (null !== $this->bizRequestId) {
            $res['biz_request_id'] = $this->bizRequestId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return MatchIcmSimpleauthRequest
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
        if (isset($map['inst_code'])) {
            $model->instCode = $map['inst_code'];
        }
        if (isset($map['identity_id'])) {
            $model->identityId = $map['identity_id'];
        }
        if (isset($map['biz_request_id'])) {
            $model->bizRequestId = $map['biz_request_id'];
        }

        return $model;
    }
}
