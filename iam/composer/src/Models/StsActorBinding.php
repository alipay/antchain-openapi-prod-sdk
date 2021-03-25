<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\IAM\Models;

use AlibabaCloud\Tea\Model;

class StsActorBinding extends Model
{
    // 虚拟身份ID
    /**
     * @example STSA0000141041
     *
     * @var string
     */
    public $actorId;

    // 受信对象ID
    /**
     * @example EZVNUJCN
     *
     * @var string
     */
    public $bindId;

    // 虚拟身份受信类型，可以为TENANT或者ALIYUN_SERVICE
    /**
     * @example TENANT
     *
     * @var string
     */
    public $bindType;
    protected $_name = [
        'actorId'  => 'actor_id',
        'bindId'   => 'bind_id',
        'bindType' => 'bind_type',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->actorId) {
            $res['actor_id'] = $this->actorId;
        }
        if (null !== $this->bindId) {
            $res['bind_id'] = $this->bindId;
        }
        if (null !== $this->bindType) {
            $res['bind_type'] = $this->bindType;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return StsActorBinding
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['actor_id'])) {
            $model->actorId = $map['actor_id'];
        }
        if (isset($map['bind_id'])) {
            $model->bindId = $map['bind_id'];
        }
        if (isset($map['bind_type'])) {
            $model->bindType = $map['bind_type'];
        }

        return $model;
    }
}
