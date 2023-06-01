<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\STLR\Models;

use AlibabaCloud\Tea\Model;

class PreviewEcarOffsetdatumResponse extends Model
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

    // 注册会员总数
    /**
     * @var int
     */
    public $registerMemberTotal;

    // 碳总能量值
    /**
     * @var string
     */
    public $carbonEnergyTotal;
    protected $_name = [
        'reqMsgId'            => 'req_msg_id',
        'resultCode'          => 'result_code',
        'resultMsg'           => 'result_msg',
        'registerMemberTotal' => 'register_member_total',
        'carbonEnergyTotal'   => 'carbon_energy_total',
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
        if (null !== $this->registerMemberTotal) {
            $res['register_member_total'] = $this->registerMemberTotal;
        }
        if (null !== $this->carbonEnergyTotal) {
            $res['carbon_energy_total'] = $this->carbonEnergyTotal;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return PreviewEcarOffsetdatumResponse
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
        if (isset($map['register_member_total'])) {
            $model->registerMemberTotal = $map['register_member_total'];
        }
        if (isset($map['carbon_energy_total'])) {
            $model->carbonEnergyTotal = $map['carbon_energy_total'];
        }

        return $model;
    }
}
