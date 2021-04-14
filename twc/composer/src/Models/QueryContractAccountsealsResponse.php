<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class QueryContractAccountsealsResponse extends Model
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

    // 业务码，0表示成功
    /**
     * @var int
     */
    public $code;

    // 业务码信息
    /**
     * @var string
     */
    public $message;

    // 查询总数
    /**
     * @var int
     */
    public $total;

    // 印章列表
    /**
     * @var ContractSeal[]
     */
    public $seals;
    protected $_name = [
        'reqMsgId'   => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg'  => 'result_msg',
        'code'       => 'code',
        'message'    => 'message',
        'total'      => 'total',
        'seals'      => 'seals',
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
        if (null !== $this->code) {
            $res['code'] = $this->code;
        }
        if (null !== $this->message) {
            $res['message'] = $this->message;
        }
        if (null !== $this->total) {
            $res['total'] = $this->total;
        }
        if (null !== $this->seals) {
            $res['seals'] = [];
            if (null !== $this->seals && \is_array($this->seals)) {
                $n = 0;
                foreach ($this->seals as $item) {
                    $res['seals'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryContractAccountsealsResponse
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
        if (isset($map['code'])) {
            $model->code = $map['code'];
        }
        if (isset($map['message'])) {
            $model->message = $map['message'];
        }
        if (isset($map['total'])) {
            $model->total = $map['total'];
        }
        if (isset($map['seals'])) {
            if (!empty($map['seals'])) {
                $model->seals = [];
                $n            = 0;
                foreach ($map['seals'] as $item) {
                    $model->seals[$n++] = null !== $item ? ContractSeal::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
