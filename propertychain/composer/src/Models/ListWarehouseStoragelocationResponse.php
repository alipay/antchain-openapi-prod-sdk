<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\PROPERTYCHAIN\Models;

use AlibabaCloud\Tea\Model;

class ListWarehouseStoragelocationResponse extends Model
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

    // 库位信息
    /**
     * @var StorageLocation[]
     */
    public $storageLocationList;

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
    protected $_name = [
        'reqMsgId'            => 'req_msg_id',
        'resultCode'          => 'result_code',
        'resultMsg'           => 'result_msg',
        'storageLocationList' => 'storage_location_list',
        'totalCount'          => 'total_count',
        'totalPage'           => 'total_page',
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
        if (null !== $this->storageLocationList) {
            $res['storage_location_list'] = [];
            if (null !== $this->storageLocationList && \is_array($this->storageLocationList)) {
                $n = 0;
                foreach ($this->storageLocationList as $item) {
                    $res['storage_location_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->totalCount) {
            $res['total_count'] = $this->totalCount;
        }
        if (null !== $this->totalPage) {
            $res['total_page'] = $this->totalPage;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ListWarehouseStoragelocationResponse
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
        if (isset($map['storage_location_list'])) {
            if (!empty($map['storage_location_list'])) {
                $model->storageLocationList = [];
                $n                          = 0;
                foreach ($map['storage_location_list'] as $item) {
                    $model->storageLocationList[$n++] = null !== $item ? StorageLocation::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['total_count'])) {
            $model->totalCount = $map['total_count'];
        }
        if (isset($map['total_page'])) {
            $model->totalPage = $map['total_page'];
        }

        return $model;
    }
}
