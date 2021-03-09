<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CAS\Models;

use AlibabaCloud\Tea\Model;

class Scope extends Model
{
    // cell identity
    /**
     * @example cell identity
     *
     * @var string
     */
    public $cell;

    // region identity
    /**
     * @example region identity
     *
     * @var string
     */
    public $region;

    // tenant name
    /**
     * @example tenant identity
     *
     * @var string
     */
    public $tenant;

    // workspace
    /**
     * @example workspace identity
     *
     * @var string
     */
    public $workspace;

    // workspace_group
    /**
     * @example workspace_group identity
     *
     * @var string
     */
    public $workspaceGroup;

    // zone identity
    /**
     * @example zone identity
     *
     * @var string
     */
    public $zone;

    // cluster identity
    /**
     * @example cluster identity
     *
     * @var string
     */
    public $cluster;
    protected $_name = [
        'cell'           => 'cell',
        'region'         => 'region',
        'tenant'         => 'tenant',
        'workspace'      => 'workspace',
        'workspaceGroup' => 'workspace_group',
        'zone'           => 'zone',
        'cluster'        => 'cluster',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->cell) {
            $res['cell'] = $this->cell;
        }
        if (null !== $this->region) {
            $res['region'] = $this->region;
        }
        if (null !== $this->tenant) {
            $res['tenant'] = $this->tenant;
        }
        if (null !== $this->workspace) {
            $res['workspace'] = $this->workspace;
        }
        if (null !== $this->workspaceGroup) {
            $res['workspace_group'] = $this->workspaceGroup;
        }
        if (null !== $this->zone) {
            $res['zone'] = $this->zone;
        }
        if (null !== $this->cluster) {
            $res['cluster'] = $this->cluster;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return Scope
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['cell'])) {
            $model->cell = $map['cell'];
        }
        if (isset($map['region'])) {
            $model->region = $map['region'];
        }
        if (isset($map['tenant'])) {
            $model->tenant = $map['tenant'];
        }
        if (isset($map['workspace'])) {
            $model->workspace = $map['workspace'];
        }
        if (isset($map['workspace_group'])) {
            $model->workspaceGroup = $map['workspace_group'];
        }
        if (isset($map['zone'])) {
            $model->zone = $map['zone'];
        }
        if (isset($map['cluster'])) {
            $model->cluster = $map['cluster'];
        }

        return $model;
    }
}
