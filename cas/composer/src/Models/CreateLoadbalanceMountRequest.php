<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CAS\Models;

use AlibabaCloud\Tea\Model;

class CreateLoadbalanceMountRequest extends Model
{
    /**
     * @var string
     */
    public $authToken;

    // mount_map
    /**
     * @var MapStringToIntegerEntity[]
     */
    public $mountMap;

    // domain
    /**
     * @var string
     */
    public $domain;

    // id
    /**
     * @var string
     */
    public $id;
    protected $_name = [
        'authToken' => 'auth_token',
        'mountMap'  => 'mount_map',
        'domain'    => 'domain',
        'id'        => 'id',
    ];

    public function validate()
    {
        Model::validateRequired('mountMap', $this->mountMap, true);
        Model::validateRequired('id', $this->id, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->mountMap) {
            $res['mount_map'] = [];
            if (null !== $this->mountMap && \is_array($this->mountMap)) {
                $n = 0;
                foreach ($this->mountMap as $item) {
                    $res['mount_map'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->domain) {
            $res['domain'] = $this->domain;
        }
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateLoadbalanceMountRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['mount_map'])) {
            if (!empty($map['mount_map'])) {
                $model->mountMap = [];
                $n               = 0;
                foreach ($map['mount_map'] as $item) {
                    $model->mountMap[$n++] = null !== $item ? MapStringToIntegerEntity::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['domain'])) {
            $model->domain = $map['domain'];
        }
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }

        return $model;
    }
}
