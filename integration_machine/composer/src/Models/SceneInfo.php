<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\INTEGRATION_MACHINE\Models;

use AlibabaCloud\Tea\Model;

class SceneInfo extends Model
{
    // 场所名称
    /**
     * @example 123
     *
     * @var string
     */
    public $sceneName;

    // 场所码
    /**
     * @example 123
     *
     * @var string
     */
    public $sceneCode;
    protected $_name = [
        'sceneName' => 'scene_name',
        'sceneCode' => 'scene_code',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->sceneName) {
            $res['scene_name'] = $this->sceneName;
        }
        if (null !== $this->sceneCode) {
            $res['scene_code'] = $this->sceneCode;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SceneInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['scene_name'])) {
            $model->sceneName = $map['scene_name'];
        }
        if (isset($map['scene_code'])) {
            $model->sceneCode = $map['scene_code'];
        }

        return $model;
    }
}
