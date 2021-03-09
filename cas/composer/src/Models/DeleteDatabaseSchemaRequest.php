<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CAS\Models;

use AlibabaCloud\Tea\Model;

class DeleteDatabaseSchemaRequest extends Model
{
    /**
     * @var string
     */
    public $authToken;

    // 欲删除的的 schema id
    /**
     * @var string
     */
    public $schemaSequence;
    protected $_name = [
        'authToken'      => 'auth_token',
        'schemaSequence' => 'schema_sequence',
    ];

    public function validate()
    {
        Model::validateRequired('schemaSequence', $this->schemaSequence, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->schemaSequence) {
            $res['schema_sequence'] = $this->schemaSequence;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return DeleteDatabaseSchemaRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['schema_sequence'])) {
            $model->schemaSequence = $map['schema_sequence'];
        }

        return $model;
    }
}
