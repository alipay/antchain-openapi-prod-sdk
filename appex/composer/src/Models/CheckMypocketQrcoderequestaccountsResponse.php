<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\APPEX\Models;

use AlibabaCloud\Tea\Model;

class CheckMypocketQrcoderequestaccountsResponse extends Model
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

    // 小程序码唯一标识
    /**
     * @var string
     */
    public $bizNo;

    // 外部业务号
    /**
     * @var string
     */
    public $outBizNo;

    // 小程序码状态，枚举，IDLE|SCANNED|CONFIRMED|CANCELLED|UNKNOWN
    /**
     * @var string
     */
    public $status;

    // 账户列表
    /**
     * @var ChainAccountEX[]
     */
    public $accounts;
    protected $_name = [
        'reqMsgId'   => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg'  => 'result_msg',
        'bizNo'      => 'biz_no',
        'outBizNo'   => 'out_biz_no',
        'status'     => 'status',
        'accounts'   => 'accounts',
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
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->accounts) {
            $res['accounts'] = [];
            if (null !== $this->accounts && \is_array($this->accounts)) {
                $n = 0;
                foreach ($this->accounts as $item) {
                    $res['accounts'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CheckMypocketQrcoderequestaccountsResponse
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
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }
        if (isset($map['accounts'])) {
            if (!empty($map['accounts'])) {
                $model->accounts = [];
                $n               = 0;
                foreach ($map['accounts'] as $item) {
                    $model->accounts[$n++] = null !== $item ? ChainAccountEX::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
