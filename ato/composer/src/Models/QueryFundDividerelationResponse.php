<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ATO\Models;

use AlibabaCloud\Tea\Model;

class QueryFundDividerelationResponse extends Model
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

    // 分账绑定关系支付宝pid
    /**
     * @var string[]
     */
    public $alipayPidList;

    // 分账比例上限
    /**
     * @var string
     */
    public $divideRadio;
    protected $_name = [
        'reqMsgId'      => 'req_msg_id',
        'resultCode'    => 'result_code',
        'resultMsg'     => 'result_msg',
        'alipayPidList' => 'alipay_pid_list',
        'divideRadio'   => 'divide_radio',
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
        if (null !== $this->alipayPidList) {
            $res['alipay_pid_list'] = $this->alipayPidList;
        }
        if (null !== $this->divideRadio) {
            $res['divide_radio'] = $this->divideRadio;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryFundDividerelationResponse
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
        if (isset($map['alipay_pid_list'])) {
            if (!empty($map['alipay_pid_list'])) {
                $model->alipayPidList = $map['alipay_pid_list'];
            }
        }
        if (isset($map['divide_radio'])) {
            $model->divideRadio = $map['divide_radio'];
        }

        return $model;
    }
}
