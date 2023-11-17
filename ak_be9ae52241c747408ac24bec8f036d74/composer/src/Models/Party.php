<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_be9ae52241c747408ac24bec8f036d74\Models;

use AlibabaCloud\Tea\Model;

class Party extends Model
{
    // 参与方节点id，创建项目时无需传入，由saas统一分配
    /**
     * @example PARTY_20231009165700_WPuWsmvg
     *
     * @var string
     */
    public $partyId;

    // 所属方id，若为云上节点，则为云上租户ID，若为线下节点，则该参数为空
    /**
     * @example tenant
     *
     * @var string
     */
    public $tenantId;

    // 参与方节点类型，创建项目时无需填写，由local_config字段推导出节点参与方类型；
    // 一期支持两类，FATE为线下fate参与方节点，SAAS_FATE为云上fate参与方节点
    /**
     * @example SAAS_FATE
     *
     * @var string
     */
    public $type;

    // 参与方配置json，当type为FATE时，其结构为FatePartyConfigInfo，当type为SAAS_FATE时，其结构为List<FatePartyConfigInfo>
    /**
     * @example ""
     *
     * @var string
     */
    public $nodeConfig;
    protected $_name = [
        'partyId'    => 'party_id',
        'tenantId'   => 'tenant_id',
        'type'       => 'type',
        'nodeConfig' => 'node_config',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->partyId) {
            $res['party_id'] = $this->partyId;
        }
        if (null !== $this->tenantId) {
            $res['tenant_id'] = $this->tenantId;
        }
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }
        if (null !== $this->nodeConfig) {
            $res['node_config'] = $this->nodeConfig;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return Party
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['party_id'])) {
            $model->partyId = $map['party_id'];
        }
        if (isset($map['tenant_id'])) {
            $model->tenantId = $map['tenant_id'];
        }
        if (isset($map['type'])) {
            $model->type = $map['type'];
        }
        if (isset($map['node_config'])) {
            $model->nodeConfig = $map['node_config'];
        }

        return $model;
    }
}
