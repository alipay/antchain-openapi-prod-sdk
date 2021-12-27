<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class ExecSecurityRiskdataserviceResponse extends Model
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

    // 反欺诈风险数据服务申请成功时返回的查询凭证（申请请求时存在）
    /**
     * @var string
     */
    public $riskDataServiceApplyId;

    // 反欺诈风险数据服务查询请求结果中风险详细信息字段（查询请求时存在）
    /**
     * @var RiskInfo[]
     */
    public $riskInfos;

    // 请求响应业务唯一id
    /**
     * @var string
     */
    public $securityId;

    // 反欺诈风险数据服务查询成功时得到风险建议结果信息（查询请求时存在）
    /**
     * @var SecurityResultInfos
     */
    public $securityResultInfos;

    // 请求是否成功
    /**
     * @var bool
     */
    public $success;
    protected $_name = [
        'reqMsgId'               => 'req_msg_id',
        'resultCode'             => 'result_code',
        'resultMsg'              => 'result_msg',
        'riskDataServiceApplyId' => 'risk_data_service_apply_id',
        'riskInfos'              => 'risk_infos',
        'securityId'             => 'security_id',
        'securityResultInfos'    => 'security_result_infos',
        'success'                => 'success',
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
        if (null !== $this->riskDataServiceApplyId) {
            $res['risk_data_service_apply_id'] = $this->riskDataServiceApplyId;
        }
        if (null !== $this->riskInfos) {
            $res['risk_infos'] = [];
            if (null !== $this->riskInfos && \is_array($this->riskInfos)) {
                $n = 0;
                foreach ($this->riskInfos as $item) {
                    $res['risk_infos'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->securityId) {
            $res['security_id'] = $this->securityId;
        }
        if (null !== $this->securityResultInfos) {
            $res['security_result_infos'] = null !== $this->securityResultInfos ? $this->securityResultInfos->toMap() : null;
        }
        if (null !== $this->success) {
            $res['success'] = $this->success;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ExecSecurityRiskdataserviceResponse
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
        if (isset($map['risk_data_service_apply_id'])) {
            $model->riskDataServiceApplyId = $map['risk_data_service_apply_id'];
        }
        if (isset($map['risk_infos'])) {
            if (!empty($map['risk_infos'])) {
                $model->riskInfos = [];
                $n                = 0;
                foreach ($map['risk_infos'] as $item) {
                    $model->riskInfos[$n++] = null !== $item ? RiskInfo::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['security_id'])) {
            $model->securityId = $map['security_id'];
        }
        if (isset($map['security_result_infos'])) {
            $model->securityResultInfos = SecurityResultInfos::fromMap($map['security_result_infos']);
        }
        if (isset($map['success'])) {
            $model->success = $map['success'];
        }

        return $model;
    }
}
