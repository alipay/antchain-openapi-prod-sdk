<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class ThingModelEventVO extends Model
{
    // 名称
    /**
     * @example 设备状态数据
     *
     * @var string
     */
    public $name;

    // 物模型功能Id
    /**
     * @example 7067312861108285440
     *
     * @var string
     */
    public $featureId;

    // 业务标识
    /**
     * @example LOCATION
     *
     * @var string
     */
    public $bizType;

    // 事件属性列表
    /**
     * @example [...]
     *
     * @var string
     */
    public $eventProperties;
    protected $_name = [
        'name'            => 'name',
        'featureId'       => 'feature_id',
        'bizType'         => 'biz_type',
        'eventProperties' => 'event_properties',
    ];

    public function validate()
    {
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('featureId', $this->featureId, true);
        Model::validateRequired('bizType', $this->bizType, true);
        Model::validateRequired('eventProperties', $this->eventProperties, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->featureId) {
            $res['feature_id'] = $this->featureId;
        }
        if (null !== $this->bizType) {
            $res['biz_type'] = $this->bizType;
        }
        if (null !== $this->eventProperties) {
            $res['event_properties'] = $this->eventProperties;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ThingModelEventVO
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['feature_id'])) {
            $model->featureId = $map['feature_id'];
        }
        if (isset($map['biz_type'])) {
            $model->bizType = $map['biz_type'];
        }
        if (isset($map['event_properties'])) {
            $model->eventProperties = $map['event_properties'];
        }

        return $model;
    }
}
