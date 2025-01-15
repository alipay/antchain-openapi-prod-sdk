<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MARKETING\Models;

use AlibabaCloud\Tea\Model;

class QueryDocChildRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 文档id
    /**
     * @var string
     */
    public $id;

    // 目录id
    /**
     * @var string
     */
    public $siteId;
    protected $_name = [
        'authToken' => 'auth_token',
        'id'        => 'id',
        'siteId'    => 'site_id',
    ];

    public function validate()
    {
        Model::validateRequired('id', $this->id, true);
        Model::validateRequired('siteId', $this->siteId, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->siteId) {
            $res['site_id'] = $this->siteId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryDocChildRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }
        if (isset($map['site_id'])) {
            $model->siteId = $map['site_id'];
        }

        return $model;
    }
}
