<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ACOPM\Models;

use AlibabaCloud\Tea\Model;

class UpdateTenantRatelimitRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 租户id
    /**
     * @var string
     */
    public $tenantId;

    // 更新列表
    /**
     * @var UpdateRateLimit[]
     */
    public $updateLimitList;
    protected $_name = [
        'authToken'       => 'auth_token',
        'tenantId'        => 'tenant_id',
        'updateLimitList' => 'update_limit_list',
    ];

    public function validate()
    {
        Model::validateRequired('tenantId', $this->tenantId, true);
        Model::validateRequired('updateLimitList', $this->updateLimitList, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->tenantId) {
            $res['tenant_id'] = $this->tenantId;
        }
        if (null !== $this->updateLimitList) {
            $res['update_limit_list'] = [];
            if (null !== $this->updateLimitList && \is_array($this->updateLimitList)) {
                $n = 0;
                foreach ($this->updateLimitList as $item) {
                    $res['update_limit_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return UpdateTenantRatelimitRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['tenant_id'])) {
            $model->tenantId = $map['tenant_id'];
        }
        if (isset($map['update_limit_list'])) {
            if (!empty($map['update_limit_list'])) {
                $model->updateLimitList = [];
                $n                      = 0;
                foreach ($map['update_limit_list'] as $item) {
                    $model->updateLimitList[$n++] = null !== $item ? UpdateRateLimit::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
