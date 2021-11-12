<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\YUNQING\Models;

use AlibabaCloud\Tea\Model;

class Region extends Model
{
    // 地域标识（与阿里云identity对齐）
    /**
     * @example cn-hz
     *
     * @var string
     */
    public $identity;

    // 地域的名字
    /**
     * @example 杭州金区
     *
     * @var string
     */
    public $name;

    // region的id
    /**
     * @example 123456
     *
     * @var string
     */
    public $regionId;

    // 显示的名字，可重复
    /**
     * @example 杭州金区
     *
     * @var string
     */
    public $displayName;

    // 所在城市
    /**
     * @example 杭州
     *
     * @var string
     */
    public $city;

    // 是否金区：FINANCIAL， NON_FINANCIAL
    /**
     * @example FINANCIAL
     *
     * @var string
     */
    public $tag;
    protected $_name = [
        'identity'    => 'identity',
        'name'        => 'name',
        'regionId'    => 'region_id',
        'displayName' => 'display_name',
        'city'        => 'city',
        'tag'         => 'tag',
    ];

    public function validate()
    {
        Model::validateRequired('identity', $this->identity, true);
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('regionId', $this->regionId, true);
        Model::validateRequired('displayName', $this->displayName, true);
        Model::validateRequired('city', $this->city, true);
        Model::validateRequired('tag', $this->tag, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->identity) {
            $res['identity'] = $this->identity;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->regionId) {
            $res['region_id'] = $this->regionId;
        }
        if (null !== $this->displayName) {
            $res['display_name'] = $this->displayName;
        }
        if (null !== $this->city) {
            $res['city'] = $this->city;
        }
        if (null !== $this->tag) {
            $res['tag'] = $this->tag;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return Region
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['identity'])) {
            $model->identity = $map['identity'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['region_id'])) {
            $model->regionId = $map['region_id'];
        }
        if (isset($map['display_name'])) {
            $model->displayName = $map['display_name'];
        }
        if (isset($map['city'])) {
            $model->city = $map['city'];
        }
        if (isset($map['tag'])) {
            $model->tag = $map['tag'];
        }

        return $model;
    }
}
