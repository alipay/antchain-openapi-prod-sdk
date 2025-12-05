<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\DAS\Models;

use AlibabaCloud\Tea\Model;

class CallbackAuthRecordRequest extends Model
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

    // 蚂蚁统一会员ID
    /**
     * @var string
     */
    public $alipayUserId;

    // 授权场景码
    /**
     * @var string
     */
    public $sceneCode;

    // 授权的用户信息JSON字符串，根据场景码配置的用户类型传不同的JSON字符串，二要素传{"name":"张三","certNo":"1101111111"}，证件号类型传{"certNo":"1101111111"}
    /**
     * @var string
     */
    public $userInfo;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'alipayUserId'      => 'alipay_user_id',
        'sceneCode'         => 'scene_code',
        'userInfo'          => 'user_info',
    ];

    public function validate()
    {
        Model::validateRequired('alipayUserId', $this->alipayUserId, true);
        Model::validateRequired('sceneCode', $this->sceneCode, true);
        Model::validateRequired('userInfo', $this->userInfo, true);
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
        if (null !== $this->alipayUserId) {
            $res['alipay_user_id'] = $this->alipayUserId;
        }
        if (null !== $this->sceneCode) {
            $res['scene_code'] = $this->sceneCode;
        }
        if (null !== $this->userInfo) {
            $res['user_info'] = $this->userInfo;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CallbackAuthRecordRequest
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
        if (isset($map['alipay_user_id'])) {
            $model->alipayUserId = $map['alipay_user_id'];
        }
        if (isset($map['scene_code'])) {
            $model->sceneCode = $map['scene_code'];
        }
        if (isset($map['user_info'])) {
            $model->userInfo = $map['user_info'];
        }

        return $model;
    }
}
