<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ENT\Models;

use AlibabaCloud\Tea\Model;

class QueryCustomerDataResponse extends Model
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

    // 数据类型，ASSET：资产信息， REVENUE：收益信息
    /**
     * @var string
     */
    public $dataType;

    // 登录支付宝的账号，手机号或者邮箱地址
    /**
     * @var string
     */
    public $logonId;

    // 登录账号类型，PHONE：手机号， EMAIL：电子邮箱
    /**
     * @var string
     */
    public $logonIdType;

    // 页码
    /**
     * @var int
     */
    public $pageNum;

    // 页面大小
    /**
     * @var int
     */
    public $pageSize;

    // 总数
    /**
     * @var int
     */
    public $totalCount;

    // 用户资产信息列表
    /**
     * @var UserAssetDetail[]
     */
    public $userAssetDetails;

    // 用户收益信息
    /**
     * @var UserRevenueDetail
     */
    public $userRevenueData;

    // 用户虚拟唯一标识
    /**
     * @var string
     */
    public $vid;
    protected $_name = [
        'reqMsgId'         => 'req_msg_id',
        'resultCode'       => 'result_code',
        'resultMsg'        => 'result_msg',
        'dataType'         => 'data_type',
        'logonId'          => 'logon_id',
        'logonIdType'      => 'logon_id_type',
        'pageNum'          => 'page_num',
        'pageSize'         => 'page_size',
        'totalCount'       => 'total_count',
        'userAssetDetails' => 'user_asset_details',
        'userRevenueData'  => 'user_revenue_data',
        'vid'              => 'vid',
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
        if (null !== $this->dataType) {
            $res['data_type'] = $this->dataType;
        }
        if (null !== $this->logonId) {
            $res['logon_id'] = $this->logonId;
        }
        if (null !== $this->logonIdType) {
            $res['logon_id_type'] = $this->logonIdType;
        }
        if (null !== $this->pageNum) {
            $res['page_num'] = $this->pageNum;
        }
        if (null !== $this->pageSize) {
            $res['page_size'] = $this->pageSize;
        }
        if (null !== $this->totalCount) {
            $res['total_count'] = $this->totalCount;
        }
        if (null !== $this->userAssetDetails) {
            $res['user_asset_details'] = [];
            if (null !== $this->userAssetDetails && \is_array($this->userAssetDetails)) {
                $n = 0;
                foreach ($this->userAssetDetails as $item) {
                    $res['user_asset_details'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->userRevenueData) {
            $res['user_revenue_data'] = null !== $this->userRevenueData ? $this->userRevenueData->toMap() : null;
        }
        if (null !== $this->vid) {
            $res['vid'] = $this->vid;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryCustomerDataResponse
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
        if (isset($map['data_type'])) {
            $model->dataType = $map['data_type'];
        }
        if (isset($map['logon_id'])) {
            $model->logonId = $map['logon_id'];
        }
        if (isset($map['logon_id_type'])) {
            $model->logonIdType = $map['logon_id_type'];
        }
        if (isset($map['page_num'])) {
            $model->pageNum = $map['page_num'];
        }
        if (isset($map['page_size'])) {
            $model->pageSize = $map['page_size'];
        }
        if (isset($map['total_count'])) {
            $model->totalCount = $map['total_count'];
        }
        if (isset($map['user_asset_details'])) {
            if (!empty($map['user_asset_details'])) {
                $model->userAssetDetails = [];
                $n                       = 0;
                foreach ($map['user_asset_details'] as $item) {
                    $model->userAssetDetails[$n++] = null !== $item ? UserAssetDetail::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['user_revenue_data'])) {
            $model->userRevenueData = UserRevenueDetail::fromMap($map['user_revenue_data']);
        }
        if (isset($map['vid'])) {
            $model->vid = $map['vid'];
        }

        return $model;
    }
}
