<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\COMMERCIAL\Models;

use AlibabaCloud\Tea\Model;

class BatchqueryCommercialcoreSpecResponse extends Model
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

    // 规格售卖模式列表
    /**
     * @var SpecSalesMode[]
     */
    public $salesModes;
    protected $_name = [
        'reqMsgId'   => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg'  => 'result_msg',
        'salesModes' => 'sales_modes',
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
        if (null !== $this->salesModes) {
            $res['sales_modes'] = [];
            if (null !== $this->salesModes && \is_array($this->salesModes)) {
                $n = 0;
                foreach ($this->salesModes as $item) {
                    $res['sales_modes'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return BatchqueryCommercialcoreSpecResponse
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
        if (isset($map['sales_modes'])) {
            if (!empty($map['sales_modes'])) {
                $model->salesModes = [];
                $n                 = 0;
                foreach ($map['sales_modes'] as $item) {
                    $model->salesModes[$n++] = null !== $item ? SpecSalesMode::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
