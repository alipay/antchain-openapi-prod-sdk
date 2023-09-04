<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_320bc483f2434f39a3af9ec9f04d3cc0\Models;

use AlibabaCloud\Tea\Model;

class SendAntsaasStaffingcInsureResponse extends Model
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

    // 投保失败人员信息，extra_msg会返回failReason，投保失败原因
    /**
     * @var InsureEmployeeInfo[]
     */
    public $failEmployeeList;
    protected $_name = [
        'reqMsgId'         => 'req_msg_id',
        'resultCode'       => 'result_code',
        'resultMsg'        => 'result_msg',
        'failEmployeeList' => 'fail_employee_list',
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
        if (null !== $this->failEmployeeList) {
            $res['fail_employee_list'] = [];
            if (null !== $this->failEmployeeList && \is_array($this->failEmployeeList)) {
                $n = 0;
                foreach ($this->failEmployeeList as $item) {
                    $res['fail_employee_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SendAntsaasStaffingcInsureResponse
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
        if (isset($map['fail_employee_list'])) {
            if (!empty($map['fail_employee_list'])) {
                $model->failEmployeeList = [];
                $n                       = 0;
                foreach ($map['fail_employee_list'] as $item) {
                    $model->failEmployeeList[$n++] = null !== $item ? InsureEmployeeInfo::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
