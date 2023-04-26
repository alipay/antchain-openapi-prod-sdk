<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class PagequeryXrCustomerdeviceResponse extends Model
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

    // 是否成功
    /**
     * @var bool
     */
    public $success;

    // 当前页
    /**
     * @var int
     */
    public $current;

    // 客户对应设备列表
    /**
     * @var CustomerDeviceItem[]
     */
    public $customerDeviceList;

    // 每页数据
    /**
     * @var int
     */
    public $pageSize;

    // 数据总条数
    /**
     * @var int
     */
    public $total;

    // 总页数
    /**
     * @var int
     */
    public $totalPage;
    protected $_name = [
        'reqMsgId'           => 'req_msg_id',
        'resultCode'         => 'result_code',
        'resultMsg'          => 'result_msg',
        'success'            => 'success',
        'current'            => 'current',
        'customerDeviceList' => 'customer_device_list',
        'pageSize'           => 'page_size',
        'total'              => 'total',
        'totalPage'          => 'total_page',
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
        if (null !== $this->success) {
            $res['success'] = $this->success;
        }
        if (null !== $this->current) {
            $res['current'] = $this->current;
        }
        if (null !== $this->customerDeviceList) {
            $res['customer_device_list'] = [];
            if (null !== $this->customerDeviceList && \is_array($this->customerDeviceList)) {
                $n = 0;
                foreach ($this->customerDeviceList as $item) {
                    $res['customer_device_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->pageSize) {
            $res['page_size'] = $this->pageSize;
        }
        if (null !== $this->total) {
            $res['total'] = $this->total;
        }
        if (null !== $this->totalPage) {
            $res['total_page'] = $this->totalPage;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return PagequeryXrCustomerdeviceResponse
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
        if (isset($map['success'])) {
            $model->success = $map['success'];
        }
        if (isset($map['current'])) {
            $model->current = $map['current'];
        }
        if (isset($map['customer_device_list'])) {
            if (!empty($map['customer_device_list'])) {
                $model->customerDeviceList = [];
                $n                         = 0;
                foreach ($map['customer_device_list'] as $item) {
                    $model->customerDeviceList[$n++] = null !== $item ? CustomerDeviceItem::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['page_size'])) {
            $model->pageSize = $map['page_size'];
        }
        if (isset($map['total'])) {
            $model->total = $map['total'];
        }
        if (isset($map['total_page'])) {
            $model->totalPage = $map['total_page'];
        }

        return $model;
    }
}
