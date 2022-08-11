<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_5bb1b66c4aab4cc998c05a36078e45c1\Models;

use AlibabaCloud\Tea\Model;

class InfoSecContentQuery extends Model
{
    // 123
    /**
     * @example 123
     *
     * @var string
     */
    public $appScene;

    // 123
    /**
     * @example 123
     *
     * @var string
     */
    public $appSceneDataId;

    // 123
    /**
     * @example 123
     *
     * @var string
     */
    public $eventId;
    protected $_name = [
        'appScene'       => 'app_scene',
        'appSceneDataId' => 'app_scene_data_id',
        'eventId'        => 'event_id',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->appScene) {
            $res['app_scene'] = $this->appScene;
        }
        if (null !== $this->appSceneDataId) {
            $res['app_scene_data_id'] = $this->appSceneDataId;
        }
        if (null !== $this->eventId) {
            $res['event_id'] = $this->eventId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return InfoSecContentQuery
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['app_scene'])) {
            $model->appScene = $map['app_scene'];
        }
        if (isset($map['app_scene_data_id'])) {
            $model->appSceneDataId = $map['app_scene_data_id'];
        }
        if (isset($map['event_id'])) {
            $model->eventId = $map['event_id'];
        }

        return $model;
    }
}
