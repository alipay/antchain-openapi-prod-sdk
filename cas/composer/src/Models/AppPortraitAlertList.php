<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CAS\Models;

use AlibabaCloud\Tea\Model;

class AppPortraitAlertList extends Model
{
    // 告警节点ID
    /**
     * @example node_id
     *
     * @var string
     */
    public $nodeId;

    // 节点名
    /**
     * @example node_name
     *
     * @var string
     */
    public $nodeName;

    // 告警指标
    /**
     * @example metric
     *
     * @var string
     */
    public $metric;

    // 告警级别
    /**
     * @example INFO
     *
     * @var string
     */
    public $severity;

    // 告警内容
    /**
     * @example 告警内容
     *
     * @var string
     */
    public $alertContent;

    // 告警时间
    /**
     * @example 2018-10-10T10:10:00Z
     *
     * @var string
     */
    public $gmtOccurTimestamp;
    protected $_name = [
        'nodeId'            => 'node_id',
        'nodeName'          => 'node_name',
        'metric'            => 'metric',
        'severity'          => 'severity',
        'alertContent'      => 'alert_content',
        'gmtOccurTimestamp' => 'gmt_occur_timestamp',
    ];

    public function validate()
    {
        Model::validateRequired('nodeId', $this->nodeId, true);
        Model::validateRequired('nodeName', $this->nodeName, true);
        Model::validateRequired('metric', $this->metric, true);
        Model::validateRequired('severity', $this->severity, true);
        Model::validateRequired('alertContent', $this->alertContent, true);
        Model::validateRequired('gmtOccurTimestamp', $this->gmtOccurTimestamp, true);
        Model::validatePattern('gmtOccurTimestamp', $this->gmtOccurTimestamp, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->nodeId) {
            $res['node_id'] = $this->nodeId;
        }
        if (null !== $this->nodeName) {
            $res['node_name'] = $this->nodeName;
        }
        if (null !== $this->metric) {
            $res['metric'] = $this->metric;
        }
        if (null !== $this->severity) {
            $res['severity'] = $this->severity;
        }
        if (null !== $this->alertContent) {
            $res['alert_content'] = $this->alertContent;
        }
        if (null !== $this->gmtOccurTimestamp) {
            $res['gmt_occur_timestamp'] = $this->gmtOccurTimestamp;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return AppPortraitAlertList
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['node_id'])) {
            $model->nodeId = $map['node_id'];
        }
        if (isset($map['node_name'])) {
            $model->nodeName = $map['node_name'];
        }
        if (isset($map['metric'])) {
            $model->metric = $map['metric'];
        }
        if (isset($map['severity'])) {
            $model->severity = $map['severity'];
        }
        if (isset($map['alert_content'])) {
            $model->alertContent = $map['alert_content'];
        }
        if (isset($map['gmt_occur_timestamp'])) {
            $model->gmtOccurTimestamp = $map['gmt_occur_timestamp'];
        }

        return $model;
    }
}
