<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\STLR\Models;

use AlibabaCloud\Tea\Model;

class RegisterEcarEnterprisememberRequest extends Model
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

    // 注册会员在蚂蚁DIS服务的DID账号
    /**
     * @var string
     */
    public $accountDid;

    // 注册会员姓名
    /**
     * @var string
     */
    public $name;

    // 注册会员身份证号码
    /**
     * @var string
     */
    public $identityCardCode;

    // 手机号码
    /**
     * @var string
     */
    public $mobile;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'accountDid'        => 'account_did',
        'name'              => 'name',
        'identityCardCode'  => 'identity_card_code',
        'mobile'            => 'mobile',
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
        if (null !== $this->accountDid) {
            $res['account_did'] = $this->accountDid;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->identityCardCode) {
            $res['identity_card_code'] = $this->identityCardCode;
        }
        if (null !== $this->mobile) {
            $res['mobile'] = $this->mobile;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return RegisterEcarEnterprisememberRequest
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
        if (isset($map['account_did'])) {
            $model->accountDid = $map['account_did'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['identity_card_code'])) {
            $model->identityCardCode = $map['identity_card_code'];
        }
        if (isset($map['mobile'])) {
            $model->mobile = $map['mobile'];
        }

        return $model;
    }
}
