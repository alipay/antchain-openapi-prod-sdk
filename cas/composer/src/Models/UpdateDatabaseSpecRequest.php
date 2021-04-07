<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CAS\Models;

use AlibabaCloud\Tea\Model;

class UpdateDatabaseSpecRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // db paas id
    /**
     * @var string[]
     */
    public $databaseSequences;

    // 实例规格 id
    /**
     * @var string
     */
    public $specId;

    // 存储空间大小
    /**
     * @var int
     */
    public $storageSize;
    protected $_name = [
        'authToken'         => 'auth_token',
        'databaseSequences' => 'database_sequences',
        'specId'            => 'spec_id',
        'storageSize'       => 'storage_size',
    ];

    public function validate()
    {
        Model::validateRequired('databaseSequences', $this->databaseSequences, true);
        Model::validateRequired('specId', $this->specId, true);
        Model::validateRequired('storageSize', $this->storageSize, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->databaseSequences) {
            $res['database_sequences'] = $this->databaseSequences;
        }
        if (null !== $this->specId) {
            $res['spec_id'] = $this->specId;
        }
        if (null !== $this->storageSize) {
            $res['storage_size'] = $this->storageSize;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return UpdateDatabaseSpecRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['database_sequences'])) {
            if (!empty($map['database_sequences'])) {
                $model->databaseSequences = $map['database_sequences'];
            }
        }
        if (isset($map['spec_id'])) {
            $model->specId = $map['spec_id'];
        }
        if (isset($map['storage_size'])) {
            $model->storageSize = $map['storage_size'];
        }

        return $model;
    }
}
