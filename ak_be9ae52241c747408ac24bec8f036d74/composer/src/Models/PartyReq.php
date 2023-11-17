<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_be9ae52241c747408ac24bec8f036d74\Models;

use AlibabaCloud\Tea\Model;

class PartyReq extends Model
{
    // 参与方类型，例如：{FATE, SAAS_FATE, KUSCIA, SAAS_KUSCIA}
    /**
     * @example "FATE"/"SAAS_FATE"/"KUSCIA"/"SAAS_KUSCIA"
     *
     * @var string
     */
    public $type;

    // 参与方租户id
    /**
     * @example "2088302558675302"
     *
     * @var string
     */
    public $tenantId;

    // 远端节点的配置信息，本期仅支持一种类型：FATE，其配置参考FatePartyLocalConfigInfo结构体定义
    /**
     * @example {}
     *
     * @var string
     */
    public $remoteConfig;
    protected $_name = [
        'type'         => 'type',
        'tenantId'     => 'tenant_id',
        'remoteConfig' => 'remote_config',
    ];

    public function validate()
    {
        Model::validateRequired('type', $this->type, true);
        Model::validateRequired('remoteConfig', $this->remoteConfig, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }
        if (null !== $this->tenantId) {
            $res['tenant_id'] = $this->tenantId;
        }
        if (null !== $this->remoteConfig) {
            $res['remote_config'] = $this->remoteConfig;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return PartyReq
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['type'])) {
            $model->type = $map['type'];
        }
        if (isset($map['tenant_id'])) {
            $model->tenantId = $map['tenant_id'];
        }
        if (isset($map['remote_config'])) {
            $model->remoteConfig = $map['remote_config'];
        }

        return $model;
    }
}
