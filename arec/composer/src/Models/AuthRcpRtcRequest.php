<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\AREC\Models;

use AlibabaCloud\Tea\Model;

class AuthRcpRtcRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 集群ID
    /**
     * @var string
     */
    public $productInstanceId;

    // 申办业务号
    /**
     * @var string
     */
    public $applyBizId;

    // 签署任务描述
    /**
     * @var SignTaskProfile
     */
    public $signTaskProfile;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'applyBizId'        => 'apply_biz_id',
        'signTaskProfile'   => 'sign_task_profile',
    ];

    public function validate()
    {
        Model::validateRequired('applyBizId', $this->applyBizId, true);
        Model::validateRequired('signTaskProfile', $this->signTaskProfile, true);
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
        if (null !== $this->applyBizId) {
            $res['apply_biz_id'] = $this->applyBizId;
        }
        if (null !== $this->signTaskProfile) {
            $res['sign_task_profile'] = null !== $this->signTaskProfile ? $this->signTaskProfile->toMap() : null;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return AuthRcpRtcRequest
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
        if (isset($map['apply_biz_id'])) {
            $model->applyBizId = $map['apply_biz_id'];
        }
        if (isset($map['sign_task_profile'])) {
            $model->signTaskProfile = SignTaskProfile::fromMap($map['sign_task_profile']);
        }

        return $model;
    }
}
