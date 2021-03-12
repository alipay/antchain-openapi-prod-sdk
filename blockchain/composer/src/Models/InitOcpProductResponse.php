<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class InitOcpProductResponse extends Model
{
    // 请求唯一ID，用于链路跟踪和问题排查
    /**
     * @var string
     */
    public $reqMsgId;

    // 异常信息的文本描述
    /**
     * @var string
     */
    public $resultCode;

    /**
     * @var string
     */
    public $resultMsg;

    // 组合内容
    /**
     * @var DiscreteValue[]
     */
    public $discreteValues;

    // 签名结果
    /**
     * @var string
     */
    public $sign;
    protected $_name = [
        'reqMsgId'       => 'req_msg_id',
        'resultCode'     => 'result_code',
        'resultMsg'      => 'result_msg',
        'discreteValues' => 'discrete_values',
        'sign'           => 'sign',
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
        if (null !== $this->discreteValues) {
            $res['discrete_values'] = [];
            if (null !== $this->discreteValues && \is_array($this->discreteValues)) {
                $n = 0;
                foreach ($this->discreteValues as $item) {
                    $res['discrete_values'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->sign) {
            $res['sign'] = $this->sign;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return InitOcpProductResponse
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
        if (isset($map['discrete_values'])) {
            if (!empty($map['discrete_values'])) {
                $model->discreteValues = [];
                $n                     = 0;
                foreach ($map['discrete_values'] as $item) {
                    $model->discreteValues[$n++] = null !== $item ? DiscreteValue::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['sign'])) {
            $model->sign = $map['sign'];
        }

        return $model;
    }
}
