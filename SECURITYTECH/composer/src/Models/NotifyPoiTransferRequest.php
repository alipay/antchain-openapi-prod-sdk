<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\SECURITYTECH\Models;

use AlibabaCloud\Tea\Model;

class NotifyPoiTransferRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'tradeNo' => 'trade_no',
        'bizOrderNo' => 'biz_order_no',
        'originalOrderNo' => 'original_order_no',
        'gmtTransfer' => 'gmt_transfer',
        'settleType' => 'settle_type',
        'transferDetails' => 'transfer_details',
    ];
    public function validate() {
        Model::validateRequired('tradeNo', $this->tradeNo, true);
        Model::validateRequired('bizOrderNo', $this->bizOrderNo, true);
        Model::validateRequired('gmtTransfer', $this->gmtTransfer, true);
        Model::validateRequired('settleType', $this->settleType, true);
        Model::validateRequired('transferDetails', $this->transferDetails, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->tradeNo) {
            $res['trade_no'] = $this->tradeNo;
        }
        if (null !== $this->bizOrderNo) {
            $res['biz_order_no'] = $this->bizOrderNo;
        }
        if (null !== $this->originalOrderNo) {
            $res['original_order_no'] = $this->originalOrderNo;
        }
        if (null !== $this->gmtTransfer) {
            $res['gmt_transfer'] = $this->gmtTransfer;
        }
        if (null !== $this->settleType) {
            $res['settle_type'] = $this->settleType;
        }
        if (null !== $this->transferDetails) {
            $res['transfer_details'] = $this->transferDetails;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return NotifyPoiTransferRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['product_instance_id'])){
            $model->productInstanceId = $map['product_instance_id'];
        }
        if(isset($map['trade_no'])){
            $model->tradeNo = $map['trade_no'];
        }
        if(isset($map['biz_order_no'])){
            $model->bizOrderNo = $map['biz_order_no'];
        }
        if(isset($map['original_order_no'])){
            $model->originalOrderNo = $map['original_order_no'];
        }
        if(isset($map['gmt_transfer'])){
            $model->gmtTransfer = $map['gmt_transfer'];
        }
        if(isset($map['settle_type'])){
            $model->settleType = $map['settle_type'];
        }
        if(isset($map['transfer_details'])){
            $model->transferDetails = $map['transfer_details'];
        }
        return $model;
    }
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    /**
     * @var string
     */
    public $productInstanceId;

    // 关联交易单号（天枢内部，eKYT接收不透出商城）
    /**
     * @var string
     */
    public $tradeNo;

    // 商城订单号
    /**
     * @var string
     */
    public $bizOrderNo;

    // 原始正向订单号（仅MALL携带，余额来源业务订单号）
    /**
     * @var string
     */
    public $originalOrderNo;

    // 分账时间，格式yyyy-MM-dd HH:mm:ss
    /**
     * @var string
     */
    public $gmtTransfer;

    // 结算类型：PET-活体 / MALL-商城消费 / SCORE-充值余额整笔 / MEMBER-会员
    /**
     * @var string
     */
    public $settleType;

    // 分账明细JSON数组（天枢每批次收款主体唯一，单元素数组；元素：cert_no收款主体社信码、transfer_amount结算金额元）
    /**
     * @var string
     */
    public $transferDetails;

}
