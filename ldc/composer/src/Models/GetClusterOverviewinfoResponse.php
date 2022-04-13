<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class GetClusterOverviewinfoResponse extends Model
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

    // cpu
    /**
     * @var int
     */
    public $limitedCpu;

    // cpu unit
    /**
     * @var string
     */
    public $limitedCpuUnit;

    // memory
    /**
     * @var int
     */
    public $limitedMemory;

    // memory unit
    /**
     * @var string
     */
    public $limitedMemoryUnit;

    // pod overview info
    /**
     * @var PodOverviewInfo
     */
    public $podOverviewInfo;

    // total node number
    /**
     * @var string
     */
    public $totalNodeNum;

    // unhealthy node num
    /**
     * @var string
     */
    public $unHealthyNodeNum;

    // used cpu
    /**
     * @var int
     */
    public $usedCpu;

    // used cpu unit
    /**
     * @var string
     */
    public $usedCpuUnit;

    // used memory
    /**
     * @var int
     */
    public $usedMemory;

    // used memory unit
    /**
     * @var string
     */
    public $usedMemoryUnit;
    protected $_name = [
        'reqMsgId'          => 'req_msg_id',
        'resultCode'        => 'result_code',
        'resultMsg'         => 'result_msg',
        'limitedCpu'        => 'limited_cpu',
        'limitedCpuUnit'    => 'limited_cpu_unit',
        'limitedMemory'     => 'limited_memory',
        'limitedMemoryUnit' => 'limited_memory_unit',
        'podOverviewInfo'   => 'pod_overview_info',
        'totalNodeNum'      => 'total_node_num',
        'unHealthyNodeNum'  => 'un_healthy_node_num',
        'usedCpu'           => 'used_cpu',
        'usedCpuUnit'       => 'used_cpu_unit',
        'usedMemory'        => 'used_memory',
        'usedMemoryUnit'    => 'used_memory_unit',
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
        if (null !== $this->limitedCpu) {
            $res['limited_cpu'] = $this->limitedCpu;
        }
        if (null !== $this->limitedCpuUnit) {
            $res['limited_cpu_unit'] = $this->limitedCpuUnit;
        }
        if (null !== $this->limitedMemory) {
            $res['limited_memory'] = $this->limitedMemory;
        }
        if (null !== $this->limitedMemoryUnit) {
            $res['limited_memory_unit'] = $this->limitedMemoryUnit;
        }
        if (null !== $this->podOverviewInfo) {
            $res['pod_overview_info'] = null !== $this->podOverviewInfo ? $this->podOverviewInfo->toMap() : null;
        }
        if (null !== $this->totalNodeNum) {
            $res['total_node_num'] = $this->totalNodeNum;
        }
        if (null !== $this->unHealthyNodeNum) {
            $res['un_healthy_node_num'] = $this->unHealthyNodeNum;
        }
        if (null !== $this->usedCpu) {
            $res['used_cpu'] = $this->usedCpu;
        }
        if (null !== $this->usedCpuUnit) {
            $res['used_cpu_unit'] = $this->usedCpuUnit;
        }
        if (null !== $this->usedMemory) {
            $res['used_memory'] = $this->usedMemory;
        }
        if (null !== $this->usedMemoryUnit) {
            $res['used_memory_unit'] = $this->usedMemoryUnit;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return GetClusterOverviewinfoResponse
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
        if (isset($map['limited_cpu'])) {
            $model->limitedCpu = $map['limited_cpu'];
        }
        if (isset($map['limited_cpu_unit'])) {
            $model->limitedCpuUnit = $map['limited_cpu_unit'];
        }
        if (isset($map['limited_memory'])) {
            $model->limitedMemory = $map['limited_memory'];
        }
        if (isset($map['limited_memory_unit'])) {
            $model->limitedMemoryUnit = $map['limited_memory_unit'];
        }
        if (isset($map['pod_overview_info'])) {
            $model->podOverviewInfo = PodOverviewInfo::fromMap($map['pod_overview_info']);
        }
        if (isset($map['total_node_num'])) {
            $model->totalNodeNum = $map['total_node_num'];
        }
        if (isset($map['un_healthy_node_num'])) {
            $model->unHealthyNodeNum = $map['un_healthy_node_num'];
        }
        if (isset($map['used_cpu'])) {
            $model->usedCpu = $map['used_cpu'];
        }
        if (isset($map['used_cpu_unit'])) {
            $model->usedCpuUnit = $map['used_cpu_unit'];
        }
        if (isset($map['used_memory'])) {
            $model->usedMemory = $map['used_memory'];
        }
        if (isset($map['used_memory_unit'])) {
            $model->usedMemoryUnit = $map['used_memory_unit'];
        }

        return $model;
    }
}
