<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CAS\Models;

use AlibabaCloud\Tea\Model;

class ReleaseDatabaseRequest extends Model
{
    /**
     * @var string
     */
    public $authToken;

    // 需要释放的应用 ids
    /**
     * @var string[]
     */
    public $appIds;

    // 应用实例 ids
    /**
     * @var string[]
     */
    public $appServiceIds;

    // 需要释放应用的 database sequence
    /**
     * @var string[]
     */
    public $databaseSequences;
    protected $_name = [
        'authToken'         => 'auth_token',
        'appIds'            => 'app_ids',
        'appServiceIds'     => 'app_service_ids',
        'databaseSequences' => 'database_sequences',
    ];

    public function validate()
    {
        Model::validateRequired('databaseSequences', $this->databaseSequences, true);
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
        if (null !== $this->appServiceIds) {
            $res['app_service_ids'] = $this->appServiceIds;
        }
        if (null !== $this->databaseSequences) {
            $res['database_sequences'] = $this->databaseSequences;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ReleaseDatabaseRequest
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
        if (isset($map['app_service_ids'])) {
            if (!empty($map['app_service_ids'])) {
                $model->appServiceIds = $map['app_service_ids'];
            }
        }
        if (isset($map['database_sequences'])) {
            if (!empty($map['database_sequences'])) {
                $model->databaseSequences = $map['database_sequences'];
            }
        }

        return $model;
    }
}
