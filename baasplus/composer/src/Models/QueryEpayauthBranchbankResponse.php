<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BAASPLUS\Models;

use AlibabaCloud\Tea\Model;

class QueryEpayauthBranchbankResponse extends Model
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

    // Institution列表
    /**
     * @var Institution[]
     */
    public $bankDetails;
    protected $_name = [
        'reqMsgId'    => 'req_msg_id',
        'resultCode'  => 'result_code',
        'resultMsg'   => 'result_msg',
        'bankDetails' => 'bank_details',
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
        if (null !== $this->bankDetails) {
            $res['bank_details'] = [];
            if (null !== $this->bankDetails && \is_array($this->bankDetails)) {
                $n = 0;
                foreach ($this->bankDetails as $item) {
                    $res['bank_details'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryEpayauthBranchbankResponse
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
        if (isset($map['bank_details'])) {
            if (!empty($map['bank_details'])) {
                $model->bankDetails = [];
                $n                  = 0;
                foreach ($map['bank_details'] as $item) {
                    $model->bankDetails[$n++] = null !== $item ? Institution::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
