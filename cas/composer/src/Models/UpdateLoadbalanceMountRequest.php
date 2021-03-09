<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CAS\Models;

use AlibabaCloud\Tea\Model;

class UpdateLoadbalanceMountRequest extends Model
{
    /**
     * @var string
     */
    public $authToken;

    // id
    /**
     * @var string
     */
    public $id;

    // mountMap
    /**
     * @var MapStringToIntegerEntity[]
     */
    public $mountMap;

    // domain
    /**
     * @var string
     */
    public $domain;
    protected $_name = [
        'authToken' => 'auth_token',
        'id'        => 'id',
        'mountMap'  => 'mount_map',
        'domain'    => 'domain',
    ];

    public function validate()
    {
        Model::validateRequired('id', $this->id, true);
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

        return $res;
    }

    /**
     * @param array $map
     *
     * @return UpdateLoadbalanceMountRequest
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

        return $model;
    }
}
