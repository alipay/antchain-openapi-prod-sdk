<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\PCC\Models;

use AlibabaCloud\Tea\Model;

class QueryProductResponse extends Model
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

    // 产品列表
    /**
     * @var ProductBaseInfo[]
     */
    public $productArray;
    protected $_name = [
        'reqMsgId'     => 'req_msg_id',
        'resultCode'   => 'result_code',
        'resultMsg'    => 'result_msg',
        'productArray' => 'product_array',
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
        if (null !== $this->productArray) {
            $res['product_array'] = [];
            if (null !== $this->productArray && \is_array($this->productArray)) {
                $n = 0;
                foreach ($this->productArray as $item) {
                    $res['product_array'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryProductResponse
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
        if (isset($map['product_array'])) {
            if (!empty($map['product_array'])) {
                $model->productArray = [];
                $n                   = 0;
                foreach ($map['product_array'] as $item) {
                    $model->productArray[$n++] = null !== $item ? ProductBaseInfo::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
