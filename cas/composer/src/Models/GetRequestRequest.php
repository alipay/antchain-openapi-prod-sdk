<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CAS\Models;

use AlibabaCloud\Tea\Model;

class GetRequestRequest extends Model
{
    /**
     * @var string
     */
    public $authToken;

    // workspace
    /**
     * @var string
     */
    public $workspace;

    // id
    /**
     * @var string
     */
    public $id;
    protected $_name = [
        'authToken' => 'auth_token',
        'workspace' => 'workspace',
        'id'        => 'id',
    ];

    public function validate()
    {
        Model::validateRequired('workspace', $this->workspace, true);
        Model::validateRequired('id', $this->id, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->workspace) {
            $res['workspace'] = $this->workspace;
        }
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return GetRequestRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['workspace'])) {
            $model->workspace = $map['workspace'];
        }
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }

        return $model;
    }
}
