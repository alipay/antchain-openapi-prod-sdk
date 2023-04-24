<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\APPEX\Models;

use AlibabaCloud\Tea\Model;

class CreateMypocketQrcoderequestaccountsResponse extends Model
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

    // 业务号，小程序码唯一标识
    /**
     * @var string
     */
    public $bizNo;

    // 外部业务号，透传返回
    /**
     * @var string
     */
    public $outBizNo;

    // 小程序码地址
    /**
     * @var string
     */
    public $qrCodeUrl;
    protected $_name = [
        'reqMsgId'   => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg'  => 'result_msg',
        'bizNo'      => 'biz_no',
        'outBizNo'   => 'out_biz_no',
        'qrCodeUrl'  => 'qr_code_url',
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
        if (null !== $this->outBizNo) {
            $res['out_biz_no'] = $this->outBizNo;
        }
        if (null !== $this->qrCodeUrl) {
            $res['qr_code_url'] = $this->qrCodeUrl;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateMypocketQrcoderequestaccountsResponse
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
        if (isset($map['out_biz_no'])) {
            $model->outBizNo = $map['out_biz_no'];
        }
        if (isset($map['qr_code_url'])) {
            $model->qrCodeUrl = $map['qr_code_url'];
        }

        return $model;
    }
}
