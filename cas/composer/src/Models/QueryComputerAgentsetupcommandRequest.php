<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CAS\Models;

use AlibabaCloud\Tea\Model;

class QueryComputerAgentsetupcommandRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // computer serial numbers
    /**
     * @var string[]
     */
    public $sn;

    // workspace name
    /**
     * @var string
     */
    public $workspace;

    // iaas_id
    /**
     * @var string
     */
    public $iaasId;

    // zone_iaas_id
    /**
     * @var string
     */
    public $zoneIaasId;
    protected $_name = [
        'authToken'  => 'auth_token',
        'sn'         => 'sn',
        'workspace'  => 'workspace',
        'iaasId'     => 'iaas_id',
        'zoneIaasId' => 'zone_iaas_id',
    ];

    public function validate()
    {
        Model::validateRequired('workspace', $this->workspace, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->sn) {
            $res['sn'] = $this->sn;
        }
        if (null !== $this->workspace) {
            $res['workspace'] = $this->workspace;
        }
        if (null !== $this->iaasId) {
            $res['iaas_id'] = $this->iaasId;
        }
        if (null !== $this->zoneIaasId) {
            $res['zone_iaas_id'] = $this->zoneIaasId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryComputerAgentsetupcommandRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['sn'])) {
            if (!empty($map['sn'])) {
                $model->sn = $map['sn'];
            }
        }
        if (isset($map['workspace'])) {
            $model->workspace = $map['workspace'];
        }
        if (isset($map['iaas_id'])) {
            $model->iaasId = $map['iaas_id'];
        }
        if (isset($map['zone_iaas_id'])) {
            $model->zoneIaasId = $map['zone_iaas_id'];
        }

        return $model;
    }
}
