<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\YUNQING\Models;

use AlibabaCloud\Tea\Model;

class GetSolutionPlanstatusResponse extends Model
{
    // 请求唯一ID，用于链路跟踪和问题排查
    /**
     * @var string
     */
    public $reqMsgId;

    // 结果码，一般OK表示调用成功
    /**
     * @var string
     */
    public $resultCode;

    // 异常信息的文本描述
    /**
     * @var string
     */
    public $resultMsg;

    // 是否完成规划
    /**
     * @var bool
     */
    public $allPlanConfirmed;

    // sidecar规划状态
    /**
     * @var string
     */
    public $sidecarPlanStatus;

    // 持久化存储规划状态
    /**
     * @var string
     */
    public $persistentVolumePlanStatus;

    // 数据库规划状态
    //
    /**
     * @var string
     */
    public $dbPlanStatus;

    // 负载均衡规划
    /**
     * @var string
     */
    public $lbPlanStatus;

    // 应用配置规划状态
    /**
     * @var string
     */
    public $appDeploySpecStatus;

    // 解决方案检查项结果
    /**
     * @var CheckPoint[]
     */
    public $checkPoint;
    protected $_name = [
        'reqMsgId'                   => 'req_msg_id',
        'resultCode'                 => 'result_code',
        'resultMsg'                  => 'result_msg',
        'allPlanConfirmed'           => 'all_plan_confirmed',
        'sidecarPlanStatus'          => 'sidecar_plan_status',
        'persistentVolumePlanStatus' => 'persistent_volume_plan_status',
        'dbPlanStatus'               => 'db_plan_status',
        'lbPlanStatus'               => 'lb_plan_status',
        'appDeploySpecStatus'        => 'app_deploy_spec_status',
        'checkPoint'                 => 'check_point',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->reqMsgId) {
            $res['req_msg_id'] = $this->reqMsgId;
        }
        if (null !== $this->resultCode) {
            $res['result_code'] = $this->resultCode;
        }
        if (null !== $this->resultMsg) {
            $res['result_msg'] = $this->resultMsg;
        }
        if (null !== $this->allPlanConfirmed) {
            $res['all_plan_confirmed'] = $this->allPlanConfirmed;
        }
        if (null !== $this->sidecarPlanStatus) {
            $res['sidecar_plan_status'] = $this->sidecarPlanStatus;
        }
        if (null !== $this->persistentVolumePlanStatus) {
            $res['persistent_volume_plan_status'] = $this->persistentVolumePlanStatus;
        }
        if (null !== $this->dbPlanStatus) {
            $res['db_plan_status'] = $this->dbPlanStatus;
        }
        if (null !== $this->lbPlanStatus) {
            $res['lb_plan_status'] = $this->lbPlanStatus;
        }
        if (null !== $this->appDeploySpecStatus) {
            $res['app_deploy_spec_status'] = $this->appDeploySpecStatus;
        }
        if (null !== $this->checkPoint) {
            $res['check_point'] = [];
            if (null !== $this->checkPoint && \is_array($this->checkPoint)) {
                $n = 0;
                foreach ($this->checkPoint as $item) {
                    $res['check_point'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return GetSolutionPlanstatusResponse
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['req_msg_id'])) {
            $model->reqMsgId = $map['req_msg_id'];
        }
        if (isset($map['result_code'])) {
            $model->resultCode = $map['result_code'];
        }
        if (isset($map['result_msg'])) {
            $model->resultMsg = $map['result_msg'];
        }
        if (isset($map['all_plan_confirmed'])) {
            $model->allPlanConfirmed = $map['all_plan_confirmed'];
        }
        if (isset($map['sidecar_plan_status'])) {
            $model->sidecarPlanStatus = $map['sidecar_plan_status'];
        }
        if (isset($map['persistent_volume_plan_status'])) {
            $model->persistentVolumePlanStatus = $map['persistent_volume_plan_status'];
        }
        if (isset($map['db_plan_status'])) {
            $model->dbPlanStatus = $map['db_plan_status'];
        }
        if (isset($map['lb_plan_status'])) {
            $model->lbPlanStatus = $map['lb_plan_status'];
        }
        if (isset($map['app_deploy_spec_status'])) {
            $model->appDeploySpecStatus = $map['app_deploy_spec_status'];
        }
        if (isset($map['check_point'])) {
            if (!empty($map['check_point'])) {
                $model->checkPoint = [];
                $n                 = 0;
                foreach ($map['check_point'] as $item) {
                    $model->checkPoint[$n++] = null !== $item ? CheckPoint::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
