<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ATO\Models;

use AlibabaCloud\Tea\Model;

class QueryInnerTenantindirectmainclassResponse extends Model
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

    // 当前开通类目
    /**
     * @var string[]
     */
    public $currentIndirectMainClassList;

    // 开通说明
    /**
     * @var string
     */
    public $desc;

    // 状态
    // INIT:初始化
    // AUDIT:审批中
    // AUDIT_PASSED:审批通过
    // AUDIT_NOT_PASSED:审批不通过
    /**
     * @var string
     */
    public $status;

    // 审核拒绝原因
    /**
     * @var string
     */
    public $failReason;

    // 申请开通的类目
    /**
     * @var string[]
     */
    public $changingIndirectMainClassList;
    protected $_name = [
        'reqMsgId'                      => 'req_msg_id',
        'resultCode'                    => 'result_code',
        'resultMsg'                     => 'result_msg',
        'currentIndirectMainClassList'  => 'current_indirect_main_class_list',
        'desc'                          => 'desc',
        'status'                        => 'status',
        'failReason'                    => 'fail_reason',
        'changingIndirectMainClassList' => 'changing_indirect_main_class_list',
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
        if (null !== $this->currentIndirectMainClassList) {
            $res['current_indirect_main_class_list'] = $this->currentIndirectMainClassList;
        }
        if (null !== $this->desc) {
            $res['desc'] = $this->desc;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->failReason) {
            $res['fail_reason'] = $this->failReason;
        }
        if (null !== $this->changingIndirectMainClassList) {
            $res['changing_indirect_main_class_list'] = $this->changingIndirectMainClassList;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryInnerTenantindirectmainclassResponse
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
        if (isset($map['current_indirect_main_class_list'])) {
            if (!empty($map['current_indirect_main_class_list'])) {
                $model->currentIndirectMainClassList = $map['current_indirect_main_class_list'];
            }
        }
        if (isset($map['desc'])) {
            $model->desc = $map['desc'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }
        if (isset($map['fail_reason'])) {
            $model->failReason = $map['fail_reason'];
        }
        if (isset($map['changing_indirect_main_class_list'])) {
            if (!empty($map['changing_indirect_main_class_list'])) {
                $model->changingIndirectMainClassList = $map['changing_indirect_main_class_list'];
            }
        }

        return $model;
    }
}
