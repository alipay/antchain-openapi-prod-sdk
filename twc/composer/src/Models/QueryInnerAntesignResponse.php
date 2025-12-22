<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class QueryInnerAntesignResponse extends Model
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

    // 业务流水号
    /**
     * @var string
     */
    public $bizNo;

    // 签署流水id
    /**
     * @var string
     */
    public $signFlowId;

    // 签署子任务结果
    /**
     * @var AntSignTaskResult[]
     */
    public $antSignTaskResultList;

    // 总状态INIT-初始化
    // SIGNING-签署中
    // FINISH-已完成
    /**
     * @var string
     */
    public $status;

    // 应用方来源信息
    /**
     * @var string
     */
    public $appName;

    // 租户信息
    /**
     * @var string
     */
    public $tenantName;

    // 签署中心流程id
    /**
     * @var string
     */
    public $signCenterId;
    protected $_name = [
        'reqMsgId'              => 'req_msg_id',
        'resultCode'            => 'result_code',
        'resultMsg'             => 'result_msg',
        'bizNo'                 => 'biz_no',
        'signFlowId'            => 'sign_flow_id',
        'antSignTaskResultList' => 'ant_sign_task_result_list',
        'status'                => 'status',
        'appName'               => 'app_name',
        'tenantName'            => 'tenant_name',
        'signCenterId'          => 'sign_center_id',
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
        if (null !== $this->bizNo) {
            $res['biz_no'] = $this->bizNo;
        }
        if (null !== $this->signFlowId) {
            $res['sign_flow_id'] = $this->signFlowId;
        }
        if (null !== $this->antSignTaskResultList) {
            $res['ant_sign_task_result_list'] = [];
            if (null !== $this->antSignTaskResultList && \is_array($this->antSignTaskResultList)) {
                $n = 0;
                foreach ($this->antSignTaskResultList as $item) {
                    $res['ant_sign_task_result_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->appName) {
            $res['app_name'] = $this->appName;
        }
        if (null !== $this->tenantName) {
            $res['tenant_name'] = $this->tenantName;
        }
        if (null !== $this->signCenterId) {
            $res['sign_center_id'] = $this->signCenterId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryInnerAntesignResponse
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
        if (isset($map['biz_no'])) {
            $model->bizNo = $map['biz_no'];
        }
        if (isset($map['sign_flow_id'])) {
            $model->signFlowId = $map['sign_flow_id'];
        }
        if (isset($map['ant_sign_task_result_list'])) {
            if (!empty($map['ant_sign_task_result_list'])) {
                $model->antSignTaskResultList = [];
                $n                            = 0;
                foreach ($map['ant_sign_task_result_list'] as $item) {
                    $model->antSignTaskResultList[$n++] = null !== $item ? AntSignTaskResult::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }
        if (isset($map['app_name'])) {
            $model->appName = $map['app_name'];
        }
        if (isset($map['tenant_name'])) {
            $model->tenantName = $map['tenant_name'];
        }
        if (isset($map['sign_center_id'])) {
            $model->signCenterId = $map['sign_center_id'];
        }

        return $model;
    }
}
