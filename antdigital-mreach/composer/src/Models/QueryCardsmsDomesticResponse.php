<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MREACH\Models;

use AlibabaCloud\Tea\Model;

class QueryCardsmsDomesticResponse extends Model
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

    // 短信发送详情
    /**
     * @var CradSmsSendDetail[]
     */
    public $sendDatals;
    protected $_name = [
        'reqMsgId'   => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg'  => 'result_msg',
        'sendDatals' => 'send_datals',
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
        if (null !== $this->sendDatals) {
            $res['send_datals'] = [];
            if (null !== $this->sendDatals && \is_array($this->sendDatals)) {
                $n = 0;
                foreach ($this->sendDatals as $item) {
                    $res['send_datals'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryCardsmsDomesticResponse
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
        if (isset($map['send_datals'])) {
            if (!empty($map['send_datals'])) {
                $model->sendDatals = [];
                $n                 = 0;
                foreach ($map['send_datals'] as $item) {
                    $model->sendDatals[$n++] = null !== $item ? CradSmsSendDetail::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
