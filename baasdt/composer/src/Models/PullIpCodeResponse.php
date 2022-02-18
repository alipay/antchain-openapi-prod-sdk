<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BAASDT\Models;

use AlibabaCloud\Tea\Model;

class PullIpCodeResponse extends Model
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

    // 数字凭证列表(小程序扫描可跳转)
    /**
     * @var string[]
     */
    public $codeList;

    // 展示码列表(和code_list一一对应)
    /**
     * @var string[]
     */
    public $showCodeList;

    // 交易订单ID
    /**
     * @var string
     */
    public $orderId;

    // IP商家的链上账户ID
    /**
     * @var string
     */
    public $buyerAccountId;

    // IP版权方的链上账户ID
    /**
     * @var string
     */
    public $sellerAccountId;

    // IPID
    /**
     * @var string
     */
    public $ipId;

    // IP名称
    /**
     * @var string
     */
    public $ipName;

    // IP主图的OSS地址
    /**
     * @var string
     */
    public $ipImage;

    // IP描述
    /**
     * @var string
     */
    public $ipDesc;

    // 该批次数字凭证的过期时间戳(毫秒)
    /**
     * @var int
     */
    public $expiredDate;

    // 已经申请的总数量
    /**
     * @var int
     */
    public $totalCount;
    protected $_name = [
        'reqMsgId'        => 'req_msg_id',
        'resultCode'      => 'result_code',
        'resultMsg'       => 'result_msg',
        'codeList'        => 'code_list',
        'showCodeList'    => 'show_code_list',
        'orderId'         => 'order_id',
        'buyerAccountId'  => 'buyer_account_id',
        'sellerAccountId' => 'seller_account_id',
        'ipId'            => 'ip_id',
        'ipName'          => 'ip_name',
        'ipImage'         => 'ip_image',
        'ipDesc'          => 'ip_desc',
        'expiredDate'     => 'expired_date',
        'totalCount'      => 'total_count',
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
        if (null !== $this->codeList) {
            $res['code_list'] = $this->codeList;
        }
        if (null !== $this->showCodeList) {
            $res['show_code_list'] = $this->showCodeList;
        }
        if (null !== $this->orderId) {
            $res['order_id'] = $this->orderId;
        }
        if (null !== $this->buyerAccountId) {
            $res['buyer_account_id'] = $this->buyerAccountId;
        }
        if (null !== $this->sellerAccountId) {
            $res['seller_account_id'] = $this->sellerAccountId;
        }
        if (null !== $this->ipId) {
            $res['ip_id'] = $this->ipId;
        }
        if (null !== $this->ipName) {
            $res['ip_name'] = $this->ipName;
        }
        if (null !== $this->ipImage) {
            $res['ip_image'] = $this->ipImage;
        }
        if (null !== $this->ipDesc) {
            $res['ip_desc'] = $this->ipDesc;
        }
        if (null !== $this->expiredDate) {
            $res['expired_date'] = $this->expiredDate;
        }
        if (null !== $this->totalCount) {
            $res['total_count'] = $this->totalCount;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return PullIpCodeResponse
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
        if (isset($map['code_list'])) {
            if (!empty($map['code_list'])) {
                $model->codeList = $map['code_list'];
            }
        }
        if (isset($map['show_code_list'])) {
            if (!empty($map['show_code_list'])) {
                $model->showCodeList = $map['show_code_list'];
            }
        }
        if (isset($map['order_id'])) {
            $model->orderId = $map['order_id'];
        }
        if (isset($map['buyer_account_id'])) {
            $model->buyerAccountId = $map['buyer_account_id'];
        }
        if (isset($map['seller_account_id'])) {
            $model->sellerAccountId = $map['seller_account_id'];
        }
        if (isset($map['ip_id'])) {
            $model->ipId = $map['ip_id'];
        }
        if (isset($map['ip_name'])) {
            $model->ipName = $map['ip_name'];
        }
        if (isset($map['ip_image'])) {
            $model->ipImage = $map['ip_image'];
        }
        if (isset($map['ip_desc'])) {
            $model->ipDesc = $map['ip_desc'];
        }
        if (isset($map['expired_date'])) {
            $model->expiredDate = $map['expired_date'];
        }
        if (isset($map['total_count'])) {
            $model->totalCount = $map['total_count'];
        }

        return $model;
    }
}
