<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\NFTC\Models;

use AlibabaCloud\Tea\Model;

class CreateResourceGeneralresourceRequest extends Model
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

    // 小程序的APP ID
    /**
     * @var string
     */
    public $appId;

    // 业务幂等ID
    /**
     * @var string
     */
    public $bizId;

    // 是否需要生成差量包
    /**
     * @var bool
     */
    public $needPatch;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'appId'             => 'app_id',
        'bizId'             => 'biz_id',
        'needPatch'         => 'need_patch',
    ];

    public function validate()
    {
        Model::validateRequired('appId', $this->appId, true);
        Model::validateRequired('bizId', $this->bizId, true);
        Model::validateRequired('needPatch', $this->needPatch, true);
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
        if (null !== $this->appId) {
            $res['app_id'] = $this->appId;
        }
        if (null !== $this->bizId) {
            $res['biz_id'] = $this->bizId;
        }
        if (null !== $this->needPatch) {
            $res['need_patch'] = $this->needPatch;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateResourceGeneralresourceRequest
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
        if (isset($map['app_id'])) {
            $model->appId = $map['app_id'];
        }
        if (isset($map['biz_id'])) {
            $model->bizId = $map['biz_id'];
        }
        if (isset($map['need_patch'])) {
            $model->needPatch = $map['need_patch'];
        }

        return $model;
    }
}
