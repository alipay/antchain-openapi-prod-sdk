<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class TenantBindInfoReq extends Model
{
    // 租户关联扩展信息
    /**
     * @example "CN,北京"
     *
     * @var string
     */
    public $extension;

    // 业务类型，默认空
    /**
     * @example null
     *
     * @var string
     */
    public $bizType;

    // 组织机构代码，可为中文
    /**
     * @example "12345"
     *
     * @var string
     */
    public $tenantUid;

    // 组织结构名称
    /**
     * @example "xx公司xx部门"
     *
     * @var string
     */
    public $userName;
    protected $_name = [
        'extension' => 'extension',
        'bizType'   => 'biz_type',
        'tenantUid' => 'tenant_uid',
        'userName'  => 'user_name',
    ];

    public function validate()
    {
        Model::validateRequired('tenantUid', $this->tenantUid, true);
        Model::validateRequired('userName', $this->userName, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->extension) {
            $res['extension'] = $this->extension;
        }
        if (null !== $this->bizType) {
            $res['biz_type'] = $this->bizType;
        }
        if (null !== $this->tenantUid) {
            $res['tenant_uid'] = $this->tenantUid;
        }
        if (null !== $this->userName) {
            $res['user_name'] = $this->userName;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return TenantBindInfoReq
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['extension'])) {
            $model->extension = $map['extension'];
        }
        if (isset($map['biz_type'])) {
            $model->bizType = $map['biz_type'];
        }
        if (isset($map['tenant_uid'])) {
            $model->tenantUid = $map['tenant_uid'];
        }
        if (isset($map['user_name'])) {
            $model->userName = $map['user_name'];
        }

        return $model;
    }
}
