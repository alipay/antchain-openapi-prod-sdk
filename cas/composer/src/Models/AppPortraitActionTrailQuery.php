<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CAS\Models;

use AlibabaCloud\Tea\Model;

class AppPortraitActionTrailQuery extends Model
{
    // 操作时间
    /**
     * @example 2018-10-10T10:10:00Z
     *
     * @var string
     */
    public $actiontrailTimestamp;

    // 状态
    /**
     * @example 成功
     *
     * @var string
     */
    public $status;

    // 发布单id
    /**
     * @example CNSH_NJ202205111559258629
     *
     * @var string
     */
    public $id;

    // 应用服务
    /**
     * @example medicalscore
     *
     * @var string
     */
    public $appService;

    // 操作内容
    /**
     * @example 发布
     *
     * @var string
     */
    public $operateType;

    // 执行人
    /**
     * @example 周大侠
     *
     * @var string
     */
    public $operator;
    protected $_name = [
        'actiontrailTimestamp' => 'actiontrail_timestamp',
        'status'               => 'status',
        'id'                   => 'id',
        'appService'           => 'app_service',
        'operateType'          => 'operate_type',
        'operator'             => 'operator',
    ];

    public function validate()
    {
        Model::validateRequired('actiontrailTimestamp', $this->actiontrailTimestamp, true);
        Model::validateRequired('status', $this->status, true);
        Model::validateRequired('id', $this->id, true);
        Model::validateRequired('appService', $this->appService, true);
        Model::validateRequired('operateType', $this->operateType, true);
        Model::validateRequired('operator', $this->operator, true);
        Model::validatePattern('actiontrailTimestamp', $this->actiontrailTimestamp, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->actiontrailTimestamp) {
            $res['actiontrail_timestamp'] = $this->actiontrailTimestamp;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->appService) {
            $res['app_service'] = $this->appService;
        }
        if (null !== $this->operateType) {
            $res['operate_type'] = $this->operateType;
        }
        if (null !== $this->operator) {
            $res['operator'] = $this->operator;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return AppPortraitActionTrailQuery
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['actiontrail_timestamp'])) {
            $model->actiontrailTimestamp = $map['actiontrail_timestamp'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }
        if (isset($map['app_service'])) {
            $model->appService = $map['app_service'];
        }
        if (isset($map['operate_type'])) {
            $model->operateType = $map['operate_type'];
        }
        if (isset($map['operator'])) {
            $model->operator = $map['operator'];
        }

        return $model;
    }
}
