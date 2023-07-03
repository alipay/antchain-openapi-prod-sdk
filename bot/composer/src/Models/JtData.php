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
    protected $_name = [
        'trustiotId'       => 'trustiot_id',
        'trustiotEntityId' => 'trustiot_entity_id',
        'processedContent' => 'processed_content',
        'deltaMileage'     => 'delta_mileage',
    ];

    public function validate()
    {
        Model::validateRequired('trustiotId', $this->trustiotId, true);
        Model::validateRequired('trustiotEntityId', $this->trustiotEntityId, true);
        Model::validateRequired('processedContent', $this->processedContent, true);
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

        return $model;
    }
}
