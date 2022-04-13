<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class ZoneInfo extends Model
{
    // zone identity
    /**
     * @example test-zone
     *
     * @var string
     */
    public $id;

    // zone name
    /**
     * @example 上海金融可用区-A
     *
     * @var string
     */
    public $name;

    // 所属region信息。
    /**
     * @example 杭州
     *
     * @var string
     */
    public $region;

    // zone display name
    /**
     * @example zone a
     *
     * @var string
     */
    public $displayName;
    protected $_name = [
        'id'          => 'id',
        'name'        => 'name',
        'region'      => 'region',
        'displayName' => 'display_name',
    ];

    public function validate()
    {
        Model::validateRequired('id', $this->id, true);
        Model::validateRequired('displayName', $this->displayName, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->region) {
            $res['region'] = $this->region;
        }
        if (null !== $this->displayName) {
            $res['display_name'] = $this->displayName;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ZoneInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['region'])) {
            $model->region = $map['region'];
        }
        if (isset($map['display_name'])) {
            $model->displayName = $map['display_name'];
        }

        return $model;
    }
}
