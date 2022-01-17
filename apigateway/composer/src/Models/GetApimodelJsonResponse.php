<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\APIGATEWAY\Models;

use AlibabaCloud\Tea\Model;

class GetApimodelJsonResponse extends Model
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

    // data
    /**
     * @var string
     */
    public $data;

    // req_params
    /**
     * @var ApiParamVO[]
     */
    public $reqParams;
    protected $_name = [
        'reqMsgId'   => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg'  => 'result_msg',
        'data'       => 'data',
        'reqParams'  => 'req_params',
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
        if (null !== $this->data) {
            $res['data'] = $this->data;
        }
        if (null !== $this->reqParams) {
            $res['req_params'] = [];
            if (null !== $this->reqParams && \is_array($this->reqParams)) {
                $n = 0;
                foreach ($this->reqParams as $item) {
                    $res['req_params'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return GetApimodelJsonResponse
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
        if (isset($map['data'])) {
            $model->data = $map['data'];
        }
        if (isset($map['req_params'])) {
            if (!empty($map['req_params'])) {
                $model->reqParams = [];
                $n                = 0;
                foreach ($map['req_params'] as $item) {
                    $model->reqParams[$n++] = null !== $item ? ApiParamVO::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
