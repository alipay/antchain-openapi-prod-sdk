<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MS\Models;

use AlibabaCloud\Tea\Model;

class QueryclientsMsDdcsResponse extends Model
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

    // 订阅客户端列表
    /**
     * @var ClientInfo[]
     */
    public $clients;
    protected $_name = [
        'reqMsgId'   => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg'  => 'result_msg',
        'clients'    => 'clients',
    ];

    public function validate()
    {
        Model::validateRequired('clients', $this->clients, true);
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
        if (null !== $this->clients) {
            $res['clients'] = [];
            if (null !== $this->clients && \is_array($this->clients)) {
                $n = 0;
                foreach ($this->clients as $item) {
                    $res['clients'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryclientsMsDdcsResponse
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
        if (isset($map['clients'])) {
            if (!empty($map['clients'])) {
                $model->clients = [];
                $n              = 0;
                foreach ($map['clients'] as $item) {
                    $model->clients[$n++] = null !== $item ? ClientInfo::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
