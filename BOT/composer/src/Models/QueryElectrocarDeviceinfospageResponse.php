<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class QueryElectrocarDeviceinfospageResponse extends Model
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

    // page_num
    /**
     * @var int
     */
    public $pageNum;

    // page_size
    /**
     * @var int
     */
    public $pageSize;

    // total_pages
    /**
     * @var int
     */
    public $totalPages;

    // total_size
    /**
     * @var int
     */
    public $totalSize;

    // device_list
    /**
     * @var DeviceInfos[]
     */
    public $deviceList;
    protected $_name = [
        'reqMsgId'   => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg'  => 'result_msg',
        'success'    => 'success',
        'pageNum'    => 'page_num',
        'pageSize'   => 'page_size',
        'totalPages' => 'total_pages',
        'totalSize'  => 'total_size',
        'deviceList' => 'device_list',
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
        if (null !== $this->deviceList) {
            $res['device_list'] = [];
            if (null !== $this->deviceList && \is_array($this->deviceList)) {
                $n = 0;
                foreach ($this->deviceList as $item) {
                    $res['device_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryElectrocarDeviceinfospageResponse
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
        if (isset($map['device_list'])) {
            if (!empty($map['device_list'])) {
                $model->deviceList = [];
                $n                 = 0;
                foreach ($map['device_list'] as $item) {
                    $model->deviceList[$n++] = null !== $item ? DeviceInfos::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
