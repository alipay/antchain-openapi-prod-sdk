<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\SHUZIWULIU\Models;

use AlibabaCloud\Tea\Model;

class ApplyInsurancepolicyUniversalResponse extends Model
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

    // 保单号
    /**
     * @var string
     */
    public $polNo;

    // 电子保单下载地址
    /**
     * @var string
     */
    public $polUrl;

    // 总保费
    /**
     * @var string
     */
    public $totalPremium;

    // 订单号
    /**
     * @var string
     */
    public $tradeNo;
    protected $_name = [
        'reqMsgId'     => 'req_msg_id',
        'resultCode'   => 'result_code',
        'resultMsg'    => 'result_msg',
        'polNo'        => 'pol_no',
        'polUrl'       => 'pol_url',
        'totalPremium' => 'total_premium',
        'tradeNo'      => 'trade_no',
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
        if (null !== $this->polNo) {
            $res['pol_no'] = $this->polNo;
        }
        if (null !== $this->polUrl) {
            $res['pol_url'] = $this->polUrl;
        }
        if (null !== $this->totalPremium) {
            $res['total_premium'] = $this->totalPremium;
        }
        if (null !== $this->tradeNo) {
            $res['trade_no'] = $this->tradeNo;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ApplyInsurancepolicyUniversalResponse
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
        if (isset($map['pol_no'])) {
            $model->polNo = $map['pol_no'];
        }
        if (isset($map['pol_url'])) {
            $model->polUrl = $map['pol_url'];
        }
        if (isset($map['total_premium'])) {
            $model->totalPremium = $map['total_premium'];
        }
        if (isset($map['trade_no'])) {
            $model->tradeNo = $map['trade_no'];
        }

        return $model;
    }
}
