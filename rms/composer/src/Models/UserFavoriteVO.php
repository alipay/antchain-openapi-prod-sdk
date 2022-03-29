<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RMS\Models;

use AlibabaCloud\Tea\Model;

class UserFavoriteVO extends Model
{
    // 收藏资源 ID
    /**
     * @example 123
     *
     * @var string
     */
    public $resourceId;

    // 收藏资源类型
    /**
     * @example folder
     *
     * @var string
     */
    public $resourceType;

    // 用户收藏的 ID
    /**
     * @example 123
     *
     * @var int
     */
    public $userFavoriteId;
    protected $_name = [
        'resourceId'     => 'resource_id',
        'resourceType'   => 'resource_type',
        'userFavoriteId' => 'user_favorite_id',
    ];

    public function validate()
    {
        Model::validateRequired('resourceId', $this->resourceId, true);
        Model::validateRequired('resourceType', $this->resourceType, true);
        Model::validateRequired('userFavoriteId', $this->userFavoriteId, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->resourceId) {
            $res['resource_id'] = $this->resourceId;
        }
        if (null !== $this->resourceType) {
            $res['resource_type'] = $this->resourceType;
        }
        if (null !== $this->userFavoriteId) {
            $res['user_favorite_id'] = $this->userFavoriteId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return UserFavoriteVO
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['resource_id'])) {
            $model->resourceId = $map['resource_id'];
        }
        if (isset($map['resource_type'])) {
            $model->resourceType = $map['resource_type'];
        }
        if (isset($map['user_favorite_id'])) {
            $model->userFavoriteId = $map['user_favorite_id'];
        }

        return $model;
    }
}
