<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ATO\Models;

use AlibabaCloud\Tea\Model;

class QueryFundAssetpackageResponse extends Model
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

    // 资产包id
    /**
     * @var string
     */
    public $assetPackageId;

    // 用信id
    /**
     * @var string
     */
    public $utilizationId;

    // 资产包状态
    /**
     * @var string
     */
    public $status;

    // 组包完成时间， yyyy-MM-dd HH:mm:ss
    /**
     * @var string
     */
    public $gmtGroupingEnd;

    // 订单列表
    /**
     * @var AssetPackageOrderInfo[]
     */
    public $orderList;
    protected $_name = [
        'reqMsgId'       => 'req_msg_id',
        'resultCode'     => 'result_code',
        'resultMsg'      => 'result_msg',
        'assetPackageId' => 'asset_package_id',
        'utilizationId'  => 'utilization_id',
        'status'         => 'status',
        'gmtGroupingEnd' => 'gmt_grouping_end',
        'orderList'      => 'order_list',
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
        if (null !== $this->assetPackageId) {
            $res['asset_package_id'] = $this->assetPackageId;
        }
        if (null !== $this->utilizationId) {
            $res['utilization_id'] = $this->utilizationId;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->gmtGroupingEnd) {
            $res['gmt_grouping_end'] = $this->gmtGroupingEnd;
        }
        if (null !== $this->orderList) {
            $res['order_list'] = [];
            if (null !== $this->orderList && \is_array($this->orderList)) {
                $n = 0;
                foreach ($this->orderList as $item) {
                    $res['order_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryFundAssetpackageResponse
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
        if (isset($map['asset_package_id'])) {
            $model->assetPackageId = $map['asset_package_id'];
        }
        if (isset($map['utilization_id'])) {
            $model->utilizationId = $map['utilization_id'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }
        if (isset($map['gmt_grouping_end'])) {
            $model->gmtGroupingEnd = $map['gmt_grouping_end'];
        }
        if (isset($map['order_list'])) {
            if (!empty($map['order_list'])) {
                $model->orderList = [];
                $n                = 0;
                foreach ($map['order_list'] as $item) {
                    $model->orderList[$n++] = null !== $item ? AssetPackageOrderInfo::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
