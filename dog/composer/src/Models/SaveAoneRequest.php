<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\DOG\Models;

use AlibabaCloud\Tea\Model;

class SaveAoneRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    /**
     * @var string
     */
    public $productInstanceId;

    // 创建者的工号
    /**
     * @var string
     */
    public $author;

    // versionIds
    /**
     * @var int[]
     */
    public $versionIds;

    // assignedTo
    /**
     * @var string
     */
    public $assignedTo;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'author'            => 'author',
        'versionIds'        => 'version_ids',
        'assignedTo'        => 'assigned_to',
    ];

    public function validate()
    {
        Model::validateRequired('author', $this->author, true);
        Model::validateRequired('versionIds', $this->versionIds, true);
        Model::validateRequired('assignedTo', $this->assignedTo, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->author) {
            $res['author'] = $this->author;
        }
        if (null !== $this->versionIds) {
            $res['version_ids'] = $this->versionIds;
        }
        if (null !== $this->assignedTo) {
            $res['assigned_to'] = $this->assignedTo;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SaveAoneRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['product_instance_id'])) {
            $model->productInstanceId = $map['product_instance_id'];
        }
        if (isset($map['author'])) {
            $model->author = $map['author'];
        }
        if (isset($map['version_ids'])) {
            if (!empty($map['version_ids'])) {
                $model->versionIds = $map['version_ids'];
            }
        }
        if (isset($map['assigned_to'])) {
            $model->assignedTo = $map['assigned_to'];
        }

        return $model;
    }
}
