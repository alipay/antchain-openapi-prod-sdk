<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\NFTX\Models;

use AlibabaCloud\Tea\Model;

class PagequeryNftCustomerResponse extends Model
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

    // 页码，查询时传入
    /**
     * @var int
     */
    public $page;

    // 页长，查询时传入
    /**
     * @var int
     */
    public $pageSize;

    // 列表总数
    /**
     * @var int
     */
    public $totalCount;

    // 用户资产列表
    /**
     * @var UserAsset[]
     */
    public $assetList;
    protected $_name = [
        'reqMsgId'   => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg'  => 'result_msg',
        'page'       => 'page',
        'pageSize'   => 'page_size',
        'totalCount' => 'total_count',
        'assetList'  => 'asset_list',
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
        if (null !== $this->page) {
            $res['page'] = $this->page;
        }
        if (null !== $this->pageSize) {
            $res['page_size'] = $this->pageSize;
        }
        if (null !== $this->totalCount) {
            $res['total_count'] = $this->totalCount;
        }
        if (null !== $this->assetList) {
            $res['asset_list'] = [];
            if (null !== $this->assetList && \is_array($this->assetList)) {
                $n = 0;
                foreach ($this->assetList as $item) {
                    $res['asset_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return PagequeryNftCustomerResponse
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
        if (isset($map['page'])) {
            $model->page = $map['page'];
        }
        if (isset($map['page_size'])) {
            $model->pageSize = $map['page_size'];
        }
        if (isset($map['total_count'])) {
            $model->totalCount = $map['total_count'];
        }
        if (isset($map['asset_list'])) {
            if (!empty($map['asset_list'])) {
                $model->assetList = [];
                $n                = 0;
                foreach ($map['asset_list'] as $item) {
                    $model->assetList[$n++] = null !== $item ? UserAsset::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
