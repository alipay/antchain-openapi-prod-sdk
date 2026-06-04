<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\SAAS_SECURITY\Models;

use AlibabaCloud\Tea\Model;

class SecurityRiskContentAnalyzeResponse extends Model
{
    // 场景id
    /**
     * @example 123
     *
     * @var string
     */
    public $appSceneDataId;

    // 返回事件码，用于异步查询
    /**
     * @example 123
     *
     * @var string
     */
    public $eventId;

    // 是否需要异步查询
    /**
     * @example need
     *
     * @var string
     */
    public $needQuery;

    // 返回结果
    /**
     * @example PASSED
     *
     * @var string
     */
    public $resultAction;

    // 命中场景
    /**
     * @example
     *
     * @var InfoSecHitDetectItem[]
     */
    public $hitDetectItems;

    // 描述被命中的风险标签
    /**
     * @example risk,risk
     *
     * @var string
     */
    public $riskLabels;
    protected $_name = [
        'appSceneDataId' => 'app_scene_data_id',
        'eventId'        => 'event_id',
        'needQuery'      => 'need_query',
        'resultAction'   => 'result_action',
        'hitDetectItems' => 'hit_detect_items',
        'riskLabels'     => 'risk_labels',
    ];

    public function validate()
    {
        Model::validateRequired('riskLabels', $this->riskLabels, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->appSceneDataId) {
            $res['app_scene_data_id'] = $this->appSceneDataId;
        }
        if (null !== $this->eventId) {
            $res['event_id'] = $this->eventId;
        }
        if (null !== $this->needQuery) {
            $res['need_query'] = $this->needQuery;
        }
        if (null !== $this->resultAction) {
            $res['result_action'] = $this->resultAction;
        }
        if (null !== $this->hitDetectItems) {
            $res['hit_detect_items'] = [];
            if (null !== $this->hitDetectItems && \is_array($this->hitDetectItems)) {
                $n = 0;
                foreach ($this->hitDetectItems as $item) {
                    $res['hit_detect_items'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->riskLabels) {
            $res['risk_labels'] = $this->riskLabels;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SecurityRiskContentAnalyzeResponse
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['app_scene_data_id'])) {
            $model->appSceneDataId = $map['app_scene_data_id'];
        }
        if (isset($map['event_id'])) {
            $model->eventId = $map['event_id'];
        }
        if (isset($map['need_query'])) {
            $model->needQuery = $map['need_query'];
        }
        if (isset($map['result_action'])) {
            $model->resultAction = $map['result_action'];
        }
        if (isset($map['hit_detect_items'])) {
            if (!empty($map['hit_detect_items'])) {
                $model->hitDetectItems = [];
                $n                     = 0;
                foreach ($map['hit_detect_items'] as $item) {
                    $model->hitDetectItems[$n++] = null !== $item ? InfoSecHitDetectItem::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['risk_labels'])) {
            $model->riskLabels = $map['risk_labels'];
        }

        return $model;
    }
}
