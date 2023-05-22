<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\STLR\Models;

use AlibabaCloud\Tea\Model;

class AddEcarOffsetacquisitionResponse extends Model
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

    // 活动数据采集单号
    /**
     * @var string
     */
    public $acquisitionItemNo;

    // 减碳量，最多4位小数
    /**
     * @var string
     */
    public $carbonEmissionAmount;
    protected $_name = [
        'reqMsgId'             => 'req_msg_id',
        'resultCode'           => 'result_code',
        'resultMsg'            => 'result_msg',
        'acquisitionItemNo'    => 'acquisition_item_no',
        'carbonEmissionAmount' => 'carbon_emission_amount',
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
        if (null !== $this->acquisitionItemNo) {
            $res['acquisition_item_no'] = $this->acquisitionItemNo;
        }
        if (null !== $this->carbonEmissionAmount) {
            $res['carbon_emission_amount'] = $this->carbonEmissionAmount;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return AddEcarOffsetacquisitionResponse
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
        if (isset($map['acquisition_item_no'])) {
            $model->acquisitionItemNo = $map['acquisition_item_no'];
        }
        if (isset($map['carbon_emission_amount'])) {
            $model->carbonEmissionAmount = $map['carbon_emission_amount'];
        }

        return $model;
    }
}
