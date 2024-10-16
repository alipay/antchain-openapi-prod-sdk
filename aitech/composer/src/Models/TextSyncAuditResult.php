<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\AITECH\Models;

use AlibabaCloud\Tea\Model;

class TextSyncAuditResult extends Model
{
    // 任务id
    /**
     * @example 123
     *
     * @var string
     */
    public $taskId;

    // 数据Id
    /**
     * @example 123
     *
     * @var string
     */
    public $dataId;

    // 业务Id - 调用方透传
    /**
     * @example 123
     *
     * @var string
     */
    public $businessId;

    // 风险等级，根据设置的高低风险分返回，返回值包括： - high：高风险（若命中自定义词库，风险等级默认为高风险） - medium：中风险 - low：低风险 - none：未检测到风险
    /**
     * @example high
     *
     * @var string
     */
    public $riskLevel;

    // 审核标签列表
    /**
     * @example [{"label":"sex", "probability":66.5, "description":"疑似色情内容", "riskWords":"AA,BB,CC"}]
     *
     * @var AuditSyncLabel[]
     */
    public $labels;
    protected $_name = [
        'taskId'     => 'task_id',
        'dataId'     => 'data_id',
        'businessId' => 'business_id',
        'riskLevel'  => 'risk_level',
        'labels'     => 'labels',
    ];

    public function validate()
    {
        Model::validateRequired('taskId', $this->taskId, true);
        Model::validateRequired('dataId', $this->dataId, true);
        Model::validateRequired('businessId', $this->businessId, true);
        Model::validateRequired('riskLevel', $this->riskLevel, true);
        Model::validateRequired('labels', $this->labels, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->taskId) {
            $res['task_id'] = $this->taskId;
        }
        if (null !== $this->dataId) {
            $res['data_id'] = $this->dataId;
        }
        if (null !== $this->businessId) {
            $res['business_id'] = $this->businessId;
        }
        if (null !== $this->riskLevel) {
            $res['risk_level'] = $this->riskLevel;
        }
        if (null !== $this->labels) {
            $res['labels'] = [];
            if (null !== $this->labels && \is_array($this->labels)) {
                $n = 0;
                foreach ($this->labels as $item) {
                    $res['labels'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return TextSyncAuditResult
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['task_id'])) {
            $model->taskId = $map['task_id'];
        }
        if (isset($map['data_id'])) {
            $model->dataId = $map['data_id'];
        }
        if (isset($map['business_id'])) {
            $model->businessId = $map['business_id'];
        }
        if (isset($map['risk_level'])) {
            $model->riskLevel = $map['risk_level'];
        }
        if (isset($map['labels'])) {
            if (!empty($map['labels'])) {
                $model->labels = [];
                $n             = 0;
                foreach ($map['labels'] as $item) {
                    $model->labels[$n++] = null !== $item ? AuditSyncLabel::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
