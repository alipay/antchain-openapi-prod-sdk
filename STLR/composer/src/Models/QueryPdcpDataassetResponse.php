<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\STLR\Models;

use AlibabaCloud\Tea\Model;

class QueryPdcpDataassetResponse extends Model
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

    // 总量
    /**
     * @var int
     */
    public $total;

    // 当前页面
    /**
     * @var int
     */
    public $pageNumber;

    // 页面大小
    /**
     * @var int
     */
    public $pageSize;

    // 数据资产信息
    /**
     * @var DataAssetInfo[]
     */
    public $dataAssetList;
    protected $_name = [
        'reqMsgId'      => 'req_msg_id',
        'resultCode'    => 'result_code',
        'resultMsg'     => 'result_msg',
        'total'         => 'total',
        'pageNumber'    => 'page_number',
        'pageSize'      => 'page_size',
        'dataAssetList' => 'data_asset_list',
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
        if (null !== $this->total) {
            $res['total'] = $this->total;
        }
        if (null !== $this->pageNumber) {
            $res['page_number'] = $this->pageNumber;
        }
        if (null !== $this->pageSize) {
            $res['page_size'] = $this->pageSize;
        }
        if (null !== $this->dataAssetList) {
            $res['data_asset_list'] = [];
            if (null !== $this->dataAssetList && \is_array($this->dataAssetList)) {
                $n = 0;
                foreach ($this->dataAssetList as $item) {
                    $res['data_asset_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryPdcpDataassetResponse
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
        if (isset($map['total'])) {
            $model->total = $map['total'];
        }
        if (isset($map['page_number'])) {
            $model->pageNumber = $map['page_number'];
        }
        if (isset($map['page_size'])) {
            $model->pageSize = $map['page_size'];
        }
        if (isset($map['data_asset_list'])) {
            if (!empty($map['data_asset_list'])) {
                $model->dataAssetList = [];
                $n                    = 0;
                foreach ($map['data_asset_list'] as $item) {
                    $model->dataAssetList[$n++] = null !== $item ? DataAssetInfo::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
