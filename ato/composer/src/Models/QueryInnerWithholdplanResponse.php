<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ATO\Models;

use AlibabaCloud\Tea\Model;

class QueryInnerWithholdplanResponse extends Model
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

    // 总金额，单位为分
    /**
     * @var int
     */
    public $totalMoney;

    // 总期数
    /**
     * @var int
     */
    public $totalTerm;

    // 用户履约信息列表
    /**
     * @var UserPerformanceInfo[]
     */
    public $payInfo;
    protected $_name = [
        'reqMsgId'   => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg'  => 'result_msg',
        'totalMoney' => 'total_money',
        'totalTerm'  => 'total_term',
        'payInfo'    => 'pay_info',
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
        if (null !== $this->totalMoney) {
            $res['total_money'] = $this->totalMoney;
        }
        if (null !== $this->totalTerm) {
            $res['total_term'] = $this->totalTerm;
        }
        if (null !== $this->payInfo) {
            $res['pay_info'] = [];
            if (null !== $this->payInfo && \is_array($this->payInfo)) {
                $n = 0;
                foreach ($this->payInfo as $item) {
                    $res['pay_info'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryInnerWithholdplanResponse
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
        if (isset($map['total_money'])) {
            $model->totalMoney = $map['total_money'];
        }
        if (isset($map['total_term'])) {
            $model->totalTerm = $map['total_term'];
        }
        if (isset($map['pay_info'])) {
            if (!empty($map['pay_info'])) {
                $model->payInfo = [];
                $n              = 0;
                foreach ($map['pay_info'] as $item) {
                    $model->payInfo[$n++] = null !== $item ? UserPerformanceInfo::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
