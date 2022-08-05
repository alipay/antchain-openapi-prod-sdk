<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BBP\Models;

use AlibabaCloud\Tea\Model;

class QueryInsuranceRecordsResponse extends Model
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

    // 用户保单信息集合
    /**
     * @var InsuranceRecordModel[]
     */
    public $insuranceRecordsList;
    protected $_name = [
        'reqMsgId'             => 'req_msg_id',
        'resultCode'           => 'result_code',
        'resultMsg'            => 'result_msg',
        'insuranceRecordsList' => 'insurance_records_list',
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
        if (null !== $this->insuranceRecordsList) {
            $res['insurance_records_list'] = [];
            if (null !== $this->insuranceRecordsList && \is_array($this->insuranceRecordsList)) {
                $n = 0;
                foreach ($this->insuranceRecordsList as $item) {
                    $res['insurance_records_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryInsuranceRecordsResponse
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
        if (isset($map['insurance_records_list'])) {
            if (!empty($map['insurance_records_list'])) {
                $model->insuranceRecordsList = [];
                $n                           = 0;
                foreach ($map['insurance_records_list'] as $item) {
                    $model->insuranceRecordsList[$n++] = null !== $item ? InsuranceRecordModel::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
