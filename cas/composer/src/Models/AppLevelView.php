<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CAS\Models;

use AlibabaCloud\Tea\Model;

class AppLevelView extends Model
{
    // 应用等级基类
    /**
     * @example
     *
     * @var AppLevel
     */
    public $baseAppLevel;

    // 应用数量
    /**
     * @example
     *
     * @var int
     */
    public $appCount;

    // 创建者名称
    /**
     * @example 创建者名称
     *
     * @var string
     */
    public $creatorName;
    protected $_name = [
        'baseAppLevel' => 'base_app_level',
        'appCount'     => 'app_count',
        'creatorName'  => 'creator_name',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->baseAppLevel) {
            $res['base_app_level'] = null !== $this->baseAppLevel ? $this->baseAppLevel->toMap() : null;
        }
        if (null !== $this->appCount) {
            $res['app_count'] = $this->appCount;
        }
        if (null !== $this->creatorName) {
            $res['creator_name'] = $this->creatorName;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return AppLevelView
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['base_app_level'])) {
            $model->baseAppLevel = AppLevel::fromMap($map['base_app_level']);
        }
        if (isset($map['app_count'])) {
            $model->appCount = $map['app_count'];
        }
        if (isset($map['creator_name'])) {
            $model->creatorName = $map['creator_name'];
        }

        return $model;
    }
}
