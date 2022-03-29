<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RMS\Models;

use AlibabaCloud\Tea\Model;

class GetTraasmetaHostmachineRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // uuid
    /**
     * @var string
     */
    public $uuid;

    // workspace_name
    /**
     * @var string
     */
    public $workspaceName;

    // ip
    /**
     * @var string
     */
    public $ip;

    // workspace_uuid
    /**
     * @var string
     */
    public $workspaceUuid;
    protected $_name = [
        'authToken'     => 'auth_token',
        'uuid'          => 'uuid',
        'workspaceName' => 'workspace_name',
        'ip'            => 'ip',
        'workspaceUuid' => 'workspace_uuid',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->uuid) {
            $res['uuid'] = $this->uuid;
        }
        if (null !== $this->workspaceName) {
            $res['workspace_name'] = $this->workspaceName;
        }
        if (null !== $this->ip) {
            $res['ip'] = $this->ip;
        }
        if (null !== $this->workspaceUuid) {
            $res['workspace_uuid'] = $this->workspaceUuid;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return GetTraasmetaHostmachineRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['uuid'])) {
            $model->uuid = $map['uuid'];
        }
        if (isset($map['workspace_name'])) {
            $model->workspaceName = $map['workspace_name'];
        }
        if (isset($map['ip'])) {
            $model->ip = $map['ip'];
        }
        if (isset($map['workspace_uuid'])) {
            $model->workspaceUuid = $map['workspace_uuid'];
        }

        return $model;
    }
}
