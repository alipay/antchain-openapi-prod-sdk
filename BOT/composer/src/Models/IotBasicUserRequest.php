<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class IotBasicUserRequest extends Model
{
    // 租户ID
    /**
     * @example XRE2DAS
     *
     * @var string
     */
    public $tenantId;

    // 金融云用户id
    /**
     * @example 12321321
     *
     * @var string
     */
    public $cloudUserId;

    // 登录名
    /**
     * @example test@alibaba-inc.com
     *
     * @var string
     */
    public $loginName;
    protected $_name = [
        'tenantId'    => 'tenant_id',
        'cloudUserId' => 'cloud_user_id',
        'loginName'   => 'login_name',
    ];

    public function validate()
    {
        Model::validateRequired('tenantId', $this->tenantId, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->tenantId) {
            $res['tenant_id'] = $this->tenantId;
        }
        if (null !== $this->cloudUserId) {
            $res['cloud_user_id'] = $this->cloudUserId;
        }
        if (null !== $this->loginName) {
            $res['login_name'] = $this->loginName;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return IotBasicUserRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['tenant_id'])) {
            $model->tenantId = $map['tenant_id'];
        }
        if (isset($map['cloud_user_id'])) {
            $model->cloudUserId = $map['cloud_user_id'];
        }
        if (isset($map['login_name'])) {
            $model->loginName = $map['login_name'];
        }

        return $model;
    }
}
