<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CAS\Models;

use AlibabaCloud\Tea\Model;

class ImportDatabaseRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // database iaas ids
    /**
     * @var string[]
     */
    public $databaseIds;

    // database 类型，默认为 DATABASE 类型
    /**
     * @var string
     */
    public $type;

    // 工作空间
    /**
     * @var string
     */
    public $workspace;
    protected $_name = [
        'authToken'   => 'auth_token',
        'databaseIds' => 'database_ids',
        'type'        => 'type',
        'workspace'   => 'workspace',
    ];

    public function validate()
    {
        Model::validateRequired('databaseIds', $this->databaseIds, true);
        Model::validateRequired('workspace', $this->workspace, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->databaseIds) {
            $res['database_ids'] = $this->databaseIds;
        }
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }
        if (null !== $this->workspace) {
            $res['workspace'] = $this->workspace;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ImportDatabaseRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['database_ids'])) {
            if (!empty($map['database_ids'])) {
                $model->databaseIds = $map['database_ids'];
            }
        }
        if (isset($map['type'])) {
            $model->type = $map['type'];
        }
        if (isset($map['workspace'])) {
            $model->workspace = $map['workspace'];
        }

        return $model;
    }
}
