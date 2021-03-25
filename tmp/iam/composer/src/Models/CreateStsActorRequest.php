<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\IAM\Models;

use AlibabaCloud\Tea\Model;

class CreateStsActorRequest extends Model
{
    /**
     * @var string
     */
    public $authToken;

    // 虚拟身份受信关系集合，通常只包含一个
    /**
     * @var StsActorBinding[]
     */
    public $bindings;

    // 针对虚拟身份的描述
    /**
     * @var string
     */
    public $description;

    // 虚拟身份名称，租户内唯一
    /**
     * @var string
     */
    public $name;
    protected $_name = [
        'authToken'   => 'auth_token',
        'bindings'    => 'bindings',
        'description' => 'description',
        'name'        => 'name',
    ];

    public function validate()
    {
        Model::validateRequired('bindings', $this->bindings, true);
        Model::validateRequired('name', $this->name, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->bindings) {
            $res['bindings'] = [];
            if (null !== $this->bindings && \is_array($this->bindings)) {
                $n = 0;
                foreach ($this->bindings as $item) {
                    $res['bindings'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->description) {
            $res['description'] = $this->description;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateStsActorRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['bindings'])) {
            if (!empty($map['bindings'])) {
                $model->bindings = [];
                $n               = 0;
                foreach ($map['bindings'] as $item) {
                    $model->bindings[$n++] = null !== $item ? StsActorBinding::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['description'])) {
            $model->description = $map['description'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }

        return $model;
    }
}
