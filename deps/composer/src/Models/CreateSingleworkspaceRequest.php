<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Deps\Models;

use AlibabaCloud\Tea\Model;

class CreateSingleworkspaceRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    /**
     * @var string
     */
    public $tenant;

    // workspace 显示名称
    /**
     * @var string
     */
    public $displayName;

    // workspace 唯一标识符
    /**
     * @var string
     */
    public $name;

    // VPC ｜ Classic
    /**
     * @var string
     */
    public $networkType;

    // 地域
    /**
     * @var string
     */
    public $region;

    // 枚举值：
    // 标准工作空间NORMAL;
    // 单元化工作空间UNIT
    /**
     * @var string
     */
    public $type;

    // 可用区
    /**
     * @var string[]
     */
    public $zones;

    // region_id，由于和阿里云命名冲突，故用paas_region_id
    /**
     * @var string
     */
    public $paasRegionId;

    // zone_ids
    /**
     * @var string[]
     */
    public $zoneIds;
    protected $_name = [
        'authToken'    => 'auth_token',
        'tenant'       => 'tenant',
        'displayName'  => 'display_name',
        'name'         => 'name',
        'networkType'  => 'network_type',
        'region'       => 'region',
        'type'         => 'type',
        'zones'        => 'zones',
        'paasRegionId' => 'paas_region_id',
        'zoneIds'      => 'zone_ids',
    ];

    public function validate()
    {
        Model::validateRequired('displayName', $this->displayName, true);
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('networkType', $this->networkType, true);
        Model::validateRequired('region', $this->region, true);
        Model::validateRequired('paasRegionId', $this->paasRegionId, true);
        Model::validateRequired('zoneIds', $this->zoneIds, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->tenant) {
            $res['tenant'] = $this->tenant;
        }
        if (null !== $this->displayName) {
            $res['display_name'] = $this->displayName;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->networkType) {
            $res['network_type'] = $this->networkType;
        }
        if (null !== $this->region) {
            $res['region'] = $this->region;
        }
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }
        if (null !== $this->zones) {
            $res['zones'] = $this->zones;
        }
        if (null !== $this->paasRegionId) {
            $res['paas_region_id'] = $this->paasRegionId;
        }
        if (null !== $this->zoneIds) {
            $res['zone_ids'] = $this->zoneIds;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateSingleworkspaceRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['tenant'])) {
            $model->tenant = $map['tenant'];
        }
        if (isset($map['display_name'])) {
            $model->displayName = $map['display_name'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['network_type'])) {
            $model->networkType = $map['network_type'];
        }
        if (isset($map['region'])) {
            $model->region = $map['region'];
        }
        if (isset($map['type'])) {
            $model->type = $map['type'];
        }
        if (isset($map['zones'])) {
            if (!empty($map['zones'])) {
                $model->zones = $map['zones'];
            }
        }
        if (isset($map['paas_region_id'])) {
            $model->paasRegionId = $map['paas_region_id'];
        }
        if (isset($map['zone_ids'])) {
            if (!empty($map['zone_ids'])) {
                $model->zoneIds = $map['zone_ids'];
            }
        }

        return $model;
    }
}
