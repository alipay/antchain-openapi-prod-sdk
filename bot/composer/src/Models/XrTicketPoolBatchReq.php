<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class XrTicketPoolBatchReq extends Model
{
    // 资源id
    /**
     * @example 资源id
     *
     * @var string
     */
    public $resourceId;

    // 通行证有效期
    /**
     * @example 通行证有效期
     *
     * @var string
     */
    public $validTime;

    // 体验时长
    /**
     * @example 60(单位分)
     *
     * @var int
     */
    public $testTime;

    // vr设备集合
    /**
     * @example json或数组
     *
     * @var string
     */
    public $xrApps;

    // 券池最大出票数
    /**
     * @example 100
     *
     * @var int
     */
    public $maxPoolCount;

    // 通行证名称
    /**
     * @example 通行证名称
     *
     * @var string
     */
    public $xrTicketPoolName;

    // 核销类型
    /**
     * @example XR_DEVICE
     *
     * @var string
     */
    public $xrVerificationType;
    protected $_name = [
        'resourceId'         => 'resource_id',
        'validTime'          => 'valid_time',
        'testTime'           => 'test_time',
        'xrApps'             => 'xr_apps',
        'maxPoolCount'       => 'max_pool_count',
        'xrTicketPoolName'   => 'xr_ticket_pool_name',
        'xrVerificationType' => 'xr_verification_type',
    ];

    public function validate()
    {
        Model::validateRequired('resourceId', $this->resourceId, true);
        Model::validateRequired('validTime', $this->validTime, true);
        Model::validateRequired('testTime', $this->testTime, true);
        Model::validateRequired('maxPoolCount', $this->maxPoolCount, true);
        Model::validateRequired('xrTicketPoolName', $this->xrTicketPoolName, true);
        Model::validateRequired('xrVerificationType', $this->xrVerificationType, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->resourceId) {
            $res['resource_id'] = $this->resourceId;
        }
        if (null !== $this->validTime) {
            $res['valid_time'] = $this->validTime;
        }
        if (null !== $this->testTime) {
            $res['test_time'] = $this->testTime;
        }
        if (null !== $this->xrApps) {
            $res['xr_apps'] = $this->xrApps;
        }
        if (null !== $this->maxPoolCount) {
            $res['max_pool_count'] = $this->maxPoolCount;
        }
        if (null !== $this->xrTicketPoolName) {
            $res['xr_ticket_pool_name'] = $this->xrTicketPoolName;
        }
        if (null !== $this->xrVerificationType) {
            $res['xr_verification_type'] = $this->xrVerificationType;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return XrTicketPoolBatchReq
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['resource_id'])) {
            $model->resourceId = $map['resource_id'];
        }
        if (isset($map['valid_time'])) {
            $model->validTime = $map['valid_time'];
        }
        if (isset($map['test_time'])) {
            $model->testTime = $map['test_time'];
        }
        if (isset($map['xr_apps'])) {
            $model->xrApps = $map['xr_apps'];
        }
        if (isset($map['max_pool_count'])) {
            $model->maxPoolCount = $map['max_pool_count'];
        }
        if (isset($map['xr_ticket_pool_name'])) {
            $model->xrTicketPoolName = $map['xr_ticket_pool_name'];
        }
        if (isset($map['xr_verification_type'])) {
            $model->xrVerificationType = $map['xr_verification_type'];
        }

        return $model;
    }
}
