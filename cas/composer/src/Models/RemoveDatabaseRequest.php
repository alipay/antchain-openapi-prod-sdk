<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CAS\Models;

use AlibabaCloud\Tea\Model;

class RemoveDatabaseRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // database ids
    /**
     * @var string[]
     */
    public $databaseSequences;
    protected $_name = [
        'authToken'         => 'auth_token',
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
        if (null !== $this->databaseSequences) {
            $res['database_sequences'] = $this->databaseSequences;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return RemoveDatabaseRequest
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

        return $model;
    }
}
