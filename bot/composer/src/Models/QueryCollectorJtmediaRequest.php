<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class QueryCollectorJtmediaRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    /**
     * @var string
     */
    public $productInstanceId;

    // 场景码
    /**
     * @var string
     */
    public $scene;

    // 异常事件ID，由告警事件标识生成，在blockchain.bot.collector.jtflux.query接口中可获取
    /**
     * @var string
     */
    public $alarmEventId;

    // 异常事件媒体文件ID列表
    /**
     * @var string[]
     */
    public $mediaIdList;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'scene'             => 'scene',
        'alarmEventId'      => 'alarm_event_id',
        'mediaIdList'       => 'media_id_list',
    ];

    public function validate()
    {
        Model::validateRequired('scene', $this->scene, true);
        Model::validateRequired('alarmEventId', $this->alarmEventId, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->scene) {
            $res['scene'] = $this->scene;
        }
        if (null !== $this->alarmEventId) {
            $res['alarm_event_id'] = $this->alarmEventId;
        }
        if (null !== $this->mediaIdList) {
            $res['media_id_list'] = $this->mediaIdList;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryCollectorJtmediaRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['product_instance_id'])) {
            $model->productInstanceId = $map['product_instance_id'];
        }
        if (isset($map['scene'])) {
            $model->scene = $map['scene'];
        }
        if (isset($map['alarm_event_id'])) {
            $model->alarmEventId = $map['alarm_event_id'];
        }
        if (isset($map['media_id_list'])) {
            if (!empty($map['media_id_list'])) {
                $model->mediaIdList = $map['media_id_list'];
            }
        }

        return $model;
    }
}
