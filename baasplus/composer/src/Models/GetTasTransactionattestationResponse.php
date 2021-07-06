<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BAASPLUS\Models;

use AlibabaCloud\Tea\Model;

class GetTasTransactionattestationResponse extends Model
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

    // serialNumber，凭证编号 （在校验的时需要先填写凭证编号）
    /**
     * @var string
     */
    public $sn;

    // 精简后的时间戳完整编码（在校验时需要提交）
    /**
     * @var string
     */
    public $ctsr;

    // 时间信息，从1970年1月1日起至当前时间的毫秒数(13位数字)
    /**
     * @var string
     */
    public $ts;
    protected $_name = [
        'reqMsgId'   => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg'  => 'result_msg',
        'sn'         => 'sn',
        'ctsr'       => 'ctsr',
        'ts'         => 'ts',
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
        if (null !== $this->sn) {
            $res['sn'] = $this->sn;
        }
        if (null !== $this->ctsr) {
            $res['ctsr'] = $this->ctsr;
        }
        if (null !== $this->ts) {
            $res['ts'] = $this->ts;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return GetTasTransactionattestationResponse
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
        if (isset($map['sn'])) {
            $model->sn = $map['sn'];
        }
        if (isset($map['ctsr'])) {
            $model->ctsr = $map['ctsr'];
        }
        if (isset($map['ts'])) {
            $model->ts = $map['ts'];
        }

        return $model;
    }
}
