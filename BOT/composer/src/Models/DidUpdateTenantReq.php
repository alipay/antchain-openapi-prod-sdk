<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class DidUpdateTenantReq extends Model
{
    // 待更新实体身份did
    /**
     * @example "did:iot_xxxxx"
     *
     * @var string
     */
    public $thingDid;

    // 待更新访问者列表
    /**
     * @example ["",""]
     *
     * @var string[]
     */
    public $tenantList;

    // 权限角色
    // TENANT_ROLE_OWNER
    // TENANT_ROLE_USER
    // TENANT_ROLE_OBSERVER
    /**
     * @example TENANT_ROLE_OWNER
     *
     * @var string
     */
    public $tenantRole;

    // 增加权限：THINGS_OP_MODE_ADD
    // 删除权限：THINGS_OP_MODE_REMOVE
    /**
     * @example THINGS_OP_MODE_ADD
     *
     * @var string
     */
    public $opMode;
    protected $_name = [
        'thingDid'   => 'thing_did',
        'tenantList' => 'tenant_list',
        'tenantRole' => 'tenant_role',
        'opMode'     => 'op_mode',
    ];

    public function validate()
    {
        Model::validateRequired('thingDid', $this->thingDid, true);
        Model::validateRequired('tenantList', $this->tenantList, true);
        Model::validateRequired('tenantRole', $this->tenantRole, true);
        Model::validateRequired('opMode', $this->opMode, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->thingDid) {
            $res['thing_did'] = $this->thingDid;
        }
        if (null !== $this->tenantList) {
            $res['tenant_list'] = $this->tenantList;
        }
        if (null !== $this->tenantRole) {
            $res['tenant_role'] = $this->tenantRole;
        }
        if (null !== $this->opMode) {
            $res['op_mode'] = $this->opMode;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return DidUpdateTenantReq
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['thing_did'])) {
            $model->thingDid = $map['thing_did'];
        }
        if (isset($map['tenant_list'])) {
            if (!empty($map['tenant_list'])) {
                $model->tenantList = $map['tenant_list'];
            }
        }
        if (isset($map['tenant_role'])) {
            $model->tenantRole = $map['tenant_role'];
        }
        if (isset($map['op_mode'])) {
            $model->opMode = $map['op_mode'];
        }

        return $model;
    }
}
