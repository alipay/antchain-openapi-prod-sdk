<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RMS\Models;

use AlibabaCloud\Tea\Model;

class QueryTraasmetaTenantRequest extends Model
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

    // name
    /**
     * @var string
     */
    public $name;

    // 是否是模糊搜索，默认为false
    /**
     * @var bool
     */
    public $search;
    protected $_name = [
        'authToken' => 'auth_token',
        'uuid'      => 'uuid',
        'name'      => 'name',
        'search'    => 'search',
    ];

    public function validate()
    {
        Model::validateRequired('search', $this->search, true);
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
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->search) {
            $res['search'] = $this->search;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryTraasmetaTenantRequest
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
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['search'])) {
            $model->search = $map['search'];
        }

        return $model;
    }
}
