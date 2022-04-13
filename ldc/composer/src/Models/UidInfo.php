<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class UidInfo extends Model
{
    // UID
    /**
     * @example
     *
     * @var int
     */
    public $uid;

    // 当前分组
    /**
     * @example CellGroupA
     *
     * @var string
     */
    public $currentGroup;

    // 默认分组
    /**
     * @example CellGroupB
     *
     * @var string
     */
    public $defaultGroup;

    // 是否弹性
    /**
     * @example true, false
     *
     * @var bool
     */
    public $elastic;

    // 是否压测
    /**
     * @example true, false
     *
     * @var bool
     */
    public $press;

    // 是否灰度
    /**
     * @example true, false
     *
     * @var bool
     */
    public $gray;
    protected $_name = [
        'uid'          => 'uid',
        'currentGroup' => 'current_group',
        'defaultGroup' => 'default_group',
        'elastic'      => 'elastic',
        'press'        => 'press',
        'gray'         => 'gray',
    ];

    public function validate()
    {
        Model::validateRequired('uid', $this->uid, true);
        Model::validateRequired('currentGroup', $this->currentGroup, true);
        Model::validateRequired('defaultGroup', $this->defaultGroup, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->uid) {
            $res['uid'] = $this->uid;
        }
        if (null !== $this->currentGroup) {
            $res['current_group'] = $this->currentGroup;
        }
        if (null !== $this->defaultGroup) {
            $res['default_group'] = $this->defaultGroup;
        }
        if (null !== $this->elastic) {
            $res['elastic'] = $this->elastic;
        }
        if (null !== $this->press) {
            $res['press'] = $this->press;
        }
        if (null !== $this->gray) {
            $res['gray'] = $this->gray;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return UidInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['uid'])) {
            $model->uid = $map['uid'];
        }
        if (isset($map['current_group'])) {
            $model->currentGroup = $map['current_group'];
        }
        if (isset($map['default_group'])) {
            $model->defaultGroup = $map['default_group'];
        }
        if (isset($map['elastic'])) {
            $model->elastic = $map['elastic'];
        }
        if (isset($map['press'])) {
            $model->press = $map['press'];
        }
        if (isset($map['gray'])) {
            $model->gray = $map['gray'];
        }

        return $model;
    }
}
