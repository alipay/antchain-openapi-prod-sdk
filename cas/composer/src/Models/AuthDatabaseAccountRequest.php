<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CAS\Models;

use AlibabaCloud\Tea\Model;

class AuthDatabaseAccountRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // schema_id
    /**
     * @var string
     */
    public $schemaId;

    // privilege
    /**
     * @var string
     */
    public $privilege;

    // id
    /**
     * @var string
     */
    public $id;
    protected $_name = [
        'authToken' => 'auth_token',
        'schemaId'  => 'schema_id',
        'privilege' => 'privilege',
        'id'        => 'id',
    ];

    public function validate()
    {
        Model::validateRequired('schemaId', $this->schemaId, true);
        Model::validateRequired('privilege', $this->privilege, true);
        Model::validateRequired('id', $this->id, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->schemaId) {
            $res['schema_id'] = $this->schemaId;
        }
        if (null !== $this->privilege) {
            $res['privilege'] = $this->privilege;
        }
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return AuthDatabaseAccountRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['schema_id'])) {
            $model->schemaId = $map['schema_id'];
        }
        if (isset($map['privilege'])) {
            $model->privilege = $map['privilege'];
        }
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }

        return $model;
    }
}
