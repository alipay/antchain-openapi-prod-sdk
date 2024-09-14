<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\SECURITYTECH\Models;

use AlibabaCloud\Tea\Model;

class DcpInfo extends Model
{
    // 企业入驻租户ID
    /**
     * @example LKPFALCN
     *
     * @var string
     */
    public $dcpTenantId;

    // 企业名称
    /**
     * @example 曹操出行
     *
     * @var string
     */
    public $dcpName;
    protected $_name = [
        'dcpTenantId' => 'dcp_tenant_id',
        'dcpName'     => 'dcp_name',
    ];

    public function validate()
    {
        Model::validateRequired('dcpTenantId', $this->dcpTenantId, true);
        Model::validateRequired('dcpName', $this->dcpName, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->dcpTenantId) {
            $res['dcp_tenant_id'] = $this->dcpTenantId;
        }
        if (null !== $this->dcpName) {
            $res['dcp_name'] = $this->dcpName;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return DcpInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['dcp_tenant_id'])) {
            $model->dcpTenantId = $map['dcp_tenant_id'];
        }
        if (isset($map['dcp_name'])) {
            $model->dcpName = $map['dcp_name'];
        }

        return $model;
    }
}
