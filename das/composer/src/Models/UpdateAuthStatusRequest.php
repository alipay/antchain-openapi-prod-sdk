<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\DAS\Models;

use AlibabaCloud\Tea\Model;

class UpdateAuthStatusRequest extends Model
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

    // 被授权方企业信用代码
    /**
     * @var string
     */
    public $authEnterpriseCode;

    // 场景码
    /**
     * @var string
     */
    public $sceneCode;

    // 授权状态
    /**
     * @var bool
     */
    public $authStatus;
    protected $_name = [
        'authToken'          => 'auth_token',
        'productInstanceId'  => 'product_instance_id',
        'authEnterpriseCode' => 'auth_enterprise_code',
        'sceneCode'          => 'scene_code',
        'authStatus'         => 'auth_status',
    ];

    public function validate()
    {
        Model::validateRequired('authEnterpriseCode', $this->authEnterpriseCode, true);
        Model::validateRequired('sceneCode', $this->sceneCode, true);
        Model::validateRequired('authStatus', $this->authStatus, true);
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
        if (null !== $this->authEnterpriseCode) {
            $res['auth_enterprise_code'] = $this->authEnterpriseCode;
        }
        if (null !== $this->sceneCode) {
            $res['scene_code'] = $this->sceneCode;
        }
        if (null !== $this->authStatus) {
            $res['auth_status'] = $this->authStatus;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return UpdateAuthStatusRequest
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
        if (isset($map['auth_enterprise_code'])) {
            $model->authEnterpriseCode = $map['auth_enterprise_code'];
        }
        if (isset($map['scene_code'])) {
            $model->sceneCode = $map['scene_code'];
        }
        if (isset($map['auth_status'])) {
            $model->authStatus = $map['auth_status'];
        }

        return $model;
    }
}
