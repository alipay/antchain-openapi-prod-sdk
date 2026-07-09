<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class QueryElectrocarDevicehistorypropertiesResponse extends Model
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

    // success
    /**
     * @var bool
     */
    public $success;

    // 行程统计信息属性
    /**
     * @var DeviceTripProperties[]
     */
    public $tripProperties;

    // 1
    /**
     * @var int
     */
    public $pageNum;

    // 1
    /**
     * @var int
     */
    public $pageSize;

    // 1
    /**
     * @var int
     */
    public $totalPages;

    // 记录总数
    /**
     * @var int
     */
    public $totalSize;
    protected $_name = [
        'reqMsgId'       => 'req_msg_id',
        'resultCode'     => 'result_code',
        'resultMsg'      => 'result_msg',
        'success'        => 'success',
        'tripProperties' => 'trip_properties',
        'pageNum'        => 'page_num',
        'pageSize'       => 'page_size',
        'totalPages'     => 'total_pages',
        'totalSize'      => 'total_size',
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
        if (null !== $this->tripProperties) {
            $res['trip_properties'] = [];
            if (null !== $this->tripProperties && \is_array($this->tripProperties)) {
                $n = 0;
                foreach ($this->tripProperties as $item) {
                    $res['trip_properties'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->pageNum) {
            $res['page_num'] = $this->pageNum;
        }
        if (null !== $this->pageSize) {
            $res['page_size'] = $this->pageSize;
        }
        if (null !== $this->totalPages) {
            $res['total_pages'] = $this->totalPages;
        }
        if (null !== $this->totalSize) {
            $res['total_size'] = $this->totalSize;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryElectrocarDevicehistorypropertiesResponse
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
        if (isset($map['trip_properties'])) {
            if (!empty($map['trip_properties'])) {
                $model->tripProperties = [];
                $n                     = 0;
                foreach ($map['trip_properties'] as $item) {
                    $model->tripProperties[$n++] = null !== $item ? DeviceTripProperties::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['page_num'])) {
            $model->pageNum = $map['page_num'];
        }
        if (isset($map['page_size'])) {
            $model->pageSize = $map['page_size'];
        }
        if (isset($map['total_pages'])) {
            $model->totalPages = $map['total_pages'];
        }
        if (isset($map['total_size'])) {
            $model->totalSize = $map['total_size'];
        }

        return $model;
    }
}
