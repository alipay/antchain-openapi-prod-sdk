<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BAASDT\Models;

use AlibabaCloud\Tea\Model;

class QueryIpOrderinfoResponse extends Model
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

    // 订单信息
    /**
     * @var IPOrder
     */
    public $ipOrder;

    // IP授权销售数据
    /**
     * @var IPSalesInfo[]
     */
    public $ipSalesInfoList;
    protected $_name = [
        'reqMsgId'        => 'req_msg_id',
        'resultCode'      => 'result_code',
        'resultMsg'       => 'result_msg',
        'ipOrder'         => 'ip_order',
        'ipSalesInfoList' => 'ip_sales_info_list',
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
        if (null !== $this->ipOrder) {
            $res['ip_order'] = null !== $this->ipOrder ? $this->ipOrder->toMap() : null;
        }
        if (null !== $this->ipSalesInfoList) {
            $res['ip_sales_info_list'] = [];
            if (null !== $this->ipSalesInfoList && \is_array($this->ipSalesInfoList)) {
                $n = 0;
                foreach ($this->ipSalesInfoList as $item) {
                    $res['ip_sales_info_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryIpOrderinfoResponse
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
        if (isset($map['ip_order'])) {
            $model->ipOrder = IPOrder::fromMap($map['ip_order']);
        }
        if (isset($map['ip_sales_info_list'])) {
            if (!empty($map['ip_sales_info_list'])) {
                $model->ipSalesInfoList = [];
                $n                      = 0;
                foreach ($map['ip_sales_info_list'] as $item) {
                    $model->ipSalesInfoList[$n++] = null !== $item ? IPSalesInfo::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
