<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\STLR\Models;

use AlibabaCloud\Tea\Model;

class DetailEcarEnterprisememberRequest extends Model
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

    // 注册会员手机号码
    /**
     * @var string
     */
    public $mobile;

    // 注册会员身份证号码
    /**
     * @var string
     */
    public $identityCardCode;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'mobile'            => 'mobile',
        'identityCardCode'  => 'identity_card_code',
    ];

    public function validate()
    {
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
        if (null !== $this->mobile) {
            $res['mobile'] = $this->mobile;
        }
        if (null !== $this->identityCardCode) {
            $res['identity_card_code'] = $this->identityCardCode;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return DetailEcarEnterprisememberRequest
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
        if (isset($map['mobile'])) {
            $model->mobile = $map['mobile'];
        }
        if (isset($map['identity_card_code'])) {
            $model->identityCardCode = $map['identity_card_code'];
        }

        return $model;
    }
}
