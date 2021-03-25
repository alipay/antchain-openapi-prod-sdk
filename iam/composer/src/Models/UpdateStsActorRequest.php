<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\IAM\Models;

use AlibabaCloud\Tea\Model;

class UpdateStsActorRequest extends Model
{
    /**
     * @var string
     */
    public $authToken;

    // 虚拟身份ID
    /**
     * @var string
     */
    public $actorId;

    // 针对虚拟身份的描述
    /**
     * @var string
     */
    public $description;
    protected $_name = [
        'authToken'   => 'auth_token',
        'actorId'     => 'actor_id',
        'description' => 'description',
    ];

    public function validate()
    {
        Model::validateRequired('actorId', $this->actorId, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->actorId) {
            $res['actor_id'] = $this->actorId;
        }
        if (null !== $this->description) {
            $res['description'] = $this->description;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return UpdateStsActorRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['actor_id'])) {
            $model->actorId = $map['actor_id'];
        }
        if (isset($map['description'])) {
            $model->description = $map['description'];
        }

        return $model;
    }
}
