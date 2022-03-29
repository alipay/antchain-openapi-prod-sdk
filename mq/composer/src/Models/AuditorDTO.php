<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MQ\Models;

use AlibabaCloud\Tea\Model;

class AuditorDTO extends Model
{
    // 操作名
    /**
     * @example topic.create
     *
     * @var string
     */
    public $action;

    // 资源名
    /**
     * @example /TOPIC/TP_XXX
     *
     * @var string
     */
    public $resource;

    // 操作详情
    /**
     * @example {"requests":[],"result":"success"}
     *
     * @var string
     */
    public $detail;

    // 操作人
    /**
     * @example xxx
     *
     * @var string
     */
    public $operator;

    // 时间戳
    /**
     * @example 2018-10-10T10:10:00Z
     *
     * @var string
     */
    public $timestamp;
    protected $_name = [
        'action'    => 'action',
        'resource'  => 'resource',
        'detail'    => 'detail',
        'operator'  => 'operator',
        'timestamp' => 'timestamp',
    ];

    public function validate()
    {
        Model::validateRequired('action', $this->action, true);
        Model::validateRequired('resource', $this->resource, true);
        Model::validateRequired('detail', $this->detail, true);
        Model::validateRequired('operator', $this->operator, true);
        Model::validateRequired('timestamp', $this->timestamp, true);
        Model::validatePattern('timestamp', $this->timestamp, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->action) {
            $res['action'] = $this->action;
        }
        if (null !== $this->resource) {
            $res['resource'] = $this->resource;
        }
        if (null !== $this->detail) {
            $res['detail'] = $this->detail;
        }
        if (null !== $this->operator) {
            $res['operator'] = $this->operator;
        }
        if (null !== $this->timestamp) {
            $res['timestamp'] = $this->timestamp;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return AuditorDTO
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['action'])) {
            $model->action = $map['action'];
        }
        if (isset($map['resource'])) {
            $model->resource = $map['resource'];
        }
        if (isset($map['detail'])) {
            $model->detail = $map['detail'];
        }
        if (isset($map['operator'])) {
            $model->operator = $map['operator'];
        }
        if (isset($map['timestamp'])) {
            $model->timestamp = $map['timestamp'];
        }

        return $model;
    }
}
