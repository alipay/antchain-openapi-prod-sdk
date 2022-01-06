<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MS\Models;

use AlibabaCloud\Tea\Model;

class ServiceSyncStatus extends Model
{
    // 服务id
    /**
     * @example com.alipay.sofa.cloud.osp.user.facade.UserFacade
     *
     * @var string
     */
    public $serviceId;

    // 服务所属的应用名
    /**
     * @example app1
     *
     * @var string
     */
    public $serviceName;

    // 当前同步状态
    /**
     * @example RUNNING
     *
     * @var string
     */
    public $status;

    // 日期
    /**
     * @example 2018-10-10T10:10:00Z
     *
     * @var string
     */
    public $date;
    protected $_name = [
        'serviceId'   => 'service_id',
        'serviceName' => 'service_name',
        'status'      => 'status',
        'date'        => 'date',
    ];

    public function validate()
    {
        Model::validateRequired('serviceId', $this->serviceId, true);
        Model::validateRequired('serviceName', $this->serviceName, true);
        Model::validateRequired('status', $this->status, true);
        Model::validateRequired('date', $this->date, true);
        Model::validatePattern('date', $this->date, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->serviceId) {
            $res['service_id'] = $this->serviceId;
        }
        if (null !== $this->serviceName) {
            $res['service_name'] = $this->serviceName;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->date) {
            $res['date'] = $this->date;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ServiceSyncStatus
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['service_id'])) {
            $model->serviceId = $map['service_id'];
        }
        if (isset($map['service_name'])) {
            $model->serviceName = $map['service_name'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }
        if (isset($map['date'])) {
            $model->date = $map['date'];
        }

        return $model;
    }
}
