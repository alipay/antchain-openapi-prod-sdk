<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CAS\Models;

use AlibabaCloud\Tea\Model;

class ImportLoadbalanceRequest extends Model
{
    /**
     * @var string
     */
    public $authToken;

    // loadbalance iaas ids
    /**
     * @var string[]
     */
    public $loadbalanceIds;

    // 工作空间
    /**
     * @var string
     */
    public $workspace;
    protected $_name = [
        'authToken'      => 'auth_token',
        'loadbalanceIds' => 'loadbalance_ids',
        'workspace'      => 'workspace',
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
        if (null !== $this->loadbalanceIds) {
            $res['loadbalance_ids'] = $this->loadbalanceIds;
        }
        if (null !== $this->workspace) {
            $res['workspace'] = $this->workspace;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ImportLoadbalanceRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['loadbalance_ids'])) {
            if (!empty($map['loadbalance_ids'])) {
                $model->loadbalanceIds = $map['loadbalance_ids'];
            }
        }
        if (isset($map['workspace'])) {
            $model->workspace = $map['workspace'];
        }

        return $model;
    }
}
