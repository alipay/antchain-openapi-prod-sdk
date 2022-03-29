<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RMS\Models;

use AlibabaCloud\Tea\Model;

class QueryTraasmetaEntitytopoRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // entity_name
    /**
     * @var string
     */
    public $entityName;
    protected $_name = [
        'authToken'  => 'auth_token',
        'entityName' => 'entity_name',
    ];

    public function validate()
    {
        Model::validateRequired('entityName', $this->entityName, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->entityName) {
            $res['entity_name'] = $this->entityName;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryTraasmetaEntitytopoRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['entity_name'])) {
            $model->entityName = $map['entity_name'];
        }

        return $model;
    }
}
