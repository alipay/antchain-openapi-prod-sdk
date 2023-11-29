<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class JtData extends Model
{
    // 数据的可信平台唯一ID
    /**
     * @example 123
     *
     * @var int
     */
    public $trustiotId;

    // IoT可信平台设备唯一ID
    /**
     * @example 123
     *
     * @var int
     */
    public $trustiotEntityId;

    // 上报原文解析处理之后的数据
    /**
     * @example processed_content
     *
     * @var string
     */
    public $processedContent;

    // 和上一次上报数据里程对比，新增的里程数
    /**
     * @example 123
     *
     * @var int
     */
    public $deltaMileage;

    // 正常位置信息：LOCATION
    // 告警信息：ALARM_BASIC、 ALARM_ADAS、 ALARM_DSM、 ALARM_ACCELEROMETER
    /**
     * @example 数据标识
     *
     * @var string
     */
    public $bizType;

    // 告警子类型
    // //ADAS
    // 10001: 前向碰撞报警
    // 10002: 车辆偏离报警
    // 10003: 车距过近报警
    // 10004: 行人碰撞报警
    // 10005: 频繁变道报警
    // 10006: 道路标识超限报警
    // 10007: 障碍物报警 //10008~10015 保留
    // 10016: 道路标志识别事件
    // 10017: 主动抓拍事件 //10018~10031 保留
    // //DSM
    // 10101: 疲劳驾驶报警
    // 10102: 接打电话报警
    // 10103: 抽烟报警报警
    // 10104: 分神驾驶报警
    // 10105: 驾驶员异常报警 //10106~10115 保留
    // 10116: 自动抓拍事件
    // 10117: 驾驶员变更事件 //10118~10031 保留
    // //加速度
    // 11701: 急加速
    // 11702: 急减速
    // 11703: 急转弯
    /**
     * @example 10001
     *
     * @var int
     */
    public $alarmSubType;

    // 关联设备唯一ID
    /**
     * @example 123
     *
     * @var string
     */
    public $relatedTrustEntityId;
    protected $_name = [
        'trustiotId'           => 'trustiot_id',
        'trustiotEntityId'     => 'trustiot_entity_id',
        'processedContent'     => 'processed_content',
        'deltaMileage'         => 'delta_mileage',
        'bizType'              => 'biz_type',
        'alarmSubType'         => 'alarm_sub_type',
        'relatedTrustEntityId' => 'related_trust_entity_id',
    ];

    public function validate()
    {
        Model::validateRequired('trustiotId', $this->trustiotId, true);
        Model::validateRequired('trustiotEntityId', $this->trustiotEntityId, true);
        Model::validateRequired('processedContent', $this->processedContent, true);
        Model::validateRequired('bizType', $this->bizType, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->trustiotId) {
            $res['trustiot_id'] = $this->trustiotId;
        }
        if (null !== $this->trustiotEntityId) {
            $res['trustiot_entity_id'] = $this->trustiotEntityId;
        }
        if (null !== $this->processedContent) {
            $res['processed_content'] = $this->processedContent;
        }
        if (null !== $this->deltaMileage) {
            $res['delta_mileage'] = $this->deltaMileage;
        }
        if (null !== $this->bizType) {
            $res['biz_type'] = $this->bizType;
        }
        if (null !== $this->alarmSubType) {
            $res['alarm_sub_type'] = $this->alarmSubType;
        }
        if (null !== $this->relatedTrustEntityId) {
            $res['related_trust_entity_id'] = $this->relatedTrustEntityId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return JtData
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['trustiot_id'])) {
            $model->trustiotId = $map['trustiot_id'];
        }
        if (isset($map['trustiot_entity_id'])) {
            $model->trustiotEntityId = $map['trustiot_entity_id'];
        }
        if (isset($map['processed_content'])) {
            $model->processedContent = $map['processed_content'];
        }
        if (isset($map['delta_mileage'])) {
            $model->deltaMileage = $map['delta_mileage'];
        }
        if (isset($map['biz_type'])) {
            $model->bizType = $map['biz_type'];
        }
        if (isset($map['alarm_sub_type'])) {
            $model->alarmSubType = $map['alarm_sub_type'];
        }
        if (isset($map['related_trust_entity_id'])) {
            $model->relatedTrustEntityId = $map['related_trust_entity_id'];
        }

        return $model;
    }
}
