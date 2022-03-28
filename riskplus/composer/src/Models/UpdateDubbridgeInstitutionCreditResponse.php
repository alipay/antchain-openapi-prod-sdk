<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class UpdateDubbridgeInstitutionCreditResponse extends Model
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

    // 蚂蚁端返回申请单号
    /**
     * @var string
     */
    public $applyNo;

    // 机构请求流水号，用于幂等
    /**
     * @var string
     */
    public $serialNo;

    // 业务响应码
    /**
     * @var string
     */
    public $bizCode;

    // 业务消息
    /**
     * @var string
     */
    public $bizMsg;
    protected $_name = [
        'reqMsgId'   => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg'  => 'result_msg',
        'applyNo'    => 'apply_no',
        'serialNo'   => 'serial_no',
        'bizCode'    => 'biz_code',
        'bizMsg'     => 'biz_msg',
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
        if (null !== $this->applyNo) {
            $res['apply_no'] = $this->applyNo;
        }
        if (null !== $this->serialNo) {
            $res['serial_no'] = $this->serialNo;
        }
        if (null !== $this->bizCode) {
            $res['biz_code'] = $this->bizCode;
        }
        if (null !== $this->bizMsg) {
            $res['biz_msg'] = $this->bizMsg;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return UpdateDubbridgeInstitutionCreditResponse
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
        if (isset($map['apply_no'])) {
            $model->applyNo = $map['apply_no'];
        }
        if (isset($map['serial_no'])) {
            $model->serialNo = $map['serial_no'];
        }
        if (isset($map['biz_code'])) {
            $model->bizCode = $map['biz_code'];
        }
        if (isset($map['biz_msg'])) {
            $model->bizMsg = $map['biz_msg'];
        }

        return $model;
    }
}
