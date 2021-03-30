<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\PROPERTYCHAIN\Models;

use AlibabaCloud\Tea\Model;

class ListWarehouseResponse extends Model
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

    // 仓位总数
    /**
     * @var int
     */
    public $locationTotal;

    // 总条目
    /**
     * @var int
     */
    public $totalCount;

    // 总页数
    /**
     * @var int
     */
    public $totalPage;

    // 仓库信息
    /**
     * @var WarehouseInfo[]
     */
    public $warehouseList;

    // 设备总数
    /**
     * @var int
     */
    public $deviceTotal;
    protected $_name = [
        'reqMsgId'      => 'req_msg_id',
        'resultCode'    => 'result_code',
        'resultMsg'     => 'result_msg',
        'locationTotal' => 'location_total',
        'totalCount'    => 'total_count',
        'totalPage'     => 'total_page',
        'warehouseList' => 'warehouse_list',
        'deviceTotal'   => 'device_total',
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
        if (null !== $this->locationTotal) {
            $res['location_total'] = $this->locationTotal;
        }
        if (null !== $this->totalCount) {
            $res['total_count'] = $this->totalCount;
        }
        if (null !== $this->totalPage) {
            $res['total_page'] = $this->totalPage;
        }
        if (null !== $this->warehouseList) {
            $res['warehouse_list'] = [];
            if (null !== $this->warehouseList && \is_array($this->warehouseList)) {
                $n = 0;
                foreach ($this->warehouseList as $item) {
                    $res['warehouse_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->deviceTotal) {
            $res['device_total'] = $this->deviceTotal;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ListWarehouseResponse
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
        if (isset($map['location_total'])) {
            $model->locationTotal = $map['location_total'];
        }
        if (isset($map['total_count'])) {
            $model->totalCount = $map['total_count'];
        }
        if (isset($map['total_page'])) {
            $model->totalPage = $map['total_page'];
        }
        if (isset($map['warehouse_list'])) {
            if (!empty($map['warehouse_list'])) {
                $model->warehouseList = [];
                $n                    = 0;
                foreach ($map['warehouse_list'] as $item) {
                    $model->warehouseList[$n++] = null !== $item ? WarehouseInfo::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['device_total'])) {
            $model->deviceTotal = $map['device_total'];
        }

        return $model;
    }
}
