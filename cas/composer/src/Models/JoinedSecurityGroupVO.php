<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CAS\Models;

use AlibabaCloud\Tea\Model;

class JoinedSecurityGroupVO extends Model
{
    // iaas id
    /**
     * @example sg-slg4s5f4sf43s54f***
     *
     * @var string
     */
    public $iaasId;

    // name
    /**
     * @example name
     *
     * @var string
     */
    public $name;

    // workspace id
    /**
     * @example 12345678
     *
     * @var string
     */
    public $workspaceId;

    // workspace name
    /**
     * @example wsName
     *
     * @var string
     */
    public $workspaceName;
    protected $_name = [
        'iaasId'        => 'iaas_id',
        'name'          => 'name',
        'workspaceId'   => 'workspace_id',
        'workspaceName' => 'workspace_name',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->iaasId) {
            $res['iaas_id'] = $this->iaasId;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->workspaceId) {
            $res['workspace_id'] = $this->workspaceId;
        }
        if (null !== $this->workspaceName) {
            $res['workspace_name'] = $this->workspaceName;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return JoinedSecurityGroupVO
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['iaas_id'])) {
            $model->iaasId = $map['iaas_id'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['workspace_id'])) {
            $model->workspaceId = $map['workspace_id'];
        }
        if (isset($map['workspace_name'])) {
            $model->workspaceName = $map['workspace_name'];
        }

        return $model;
    }
}
