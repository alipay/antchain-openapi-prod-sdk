<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\APIGATEWAY\Models;

use AlibabaCloud\Tea\Model;

class LdcInfoVO extends Model
{
    // 是否开启
    /**
     * @example true, false
     *
     * @var bool
     */
    public $enable;

    // 参数位置
    /**
     * @example header
     *
     * @var string
     */
    public $paramLocation;

    // 参数名
    /**
     * @example uid
     *
     * @var string
     */
    public $paramKey;

    // tenant_id
    /**
     * @example tenant_id
     *
     * @var string
     */
    public $tenantId;

    // workspace_id
    /**
     * @example workspace_id
     *
     * @var string
     */
    public $workspaceId;
    protected $_name = [
        'enable'        => 'enable',
        'paramLocation' => 'param_location',
        'paramKey'      => 'param_key',
        'tenantId'      => 'tenant_id',
        'workspaceId'   => 'workspace_id',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->enable) {
            $res['enable'] = $this->enable;
        }
        if (null !== $this->paramLocation) {
            $res['param_location'] = $this->paramLocation;
        }
        if (null !== $this->paramKey) {
            $res['param_key'] = $this->paramKey;
        }
        if (null !== $this->tenantId) {
            $res['tenant_id'] = $this->tenantId;
        }
        if (null !== $this->workspaceId) {
            $res['workspace_id'] = $this->workspaceId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return LdcInfoVO
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['enable'])) {
            $model->enable = $map['enable'];
        }
        if (isset($map['param_location'])) {
            $model->paramLocation = $map['param_location'];
        }
        if (isset($map['param_key'])) {
            $model->paramKey = $map['param_key'];
        }
        if (isset($map['tenant_id'])) {
            $model->tenantId = $map['tenant_id'];
        }
        if (isset($map['workspace_id'])) {
            $model->workspaceId = $map['workspace_id'];
        }

        return $model;
    }
}
