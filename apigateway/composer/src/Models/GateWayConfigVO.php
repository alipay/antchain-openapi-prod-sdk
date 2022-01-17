<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\APIGATEWAY\Models;

use AlibabaCloud\Tea\Model;

class GateWayConfigVO extends Model
{
    // 唯一标识
    /**
     * @example gatewayId
     *
     * @var string
     */
    public $gatewayId;

    // host
    /**
     * @example host
     *
     * @var string
     */
    public $host;

    // 唯一性标识
    /**
     * @example id
     *
     * @var string
     */
    public $id;

    // zone名称、网关名称
    /**
     * @example name
     *
     * @var string
     */
    public $name;

    // 注册中心
    /**
     * @example
     *
     * @var RegistryVO[]
     */
    public $routers;

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

    // zone
    /**
     * @example hz | sh
     *
     * @var string
     */
    public $zone;

    // 流量比例
    /**
     * @example
     *
     * @var int
     */
    public $weight;
    protected $_name = [
        'gatewayId'   => 'gateway_id',
        'host'        => 'host',
        'id'          => 'id',
        'name'        => 'name',
        'routers'     => 'routers',
        'tenantId'    => 'tenant_id',
        'workspaceId' => 'workspace_id',
        'zone'        => 'zone',
        'weight'      => 'weight',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->gatewayId) {
            $res['gateway_id'] = $this->gatewayId;
        }
        if (null !== $this->host) {
            $res['host'] = $this->host;
        }
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->routers) {
            $res['routers'] = [];
            if (null !== $this->routers && \is_array($this->routers)) {
                $n = 0;
                foreach ($this->routers as $item) {
                    $res['routers'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->tenantId) {
            $res['tenant_id'] = $this->tenantId;
        }
        if (null !== $this->workspaceId) {
            $res['workspace_id'] = $this->workspaceId;
        }
        if (null !== $this->zone) {
            $res['zone'] = $this->zone;
        }
        if (null !== $this->weight) {
            $res['weight'] = $this->weight;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return GateWayConfigVO
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['gateway_id'])) {
            $model->gatewayId = $map['gateway_id'];
        }
        if (isset($map['host'])) {
            $model->host = $map['host'];
        }
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['routers'])) {
            if (!empty($map['routers'])) {
                $model->routers = [];
                $n              = 0;
                foreach ($map['routers'] as $item) {
                    $model->routers[$n++] = null !== $item ? RegistryVO::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['tenant_id'])) {
            $model->tenantId = $map['tenant_id'];
        }
        if (isset($map['workspace_id'])) {
            $model->workspaceId = $map['workspace_id'];
        }
        if (isset($map['zone'])) {
            $model->zone = $map['zone'];
        }
        if (isset($map['weight'])) {
            $model->weight = $map['weight'];
        }

        return $model;
    }
}
