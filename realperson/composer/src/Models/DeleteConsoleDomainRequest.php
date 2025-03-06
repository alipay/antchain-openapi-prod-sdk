<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\REALPERSON\Models;

use AlibabaCloud\Tea\Model;

class DeleteConsoleDomainRequest extends Model
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

    // 控制台场景id
    /**
     * @var string
     */
    public $sceneId;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'sceneId'           => 'scene_id',
    ];

    public function validate()
    {
        Model::validateRequired('sceneId', $this->sceneId, true);
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
        if (null !== $this->sceneId) {
            $res['scene_id'] = $this->sceneId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return DeleteConsoleDomainRequest
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
        if (isset($map['scene_id'])) {
            $model->sceneId = $map['scene_id'];
        }

        return $model;
    }
}
