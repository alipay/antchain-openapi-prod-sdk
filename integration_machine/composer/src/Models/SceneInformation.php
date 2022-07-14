<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\INTEGRATION_MACHINE\Models;

use AlibabaCloud\Tea\Model;

class SceneInformation extends Model
{
    // 场所地址
    /**
     * @example 杭州
     *
     * @var string
     */
    public $sceneAddress;

    // 场所ID
    /**
     * @example sdewqw121
     *
     * @var string
     */
    public $sceneId;
    protected $_name = [
        'sceneAddress' => 'scene_address',
        'sceneId'      => 'scene_id',
    ];

    public function validate()
    {
        Model::validateRequired('sceneAddress', $this->sceneAddress, true);
        Model::validateRequired('sceneId', $this->sceneId, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->sceneAddress) {
            $res['scene_address'] = $this->sceneAddress;
        }
        if (null !== $this->sceneId) {
            $res['scene_id'] = $this->sceneId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SceneInformation
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['scene_address'])) {
            $model->sceneAddress = $map['scene_address'];
        }
        if (isset($map['scene_id'])) {
            $model->sceneId = $map['scene_id'];
        }

        return $model;
    }
}
