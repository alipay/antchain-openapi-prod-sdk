<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class QueryEsignAccountRequest extends Model
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

    // 三方账号id
    /**
     * @var string
     */
    public $thirdPartyUserId;

    // 用户类型
    /**
     * @var string
     */
    public $userType;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'thirdPartyUserId'  => 'third_party_user_id',
        'userType'          => 'user_type',
    ];

    public function validate()
    {
        Model::validateRequired('thirdPartyUserId', $this->thirdPartyUserId, true);
        Model::validateRequired('userType', $this->userType, true);
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
        if (null !== $this->thirdPartyUserId) {
            $res['third_party_user_id'] = $this->thirdPartyUserId;
        }
        if (null !== $this->userType) {
            $res['user_type'] = $this->userType;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryEsignAccountRequest
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
        if (isset($map['third_party_user_id'])) {
            $model->thirdPartyUserId = $map['third_party_user_id'];
        }
        if (isset($map['user_type'])) {
            $model->userType = $map['user_type'];
        }

        return $model;
    }
}
