<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ENT\Models;

use AlibabaCloud\Tea\Model;

class QueryTppAllinfoResponse extends Model
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

    // 累计全部参与收益
    /**
     * @var Revenue
     */
    public $accumulativeRevenue;

    // 累计参与用书
    /**
     * @var int
     */
    public $accumulativeUsers;

    // 用户资产详情列表
    /**
     * @var AssetDetail[]
     */
    public $assetDetailList;

    // 用户当前累计收益
    /**
     * @var Revenue
     */
    public $currentAccumulativeRevenue;

    // 当前用户收益
    /**
     * @var Revenue
     */
    public $currentRevenue;
    protected $_name = [
        'reqMsgId'                   => 'req_msg_id',
        'resultCode'                 => 'result_code',
        'resultMsg'                  => 'result_msg',
        'accumulativeRevenue'        => 'accumulative_revenue',
        'accumulativeUsers'          => 'accumulative_users',
        'assetDetailList'            => 'asset_detail_list',
        'currentAccumulativeRevenue' => 'current_accumulative_revenue',
        'currentRevenue'             => 'current_revenue',
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
        if (null !== $this->accumulativeRevenue) {
            $res['accumulative_revenue'] = null !== $this->accumulativeRevenue ? $this->accumulativeRevenue->toMap() : null;
        }
        if (null !== $this->accumulativeUsers) {
            $res['accumulative_users'] = $this->accumulativeUsers;
        }
        if (null !== $this->assetDetailList) {
            $res['asset_detail_list'] = [];
            if (null !== $this->assetDetailList && \is_array($this->assetDetailList)) {
                $n = 0;
                foreach ($this->assetDetailList as $item) {
                    $res['asset_detail_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->currentAccumulativeRevenue) {
            $res['current_accumulative_revenue'] = null !== $this->currentAccumulativeRevenue ? $this->currentAccumulativeRevenue->toMap() : null;
        }
        if (null !== $this->currentRevenue) {
            $res['current_revenue'] = null !== $this->currentRevenue ? $this->currentRevenue->toMap() : null;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryTppAllinfoResponse
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
        if (isset($map['accumulative_revenue'])) {
            $model->accumulativeRevenue = Revenue::fromMap($map['accumulative_revenue']);
        }
        if (isset($map['accumulative_users'])) {
            $model->accumulativeUsers = $map['accumulative_users'];
        }
        if (isset($map['asset_detail_list'])) {
            if (!empty($map['asset_detail_list'])) {
                $model->assetDetailList = [];
                $n                      = 0;
                foreach ($map['asset_detail_list'] as $item) {
                    $model->assetDetailList[$n++] = null !== $item ? AssetDetail::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['current_accumulative_revenue'])) {
            $model->currentAccumulativeRevenue = Revenue::fromMap($map['current_accumulative_revenue']);
        }
        if (isset($map['current_revenue'])) {
            $model->currentRevenue = Revenue::fromMap($map['current_revenue']);
        }

        return $model;
    }
}
