<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_1f51f68dfc5d438387dbbaa76f5997f4\Models;

use AlibabaCloud\Tea\Model;

class QueryAntchainMytcMiniCodeRequest extends Model
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

    // 溯源码
    /**
     * @var string
     */
    public $code;

    // 用户信息
    /**
     * @var ScanUserInfo
     */
    public $userInfo;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'code'              => 'code',
        'userInfo'          => 'user_info',
    ];

    public function validate()
    {
        Model::validateRequired('code', $this->code, true);
        Model::validateMaxLength('code', $this->code, 160);
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
        if (null !== $this->code) {
            $res['code'] = $this->code;
        }
        if (null !== $this->userInfo) {
            $res['user_info'] = null !== $this->userInfo ? $this->userInfo->toMap() : null;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryAntchainMytcMiniCodeRequest
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
        if (isset($map['code'])) {
            $model->code = $map['code'];
        }
        if (isset($map['user_info'])) {
            $model->userInfo = ScanUserInfo::fromMap($map['user_info']);
        }

        return $model;
    }
}
