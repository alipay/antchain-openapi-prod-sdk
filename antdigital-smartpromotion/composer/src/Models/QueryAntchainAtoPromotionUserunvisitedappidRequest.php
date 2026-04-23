<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\SMARTPROMOTION\Models;

use AlibabaCloud\Tea\Model;

class QueryAntchainAtoPromotionUserunvisitedappidRequest extends Model
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

    // 支付宝用户uid
    /**
     * @var string
     */
    public $userId;

    // 订阅的appid列表，不支持的appid会自动忽略
    /**
     * @var string[]
     */
    public $appIdList;

    // 默认appid，无法判断推荐结果时返回此默认值
    /**
     * @var string
     */
    public $defaultAppId;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'userId'            => 'user_id',
        'appIdList'         => 'app_id_list',
        'defaultAppId'      => 'default_app_id',
    ];

    public function validate()
    {
        Model::validateRequired('userId', $this->userId, true);
        Model::validateRequired('appIdList', $this->appIdList, true);
        Model::validateRequired('defaultAppId', $this->defaultAppId, true);
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
        if (null !== $this->userId) {
            $res['user_id'] = $this->userId;
        }
        if (null !== $this->appIdList) {
            $res['app_id_list'] = $this->appIdList;
        }
        if (null !== $this->defaultAppId) {
            $res['default_app_id'] = $this->defaultAppId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryAntchainAtoPromotionUserunvisitedappidRequest
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
        if (isset($map['user_id'])) {
            $model->userId = $map['user_id'];
        }
        if (isset($map['app_id_list'])) {
            if (!empty($map['app_id_list'])) {
                $model->appIdList = $map['app_id_list'];
            }
        }
        if (isset($map['default_app_id'])) {
            $model->defaultAppId = $map['default_app_id'];
        }

        return $model;
    }
}
