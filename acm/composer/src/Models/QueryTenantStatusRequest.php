<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Acm\Models;

use AlibabaCloud\Tea\Model;

class QueryTenantStatusRequest extends Model
{
    /**
     * @var string
     */
    public $authToken;

    // 渠道码，接入时需要申请
    /**
     * @var string
     */
    public $channelCode;

    // 业务场景码，接入时需要申请
    /**
     * @var string
     */
    public $sceneCode;

    // 智科租户id（支付宝会员id)
    /**
     * @var string
     */
    public $tenantId;
    protected $_name = [
        'authToken'   => 'auth_token',
        'channelCode' => 'channel_code',
        'sceneCode'   => 'scene_code',
        'tenantId'    => 'tenant_id',
    ];

    public function validate()
    {
        Model::validateRequired('channelCode', $this->channelCode, true);
        Model::validateRequired('sceneCode', $this->sceneCode, true);
        Model::validateRequired('tenantId', $this->tenantId, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->channelCode) {
            $res['channel_code'] = $this->channelCode;
        }
        if (null !== $this->sceneCode) {
            $res['scene_code'] = $this->sceneCode;
        }
        if (null !== $this->tenantId) {
            $res['tenant_id'] = $this->tenantId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryTenantStatusRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['channel_code'])) {
            $model->channelCode = $map['channel_code'];
        }
        if (isset($map['scene_code'])) {
            $model->sceneCode = $map['scene_code'];
        }
        if (isset($map['tenant_id'])) {
            $model->tenantId = $map['tenant_id'];
        }

        return $model;
    }
}
