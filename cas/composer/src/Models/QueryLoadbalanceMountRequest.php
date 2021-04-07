<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CAS\Models;

use AlibabaCloud\Tea\Model;

class QueryLoadbalanceMountRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // app_ids
    /**
     * @var string[]
     */
    public $appIds;

    // current_page
    /**
     * @var int
     */
    public $currentPage;

    // domains
    /**
     * @var string[]
     */
    public $domains;

    // iaas_ids_exclude
    /**
     * @var string[]
     */
    public $iaasIdsExclude;

    // initialized
    /**
     * @var bool
     */
    public $initialized;

    // loadbalance_ids
    /**
     * @var string[]
     */
    public $loadbalanceIds;

    // mounted
    /**
     * @var bool
     */
    public $mounted;

    // page_size
    /**
     * @var int
     */
    public $pageSize;

    // statuses
    /**
     * @var string[]
     */
    public $statuses;

    // workspace
    /**
     * @var string
     */
    public $workspace;

    // region_ids
    /**
     * @var string[]
     */
    public $regionIds;

    // zone_ids
    /**
     * @var string[]
     */
    public $zoneIds;

    // name
    /**
     * @var string
     */
    public $name;
    protected $_name = [
        'authToken'      => 'auth_token',
        'appIds'         => 'app_ids',
        'currentPage'    => 'current_page',
        'domains'        => 'domains',
        'iaasIdsExclude' => 'iaas_ids_exclude',
        'initialized'    => 'initialized',
        'loadbalanceIds' => 'loadbalance_ids',
        'mounted'        => 'mounted',
        'pageSize'       => 'page_size',
        'statuses'       => 'statuses',
        'workspace'      => 'workspace',
        'regionIds'      => 'region_ids',
        'zoneIds'        => 'zone_ids',
        'name'           => 'name',
    ];

    public function validate()
    {
        Model::validateRequired('loadbalanceIds', $this->loadbalanceIds, true);
        Model::validateRequired('workspace', $this->workspace, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->appIds) {
            $res['app_ids'] = $this->appIds;
        }
        if (null !== $this->currentPage) {
            $res['current_page'] = $this->currentPage;
        }
        if (null !== $this->domains) {
            $res['domains'] = $this->domains;
        }
        if (null !== $this->iaasIdsExclude) {
            $res['iaas_ids_exclude'] = $this->iaasIdsExclude;
        }
        if (null !== $this->initialized) {
            $res['initialized'] = $this->initialized;
        }
        if (null !== $this->loadbalanceIds) {
            $res['loadbalance_ids'] = $this->loadbalanceIds;
        }
        if (null !== $this->mounted) {
            $res['mounted'] = $this->mounted;
        }
        if (null !== $this->pageSize) {
            $res['page_size'] = $this->pageSize;
        }
        if (null !== $this->statuses) {
            $res['statuses'] = $this->statuses;
        }
        if (null !== $this->workspace) {
            $res['workspace'] = $this->workspace;
        }
        if (null !== $this->regionIds) {
            $res['region_ids'] = $this->regionIds;
        }
        if (null !== $this->zoneIds) {
            $res['zone_ids'] = $this->zoneIds;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryLoadbalanceMountRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['app_ids'])) {
            if (!empty($map['app_ids'])) {
                $model->appIds = $map['app_ids'];
            }
        }
        if (isset($map['current_page'])) {
            $model->currentPage = $map['current_page'];
        }
        if (isset($map['domains'])) {
            if (!empty($map['domains'])) {
                $model->domains = $map['domains'];
            }
        }
        if (isset($map['iaas_ids_exclude'])) {
            if (!empty($map['iaas_ids_exclude'])) {
                $model->iaasIdsExclude = $map['iaas_ids_exclude'];
            }
        }
        if (isset($map['initialized'])) {
            $model->initialized = $map['initialized'];
        }
        if (isset($map['loadbalance_ids'])) {
            if (!empty($map['loadbalance_ids'])) {
                $model->loadbalanceIds = $map['loadbalance_ids'];
            }
        }
        if (isset($map['mounted'])) {
            $model->mounted = $map['mounted'];
        }
        if (isset($map['page_size'])) {
            $model->pageSize = $map['page_size'];
        }
        if (isset($map['statuses'])) {
            if (!empty($map['statuses'])) {
                $model->statuses = $map['statuses'];
            }
        }
        if (isset($map['workspace'])) {
            $model->workspace = $map['workspace'];
        }
        if (isset($map['region_ids'])) {
            if (!empty($map['region_ids'])) {
                $model->regionIds = $map['region_ids'];
            }
        }
        if (isset($map['zone_ids'])) {
            if (!empty($map['zone_ids'])) {
                $model->zoneIds = $map['zone_ids'];
            }
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }

        return $model;
    }
}
