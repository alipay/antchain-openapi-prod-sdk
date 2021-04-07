<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CAS\Models;

use AlibabaCloud\Tea\Model;

class SetDatabaseAssignRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // app_service_ids
    /**
     * @var string[]
     */
    public $appServiceIds;

    // app_ids
    /**
     * @var string[]
     */
    public $appIds;

    // workspace
    /**
     * @var string
     */
    public $workspace;

    // ids
    /**
     * @var string[]
     */
    public $ids;
    protected $_name = [
        'authToken'     => 'auth_token',
        'appServiceIds' => 'app_service_ids',
        'appIds'        => 'app_ids',
        'workspace'     => 'workspace',
        'ids'           => 'ids',
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
        if (null !== $this->appServiceIds) {
            $res['app_service_ids'] = $this->appServiceIds;
        }
        if (null !== $this->appIds) {
            $res['app_ids'] = $this->appIds;
        }
        if (null !== $this->workspace) {
            $res['workspace'] = $this->workspace;
        }
        if (null !== $this->ids) {
            $res['ids'] = $this->ids;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SetDatabaseAssignRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['app_service_ids'])) {
            if (!empty($map['app_service_ids'])) {
                $model->appServiceIds = $map['app_service_ids'];
            }
        }
        if (isset($map['app_ids'])) {
            if (!empty($map['app_ids'])) {
                $model->appIds = $map['app_ids'];
            }
        }
        if (isset($map['workspace'])) {
            $model->workspace = $map['workspace'];
        }
        if (isset($map['ids'])) {
            if (!empty($map['ids'])) {
                $model->ids = $map['ids'];
            }
        }

        return $model;
    }
}
