<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ATO\Models;

use AlibabaCloud\Tea\Model;

class GetInnerAgentcustomerserviceResponse extends Model
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

    // 客诉问题
    /**
     * @var string
     */
    public $customerComplaintIssues;

    // 客诉处理人员信息
    /**
     * @var CustomerPersonInfo[]
     */
    public $customerPersonInfoList;
    protected $_name = [
        'reqMsgId'                => 'req_msg_id',
        'resultCode'              => 'result_code',
        'resultMsg'               => 'result_msg',
        'customerComplaintIssues' => 'customer_complaint_issues',
        'customerPersonInfoList'  => 'customer_person_info_list',
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
        if (null !== $this->customerComplaintIssues) {
            $res['customer_complaint_issues'] = $this->customerComplaintIssues;
        }
        if (null !== $this->customerPersonInfoList) {
            $res['customer_person_info_list'] = [];
            if (null !== $this->customerPersonInfoList && \is_array($this->customerPersonInfoList)) {
                $n = 0;
                foreach ($this->customerPersonInfoList as $item) {
                    $res['customer_person_info_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return GetInnerAgentcustomerserviceResponse
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
        if (isset($map['customer_complaint_issues'])) {
            $model->customerComplaintIssues = $map['customer_complaint_issues'];
        }
        if (isset($map['customer_person_info_list'])) {
            if (!empty($map['customer_person_info_list'])) {
                $model->customerPersonInfoList = [];
                $n                             = 0;
                foreach ($map['customer_person_info_list'] as $item) {
                    $model->customerPersonInfoList[$n++] = null !== $item ? CustomerPersonInfo::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
